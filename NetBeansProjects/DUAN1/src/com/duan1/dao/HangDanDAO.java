/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

import com.duan1.entity.HangDan;
import com.duan1.entity.KhachHang;
import com.duan1.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class HangDanDAO extends DUAN1DAO<HangDan, String> {

    public void insert(HangDan model) {
        String sql = "INSERT INTO Hangdan ( Tenhangdan, Diachi, Sodienthoai, Email) VALUES ( ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getTenhangdan(),
                model.getDiachi(),
                model.getSodienthoai(),
                model.getEmail());
    }

    public void update(HangDan model) {
        String sql = "UPDATE Hangdan SET Tenhangdan=?, Diachi=?, Sodienthoai=?, Email=?  WHERE Mahangdan=?";
        XJdbc.update(sql,
                
                model.getTenhangdan(),
                model.getDiachi(),
                model.getSodienthoai(),
                model.getEmail(),
                model.getMahangdan());
    }

    public void delete(String Mahangdan) {
        String sql = "DELETE FROM Hangdan WHERE Mahangdan=?";
        XJdbc.update(sql, Mahangdan);
    }

    public List<HangDan> selectAll() {
        String sql = "SELECT * FROM Hangdan";
        return this.selectBySql(sql);
    }

    public HangDan selectById(int Mahangdan) {
        String sql = "SELECT * FROM Hangdan WHERE Mahangdan=?";
        List<HangDan> list = this.selectBySql(sql, Mahangdan);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<HangDan> selectBySql(String sql, Object... args) {
        List<HangDan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HangDan entity = new HangDan();
                    entity.setMahangdan(rs.getInt("Mahangdan"));
                    entity.setTenhangdan(rs.getString("Tenhangdan"));
                    entity.setDiachi(rs.getString("Diachi"));
                    entity.setSodienthoai(rs.getString("Sodienthoai"));
                    entity.setEmail(rs.getString("Email"));

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
    public HangDan selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
