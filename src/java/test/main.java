/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.DanhMucDAOImpl;
import dao.SanPhamDAOImpl;

/**
 *
 * @author hoang
 */
public class main {
    public static void main(String[] args) {
        DanhMucDAOImpl dm = new DanhMucDAOImpl();
        SanPhamDAOImpl sp = new SanPhamDAOImpl();
        System.out.println(sp.getListProductByCategory("100002").size());
    }
}
