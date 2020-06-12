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
import model.ChiTietHoaDon;

/**
 *
 * @author hoang
 */
public class ChiTietHDDAOImpl implements ChiTietHDDAO{

    @Override
    public void themChiTietHD(ChiTietHoaDon cthd) {
        Connection cons = DBConnect.getConnection();
        String sql = "INSERT INTO chi_tiet_hoa_don VALUE (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, cthd.getMa_chi_tiet_hoa_don());
            ps.setString(2, cthd.getHoa_don().getMa_hoa_don());
            ps.setString(3, cthd.getSan_pham().getMa_san_pham());
            ps.setInt(4, cthd.getSo_luong());
            ps.setDouble(5, cthd.getDon_gia());
            ps.setInt(6, cthd.getGiam_gia());
            ps.executeUpdate();
            cons.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHDDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
