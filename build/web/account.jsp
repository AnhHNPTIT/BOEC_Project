<%-- 
    Document   : account
    Created on : Jun 9, 2020, 12:13:41 AM
    Author     : hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập, đăng ký thành viên</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </head>
    <body>
        <%
            String ten_dang_nhap_err = "", ten_tai_khoan_err = "", mat_khau_err = "";
            if(request.getAttribute("ten_tai_khoan_err") != null){
                ten_tai_khoan_err = (String) request.getAttribute("ten_tai_khoan_err");
            }
            if(request.getAttribute("ten_dang_nhap_err") != null){
                ten_dang_nhap_err = (String) request.getAttribute("ten_dang_nhap_err");
            }
            if(request.getAttribute("mat_khau_err") != null){
                mat_khau_err = (String) request.getAttribute("mat_khau_err");
            }
            String ten_dang_nhap = "", ten_tai_khoan = "", mat_khau = "";
            if(request.getAttribute("ten_tai_khoan") != null){
                ten_tai_khoan = (String) request.getAttribute("ten_tai_khoan");
            }
            if(request.getAttribute("ten_dang_nhap") != null){
                ten_dang_nhap = (String) request.getAttribute("ten_dang_nhap");
            }
            if(request.getAttribute("mat_khau") != null){
                mat_khau = (String) request.getAttribute("mat_khau");
            }
        %>
        <jsp:include page = "header.jsp"></jsp:include>
            <section id="form"><!--form-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4 col-sm-offset-1">
                            <div class="login-form"><!--login form-->
                                <h2>Đăng nhập hệ thống</h2>
                                <form action="#">
                                    <input type="email" placeholder="Email" />
                                    <input type="password" placeholder="Mật khẩu" />
                                    <span>
                                        <input type="checkbox" class="checkbox"> 
                                        Duy trì tài khoản
                                    </span>
                                    <button type="submit" class="btn btn-default">Đăng nhập</button>
                                </form>
                            </div><!--/login form-->
                        </div>
                        <div class="col-sm-1">
                            <h2 class="or">hoặc</h2>
                        </div>
                        <div class="col-sm-4">
                            <div class="signup-form"><!--sign up form-->
                                <h2>Đăng ký tài khoản</h2>
                                <form action="DangKyServlet" method="post">
                                    <p style="color: red"><%=ten_tai_khoan_err%></p>
                                <input type="text" placeholder="Họ và tên" name="ten_tai_khoan" value="<%=ten_tai_khoan%>"/>
                                    <p style="color: red"><%=ten_dang_nhap_err%></p>
                                    <input type="email" placeholder="Email" name="ten_dang_nhap" value="<%=ten_dang_nhap%>"/>
                                    <p style="color: red"><%=mat_khau_err%></p>
                                    <input type="password" placeholder="Mật khẩu" name="mat_khau" value="<%=mat_khau%>"/>
                                    <button type="submit" class="btn btn-default">Đăng ký</button>
                                </form>
                            </div><!--/sign up form-->
                        </div>
                    </div>
                </div>
            </section><!--/form-->
        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
