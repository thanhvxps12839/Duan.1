/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.entity;

import com.duan1.utils.XDate;
import java.util.Date;

/**
 *
 * @author admin
 */
public class HoaDon {
    private int Mahoadon ;
    private String Manhanvien ;
    private Date Ngayban ;
    private int Makhachhang ;
    private double Tongtien ;

    public int getMahoadon() {
        return Mahoadon;
    }

    public void setMahoadon(int Mahoadon) {
        this.Mahoadon = Mahoadon;
    }

    public String getManhanvien() {
        return Manhanvien;
    }

    public void setManhanvien(String Manhanvien) {
        this.Manhanvien = Manhanvien;
    }

    public Date getNgayban() {
        return Ngayban;
    }

    public void setNgayban(Date Ngayban) {
        this.Ngayban = Ngayban;
    }
        public String getNgayban2()
    {
       
        return XDate.toString(Ngayban, "yyyy/MM/dd");
    }

    public int getMakhachhang() {
        return Makhachhang;
    }

    public void setMakhachhang(int Makhachhang) {
        this.Makhachhang = Makhachhang;
    }

    public double getTongtien() {
        return Tongtien;
    }

    public void setTongtien(double Tongtien) {
        this.Tongtien = Tongtien;
    }

    

    
}
