<%-- 
    Document   : Category
    Created on : Jun 8, 2020, 8:44:42 PM
    Author     : hoang
--%>

<%@page import="model.DanhMuc"%>
<%@page import="dao.DanhMucDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            DanhMucDAOImpl danhMucDAO = new DanhMucDAOImpl();
        %>
        <div class="col-sm-3">
            <div class="left-sidebar">
                <h2>Danh mục</h2>
                <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                    <%for (DanhMuc danh_muc_cha : danhMucDAO.getListDanhMucCha()) {%>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a>
                                    <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                        <%=danh_muc_cha.getTen_danh_muc()%>
                                </a>
                            </h4>
                        </div>

                        <div class="panel-body">
                            <ul>
                                <%for (DanhMuc danh_muc_con : danhMucDAO.getListDanhMucCon(danh_muc_cha.getMa_danh_muc())) {%>
                                <li><a href="index.jsp?ma_danh_muc=<%=danh_muc_con.getMa_danh_muc()%>"><%=danh_muc_con.getTen_danh_muc()%> </a></li>
                                    <%
                                        }
                                    %>
                            </ul>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div><!--/category-products-->

                <div class="brands_products"><!--brands_products-->
                    <h2>Brands</h2>
                    <div class="brands-name">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>
                            <li><a href="#"> <span class="pull-right">(56)</span>Grüne Erde</a></li>
                            <li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>
                            <li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>
                            <li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>
                            <li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>
                            <li><a href="#"> <span class="pull-right">(4)</span>Rösch creative culture</a></li>
                        </ul>
                    </div>
                </div><!--/brands_products-->

                <div class="shipping text-center"><!--shipping-->
                    <img src="images/home/shipping.jpg" alt="" />
                </div><!--/shipping-->
                
                <div style="clear: both; margin-bottom: 40px"></div>
            </div>
        </div>
    </body>
</html>
