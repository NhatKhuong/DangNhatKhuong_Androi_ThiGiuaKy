package com.example.a19438561_dangnhatkhuong;

import android.widget.BaseAdapter;

import java.io.Serializable;

public class Goods implements Serializable {

    private String mau;
    private String trangThai;
    private double giaHienTai;
    private double giaCu;
    private int img;
    private int loai;

    public  Goods(String mau,String trangThai,double giaHienTai, double giaCu, int img, int loai){
        this.mau = mau;
        this.trangThai = trangThai;
        this.giaHienTai = giaHienTai;
        this.giaCu = giaCu;
        this.img = img;
        this.loai = loai;

    }

    public Goods() {
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setGiaHienTai(double giaHienTai) {
        this.giaHienTai = giaHienTai;
    }

    public void setGiaCu(double giaCu) {
        this.giaCu = giaCu;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public double getGiaHienTai() {
        return giaHienTai;
    }

    public double getGiaCu() {
        return giaCu;
    }

    public int getImg() {
        return img;
    }

    public int getLoai() {
        return loai;
    }






}
