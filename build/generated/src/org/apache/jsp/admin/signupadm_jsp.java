package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signupadm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Lee Fashion Store</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/etalage.css\">\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Lee Fashion Store\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//fonts-->\n");
      out.write("        <!-- icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\">\n");
      out.write("        <!--//icon -->\n");
      out.write("        \n");
      out.write("        ");
 String name = (String) session.getAttribute("name"); 
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"header-grid\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\" class=\"scroll\">Articles</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"scroll\">Contact</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"scroll\">Privacy</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"scroll\">Terms</a></li>\t\t\t\t\t\t\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-grid-right\">\n");
      out.write("                        ");
 if (name == null) { 
      out.write("\n");
      out.write("                            <a href=\"\" class=\"sign-in\">Sign In</a>\n");
      out.write("                            <form action=\"Log?action=SignIn\" method=\"post\">\n");
      out.write("                                <input type=\"text\" name=\"username\" value=\"Username\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='';}\">\n");
      out.write("                                <input type=\"text\" name=\"password\" value=\"Password\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='';}\">\n");
      out.write("                                <input type=\"submit\" value=\"Go\" >\n");
      out.write("                            </form>\n");
      out.write("                            <label>|</label>\n");
      out.write("                            <a href=\"signup.jsp\" class=\"sign-up\">Sign Up</a>\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                            <a href=\"\" class=\"hello\" title=\"View Profile\">\n");
      out.write("                                Hello, ");
 out.print(name); 
      out.write("\n");
      out.write("                                <i class=\"fas fa-user-secret profile\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <label>|</label>\n");
      out.write("                            <a href=\"Log?action=SignOut\" class=\"sign-out\">Sign Out</a>\n");
      out.write("                        ");
 } 
      out.write("    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"header-bottom\">\t\t\t\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\" \" style=\"height: 70px\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ad-right\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"images/ad.png\" alt=\" \" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\t\n");
      out.write("                <div class=\"header-bottom-bottom\">\n");
      out.write("                    <div class=\"top-nav\">\n");
      out.write("                        <span class=\"menu\"> </span>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"active\" id=\"li1\"><a id=\"a1\" href=\"index.jsp\">HOME </a></li>\n");
      out.write("                            <li id=\"li2\"><a id=\"a2\" href=\"category?cid1\" >MEN</a></li>\n");
      out.write("                            <li id=\"li3\"><a id=\"a3\" href=\"category?cid2\" >WOMEN</a></li>\n");
      out.write("                            <li id=\"li4\"><a id=\"a4\" href=\"category?cid3\" >KIDS</a></li>\n");
      out.write("                            <li id=\"li5\"><a id=\"a5\" href=\"category?cid4\" >ACCESSORIES</a></li>\n");
      out.write("                            <li id=\"li6\"><a id=\"a6\" href=\"#\" >LATEST PRODUCT</a></li>\n");
      out.write("                        </ul>\t                      \n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <script>\n");
      out.write("                            $(\"span.menu\").click(function(){\n");
      out.write("                                $(\".top-nav ul\").slideToggle(300, function(){\n");
      out.write("                                });\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"search\">\n");
      out.write("                        <form>\n");
      out.write("                            <input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\" >\n");
      out.write("                            <input type=\"submit\"  value=\"\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <script>    \n");
      out.write("            $('#a1').click(() => {\n");
      out.write("                $(window).load(() => {\n");
      out.write("                    $('.active').removeClass('active');\n");
      out.write("                    $('#li1').addClass('active');\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("            $('#a2').click(() => {\n");
      out.write("                $('.active').removeClass('active');\n");
      out.write("                $('#li2').addClass('active');\n");
      out.write("            })\n");
      out.write("            $('#a3').click(() => {\n");
      out.write("                $('.active').removeClass('active');\n");
      out.write("                $('#li3').addClass('active');\n");
      out.write("            })\n");
      out.write("            $('#a4').click(() => {\n");
      out.write("                $('.active').removeClass('active');\n");
      out.write("                $('#li4').addClass('active');\n");
      out.write("            })\n");
      out.write("            $('#a5').click(() => {\n");
      out.write("                $('.active').removeClass('active');\n");
      out.write("                $('#li5').addClass('active');\n");
      out.write("            })\n");
      out.write("            $('#a6').click(() => {\n");
      out.write("                $('.active').removeClass('active');\n");
      out.write("                $('#li6').addClass('active');\n");
      out.write("            })\n");
      out.write("        </script>-->");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("    <div class=\"container\"> \t\t\t         \n");
      out.write("        <div class=\"register\">\n");
      out.write("            <form name=\"form-name\" action=\"Log?action=SignUp\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("                <div class=\"register-top-grid\">\n");
      out.write("                    <h3>PERSONAL INFORMATION</h3>\n");
      out.write("                    <div class=\"mation\">\n");
      out.write("                        <span>Full Name <label id=\"errFname\"></label></span>\n");
      out.write("                        <input type=\"text\" name=\"fullname\"> \n");
      out.write("\n");
      out.write("                        <span>Email Address <label id=\"errEmail\"></label></span>\n");
      out.write("                        <input type=\"text\" name=\"email\">\n");
      out.write("\n");
      out.write("                        <span>Username <label id=\"errUsername\"></label></span>\n");
      out.write("                        <input type=\"text\" name=\"username\"> \n");
      out.write("\n");
      out.write("                        <span>Password <label id=\"errPass\"></label></span>\n");
      out.write("                        <input type=\"password\" name=\"password\"> \n");
      out.write("\n");
      out.write("                        <span>Confirm Password <label id=\"errCon-Pass\" ></label></span>\n");
      out.write("                        <input type=\"password\" name=\"confirm-pass\">       \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <div class=\"submit\"><input type=\"submit\" value=\"Sign Up\" name=\"sign-up\"/></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("<!--footer-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"footer-class\">\r\n");
      out.write("            <div class=\"class-footer\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li ><a href=\"index.jsp\" class=\"scroll\">HOME </a><label>|</label></li>\r\n");
      out.write("                    <li><a href=\"category?cid1\" class=\"scroll\">MEN</a><label>|</label></li>\r\n");
      out.write("                    <li><a href=\"category?cid2\" class=\"scroll\">WOMEN</a><label>|</label></li>\r\n");
      out.write("                    <li><a href=\"category?cid3\" class=\"scroll\">KIDS</a><label>|</label></li>\r\n");
      out.write("                    <li><a href=\"category?cid4\" class=\"scroll\">ACCESSORIES</a><label>|</label></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"scroll\">LATEST PRODUCT</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <p class=\"footer-grid\">&copy; 2019 By <a href=\"#\" target=\"_blank\">Lee Nguyen</a> </p>\r\n");
      out.write("            </div>\t \r\n");
      out.write("            <div class=\"footer-left\">\r\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/logo1.png\" alt=\" \" style=\"height: 70px\"/></a>\r\n");
      out.write("            </div> \r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/validate.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
