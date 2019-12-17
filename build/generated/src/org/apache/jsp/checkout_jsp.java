package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<c:set var='view' value='/checkout' scope='session' />\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                    <h2>Form validation <small>sub title</small></h2>\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                      <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i class=\"fa fa-wrench\"></i></a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Settings 1</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Settings 2</a>\n");
      out.write("                          </div>\n");
      out.write("                      </li>\n");
      out.write("                      <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("\n");
      out.write("                    <form class=\"form-horizontal form-label-left\" novalidate>\n");
      out.write("\n");
      out.write("                      <p>For alternative validation library <code>parsleyJS</code> check out in the <a href=\"form.html\">form page</a>\n");
      out.write("                      </p>\n");
      out.write("                      <span class=\"section\">Personal Info</span>\n");
      out.write("\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"name\">Name <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input id=\"name\" class=\"form-control\" data-validate-length-range=\"6\" data-validate-words=\"2\" name=\"name\" placeholder=\"both name(s) e.g Jon Doe\" required=\"required\" type=\"text\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"email\">Email <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input type=\"email\" id=\"email\" name=\"email\" required=\"required\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"email\">Confirm Email <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input type=\"email\" id=\"email2\" name=\"confirm_email\" data-validate-linked=\"email\" required=\"required\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"number\">Number <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input type=\"number\" id=\"number\" name=\"number\" required=\"required\" data-validate-minmax=\"10,100\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"website\">Website URL <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input type=\"url\" id=\"website\" name=\"website label-align\" required=\"required\" placeholder=\"www.website.com\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"occupation\">Occupation <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input id=\"occupation\" type=\"text\" name=\"occupation\" data-validate-length-range=\"5,20\" class=\"optional form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label for=\"password\" class=\"col-form-label col-md-3 label-align\">Password</label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input id=\"password\" type=\"password\" name=\"password\" data-validate-length=\"6,8\" class=\"form-control\" required=\"required\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label for=\"password2\" class=\"col-form-label col-md-3 col-sm-3 label-align \">Repeat Password</label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input id=\"password2\" type=\"password\" name=\"password2\" data-validate-linked=\"password\" class=\"form-control\" required=\"required\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"telephone\">Telephone <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <input type=\"tel\" id=\"telephone\" name=\"phone\" required=\"required\" data-validate-length-range=\"8,20\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item form-group\">\n");
      out.write("                        <label class=\"col-form-label col-md-3 col-sm-3 label-align\" for=\"textarea\">Textarea <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                          <textarea id=\"textarea\" required=\"required\" name=\"textarea\" class=\"form-control\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"ln_solid\"></div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-md-6 offset-md-3\">\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-primary\">Cancel</button>\n");
      out.write("                          <button id=\"send\" type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 cart-total\">\n");
      out.write("                <c:url var=\"url\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <a class=\"continue\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Continue Shopping</a>\n");
      out.write("                <div class=\"price-details\">\n");
      out.write("                    <h3>Price Details</h3>\n");
      out.write("                    <span>Total</span>\n");
      out.write("                    <span class=\"total1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.getSubtotalCurrencyFormat()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    <span>Discount</span>\n");
      out.write("                    <span class=\"total1\">---</span>\n");
      out.write("                    <span>Delivery Charges</span>\n");
      out.write("                    <span class=\"total1\">$1.3</span>\n");
      out.write("                    <div class=\"clearfix\"></div>\t\t\t\t \n");
      out.write("                </div>\t\n");
      out.write("                <ul class=\"total_price\">\n");
      out.write("                    <li class=\"last_price\"> <h4>TOTAL</h4></li>\t\n");
      out.write("                    <li class=\"last_price\"><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.calculateTotal(\"1.3\")}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.getTotalCurrencyFormat()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <a class=\"order\" href=\"#\">Place Order</a>\n");
      out.write("                <div class=\"total-item\">\n");
      out.write("                    <h3>OPTIONS</h3>\n");
      out.write("                    <h4>COUPONS</h4>\n");
      out.write("                    <a class=\"cpns\" href=\"#\">Apply Coupons</a>\n");
      out.write("                    <p><a href=\"#\">Log In</a> to use accounts - linked coupons</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</div>\n");
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
