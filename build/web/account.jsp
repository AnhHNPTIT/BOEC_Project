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
            <section id="form"><!--form-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4 col-sm-offset-1">
                            <div class="login-form"><!--login form-->
                                <h2>Login to your account</h2>
                                <form action="#">
                                    <input type="text" placeholder="Name" />
                                    <input type="email" placeholder="Email Address" />
                                    <span>
                                        <input type="checkbox" class="checkbox"> 
                                        Keep me signed in
                                    </span>
                                    <button type="submit" class="btn btn-default">Login</button>
                                </form>
                            </div><!--/login form-->
                        </div>
                        <div class="col-sm-1">
                            <h2 class="or">OR</h2>
                        </div>
                        <div class="col-sm-4">
                            <div class="signup-form"><!--sign up form-->
                                <h2>New User Signup!</h2>
                                <form action="#">
                                    <input type="text" placeholder="Name"/>
                                    <input type="email" placeholder="Email Address"/>
                                    <input type="password" placeholder="Password"/>
                                    <button type="submit" class="btn btn-default">Signup</button>
                                </form>
                            </div><!--/sign up form-->
                        </div>
                    </div>
                </div>
            </section><!--/form-->
        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
