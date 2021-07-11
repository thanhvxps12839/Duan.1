
package com.duan1.dao;

import com.duan1.entity.HoaDonBean;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author admin
 */
public class ThongKeDAOHd implements ThongKeDAO{

    @Override
    public List<HoaDonBean> getlistByHoaDon() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT Ngayban, COUNT(*) as Soluong FROM Hoadon GROUP BY Ngayban";
        List<HoaDonBean> list = new ArrayList<>();
       try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonBean hoaDonBean = new HoaDonBean();
                hoaDonBean.setNgayban(rs.getString("Ngayban"));
                hoaDonBean.setSoluonghoadon(rs.getInt("Soluong"));
                list.add(hoaDonBean);
             }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
