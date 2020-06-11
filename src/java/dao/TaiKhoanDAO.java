/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.TaiKhoan;

/**
 *
 * @author hoang
 */
public interface TaiKhoanDAO {
    // kiểm tra tên đăng nhập tồn tại chưa
    public boolean kiemTraTaiKhoan(String ten_dang_nhap);
    
    // thêm mới tài khoản
    public void themTaiKhoan(TaiKhoan tk);
}
