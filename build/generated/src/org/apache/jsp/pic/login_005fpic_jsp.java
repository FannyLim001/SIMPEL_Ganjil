package org.apache.jsp.pic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fpic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Log In | SIMPEL</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\n");
      out.write("        <!-- App favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- App css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"light-style\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"dark-style\" />\n");
      out.write("        <style>\n");
      out.write("            .override-bg-auth{\n");
      out.write("                background: url(\"http://localhost:8080/SIMPEL_Ganjil/assets/images/foto-pcr.jpg\") center;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"authentication-bg pb-0\" data-layout-config='{\"darkMode\":false}'>\n");
      out.write("        <div class=\"auth-fluid override-bg-auth\">\n");
      out.write("            <!--Auth fluid left content -->\n");
      out.write("            <div class=\"auth-fluid-form-box\">\n");
      out.write("                <div class=\"align-items-center d-flex h-100\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                        <!-- Logo -->\n");
      out.write("                        <div class=\"auth-brand text-center text-lg-start\">\n");
      out.write("                            <a href=\"index.html\" class=\"logo-dark\">\n");
      out.write("                                <span><img src=\"assets/images/logo-dark.png\" alt=\"\" height=\"18\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"index.html\" class=\"logo-light\">\n");
      out.write("                                <span><img src=\"assets/images/logo.png\" alt=\"\" height=\"18\"></span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- title-->\n");
      out.write("                        <h4 class=\"mt-0\">Sign In</h4>\n");
      out.write("                        <p class=\"text-muted mb-4\">Enter your email address and password to access account.</p>\n");
      out.write("                        ");

                            if (request.getAttribute("kondisi_login") != null && request.getAttribute("kondisi_login").equals("gagal")) {
                        
      out.write("\n");
      out.write("                        <!-- Start Alert -->\n");
      out.write("                        <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                            Email atau password yang dimasukkan salah!\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Alert -->\n");
      out.write("                        ");
 
                            }else if (request.getAttribute("kondisi_login") != null && request.getAttribute("kondisi_login").equals("belum")) {
                        
      out.write("\n");
      out.write("                        <!-- Start Alert -->\n");
      out.write("                        <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                            Login terlebih dahulu sebelum akses halaman!\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Alert -->\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        \n");
      out.write("                        <!-- form -->\n");
      out.write("                        <form action=\"CekLoginPic.jsp\" method=\"POST\">\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"emailaddress\" class=\"form-label\">Email address</label>\n");
      out.write("                                <input name=\"email\" class=\"form-control\" type=\"email\" id=\"emailaddress\" required=\"\" placeholder=\"Enter your email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <a href=\"pages-recoverpw-2.html\" class=\"text-muted float-end\"><small>Forgot your password?</small></a>\n");
      out.write("                                <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("                                <input name=\"pass\" class=\"form-control\" type=\"password\" required=\"\" id=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" id=\"checkbox-signin\">\n");
      out.write("                                    <label class=\"form-check-label\" for=\"checkbox-signin\">Remember me</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-grid mb-0 text-center\">\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"submit\"><i class=\"mdi mdi-login\"></i> Log In </button>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- social-->\n");
      out.write("                            <div class=\"text-center mt-4\">\n");
      out.write("                                <p class=\"text-muted font-16\">Sign in with</p>\n");
      out.write("                                <ul class=\"social-list list-inline mt-3\">\n");
      out.write("                                    <li class=\"list-inline-item\">\n");
      out.write("                                        <a href=\"javascript: void(0);\" class=\"social-list-item border-primary text-primary\"><i class=\"mdi mdi-facebook\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-inline-item\">\n");
      out.write("                                        <a href=\"javascript: void(0);\" class=\"social-list-item border-danger text-danger\"><i class=\"mdi mdi-google\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-inline-item\">\n");
      out.write("                                        <a href=\"javascript: void(0);\" class=\"social-list-item border-info text-info\"><i class=\"mdi mdi-twitter\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-inline-item\">\n");
      out.write("                                        <a href=\"javascript: void(0);\" class=\"social-list-item border-secondary text-secondary\"><i class=\"mdi mdi-github\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <!-- end form-->\n");
      out.write("\n");
      out.write("                        <!-- Footer-->\n");
      out.write("                        <footer class=\"footer footer-alt\">\n");
      out.write("                            <p class=\"text-muted\">Don't have an account? <a href=\"pages-register-2.html\" class=\"text-muted ms-1\"><b>Sign Up</b></a></p>\n");
      out.write("                        </footer>\n");
      out.write("\n");
      out.write("                    </div> <!-- end .card-body -->\n");
      out.write("                </div> <!-- end .align-items-center.d-flex.h-100-->\n");
      out.write("            </div>\n");
      out.write("            <!-- end auth-fluid-form-box-->\n");
      out.write("\n");
      out.write("            <!-- Auth fluid right content -->\n");
      out.write("            <div class=\"auth-fluid-right text-center\">\n");
      out.write("                <div class=\"auth-user-testimonial\">\n");
      out.write("                    <h2 class=\"mb-3\">SIMPEL</h2>\n");
      out.write("                    <p class=\"lead\">\n");
      out.write("                        <i class=\"mdi mdi-format-quote-open\"></i>\n");
      out.write("                            Sistem Peminjaman Lab\n");
      out.write("                        <i class=\"mdi mdi-format-quote-close\"></i>\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        - 2 TI D Ganjil\n");
      out.write("                    </p>\n");
      out.write("                </div> <!-- end auth-user-testimonial-->\n");
      out.write("            </div>\n");
      out.write("            <!-- end Auth fluid right content -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end auth-fluid-->\n");
      out.write("\n");
      out.write("        <!-- bundle -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\n");
      out.write("    </body>\n");
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
