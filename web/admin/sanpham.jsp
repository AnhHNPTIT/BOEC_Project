<%-- 
    Document   : sanpham
    Created on : Jun 16, 2020, 11:29:32 PM
    Author     : hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm sản phẩm</title>
        <link rel="stylesheet" type="text/css" href="css/mos-style.css"> 
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                    <jsp:include page="menu.jsp"></jsp:include>
                </div>
                <div id="rightContent">
                    <h3>Thêm sản phẩm</h3>
                    <table width="95%">
                        <tr><td><b>Tên sản phẩm:</b></td><td><input type="text" class="panjang"></td></tr>
                        <tr><td><b>Danh mục:</b></td><td>
                                <select> 
                                    <option selected>-- pilihan --</option>
                                    <option value="">Pilihan</option>
                                </select>
                            </td></tr>
                        <tr><td width="125px"><b>Số lượng:</b></td><td><input type="text" class="pendek"></td></tr>
                        <tr><td><b>Mô tả:</b></td><td><textarea></textarea></td></tr>
                        <tr><td width="125px"><b>Giá bán:</b></td><td><input type="text" class="pendek"></td></tr>
                        <tr><td width="125px"><b>Giảm giá:</b></td><td><input type="text" class="pendek"></td></tr>
                        <tr><td></td><td>
                                <input type="submit" class="button" value="Lưu lại">
                            </td></tr>
                    </table>
                </div>
                <div class="clear"></div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
