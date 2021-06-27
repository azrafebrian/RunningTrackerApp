package com.example.runningtrackerapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

import static com.example.runningtrackerapp.DataArtikel.getListDataArtikel;

public class MainActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton buttonMulai = view.findViewById(R.id.button_mulai);
        buttonMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity().getApplicationContext(), RecordJourney.class));
                getActivity().finish();
            }
        });

        ImageButton buttonHistory = view.findViewById(R.id.button_history);
        buttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity().getApplicationContext(), ViewJourneys.class));
                getActivity().finish();
            }
        });

        ImageButton buttonStatistic = view.findViewById(R.id.button_statistic);
        buttonStatistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity().getApplicationContext(), StatisticsActivity.class));
                getActivity().finish();
            }
        });
    }
}