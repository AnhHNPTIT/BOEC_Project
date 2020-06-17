<%-- 
    Document   : login
    Created on : Jun 16, 2020, 11:44:35 PM
    Author     : hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
        <link rel="stylesheet" type="text/css" href="css/mos-style.css"> 
    </head>
    <body>
        <%
            String ten_dang_nhap = "", mat_khau = "";
            if (request.getAttribute("ten_dang_nhap") != null) {
                ten_dang_nhap = (String) request.getAttribute("ten_dang_nhap");
            }
            if (request.getAttribute("mat_khau") != null) {
                mat_khau = (String) request.getAttribute("mat_khau");
            }
            String err = "";
            if (request.getAttribute("err") != null) {
                err = (String) request.getAttribute("err");
            }
        %>
        <div id="loginForm">
            <div class="headLoginForm">
                Đăng nhập Admin
            </div>
            <div class="fieldLogin">
                <form method="POST" action="AdminServlet">
                    <p style="color: red"><%=err%></p>
                    <label>Tên đăng nhập: </label><br>
                    <input type="text" class="login" name="ten_dang_nhap"><br>
                    <label>Mật khẩu: </label><br>
                    <input type="password" class="login" name="mat_khau"><br>
                    <button type="submit" class="button">Đăng nhập</button>
                </form>
            </div>
            
        </div>
    </body>
</html>
