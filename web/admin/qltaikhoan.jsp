<%-- 
    Document   : qltaikhoan
    Created on : Jun 16, 2020, 11:06:15 PM
    Author     : hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý tài khoản</title>
        <link rel="stylesheet" type="text/css" href="css/mos-style.css"> 
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                    <jsp:include page="menu.jsp"></jsp:include>
                </div>
                <div id="rightContent">
                    <h3>Quản lý tài khoản</h3>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã khách hàng</th>
                            <th class="data">Họ tên khách hàng</th>
                            <th class="data">Tên đăng nhập</th>
                            <th class="data" width="75px">Hành động</th>
                        </tr>
                        <tr class="data">
                            <td class="data" width="30px">1</td>
                            <td class="data">Data Anda</td>
                            <td class="data">Data Anda</td>
                            <td class="data">Data Anda</td>
                            <td class="data" width="75px">
                        <center>
                            <a href="#"><img src="css/img/oke.png"></a>&nbsp;&nbsp;&nbsp;
                            <a href="#"><img src="css/img/detail.png"></a>
                        </center>
                        </td>
                        </tr>
                        
                    </table>
                </div>
                <div class="clear"></div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
