/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ChiTietHDDAOImpl;
import dao.HoaDonDAOImpl;
import dao.TaiKhoanDAOImpl;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ChiTietHoaDon;
import model.GioHang;
import model.HoaDon;
import model.SanPham;
import model.TaiKhoan;
import tools.sendMail;

/**
 *
 * @author hoang
 */
public class ThanhToanServlet extends HttpServlet {
    private HoaDonDAOImpl hoaDonDAO = new HoaDonDAOImpl();
    private ChiTietHDDAOImpl chiTietHDDAO = new ChiTietHDDAOImpl();
    private TaiKhoanDAOImpl taiKhoanDAO = new TaiKhoanDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String dia_chi_giao_hang = request.getParameter("dia_chi_giao_hang");
        String phuong_thuc_thanh_toan = request.getParameter("phuong_thuc_thanh_toan");
        String tai_khoan = request.getParameter("username");
        HttpSession session = request.getSession();
        GioHang cart = (GioHang) session.getAttribute("cart");
        sendMail.sendMail(tai_khoan, "BOEC_Project", "Bạn vừa thêm một đơn hàng mới!");
        try{
            Date date = new Date();
            String mhd = "" + date.getTime();
            TaiKhoan tk = new TaiKhoan();
            tk.setMa_tai_khoan(taiKhoanDAO.getTaiKhoan(tai_khoan).getMa_tai_khoan());
            HoaDon hd = new HoaDon(mhd, tk, dia_chi_giao_hang, phuong_thuc_thanh_toan, new Timestamp(new Date().getTime()), 0);
            hd.setMa_hoa_don(mhd);
            hoaDonDAO.themHoaDon(hd);
            TreeMap<SanPham, Integer> list = cart.getList();
            for(Map.Entry<SanPham, Integer> ds : list.entrySet()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(ds.getKey().getMa_san_pham());
                chiTietHDDAO.themChiTietHD(new ChiTietHoaDon(0, hd, sp, ds.getValue(), ds.getKey().getDon_gia(), ds.getKey().getGiam_gia()));
            }
            response.sendRedirect("/BOEC_Project/index.jsp");
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
