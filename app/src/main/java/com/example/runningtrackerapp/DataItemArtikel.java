package com.example.runningtrackerapp;

import android.os.Parcel;
import android.os.Parcelable;

public class DataItemArtikel implements Parcelable {
    private String tglBerita;
    private String judulBerita;
    private String descBerita;

    public DataItemArtikel() {
    }

    public DataItemArtikel(String tglBerita, String judulBerita, String descBerita) {
        this.tglBerita = tglBerita;
        this.judulBerita = judulBerita;
        this.descBerita = descBerita;
    }

    public String getTglBerita() {
        return tglBerita;
    }

    public void setTglBerita(String tglBerita) {
        this.tglBerita = tglBerita;
    }

    public String getJudulBerita() {
        return judulBerita;
    }

    public void setJudulBerita(String judulBerita) {
        this.judulBerita = judulBerita;
    }

    public String getDescBerita() {
        return descBerita;
    }

    public void setDescBerita(String descBerita) {
        this.descBerita = descBerita;
    }

    protected DataItemArtikel(Parcel in) {
        tglBerita = in.readString();
        judulBerita = in.readString();
        descBerita = in.readString();
    }

    public static final Creator<DataItemArtikel> CREATOR = new Creator<DataItemArtikel>() {
        @Override
        public DataItemArtikel createFromParcel(Parcel in) {
            return new DataItemArtikel(in);
        }

        @Override
        public DataItemArtikel[] newArray(int size) {
            return new DataItemArtikel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tglBerita);
        dest.writeString(judulBerita);
        dest.writeString(descBerita);
    }
}