
package com.duan1.entity;

import com.duan1.utils.XDate;
import java.util.Date;



public class NhanVien {
     private String Manhanvien;
    private String Matkhau;
    private String Tennhanvien;
    private String Gioitinh ;
    private Date Ngaysinh ;
    private String Dienthoai ;
    private String Diachi ;
    private boolean vaiTro = false;
    
    @Override
     public String toString() {
        return this.Tennhanvien;
    }
    

    public NhanVien() {
    }

    public NhanVien(String Manhanvien, String Matkhau, String Tennhanvien, String Gioitinh, Date Ngaysinh, String Dienthoai, String Diachi) {
        this.Manhanvien = Manhanvien;
        this.Matkhau = Matkhau;
        this.Tennhanvien = Tennhanvien;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Dienthoai = Dienthoai;
        this.Diachi = Diachi;
    }

  
    

    
     
    public String getManhanvien() {
        return Manhanvien;
    }

    public void setManhanvien(String Manhanvien) {
        this.Manhanvien = Manhanvien;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getTennhanvien() {
        return Tennhanvien;
    }

    public void setTennhanvien(String Tennhanvien) {
        this.Tennhanvien = Tennhanvien;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }
    public String getNgaySinh2()
    { 
        return XDate.toString(Ngaysinh, "yyyy/MM/dd");
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    
   

    

  

   

    public String getDienthoai() {
        return Dienthoai;
    }

    public void setDienthoai(String Dienthoai) {
        this.Dienthoai = Dienthoai;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

   

    
}
