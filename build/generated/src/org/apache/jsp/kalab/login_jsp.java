package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Log In Kepala Lab | SIMPEL </title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\n");
      out.write("        <!-- App favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- App css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"light-style\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"dark-style\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"loading authentication-bg\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\n");
      out.write("        <div class=\"account-pages pt-2 pt-sm-5 pb-4 pb-sm-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-xxl-4 col-lg-5\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("\n");
      out.write("                            <!-- Logo -->\n");
      out.write("                            <div class=\"card-header pt-4 pb-4 text-center bg-primary\">\n");
      out.write("                                <a href=\"index.html\">\n");
      out.write("                                    <span><img src=\"assets/images/logo.png\" alt=\"\" height=\"18\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body p-4\">\n");
      out.write("\n");
      out.write("                                <div class=\"text-center w-75 m-auto\">\n");
      out.write("                                    <h4 class=\"text-dark-50 text-center pb-0 fw-bold\">Sign In</h4>\n");
      out.write("                                    <p class=\"text-muted mb-4\">Enter your email address and password to access admin panel.</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <form action=\"#\">\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"emailaddress\" class=\"form-label\">Email address</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"email\" id=\"emailaddress\" required=\"\" placeholder=\"Enter your email\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("                                        <div class=\"input-group input-group-merge\">\n");
      out.write("                                            <input type=\"password\" id=\"password\" class=\"form-control\" placeholder=\"Enter your password\">\n");
      out.write("                                            <div class=\"input-group-text\" data-password=\"false\">\n");
      out.write("                                                <span class=\"password-eye\"></span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3 mb-0 text-center\">\n");
      out.write("                                        <button class=\"btn btn-primary\" type=\"submit\"> Log In </button>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div> <!-- end card-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end card -->\n");
      out.write("\n");
      out.write("                    </div> <!-- end col -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end page -->\n");
      out.write("\n");
      out.write("        <footer class=\"footer footer-alt\">\n");
      out.write("            2018 - 2021 © Hyper - Coderthemes.com\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- bundle -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\n");
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
