package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Lee Fashion Store</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Lee Fashion Store\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("        \n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/etalage.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 String name = (String) session.getAttribute("name"); 
           String role = (String) session.getAttribute("role");
        
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"header-grid\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\" class=\"scroll cart\" title=\"View Cart\"><i class=\"fas fa-cart-plus\"></i>\n");
      out.write("                                    <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label></a></li>\n");
      out.write("                        ");
 if ("admin".equals(role)) { 
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" class=\"scroll\" title=\"Product Management\">\n");
      out.write("                                    <i class=\"fas fa-chalkboard-teacher\"></i>Product Management\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        ");
 } 
      out.write("\n");
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
      out.write("                            <a href=\"#\" class=\"hello\" title=\"View Profile\">\n");
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
      out.write("                            <li class=\"\"><a href=\"index.jsp\">HOME </a></li>\n");
      out.write("                            <li><a href=\"category?cid1\" >MEN</a></li>\n");
      out.write("                            <li><a href=\"category?cid2\" >WOMEN</a></li>\n");
      out.write("                            <li><a href=\"category?cid3\" >KIDS</a></li>\n");
      out.write("                            <li><a href=\"category?cid4\" >ACCESSORIES</a></li>\n");
      out.write("                            <li><a href=\"#\" >LATEST PRODUCT</a></li>\n");
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
      out.write("        </div>");
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"women-in\">\n");
      out.write("            <div class=\"col-md-9 col-d\">\n");
      out.write("                <div class=\"banner\">\n");
      out.write("                    <video class=\"banner-video\" loop autoplay>\n");
      out.write("                        <source src=\"images/bannervideo.mp4\" type=\"video/mp4\"/>\n");
      out.write("                    </video>\n");
      out.write("                    <div class=\"sub-banner-logo\">\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\" \"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!---->\n");
      out.write("                <div class=\"in-line\">\n");
      out.write("                    <div class=\"para-an\">\n");
      out.write("                        <h3>LATEST  ARRIVALS</h3>\n");
      out.write("                        <p>Check our all latest products in this section.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"lady-in\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 col-m-left\">\n");
      out.write("                <div class=\"in-left\">\t\t\t\t\n");
      out.write("                    <p class=\"code\">Cool COLLECTIONS</p>\t\t\n");
      out.write("                    <div class=\"cool\">\t\t\n");
      out.write("                    </div>\t\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"discount\">\n");
      out.write("                    <a href=\"#\"><img class=\"img-responsive pic-in\" src=\"images/p2.jpg\" alt=\" \" >\t</a>\t\t\n");
      out.write("                    <p class=\"no-more\">Exclusive <b>discount</b> <span>Womens wear</span></p>\t\t\t\t\t\n");
      out.write("                    <a href=\"#\" class=\"know-more\">know more</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"discount\">\n");
      out.write("                    <a href=\"#\"><img class=\"img-responsive pic-in\" src=\"images/p3.jpg\" alt=\" \" ></a>\t\t\t\n");
      out.write("                    <p class=\"no-more no-get\">Get Exclusive <b>discount on</b> <span>Ladies wear</span></p>\t\t\t\t\t\n");
      out.write("                    <a href=\"#\" class=\"know-more\">know more</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"discount\">\n");
      out.write("                    <a href=\"single.html\"><img class=\"img-responsive pic-in\" src=\"images/p2.jpg\" alt=\" \" >\t</a>\t\t\n");
      out.write("                    <p class=\"no-more\">Exclusive <b>discount</b> <span>Womens wear</span></p>\t\t\t\t\t\n");
      out.write("                    <a href=\"#\" class=\"know-more\">know more</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"twitter-in\">\n");
      out.write("                    <h5>TWITTER  UPDATES</h5>\n");
      out.write("                    <span class=\"twitter-ic\">\t</span>\n");
      out.write("                    <div class=\"up-date\">\n");
      out.write("                        <p>@leenguyen Looks like nice and dicent design</p>\n");
      out.write("                        <a href=\"#\">http://bit.ly/sun</a>\n");
      out.write("                        <p class=\"ago\">About 1 hour ago via twitterfeed</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"up-date\">\n");
      out.write("                        <p>@leenguyen Looks like nice and dicent design</p>\n");
      out.write("                        <a href=\"#\">http://bit.ly/sun</a>\n");
      out.write("                        <p class=\"ago\">About 1 hour ago via twitterfeed</p>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#\" class=\"tweets\">More Tweets</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("        <!---->\n");
      out.write("        <div class=\"lady-in-on\">\n");
      out.write("            <div class=\"buy-an\">\n");
      out.write("                <h3>CATEGORY</h3>\n");
      out.write("                <p>Check our all latest products in this section.</p>\n");
      out.write("            </div>\n");
      out.write("            <ul id=\"flexiselDemo1\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(window).load(function() {\n");
      out.write("                    $(\"#flexiselDemo1\").flexisel({\n");
      out.write("                        visibleItems: 4,\n");
      out.write("                        animationSpeed: 1500,\n");
      out.write("                        autoPlay: true,\n");
      out.write("                        autoPlaySpeed: 2000,\n");
      out.write("                        pauseOnHover: true,\n");
      out.write("                        enableResponsiveBreakpoints: true,\n");
      out.write("                        responsiveBreakpoints: {\n");
      out.write("                            portrait: {\n");
      out.write("                                changePoint: 480,\n");
      out.write("                                visibleItems: 1\n");
      out.write("                            },\n");
      out.write("                            landscape: {\n");
      out.write("                                changePoint: 640,\n");
      out.write("                                visibleItems: 2\n");
      out.write("                            },\n");
      out.write("                            tablet: {\n");
      out.write("                                changePoint: 768,\n");
      out.write("                                visibleItems: 3\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!---->");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("manageProducts");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("view");
    _jspx_th_c_set_0.setValue(new String("/index"));
    _jspx_th_c_set_0.setScope("session");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-md-4 you-para\">\n");
          out.write("                                <a href=\"");
          if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">\n");
          out.write("                                       <img class=\"img-responsive pic-in\" style=\"height: 200px;\"\n");
          out.write("                                            src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.imgProductPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\" \">\n");
          out.write("                                </a>\n");
          out.write("                                <div class=\"you-in\">\n");
          out.write("                                    <span>15<label>%</label></span>\n");
          out.write("                                    <small>off</small>\n");
          out.write("                                </div>  \n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                <span>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("  | <label class=\"cat-in\"> </label> <a href=\"#\">Add to Cart </a></span>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("product?${product.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("category");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <li><a href=\"");
          if (_jspx_meth_c_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\">\n");
          out.write("                            <img class=\"img-responsive women\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.imgCategoryPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                        </a>\n");
          out.write("                    <div class=\"hide-in\">\n");
          out.write("                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        <span>$69.00  |  <a href=\"category?");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">View</a></span>\n");
          out.write("                    </div></li>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("category?${category.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }
}
