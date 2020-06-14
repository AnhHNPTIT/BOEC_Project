<%-- 
    Document   : cart
    Created on : Jun 9, 2020, 12:06:06 AM
    Author     : hoang
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Map"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.TreeMap"%>
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
            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);
            }
            TreeMap<SanPham, Integer> list = cart.getList();

            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
            double cost = 0;
        %>
        <jsp:include page = "header.jsp"></jsp:include>
            <section>
                <div class = "container">
                    <div class ="row">
                        <section id="cart_items">
                            <div class="container">
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
                                                cost += ds.getValue() * ds.getKey().getDon_gia();
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
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </section> <!--/#cart_items-->
                </div>
            </div>
        </section>

        <section id="do_action">
            <div class="container">
                <div class="heading">
                    <h3>What would you like to do next?</h3>
                    <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="chose_area">
                            <ul class="user_option">
                                <li>
                                    <input type="checkbox">
                                    <label>Use Coupon Code</label>
                                </li>
                                <li>
                                    <input type="checkbox">
                                    <label>Use Gift Voucher</label>
                                </li>
                                <li>
                                    <input type="checkbox">
                                    <label>Estimate Shipping & Taxes</label>
                                </li>
                            </ul>
                            <ul class="user_info">
                                <li class="single_field">
                                    <label>Country:</label>
                                    <select>
                                        <option>United States</option>
                                        <option>Bangladesh</option>
                                        <option>UK</option>
                                        <option>India</option>
                                        <option>Pakistan</option>
                                        <option>Ucrane</option>
                                        <option>Canada</option>
                                        <option>Dubai</option>
                                    </select>

                                </li>
                                <li class="single_field">
                                    <label>Region / State:</label>
                                    <select>
                                        <option>Select</option>
                                        <option>Dhaka</option>
                                        <option>London</option>
                                        <option>Dillih</option>
                                        <option>Lahore</option>
                                        <option>Alaska</option>
                                        <option>Canada</option>
                                        <option>Dubai</option>
                                    </select>

                                </li>
                                <li class="single_field zip-field">
                                    <label>Zip Code:</label>
                                    <input type="text">
                                </li>
                            </ul>
                            <a class="btn btn-default update" href="">Get Quotes</a>
                            <a class="btn btn-default check_out" href="">Continue</a>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="total_area">
                            <ul>
                                <li>Tiền hàng <span><%=nf.format(cost)%> VNĐ</span></li>
                                <li>Tiền thuế <span><%=nf.format(0.1*cost)%> VNĐ</span></li>
                                <li>Tiền ship <span>Miễn phí</span></li>
                                <li>Tổng tiền <span><%=nf.format(1.1*cost)%> VNĐ</span></li>
                            </ul>
                            <a class="btn btn-default update" href="">Hủy đơn hàng</a>
                            <a class="btn btn-default check_out" href="checkout.jsp">Thanh toán</a>
                        </div>
                    </div>
                </div>
            </div>
        </section><!--/#do_action-->
        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
