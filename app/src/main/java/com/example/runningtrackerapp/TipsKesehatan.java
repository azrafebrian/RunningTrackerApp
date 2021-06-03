package com.example.runningtrackerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Objects;

import static com.example.runningtrackerapp.DataArtikel.getListDataArtikel;

public class TipsKesehatan extends AppCompatActivity {
    private ImageButton imageButton;
    private RecyclerView rvBerita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
        imageButton = findViewById(R.id.back);

        rvBerita = findViewById(R.id.rv_tips);
        rvBerita.setLayoutManager(new LinearLayoutManager(this));
        rvBerita.setHasFixedSize(true);
        ArtikelAdapter artikelAdapter = new ArtikelAdapter(this, getListDataArtikel());
        rvBerita.setAdapter(artikelAdapter);
        artikelAdapter.notifyDataSetChanged();

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipsKesehatan.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
//public class TipsKesehatan extends Fragment {
//    private ImageButton imageButton;
//    private RecyclerView rvBerita;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.activity_artikel, container, false);
//    }
//
//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        imageButton = view.findViewById(R.id.back);
//
//        rvBerita = view.findViewById(R.id.rv_tips);
//        rvBerita.setLayoutManager(new LinearLayoutManager(requireActivity().getApplicationContext()));
//        rvBerita.setHasFixedSize(true);
//        ArtikelAdapter artikelAdapter = new ArtikelAdapter(requireActivity().getApplicationContext(), getListDataArtikel());
//        rvBerita.setAdapter(artikelAdapter);
//        artikelAdapter.notifyDataSetChanged();
//
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(TipsKesehatan.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
//    }

}