package com.example.runningtrackerapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ViewHolder> {
    private Context context;
    private ArrayList<DataItemArtikel> values;
    private LayoutInflater inflater;

    public ArtikelAdapter(Context context, ArrayList<DataItemArtikel> values) {
        this.context = context;
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ArtikelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_artikel, parent, false);
        return new ArtikelAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtikelAdapter.ViewHolder holder, int position) {
        DataItemArtikel data = values.get(position);
        holder.tglBerita.setText(data.getTglBerita());
        holder.jdlBerita.setText(data.getJudulBerita());
        holder.descBerita.setText(data.getDescBerita());
        holder.bacaArtikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BacaArtikel.class);
                intent.putExtra("EXTRA_DATA", data);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tglBerita;
        TextView jdlBerita;
        TextView descBerita;
        TextView bacaArtikel;

        public ViewHolder(@NonNull View view) {
            super(view);
            tglBerita = view.findViewById(R.id.tgl_berita);
            jdlBerita = view.findViewById(R.id.judul_berita);
            descBerita = view.findViewById(R.id.deskripsi_berita);
            bacaArtikel = view.findViewById(R.id.baca_berita);
        }
    }
}