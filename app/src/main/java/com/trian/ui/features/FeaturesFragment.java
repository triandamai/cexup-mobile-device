package com.trian.ui.features;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trian.R;
import com.trian.databinding.FeaturesFragmentBinding;

public class FeaturesFragment extends Fragment {
    private FeaturesFragmentBinding binding;

    private FeaturesViewModel mViewModel;

    public static FeaturesFragment newInstance() {
        return new FeaturesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.features_fragment, container, false);
        binding.rvFeatures.showShimmerAdapter();
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FeaturesViewModel.class);
        // TODO: Use the ViewModel
    }

}