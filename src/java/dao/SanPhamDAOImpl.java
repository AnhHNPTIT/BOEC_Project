/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DanhMuc;
import model.SanPham;

/**
 *
 * @author hoang
 */
public class SanPhamDAOImpl implements SanPhamDAO{

    @Override
    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc) {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM san_pham WHERE ma_danh_muc = '"+ma_danh_muc+"'";
        ArrayList<SanPham> arr = new ArrayList<>();
        try{
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"), "", "");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("Hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);
            }
            cons.close();
        } catch(SQLException e){
            
        }
        return arr;
    }
}
