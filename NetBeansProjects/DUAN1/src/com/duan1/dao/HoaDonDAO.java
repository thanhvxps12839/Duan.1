/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

import com.duan1.entity.HangDan;
import com.duan1.entity.HoaDon;
import com.duan1.entity.SanPham;
import com.duan1.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class HoaDonDAO extends DUAN1DAO<HoaDon, String>{
      public void insert(HoaDon model){
        String sql="INSERT INTO Hoadon ( Manhanvien, Ngayban, Makhachhang, Tongtien) VALUES ( ?, ?, ?, ?)";
        XJdbc.update(sql, 
                
                model.getManhanvien(), 
                model.getNgayban2(), 
                model.getMakhachhang(),
                model.getTongtien());         
    }
    
    public void update(HoaDon model){
        String sql="UPDATE Hoadon SET  Manhanvien=?, Ngayban=?, Makhachhang=?, Tongtien=?  WHERE Mahoadon=?";
        XJdbc.update(sql, 
                 
                model.getManhanvien(), 
                model.getNgayban2(), 
                model.getMakhachhang(),
                model.getTongtien(),
                model.getMahoadon());
    }
    
    public void delete(String Mahoadon){
        String sql="DELETE FROM Hoadon WHERE Mahoadon=?";
        XJdbc.update(sql, Mahoadon);
    }
    
    public List<HoaDon> selectAll(){
        String sql="SELECT * FROM Hoadon";
        return this.selectBySql(sql);
    }
    
    public HoaDon selectById(int Mahoadon){
        String sql="SELECT * FROM Hoadon WHERE Mahoadon=?";
        List<HoaDon> list = this.selectBySql(sql, Mahoadon);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<HoaDon> selectBySql(String sql, Object...args){
        List<HoaDon> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    HoaDon entity=new HoaDon();
                    entity.setMahoadon(rs.getInt("Mahoadon"));
                    entity.setManhanvien(rs.getString("Manhanvien"));
                    entity.setNgayban(rs.getDate("Ngayban"));
                    entity.setMakhachhang(rs.getInt("Makhachhang"));
                    entity.setTongtien(rs.getDouble("Tongtien"));
                    
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
 
     public void LayDuLieuChiTietHoaDon(String MaHoaDon) {
        String cautruyvan = "";
        cautruyvan = "select MaCTHD,MaHoaDon,SanPham.TenSanPham,SoLuong,TongTien,ChiTietHoaDon.GhiChu "
                + " from ChiTietHoaDon,SanPham where ChiTietHoaDon.MaSanPham=SanPham.MaSanPham  and MaHoaDon=" + MaHoaDon;
      
      
    }
    @Override
    public HoaDon selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
