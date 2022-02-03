package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.kalab.KalabModel;

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
      out.write("\n");
      models.kalab.KalabModel Kalab = null;
      synchronized (_jspx_page_context) {
        Kalab = (models.kalab.KalabModel) _jspx_page_context.getAttribute("Kalab", PageContext.PAGE_SCOPE);
        if (Kalab == null){
          Kalab = new models.kalab.KalabModel();
          _jspx_page_context.setAttribute("Kalab", Kalab, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      controllers.kalab.KalabController KalabController = null;
      synchronized (_jspx_page_context) {
        KalabController = (controllers.kalab.KalabController) _jspx_page_context.getAttribute("KalabController", PageContext.PAGE_SCOPE);
        if (KalabController == null){
          KalabController = new controllers.kalab.KalabController();
          _jspx_page_context.setAttribute("KalabController", KalabController, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
 
    KalabModel[] daftarKalab = KalabController.getDataKalab();

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
      out.write("        <link rel=\"shortcut icon\" href=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- App css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"light-style\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"dark-style\" />\n");
      out.write("        \n");
      out.write("        <script>  \n");
      out.write("    function validateForm() {  \n");
      out.write("        //collect form data in JavaScript variables  \n");
      out.write("        var email1 = document.getElementById(\"input_email\").value;\n");
      out.write("        var email2 = document.getElementById(\"db_email\").value;\n");
      out.write("        var pw1 = document.getElementById(\"input_pass\").value;  \n");
      out.write("        var pw2 = document.getElementById(\"db_pass\").value;  \n");
      out.write("        \n");
      out.write("        if(email1!=email2) {  \n");
      out.write("          document.getElementById(\"message1\").innerHTML = \"**Email salah!\";  \n");
      out.write("          return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        if(pw1!=pw2) {  \n");
      out.write("          document.getElementById(\"message2\").innerHTML = \"**Password salah!\";  \n");
      out.write("          return false;  \n");
      out.write("        }\n");
      out.write("     }  \n");
      out.write("    </script> \n");
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
      out.write("                                <a href=\"dashboard.jsp\">\n");
      out.write("                                    <span><img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"18\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"card-body p-4\">\n");
      out.write("\n");
      out.write("                                <div class=\"text-center w-75 m-auto\">\n");
      out.write("                                    <h4 class=\"text-dark-50 text-center pb-0 fw-bold\">Log In</h4>\n");
      out.write("                                    <p class=\"text-muted mb-4\">Masukkan email PCR dan password anda untuk mengakses sistem</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <form onsubmit =\"return validateForm()\" id=\"login_form\" action=\"../Login\" method=\"post\">\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"emailaddress\" class=\"form-label\">Email address</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"email\" id=\"input_email\" required=\"\" placeholder=\"Enter your email\">\n");
      out.write("                                        <input class=\"form-control\" type=\"hidden\" id=\"db_email\" required=\"\" value=\"");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Kalab"), "email_kalab",
 Kalab.getEmail_kalab());
      out.write("\">\n");
      out.write("                                        <span id = \"message1\" style=\"color:red\"> </span>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("                                        <div class=\"input-group input-group-merge\">\n");
      out.write("                                            <input type=\"password\" id=\"input_pass\" class=\"form-control\" placeholder=\"Enter your password\">\n");
      out.write("                                            <input type=\"hidden\" id=\"db_pass\" class=\"form-control\" value=\"");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Kalab"), "pass_kalab",
 Kalab.getPass_kalab());
      out.write("\">\n");
      out.write("                                            <div class=\"input-group-text\" data-password=\"false\">\n");
      out.write("                                                <span class=\"password-eye\"></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <span id = \"message2\" style=\"color:red\"> </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3 mb-0 text-center\">\n");
      out.write("                                        <button class=\"btn btn-primary\" type=\"submit\"> Log In </button>\n");
      out.write("                                    </div>\n");
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
