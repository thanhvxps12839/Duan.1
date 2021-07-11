/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.duan1.utils.XJdbc;
import com.duan1.entity.NhanVien;

/**
 *
 * @author admin
 */
public class NhanVienDAO extends DUAN1DAO<NhanVien, String> {

    public void insert(NhanVien model) {
        String sql = "INSERT INTO NhanVien (Manhanvien, Matkhau, Tennhanvien, Gioitinh, Ngaysinh, Dienthoai, Diachi, Vaitro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        System.out.print(model.getNgaySinh2());

        XJdbc.update(sql,
                model.getManhanvien(),
                model.getMatkhau(),
                model.getTennhanvien(),
                model.getGioitinh(),
                model.getNgaySinh2(),
                model.getDienthoai(),
                model.getDiachi(),
                model.getVaiTro());

        /*
        XJdbc.update(sql, 
                "a", 
                "aaa", 
                "teo", 
                "nam",
                "2020/11/12",
                "43434", 
                "fdsfds", 
                1);
         */
    }

    public void update(NhanVien model) {
        String sql = "UPDATE NhanVien SET Manhanvien=?, Matkhau=?, Tennhanvien=?, Gioitinh=?, Ngaysinh=?, Dienthoai=?, Diachi=?, Vaitro=? WHERE Manhanvien=?";
        XJdbc.update(sql,
                model.getManhanvien(),
                model.getMatkhau(),
                model.getTennhanvien(),
                model.getGioitinh(),
                model.getNgaySinh2(),
                model.getDienthoai(),
                model.getDiachi(),
                model.getVaiTro(),
                model.getManhanvien());
    }

    public void delete(String Manhanvien) {
        String sql = "DELETE FROM NhanVien WHERE Manhanvien=?";
        XJdbc.update(sql, Manhanvien);
    }

    public List<NhanVien> selectAll() {
        String sql = "SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    public NhanVien selectById(String Manhanvien) {
        String sql = "SELECT * FROM NhanVien WHERE Manhanvien=?";
        List<NhanVien> list = this.selectBySql(sql, Manhanvien);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NhanVien entity = new NhanVien();
                    entity.setManhanvien(rs.getString("Manhanvien"));
                    entity.setMatkhau(rs.getString("Matkhau"));
                    entity.setTennhanvien(rs.getString("Tennhanvien"));
                    entity.setGioitinh(rs.getString("Gioitinh"));
                    entity.setNgaysinh(rs.getDate("Ngaysinh"));
                    entity.setDienthoai(rs.getString("Dienthoai"));
                    entity.setDiachi(rs.getString("Diachi"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
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
}
