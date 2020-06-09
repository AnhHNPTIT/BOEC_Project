package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\"><!--header-->\n");
      out.write("\t\t<div class=\"header_top\"><!--header_top-->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contactinfo\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-envelope\"></i> info@domain.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"social-icons pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/header_top-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"header-middle\"><!--header-middle-->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"logo pull-left\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\tUSA\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Canada</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">UK</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\tDOLLAR\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Canadian Dollar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Pound</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t<div class=\"shop-menu pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user\"></i> Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-star\"></i> Wishlist</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"checkout.html\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"cart.html\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.html\"><i class=\"fa fa-lock\"></i> Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/header-middle-->\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"mainmenu pull-left\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"index.html\" class=\"active\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                        <li><a href=\"shop.html\">Products</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"product-details.html\">Product Details</a></li> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"checkout.html\">Checkout</a></li> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"cart.html\">Cart</a></li> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"login.html\">Login</a></li> \n");
      out.write("                                    </ul>\n");
      out.write("                                </li> \n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\">Blog<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                        <li><a href=\"blog.html\">Blog List</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"blog-single.html\">Blog Single</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li> \n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"404.html\">404</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact-us.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"search_box pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/header-bottom-->\n");
      out.write("\t</header><!--/header-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
