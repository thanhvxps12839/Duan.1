/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

import com.duan1.entity.HoaDonBean;
import java.util.List;

/**
 *
 * @author admin
 */
public class ThongKeServiceImp implements ThongKeService{
    private ThongKeDAO thongKeDAO = null;

    public ThongKeServiceImp() {
        this.thongKeDAO = new ThongKeDAOHd();
    }

  

    @Override
    public List<HoaDonBean> getListByHoaDon() {
        return thongKeDAO.getlistByHoaDon();
    }
}
