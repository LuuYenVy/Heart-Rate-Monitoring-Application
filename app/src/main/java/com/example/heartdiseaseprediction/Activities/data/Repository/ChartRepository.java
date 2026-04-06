package com.example.heartdiseaseprediction.Activities.data.Repository;

import androidx.annotation.NonNull;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChartRepository {

    public interface Callback {
        void onSuccess(List<Entry> entries);
        void onError(String error);
    }

    public void getChartData(String userId, String date, Callback callback) {

        DatabaseReference ref = FirebaseDatabase.getInstance()
                .getReference("users")
                .child(userId)
                .child("cardiacInfo");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                List<Entry> list = new ArrayList<>();

                for (DataSnapshot item : snapshot.getChildren()) {

                    String key = item.getKey();
                    String value = item.getValue(String.class);

                    if (key == null || value == null) continue;

                    if (!key.startsWith(date)) continue;

                    try {
                        int hour = Integer.parseInt(key.substring(8, 10));
                        int minute = Integer.parseInt(key.substring(10, 12));

                        float time = hour + (minute / 60f);
                        float heartRate = Float.parseFloat(value);

                        list.add(new Entry(time, heartRate));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                Collections.sort(list, (a, b) -> Float.compare(a.getX(), b.getX()));

                callback.onSuccess(list);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                callback.onError(error.getMessage());
            }
        });
    }
}
