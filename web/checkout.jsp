<%-- 
    Document   : checkout
    Created on : Jun 11, 2020, 11:50:41 PM
    Author     : hoang
--%>

<%@page import="java.util.Map"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.TreeMap"%>
<%@page import="model.SanPham"%>
<%@page import="model.GioHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            if (session.getAttribute("username") == null) {
                response.sendRedirect("/BOEC_Project/account.jsp");
            } else {
                GioHang cart = (GioHang) session.getAttribute("cart");
                if (cart == null) {
                    cart = new GioHang();
                    session.setAttribute("cart", cart);
                }
                TreeMap<SanPham, Integer> list = cart.getList();

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMinimumIntegerDigits(0);
        %>
        <jsp:include page = "header.jsp"></jsp:include>
            <section id="cart_items">
                <div class="container">
                    <div class="review-payment">
                        <h2>Thông tin đơn hàng</h2>
                    </div>

                    <div class="table-responsive cart_info">
                        <table class="table table-condensed">
                            <thead>
                                <tr class="cart_menu">
                                    <td class="image">Sản phẩm</td>
                                    <td class="description"></td>
                                    <td class="price">Đơn giá</td>
                                    <td class="quantity">Số lượng</td>
                                    <td class="total">Thành tiền</td>
                                    <td></td>
                                </tr>
                            </thead>
                            <tbody>
                            <%
                                for (Map.Entry<SanPham, Integer> ds : list.entrySet()) {
                            %>
                            <tr>
                                <td class="cart_product">
                                    <a href=""><img src="<%=ds.getKey().getHinh_anh()%>" alt="" height=120px width=100px></a>
                                </td>
                                <td class="cart_description">
                                    <h4><a href=""><%=ds.getKey().getTen_san_pham()%></a></h4>
                                    <p>Mã sản phẩm: <%=ds.getKey().getMa_san_pham()%></p>
                                </td>
                                <td class="cart_price">
                                    <p><%=nf.format(ds.getKey().getDon_gia())%>VNĐ</p>
                                </td>
                                <td class="cart_quantity">
                                    <div class="cart_quantity_button">
                                        <a class="cart_quantity_up" href="GioHangServlet?command=plus&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> + </a>
                                        <input class="cart_quantity_input" type="text" value="<%=ds.getValue()%>" autocomplete="off" size="2" disabled="">
                                        <a class="cart_quantity_down" href="GioHangServlet?command=sub&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> - </a>
                                    </div>
                                </td>
                                <td class="cart_total">
                                    <p class="cart_total_price"><%=nf.format(ds.getValue() * ds.getKey().getDon_gia())%>VNĐ</p>
                                </td>
                                <td class="cart_delete">
                                    <a class="cart_quantity_delete" href="GioHangServlet?command=remove&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"><i class="fa fa-times"></i></a>
                                </td>
                            </tr>
                            <%
                                }
                            %>
                            <tr>
                                <td colspan="4">&nbsp;</td>
                                <td colspan="2">
                                    <table class="table table-condensed total-result">
                                        <tr>
                                            <td>Tiền hàng</td>
                                            <td>$59</td>
                                        </tr>
                                        <tr>
                                            <td>Tiền thuế</td>
                                            <td>$2</td>
                                        </tr>
                                        <tr class="shipping-cost">
                                            <td>Phí ship</td>
                                            <td>Miễn phí</td>										
                                        </tr>
                                        <tr>
                                            <td>Tổng tiền</td>
                                            <td><span>$61</span></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="shopper-informations">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="shopper-info">
                                <p>Thông tin thanh toán</p>
                                <form action="ThanhToanServlet" method="post">
                                    <p>Địa chỉ giao hàng: </p>
                                    <textarea name="dia_chi_giao_hang"  placeholder="" rows="5"></textarea>
                                    <p>Phương thức thanh toán: </p>
                                    <select name="phuong_thuc_thanh_toan">
                                        <option value="Thanh toán khi nhận hàng">Thanh toán khi nhận hàng</option>
                                        <option value="Chuyển khoản qua ngân hàng">Chuyển khoản qua ngân hàng</option>
                                    </select>
                                    <input type="hidden" value="<%=session.getAttribute("username")%>"/>
                                    <input type="submit" value="Xác nhận thanh toán" class="btn btn-primary">
                                </form>
                            </div>
                        </div>                               
                    </div>					
                </div>
            </div>
        </div>
    </section> <!--/#cart_items-->
    <jsp:include page = "footer.jsp"></jsp:include>
    <%
        }
    %>
</body>
</html>
