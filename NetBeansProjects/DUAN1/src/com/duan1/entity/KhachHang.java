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
public class KhachHang {
    private int Makhachhang ;
    private String Tenkhachhang ;
    private Date Ngaysinh ;
    private String Diachi ;
    private String Dienthoai ;

    public KhachHang() {
    }

    public KhachHang(int Makhachhang, String Tenkhachhang, Date Ngaysinh, String Diachi, String Dienthoai) {
        this.Makhachhang = Makhachhang;
        this.Tenkhachhang = Tenkhachhang;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Dienthoai = Dienthoai;
    }
    
    

    public int getMakhachhang() {
        return Makhachhang;
    }

    public void setMakhachhang(int Makhachhang) {
        this.Makhachhang = Makhachhang;
    }

    
    public String getTenkhachhang() {
        return Tenkhachhang;
    }

    public void setTenkhachhang(String Tenkhachhang) {
        this.Tenkhachhang = Tenkhachhang;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

   public String getNgaySinh2()
    {
       
        return XDate.toString(Ngaysinh, "yyyy/MM/dd");
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getDienthoai() {
        return Dienthoai;
    }

    public void setDienthoai(String Dienthoai) {
        this.Dienthoai = Dienthoai;
    }
    
}
