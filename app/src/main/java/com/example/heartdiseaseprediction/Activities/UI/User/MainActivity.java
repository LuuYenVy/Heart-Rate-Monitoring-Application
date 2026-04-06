package com.example.heartdiseaseprediction.Activities.UI.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.heartdiseaseprediction.Activities.UI.User.chatbot.ChatFragment;
import com.example.heartdiseaseprediction.Activities.UI.User.profile.ProfileFragment;
import com.example.heartdiseaseprediction.R;
import com.example.heartdiseaseprediction.databinding.ActivityMainScreenBinding;

import androidx.fragment.app.Fragment;
import com.example.heartdiseaseprediction.Activities.UI.User.home.HomeFragment;
import com.example.heartdiseaseprediction.Activities.UI.User.chart.ChartFragment;
import com.example.heartdiseaseprediction.Activities.UI.User.appointment.AppointmentFragment;

public class MainActivity extends AppCompatActivity {

        private ActivityMainScreenBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            binding = ActivityMainScreenBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

            setupBottomNav();
            loadDefaultFragment();
        }

        private void setupBottomNav() {
            binding.bottomNavigationView.setSelectedItemId(R.id.home);

            binding.bottomNavigationView.setOnItemSelectedListener(item -> {
                int id= item.getItemId();
                if( id == R.id.home){
                    replaceFragment(new HomeFragment());
                }
                else if( id == R.id.chart){
                    replaceFragment(new ChartFragment());
                }
                else if( id == R.id.history){
                    replaceFragment(new AppointmentFragment());
                }
                else if( id == R.id.chart_AI){
                    replaceFragment(new ChatFragment());
                }
                else {
                    replaceFragment(new ProfileFragment());
                }
                return true;
            });
        }

        private void loadDefaultFragment() {
            replaceFragment(new HomeFragment());
        }

        private void replaceFragment(Fragment fragment) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, fragment)
                    .commit();
        }
    }
