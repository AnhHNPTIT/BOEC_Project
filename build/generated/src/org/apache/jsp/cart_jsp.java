package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <div class = \"container\">\n");
      out.write("                    <div class =\"row\">\n");
      out.write("                        <section id=\"cart_items\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"table-responsive cart_info\">\n");
      out.write("                                    <table class=\"table table-condensed\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr class=\"cart_menu\">\n");
      out.write("                                                <td class=\"image\">Item</td>\n");
      out.write("                                                <td class=\"description\"></td>\n");
      out.write("                                                <td class=\"price\">Price</td>\n");
      out.write("                                                <td class=\"quantity\">Quantity</td>\n");
      out.write("                                                <td class=\"total\">Total</td>\n");
      out.write("                                                <td></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"cart_product\">\n");
      out.write("                                                    <a href=\"\"><img src=\"images/cart/one.png\" alt=\"\"></a>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_description\">\n");
      out.write("                                                    <h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("                                                    <p>Web ID: 1089772</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_price\">\n");
      out.write("                                                    <p>$59</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_quantity\">\n");
      out.write("                                                    <div class=\"cart_quantity_button\">\n");
      out.write("                                                        <a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("                                                        <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("                                                        <a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_total\">\n");
      out.write("                                                    <p class=\"cart_total_price\">$59</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_delete\">\n");
      out.write("                                                    <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"cart_product\">\n");
      out.write("                                                    <a href=\"\"><img src=\"images/cart/two.png\" alt=\"\"></a>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_description\">\n");
      out.write("                                                    <h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("                                                    <p>Web ID: 1089772</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_price\">\n");
      out.write("                                                    <p>$59</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_quantity\">\n");
      out.write("                                                    <div class=\"cart_quantity_button\">\n");
      out.write("                                                        <a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("                                                        <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("                                                        <a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_total\">\n");
      out.write("                                                    <p class=\"cart_total_price\">$59</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_delete\">\n");
      out.write("                                                    <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"cart_product\">\n");
      out.write("                                                    <a href=\"\"><img src=\"images/cart/three.png\" alt=\"\"></a>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_description\">\n");
      out.write("                                                    <h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("                                                    <p>Web ID: 1089772</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_price\">\n");
      out.write("                                                    <p>$59</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_quantity\">\n");
      out.write("                                                    <div class=\"cart_quantity_button\">\n");
      out.write("                                                        <a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("                                                        <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"1\" autocomplete=\"off\" size=\"2\">\n");
      out.write("                                                        <a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_total\">\n");
      out.write("                                                    <p class=\"cart_total_price\">$59</p>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"cart_delete\">\n");
      out.write("                                                    <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section> <!--/#cart_items-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section id=\"do_action\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"heading\">\n");
      out.write("                        <h3>What would you like to do next?</h3>\n");
      out.write("                        <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"chose_area\">\n");
      out.write("                                <ul class=\"user_option\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\">\n");
      out.write("                                        <label>Use Coupon Code</label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\">\n");
      out.write("                                        <label>Use Gift Voucher</label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\">\n");
      out.write("                                        <label>Estimate Shipping & Taxes</label>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <ul class=\"user_info\">\n");
      out.write("                                    <li class=\"single_field\">\n");
      out.write("                                        <label>Country:</label>\n");
      out.write("                                        <select>\n");
      out.write("                                            <option>United States</option>\n");
      out.write("                                            <option>Bangladesh</option>\n");
      out.write("                                            <option>UK</option>\n");
      out.write("                                            <option>India</option>\n");
      out.write("                                            <option>Pakistan</option>\n");
      out.write("                                            <option>Ucrane</option>\n");
      out.write("                                            <option>Canada</option>\n");
      out.write("                                            <option>Dubai</option>\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"single_field\">\n");
      out.write("                                        <label>Region / State:</label>\n");
      out.write("                                        <select>\n");
      out.write("                                            <option>Select</option>\n");
      out.write("                                            <option>Dhaka</option>\n");
      out.write("                                            <option>London</option>\n");
      out.write("                                            <option>Dillih</option>\n");
      out.write("                                            <option>Lahore</option>\n");
      out.write("                                            <option>Alaska</option>\n");
      out.write("                                            <option>Canada</option>\n");
      out.write("                                            <option>Dubai</option>\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"single_field zip-field\">\n");
      out.write("                                        <label>Zip Code:</label>\n");
      out.write("                                        <input type=\"text\">\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <a class=\"btn btn-default update\" href=\"\">Get Quotes</a>\n");
      out.write("                                <a class=\"btn btn-default check_out\" href=\"\">Continue</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"total_area\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Cart Sub Total <span>$59</span></li>\n");
      out.write("                                    <li>Eco Tax <span>$2</span></li>\n");
      out.write("                                    <li>Shipping Cost <span>Free</span></li>\n");
      out.write("                                    <li>Total <span>$61</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <a class=\"btn btn-default update\" href=\"\">Update</a>\n");
      out.write("                                <a class=\"btn btn-default check_out\" href=\"\">Check Out</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section><!--/#do_action-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
