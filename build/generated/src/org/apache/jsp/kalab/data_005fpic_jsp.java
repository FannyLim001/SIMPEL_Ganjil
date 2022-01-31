package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class data_005fpic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/kalab/include/sidebar.jsp");
    _jspx_dependants.add("/kalab/include/header.jsp");
    _jspx_dependants.add("/kalab/include/footer.jsp");
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
      out.write("<html lang=\"id\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Data PIC Lab | SIMPEL</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\n");
      out.write("        <!-- Begin page -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <!-- ========== Left Sidebar Start ========== -->\n");
      out.write("<div class=\"leftside-menu\">\n");
      out.write("\n");
      out.write("    <!-- LOGO -->\n");
      out.write("    <a href=\"index.html\" class=\"logo text-center logo-light\">\n");
      out.write("        <span class=\"logo-lg\">\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" height=\"16\">\n");
      out.write("        </span>\n");
      out.write("        <span class=\"logo-sm\">\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\n");
      out.write("        </span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <div class=\"h-100\" id=\"leftside-menu-container\" data-simplebar>\n");
      out.write("\n");
      out.write("        <!--- Sidemenu -->\n");
      out.write("        <ul class=\"side-nav\">\n");
      out.write("\n");
      out.write("            <li class=\"side-nav-title side-nav-item text-center\">Navigation</li>\n");
      out.write("            <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/dashboard.jsp\" class=\"side-nav-link\">\n");
      out.write("                    <i class=\"uil-home-alt\"></i>\n");
      out.write("                    <span> Dashboard </span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/daftar_peminjaman.jsp\" class=\"side-nav-link\">\n");
      out.write("                    <i class=\"mdi mdi-office-building\"></i>\n");
      out.write("                    <span> Peminjaman </span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/daftar_pic.jsp\" class=\"side-nav-link\">\n");
      out.write("                    <i class=\"mdi mdi-office-building\"></i>\n");
      out.write("                    <span> PIC Lab </span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/laporan_peminjaman.jsp\" class=\"side-nav-link\">\n");
      out.write("                    <i class=\"mdi mdi-trophy\"></i>\n");
      out.write("                    <span> Laporan Peminjaman</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- End Sidebar -->\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Sidebar -left -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- Left Sidebar End -->\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Start Page Content here -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("            <div class=\"content-page\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!-- Header Start -->\n");
      out.write("    <div class=\"navbar-custom\">\n");
      out.write("        <ul class=\"list-unstyled topbar-menu float-end mb-0\">\n");
      out.write("            <li class=\"dropdown notification-list\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle nav-user arrow-none me-0\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"false\"\n");
      out.write("                   aria-expanded=\"false\">\n");
      out.write("                    <span class=\"account-user-avatar\"> \n");
      out.write("                        <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/users/avatar-2.jpg\" alt=\"user-image\" class=\"rounded-circle\">\n");
      out.write("                    </span>\n");
      out.write("                    <span>\n");
      out.write("                        <span class=\"account-user-name\">Kelompok 2</span>\n");
      out.write("                        <span class=\"account-position\">Kepala Lab</span>\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown\">\n");
      out.write("                    <!-- item-->\n");
      out.write("                    <a href=\"http://localhost:8080/SIMPEL_Ganjil/admin/auth/logout\" class=\"dropdown-item notify-item\">\n");
      out.write("                        <i class=\"mdi mdi-logout me-1\"></i>\n");
      out.write("                        <span>Logout</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <button class=\"button-menu-mobile open-left\">\n");
      out.write("            <i class=\"mdi mdi-menu\"></i>\n");
      out.write("        </button>\n");
      out.write("    </div>\n");
      out.write("    <!-- end Topbar -->\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Start Content-->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"page-title-box\">\n");
      out.write("                                    <div class=\"page-title-right\">\n");
      out.write("                                        <ol class=\"breadcrumb m-0\">\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">SIMPEL</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">Kepala Lab</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Data PIC Lab</li>\n");
      out.write("                                        </ol>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h4 class=\"page-title\">Data PIC Lab SIMPEL</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end page title --> \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <!--Disini Konten-->\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div> <!-- container -->\n");
      out.write("\n");
      out.write("                </div> <!-- content -->\n");
      out.write("             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!-- Footer Start -->\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <script>document.write(new Date().getFullYear())</script> © SIMPEL - Development by Ganjil 2TID\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"text-md-end footer-links d-none d-md-block\">\n");
      out.write("                        <a href=\"https://github.com/FannyLim001/SIMPEL_Ganjil\">Developer Page</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- end Footer -->\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- End Page content -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- END wrapper -->\n");
      out.write("\n");
      out.write("        <div class=\"rightbar-overlay\"></div>\n");
      out.write("        <!-- /End-bar -->\n");
      out.write("\n");
      out.write("        <!-- bundle -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- third party js -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/Chart.bundle.min.js\"></script>\n");
      out.write("        <!-- third party js ends -->\n");
      out.write("\n");
      out.write("        <!-- demo app -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.dashboard-projects.js\"></script>\n");
      out.write("        <!-- end demo js-->\n");
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
