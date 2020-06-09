<%-- 
    Document   : product
    Created on : Jun 8, 2020, 11:40:30 PM
    Author     : hoang
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="model.SanPham"%>
<%@page import="dao.SanPhamDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            SanPhamDAOImpl sanPhamDAO = new SanPhamDAOImpl();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        %>
        <div class="col-sm-9 padding-right">
            <div class="features_items"><!--features_items-->
                <h2 class="title text-center">Sản phẩm</h2>
                <%for (SanPham sp : sanPhamDAO.getListProductByCategory(request.getParameter("ma_danh_muc"))) {%>
                <div class="col-sm-4">
                    <div class="product-image-wrapper">
                        <div class="single-products">
                            <div class="productinfo text-center">
                                <img src="<%=sp.getHinh_anh()%>" alt="" />
                                <h2><%=nf.format(sp.getDon_gia())%>VNĐ</h2>
                                <p><%=sp.getTen_san_pham()%></p>
                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                            </div>
                            <div class="product-overlay">
                                <div class="overlay-content">
                                    <h2><%=nf.format(sp.getDon_gia())%>VNĐ</h2>
                                    <p><%=sp.getTen_san_pham()%></p>
                                    <a href="#" class="btn btn-default add-to-cart">
                                        <i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                </div>
                            </div>
                        </div>
                        <div class="choose">
                            <ul class="nav nav-pills nav-justified">
                                <li><a href="#"><i class="fa fa-plus-square"></i>Thêm vào so sánh</a></li>
                                <li><a href="#"><i class="fa fa-plus-square"></i>Xem chi tiết</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <%
                    }
                %>

            </div><!--features_items-->


    </body>
</html>
