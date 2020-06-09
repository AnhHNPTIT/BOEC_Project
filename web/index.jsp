<%-- 
    Document   : index
    Created on : Jun 8, 2020, 11:44:59 PM
    Author     : hoang
--%>

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
        <jsp:include page = "header.jsp"></jsp:include>
        <jsp:include page = "slider.jsp"></jsp:include>
        <section>
            <div class = "container">
                <div class ="row">
                <jsp:include page = "category.jsp"></jsp:include>
                <jsp:include page = "product.jsp"></jsp:include>
                </div>
            </div>
        </section>
        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
