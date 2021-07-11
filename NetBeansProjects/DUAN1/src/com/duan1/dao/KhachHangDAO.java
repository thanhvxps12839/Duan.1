/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

import com.duan1.entity.KhachHang;
import com.duan1.entity.NhanVien;
import com.duan1.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class KhachHangDAO extends DUAN1DAO<KhachHang, String> {

    public void insert(KhachHang model) {
        String sql = "INSERT INTO Khachhang (Tenkhachhang, Ngaysinh, Diachi, Dienthoai) VALUES ( ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getTenkhachhang(),
                model.getNgaySinh2(),
                model.getDiachi(),
                model.getDienthoai());
    }

    public void update(KhachHang model) {
        String sql = "UPDATE Khachhang SET Tenkhachhang=?, Ngaysinh=?, Diachi=?, Dienthoai=? WHERE Makhachhang=?";
        XJdbc.update(sql,
                
                model.getTenkhachhang(),
                model.getNgaySinh2(),
                model.getDiachi(),
                model.getDienthoai(),
              model.getMakhachhang());
    }

    public void delete(String Makhachhang) {
        String sql = "DELETE FROM Khachhang WHERE Makhachhang=?";
        XJdbc.update(sql, Makhachhang);
    }

    public List<KhachHang> selectAll() {
        String sql = "SELECT * FROM Khachhang";
        return this.selectBySql(sql);
    }

    public KhachHang selectById(int Makhachhang) {
        String sql = "SELECT * FROM Khachhang WHERE Makhachhang=?";
        List<KhachHang> list = this.selectBySql(sql, Makhachhang);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    KhachHang entity = new KhachHang();
                    entity.setMakhachhang(rs.getInt("Makhachhang"));
                    entity.setTenkhachhang(rs.getString("Tenkhachhang"));
                    entity.setDiachi(rs.getString("Diachi"));
                    entity.setNgaysinh(rs.getDate("Ngaysinh"));
                    entity.setDienthoai(rs.getString("Dienthoai"));

                    list.add(entity);
                }
            } finally {
                //rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    @Override
    public KhachHang selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
