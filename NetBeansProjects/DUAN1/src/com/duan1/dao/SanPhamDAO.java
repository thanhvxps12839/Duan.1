/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;


import com.duan1.entity.SanPham;
import com.duan1.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamDAO extends DUAN1DAO<SanPham, String>{
    public void insert(SanPham model){
        String sql="INSERT INTO Sanpham ( Tensanpham, Mahangdan, Soluong, Dongianhap, Dongiaban, Anh, Ghichu) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                
                model.getTensanpham(), 
                model.getMahangdan(), 
                model.getSoluong(),
                model.getDongianhap(), 
                model.getDongiaban(), 
                model.getAnh(), 
                model.getGhichu()); 
    }
    
    public void update(SanPham model){
        String sql="UPDATE Sanpham SET  Tensanpham=? , Mahangdan=? , Soluong=? , Dongianhap=? , Dongiaban=? , Anh=? , Ghichu=?  WHERE Masanpham=?";
        XJdbc.update(sql, 
                
                model.getTensanpham(), 
                model.getMahangdan(), 
                model.getSoluong(),
                model.getDongianhap(), 
                model.getDongiaban(), 
                model.getAnh(), 
                model.getGhichu(),
                model.getMasanpham());
    }
    
    public void delete(String Masanpham){
        String sql="DELETE FROM Sanpham WHERE Masanpham=?";
        XJdbc.update(sql, Masanpham);
    }
    
    public List<SanPham> selectAll(){
        String sql="SELECT * FROM Sanpham";
        return this.selectBySql(sql);
    }
    
    public SanPham selectById(int Masanpham){
        String sql="SELECT * FROM Sanpham WHERE Masanpham=?";
        List<SanPham> list = this.selectBySql(sql, Masanpham);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<SanPham> selectBySql(String sql, Object...args){
        List<SanPham> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    SanPham entity=new SanPham();
                    entity.setMasanpham(rs.getInt("Masanpham"));
                    entity.setTensanpham(rs.getString("Tensanpham"));
                    entity.setMahangdan(rs.getInt("Mahangdan"));
                    entity.setSoluong(rs.getDouble("Soluong"));
                    entity.setDongianhap(rs.getDouble("Dongianhap"));
                    entity.setDongiaban(rs.getDouble("Dongiaban"));
                    entity.setAnh(rs.getString("Anh"));
                    entity.setGhichu(rs.getString("Ghichu"));
                    
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
     public List<SanPham> selectByHangDan(int Mahangdan) {
        String sql="SELECT * FROM Sanpham WHERE Mahangdan=?";
        return this.selectBySql(sql, Mahangdan);
    }
      
    

    

    @Override
    public SanPham selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
