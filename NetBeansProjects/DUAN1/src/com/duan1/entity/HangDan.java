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
public class HangDan {

    private int Mahangdan;
    private String Tenhangdan;
    private String Diachi;
    private String Sodienthoai;
    private String Email;

    public HangDan() {
    }

    public HangDan(int Mahangdan, String Tenhangdan, String Diachi, String Sodienthoai, String Email) {
        this.Mahangdan = Mahangdan;
        this.Tenhangdan = Tenhangdan;
        this.Diachi = Diachi;
        this.Sodienthoai = Sodienthoai;
        this.Email = Email;
    }

    
    
    public int getMahangdan() {
        return Mahangdan;
    }
    public String getMahangdan2(){
        return String.valueOf( Mahangdan);
    }

    public void setMahangdan(int Mahangdan) {
        this.Mahangdan = Mahangdan;
    }

    

    public String getTenhangdan() {
        return Tenhangdan;
    }

    public void setTenhangdan(String Tenhangdan) {
        this.Tenhangdan = Tenhangdan;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String Sodienthoai) {
        this.Sodienthoai = Sodienthoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
