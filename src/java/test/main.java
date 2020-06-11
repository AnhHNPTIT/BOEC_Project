/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.DanhMucDAOImpl;
import dao.SanPhamDAOImpl;
import dao.TaiKhoanDAOImpl;

/**
 *
 * @author hoang
 */
public class main {
    public static void main(String[] args) {
        TaiKhoanDAOImpl tk = new TaiKhoanDAOImpl();
        System.out.println(tk.kiemTraTaiKhoan("anhhn@gmail.com"));
    }
}
