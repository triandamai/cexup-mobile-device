package com.trian.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.trian.R;
import com.trian.databinding.ActivityAppBinding;

public class AppActivity extends AppCompatActivity {

    private NavController navController;
    private ActivityAppBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_app);
        navController = Navigation.findNavController(this,R.id.nav_host_app);
        navController.navigate(R.id.featuresFragment);
    }

}