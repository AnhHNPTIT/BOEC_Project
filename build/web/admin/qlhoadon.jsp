<%-- 
    Document   : qlhoadon
    Created on : Jun 16, 2020, 11:24:17 PM
    Author     : hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý hóa đơn</title>
        <link rel="stylesheet" type="text/css" href="css/mos-style.css"> 
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                    <jsp:include page="menu.jsp"></jsp:include>
                </div>
                <div id="rightContent">
                    <h3>Quản lý hóa đơn</h3>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Mã hóa đơn</th>
                            <th class="data">Họ tên khách hàng</th>
                            <th class="data">Địa chỉ giao hàng</th>
                            <th class="data">Tình trạng</th>
                            <th class="data" width="75px">Hành động</th>
                        </tr>
                        <tr class="data">
                            <td class="data" width="30px">1</td>
                            <td class="data">Data Anda</td>
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
