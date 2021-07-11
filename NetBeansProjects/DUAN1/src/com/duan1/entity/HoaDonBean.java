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
public class HoaDonBean {
    private String Ngayban ;
    private int Soluonghoadon ;

    public HoaDonBean() {
    }

    public HoaDonBean(String Ngayban, int Soluonghoadon) {
        this.Ngayban = Ngayban;
        this.Soluonghoadon = Soluonghoadon;
    }

    public String getNgayban() {
        return Ngayban;
    }

    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    public int getSoluonghoadon() {
        return Soluonghoadon;
    }

    public void setSoluonghoadon(int Soluonghoadon) {
        this.Soluonghoadon = Soluonghoadon;
    }
    
    
}
