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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TaiKhoan;

/**
 *
 * @author hoang
 */
public class TaiKhoanDAOImpl implements TaiKhoanDAO{

    @Override
    public boolean kiemTraTaiKhoan(String ten_dang_nhap) {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT ten_dang_nhap FROM tai_khoan WHERE ten_dang_nhap = '"+ten_dang_nhap+"'";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
            cons.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void themTaiKhoan(TaiKhoan tk) {
        Connection cons = DBConnect.getConnection();
        String sql = "INSERT INTO tai_khoan VALUE (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, tk.getMa_tai_khoan());
            ps.setString(2, tk.getTen_tai_khoan());
            ps.setString(3, tk.getTen_dang_nhap());
            ps.setString(4, tk.getMat_khau());
            ps.setInt(5, tk.getQuyen_truy_cap());
            ps.setInt(6, tk.getTinh_trang());
            ps.executeUpdate();
            cons.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean kiemTraDangNhap(String ten_dang_nhap, String mat_khau) {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM tai_khoan WHERE ten_dang_nhap = '"+ten_dang_nhap+"' and mat_khau = '"+mat_khau+"'";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
