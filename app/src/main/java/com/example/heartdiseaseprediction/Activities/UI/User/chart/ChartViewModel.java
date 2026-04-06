package com.example.heartdiseaseprediction.Activities.UI.User.chart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.heartdiseaseprediction.Activities.data.Repository.ChartRepository;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;

import java.util.List;

public class ChartViewModel extends ViewModel {
    private ChartRepository repo = new ChartRepository();


    private MutableLiveData<String> error= new MutableLiveData<>();

    public MutableLiveData<String> getError() {
        return error;
    }
    private MutableLiveData<List<Entry>> chartData = new MutableLiveData<>();

    public LiveData<List<Entry>> getChartData() {
        return chartData;
    }
    public void loadChart(String userId, String date) {
        repo.getChartData(userId, date, new ChartRepository.Callback() {
            @Override
            public void onSuccess(List<Entry> list) {
                chartData.setValue(list);
            }

            @Override
            public void onError(String err) {
                error.setValue(err);
            }
        });
    }
}
