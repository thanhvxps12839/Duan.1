/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

import com.duan1.entity.HoaDon;
import com.duan1.entity.HoaDonChiTiet;
import com.duan1.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class HoaDonChiTietDAO extends DUAN1DAO<HoaDonChiTiet, String>{
     @Override
     public void insert(HoaDonChiTiet model){
        String sql="INSERT INTO hoadonchitiet ( Masanpham, Soluong, Dongia, Giamgia, Thanhtien ) VALUES ( ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                
                model.getMasanpham(), 
                model.getSoluong(), 
                model.getDongia(),
                model.getGiamgia(),
                model.getThanhtien());
    }
    
     @Override
    public void update(HoaDonChiTiet model){
        String sql="UPDATE hoadonchitiet SET  Masanpham=? , Soluong= ?, Dongia= ?, Giamgia= ?, Thanhtien=?  WHERE Mahoadon=?";
        XJdbc.update(sql, 
                 
                 model.getMasanpham(), 
                model.getSoluong(), 
                model.getDongia(),
                model.getGiamgia(),
                model.getThanhtien(),
                model.getMahoadon());
    }
    
     @Override
    public void delete(String Mahoadon){
        String sql="DELETE FROM hoadonchitiet WHERE Mahoadon=?";
        XJdbc.update(sql, Mahoadon);
    }
    
     @Override
    public List<HoaDonChiTiet> selectAll(){
        String sql="SELECT * FROM hoadonchitiet";
        return this.selectBySql(sql);
    }
    
    public HoaDonChiTiet selectById(int Mahoadon){
        String sql="SELECT * FROM hoadonchitiet WHERE Mahoadon=?";
        List<HoaDonChiTiet> list = this.selectBySql(sql, Mahoadon);
        return list.size() > 0 ? list.get(0) : null;
    }
    
     @Override
    protected List<HoaDonChiTiet> selectBySql(String sql, Object...args){
        List<HoaDonChiTiet> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    HoaDonChiTiet entity=new HoaDonChiTiet();
                    entity.setMahoadon(rs.getInt("Mahoadon"));
                    entity.setMasanpham(rs.getInt("Masanpham"));
                    entity.setSoluong(rs.getFloat("Soluong"));
                    entity.setDongia(rs.getFloat("Dongia"));
                    entity.setGiamgia(rs.getString("Giamgia"));
                    entity.setThanhtien(rs.getFloat("Thanhtien"));
                    
                    list.add(entity);
                }
            } 
            finally{
                //rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    @Override
    public HoaDonChiTiet selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
