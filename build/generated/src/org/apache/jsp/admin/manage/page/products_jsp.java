package org.apache.jsp.admin.manage.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.Product;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/favicon.png\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <title>\n");
      out.write("            Products\n");
      out.write("        </title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link href=\"../assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"../assets/css/paper-dashboard.css?v=2.0.0\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("        <link href=\"../assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("        \n");
      out.write("        ");

            List<Product> listProducts = (List<Product>) session.getAttribute("listProducts");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper \">\n");
      out.write("            <div class=\"sidebar\" data-color=\"white\" data-active-color=\"danger\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"#\" class=\"simple-text logo-mini\">\n");
      out.write("                        <div class=\"logo-image-small\">\n");
      out.write("                            <img src=\"../assets/img/logo-small.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"simple-text logo-normal\">\n");
      out.write("                        LeeNguyen\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-wrapper\">\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"dashboard.jsp\">\n");
      out.write("                                <i class=\"nc-icon nc-bank\"></i>\n");
      out.write("                                <p>Dashboard</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"/notifications.jsp\">\n");
      out.write("                                <i class=\"nc-icon nc-bell-55\"></i>\n");
      out.write("                                <p>Notifications</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"/user.jsp\">\n");
      out.write("                                <i class=\"nc-icon nc-single-02\"></i>\n");
      out.write("                                <p>User Profile</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"products.jsp\">\n");
      out.write("                                <i class=\"nc-icon nc-tile-56\"></i>\n");
      out.write("                                <p>Products</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-panel\">\n");
      out.write("                <!-- Navbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"navbar-wrapper\">\n");
      out.write("                            <div class=\"navbar-toggle\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggler\">\n");
      out.write("                                    <span class=\"navbar-toggler-bar bar1\"></span>\n");
      out.write("                                    <span class=\"navbar-toggler-bar bar2\"></span>\n");
      out.write("                                    <span class=\"navbar-toggler-bar bar3\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\">Management</a>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("                            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("                            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"input-group no-border\">\n");
      out.write("                                    <input type=\"text\" value=\"\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                                    <div class=\"input-group-append\">\n");
      out.write("                                        <div class=\"input-group-text\">\n");
      out.write("                                            <i class=\"nc-icon nc-zoom-split\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <ul class=\"navbar-nav\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link btn-magnify\" href=\"#\">\n");
      out.write("                                        <i class=\"nc-icon nc-layout-11\"></i>\n");
      out.write("                                        <p>\n");
      out.write("                                            <span class=\"d-lg-none d-md-block\">Stats</span>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item btn-rotate dropdown\">\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                        <i class=\"nc-icon nc-bell-55\"></i>\n");
      out.write("                                        <p>\n");
      out.write("                                            <span class=\"d-lg-none d-md-block\">Some Actions</span>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link btn-rotate\" href=\"#\" title=\"Account\">\n");
      out.write("                                        <i class=\"nc-icon nc-settings-gear-65\"></i>\n");
      out.write("                                        <p>\n");
      out.write("                                            <span class=\"d-lg-none d-md-block\">Account</span>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- End Navbar -->\n");
      out.write("                <!-- <div class=\"panel-header panel-header-sm\"></div> -->\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <h4 class=\"card-title\">Products</h4>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table\">\n");
      out.write("                                            <thead class=\" text-primary\">\n");
      out.write("                                            <th>Image</th>\n");
      out.write("                                            <th>Id</th>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("                                            <th>Last Update</th>\n");
      out.write("                                            <th>Price</th>\n");
      out.write("                                            <th>More</th>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 for (Product p: listProducts) { 
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"thumb-img\">\n");
      out.write("                                                        <img src=\"");
      out.print("../../../imageshow/"+p.getImage());
      out.write("\" alt=\"\"/>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"product-id\">");
      out.print(p.getProductId());
      out.write("</td>\n");
      out.write("                                                    <td class=\"product-name\">");
      out.print(p.getName());
      out.write("</td>\n");
      out.write("                                                    <td class=\"product-date\">");
      out.print(p.getLastUpdate());
      out.write("</td>\n");
      out.write("                                                    <td class=\"product-price\">");
      out.print(p.getPrice());
      out.write("</td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <a class=\"link\" href=\"\" title=\"View Detail\">View Detail</a>\n");
      out.write("                                                        <a class=\"link\" href=\"#\" title=\"Delete\">Delete</a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
 } 
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <footer class=\"footer footer-black  footer-white \">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <nav class=\"footer-nav\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" target=\"_blank\">Lee</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" target=\"_blank\">Blog</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" target=\"_blank\">Licenses</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                            <div class=\"credits ml-auto\">\n");
      out.write("                                <span class=\"copyright\">\n");
      out.write("                                    ©\n");
      out.write("                                    <script>\n");
      out.write("                                        document.write(new Date().getFullYear())\n");
      out.write("                                    </script>, made with <i class=\"fa fa-heart heart\"></i> by Lee Nguyen\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </body>\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"../assets/js/core/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../assets/js/core/popper.min.js\"></script>\n");
      out.write("    <script src=\"../assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("    <!-- Chart JS -->\n");
      out.write("    <script src=\"../assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"../assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("    <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("    <script src=\"../assets/js/paper-dashboard.min.js?v=2.0.0\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- Paper Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("    <script src=\"../assets/demo/demo.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
