package com.example.scheme_01.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.scheme_01.Helth_scheme;
import com.example.scheme_01.R;
import com.example.scheme_01.databinding.FragmentHomeBinding;
import com.example.scheme_01.ui.dashboard.DashboardFragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        // Initialize the ImageSlider
        ImageSlider imageSlider = root.findViewById(R.id.auto_img);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.scheme_cat_1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.scheme_cat_2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.scheme_cat_3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.scheme_cat_4, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}