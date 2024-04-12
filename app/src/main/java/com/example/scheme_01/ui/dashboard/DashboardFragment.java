package com.example.scheme_01.ui.dashboard;

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

import com.example.scheme_01.Agri_scheme;
import com.example.scheme_01.Education_scheme;
import com.example.scheme_01.Helth_scheme;
import com.example.scheme_01.Labour_scheme;
import com.example.scheme_01.R;
import com.example.scheme_01.Sports_scheme;
import com.example.scheme_01.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        CardView cat_1_helth = root.findViewById(R.id.cat_1);
        CardView cat_2_agri = root.findViewById(R.id.cat_2);
        CardView cat_3_edu = root.findViewById(R.id.cat_3);
        CardView cat_4_labour = root.findViewById(R.id.cat_4);
        CardView cat_5_sports = root.findViewById(R.id.cat_5);


        cat_1_helth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Helth_scheme.class);
                startActivity(i);
            }
        });

        cat_2_agri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Agri_scheme.class);
                startActivity(i);
            }
        });

        cat_3_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Education_scheme.class);
                startActivity(i);
            }
        });

        cat_4_labour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Labour_scheme.class);
                startActivity(i);
            }
        });

        cat_5_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Sports_scheme.class);
                startActivity(i);
            }
        });



        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}