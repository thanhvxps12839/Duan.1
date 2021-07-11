/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.entity;

/**
 *
 * @author admin
 */
public class SanPham {
    private int Masanpham ;
    private String Tensanpham ;
    private int Mahangdan ;
    private double Soluong ;
    private double Dongianhap ;
    private double Dongiaban ;
    private String Anh ;
    private String Ghichu ;

   
    public SanPham() {
    }
   

    public SanPham(int Masanpham, String Tensanpham, int Mahangdan, double Soluong, double Dongianhap, double Dongiaban, String Anh, String Ghichu) {
        this.Masanpham = Masanpham;
        this.Tensanpham = Tensanpham;
        this.Mahangdan = Mahangdan;
        this.Soluong = Soluong;
        this.Dongianhap = Dongianhap;
        this.Dongiaban = Dongiaban;
        this.Anh = Anh;
        this.Ghichu = Ghichu;
    }
   
    
    
    public int getMasanpham() {
        return Masanpham;
    }

    public void setMasanpham(int Masanpham) {
        this.Masanpham = Masanpham;
    }

    public String getTensanpham() {
        return Tensanpham;
    }

    public void setTensanpham(String Tensanpham) {
        this.Tensanpham = Tensanpham;
    }

    public int getMahangdan() {
        return Mahangdan;
    }

    public void setMahangdan(int Mahangdan) {
        this.Mahangdan = Mahangdan;
    }

    public double getSoluong() {
        return Soluong;
    }

    public void setSoluong(double Soluong) {
        this.Soluong = Soluong;
    }

    public double getDongianhap() {
        return Dongianhap;
    }

    public void setDongianhap(double Dongianhap) {
        this.Dongianhap = Dongianhap;
    }

    public double getDongiaban() {
        return Dongiaban;
    }

    public void setDongiaban(double Dongiaban) {
        this.Dongiaban = Dongiaban;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

  
    
    
}
