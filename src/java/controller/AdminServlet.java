/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tools.MaHoa;

/**
 *
 * @author hoang
 */
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String ten_dang_nhap = request.getParameter("ten_dang_nhap");
        String mat_khau = request.getParameter("mat_khau");

        String err = "";
        if (ten_dang_nhap.equals("") || mat_khau.equals("")) {
            err = "Vui lòng nhập đầy đủ thông tin!";
        } else if (!ten_dang_nhap.equalsIgnoreCase("admin") || !mat_khau.equals("271297")) {
            err = "Thông tin đăng nhập không chính xác!";
        } else if (ten_dang_nhap.equalsIgnoreCase("admin") && mat_khau.equals("271297")) {
            err = "";
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);
        }

        String url = "/login.jsp";
        try {
            if (err.length() == 0) {
                HttpSession session = request.getSession();
                session.setAttribute("username", ten_dang_nhap);
                url = "/admin/index.jsp";
            } else {
                url = "/login.jsp";
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {

        }
    }
}
