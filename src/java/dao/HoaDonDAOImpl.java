/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDon;

/**
 *
 * @author hoang
 */
public class HoaDonDAOImpl implements HoaDonDAO{

    @Override
    public void themHoaDon(HoaDon hd) {
        Connection cons = DBConnect.getConnection();
        String sql = "INSERT INTO hoa_don VALUE (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, hd.getMa_hoa_don());
            ps.setString(2, hd.getTai_khoan().getMa_tai_khoan());
            ps.setString(3, hd.getDia_chi_giao_hang());
            ps.setString(4, hd.getPhuong_thuc_thanh_toan());
            ps.setTimestamp(5, hd.getNgay_mua_hang());
            ps.setInt(6, hd.getTinh_trang_don_hang());
            ps.executeUpdate();
            cons.close();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
