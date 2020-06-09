/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.DanhMuc;

/**
 *
 * @author hoang
 */
public interface DanhMucDAO {
    // load danh sách danh mục cha
    public ArrayList<DanhMuc> getListDanhMucCha();
    
    // load danh sách danh mục con
    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc);
    
}
