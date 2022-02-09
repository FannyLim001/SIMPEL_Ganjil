package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import config.database;
import models.kalab.DashboardModel;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      models.kalab.DashboardModel Dashboard = null;
      synchronized (_jspx_page_context) {
        Dashboard = (models.kalab.DashboardModel) _jspx_page_context.getAttribute("Dashboard", PageContext.PAGE_SCOPE);
        if (Dashboard == null){
          Dashboard = new models.kalab.DashboardModel();
          _jspx_page_context.setAttribute("Dashboard", Dashboard, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      controllers.kalab.KalabController KalabController = null;
      synchronized (_jspx_page_context) {
        KalabController = (controllers.kalab.KalabController) _jspx_page_context.getAttribute("KalabController", PageContext.PAGE_SCOPE);
        if (KalabController == null){
          KalabController = new controllers.kalab.KalabController();
          _jspx_page_context.setAttribute("KalabController", KalabController, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
        int id_kalab = (Integer) session.getAttribute("id");
        
    DashboardModel[] dataDashboard = KalabController.getDataDashboard(id_kalab);
    
    for(int i=0; i<dataDashboard.length; i++){
        Dashboard = dataDashboard[i];
    }

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Dashboard"), "total_peminjaman",
Dashboard.getTotal_peminjaman());
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Dashboard"), "total_lab",
 Dashboard.getTotal_lab());
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Dashboard"), "total_disetujui",
 Dashboard.getTotal_disetujui());
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Dashboard"), "total_ditolak",
 Dashboard.getTotal_ditolak());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"id\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>Dashboard Kepala Lab | SIMPEL</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\r\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\r\n");
      out.write("        <!-- Begin page -->\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("     <!-- ========== Left Sidebar Start ========== -->\r\n");
      out.write("<div class=\"leftside-menu\">\r\n");
      out.write("\r\n");
      out.write("    <!-- LOGO -->\r\n");
      out.write("    <a href=\"index.html\" class=\"logo text-center logo-light\">\r\n");
      out.write("        <span class=\"logo-lg\">\r\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" height=\"16\">\r\n");
      out.write("        </span>\r\n");
      out.write("        <span class=\"logo-sm\">\r\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\r\n");
      out.write("        </span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"h-100\" id=\"leftside-menu-container\" data-simplebar>\r\n");
      out.write("\r\n");
      out.write("        <!--- Sidemenu -->\r\n");
      out.write("        <ul class=\"side-nav\">\r\n");
      out.write("\r\n");
      out.write("            <li class=\"side-nav-title side-nav-item text-center\">Navigation</li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/dashboard.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"uil-home-alt\"></i>\r\n");
      out.write("                    <span> Dashboard </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/daftar_peminjaman.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-clipboard-multiple\"></i>\r\n");
      out.write("                    <span> Peminjaman </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/data_pic.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-account-group\"></i>\r\n");
      out.write("                    <span> PIC Lab </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/kalab/laporan_peminjaman.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-book-arrow-up\"></i>\r\n");
      out.write("                    <span> Laporan Peminjaman</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- End Sidebar -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Sidebar -left -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Left Sidebar End -->\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- Start Page Content here -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"content-page\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- App favicon -->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/favicon.ico\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- App css -->\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"light-style\" />\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"dark-style\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- third party css -->\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/buttons.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/select.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- third party css end -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Datatables css -->\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Header Start -->\r\n");
      out.write("    <div class=\"navbar-custom\">\r\n");
      out.write("        <ul class=\"list-unstyled topbar-menu float-end mb-0\">\r\n");
      out.write("            <li class=\"dropdown notification-list\">\r\n");
      out.write("                <a class=\"nav-link dropdown-toggle nav-user arrow-none me-0\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"false\"\r\n");
      out.write("                   aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"account-user-avatar\"> \r\n");
      out.write("                        <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/users/avatar-2.jpg\" alt=\"user-image\" class=\"rounded-circle\">\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span>\r\n");
      out.write("                        <span class=\"account-user-name\">Kepala Lab ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        <span class=\"account-position\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown\">\r\n");
      out.write("                    <!-- item-->\r\n");
      out.write("                    <a href=\"logout.jsp\" class=\"dropdown-item notify-item\">\r\n");
      out.write("                        <i class=\"mdi mdi-logout me-1\"></i>\r\n");
      out.write("                        <span>Logout</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <button class=\"button-menu-mobile open-left\">\r\n");
      out.write("            <i class=\"mdi mdi-menu\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end Topbar -->\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- Start Content-->\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"page-title-box\">\r\n");
      out.write("                                    <div class=\"page-title-right\">\r\n");
      out.write("                                        <ol class=\"breadcrumb m-0\">\r\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">SIMPEL</a></li>\r\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"dashboard.jsp\">Kepala Lab</a></li>\r\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Dashboard</li>\r\n");
      out.write("                                        </ol>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"page-title\">Dashboard SIMPEL</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- end page title --> \r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xl-5 col-lg-6\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"card widget-flat\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                <div class=\"float-end\">\r\n");
      out.write("                                                    <i class=\"mdi mdi-clipboard-multiple widget-icon\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4 class=\"text-muted fw-normal mt-0\" title=\"Total Peminjaman\">Total Peminjaman</h4>\r\n");
      out.write("                                                <h2 class=\"mt-3 mb-3\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.DashboardModel)_jspx_page_context.findAttribute("Dashboard")).getTotal_peminjaman())));
      out.write("</h2>\r\n");
      out.write("                                            </div> <!-- end card-body-->\r\n");
      out.write("                                        </div> <!-- end card-->\r\n");
      out.write("                                    </div> <!-- end col-->\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"card widget-flat\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                <div class=\"float-end\">\r\n");
      out.write("                                                    <i class=\"mdi mdi-desktop-tower-monitor widget-icon\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4 class=\"text-muted fw-normal mt-0\" title=\"Total Lab\">Total Lab</h4>\r\n");
      out.write("                                                <h2 class=\"mt-3 mb-3\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.DashboardModel)_jspx_page_context.findAttribute("Dashboard")).getTotal_lab())));
      out.write("</h2>\r\n");
      out.write("                                            </div> <!-- end card-body-->\r\n");
      out.write("                                        </div> <!-- end card-->\r\n");
      out.write("                                    </div> <!-- end col-->\r\n");
      out.write("                                </div> <!-- end row -->\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"card widget-flat\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                <div class=\"float-end\">\r\n");
      out.write("                                                    <i class=\"mdi mdi-clipboard-check-multiple widget-icon\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4 class=\"text-muted fw-normal mt-0\" title=\"Average Revenue\">Peminjaman disetujui</h4>\r\n");
      out.write("                                                <h2 class=\"mt-3 mb-3\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.DashboardModel)_jspx_page_context.findAttribute("Dashboard")).getTotal_disetujui())));
      out.write("</h2>\r\n");
      out.write("                                            </div> <!-- end card-body-->\r\n");
      out.write("                                        </div> <!-- end card-->\r\n");
      out.write("                                    </div> <!-- end col-->\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <div class=\"card widget-flat\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                <div class=\"float-end\">\r\n");
      out.write("                                                    <i class=\"mdi mdi-clipboard-off widget-icon\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <h4 class=\"text-muted fw-normal mt-0\" title=\"Growth\">Peminjaman ditolak</h4>\r\n");
      out.write("                                                <h2 class=\"mt-3 mb-3\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.DashboardModel)_jspx_page_context.findAttribute("Dashboard")).getTotal_ditolak())));
      out.write("</h2>\r\n");
      out.write("                                            </div> <!-- end card-body-->\r\n");
      out.write("                                        </div> <!-- end card-->\r\n");
      out.write("                                    </div> <!-- end col-->\r\n");
      out.write("                                </div> <!-- end row -->\r\n");
      out.write("\r\n");
      out.write("                            </div> <!-- end col -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-xl-7 col-lg-6\">\r\n");
      out.write("                                <div class=\"card card-h-100\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <h4 class=\"header-title mb-3\">Peminjaman per-bulan</h4>\r\n");
      out.write("\r\n");
      out.write("                                        <div dir=\"ltr\">\r\n");
      out.write("                                            <!--<div id=\"high-performing-product\" class=\"apex-charts\" data-colors=\"#727cf5,#e3eaef\"></div>-->\r\n");
      out.write("                                            <canvas id=\"dashboard_chart\"></canvas>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div> <!-- end card-body-->\r\n");
      out.write("                                </div> <!-- end card-->\r\n");
      out.write("\r\n");
      out.write("                            </div> <!-- end col -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- end row -->\r\n");
      out.write("\r\n");
      out.write("                    </div> <!-- container -->\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- content -->\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Footer Start -->\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <script>document.write(new Date().getFullYear())</script> © SIMPEL - Development by Ganjil 2TID\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <div class=\"text-md-end footer-links d-none d-md-block\">\r\n");
      out.write("                            <a href=\"https://github.com/FannyLim001/SIMPEL_Ganjil\">Developer Page</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- bundle -->\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- third party js -->\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.bootstrap5.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.responsive.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/responsive.bootstrap5.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.buttons.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.bootstrap5.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.html5.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.flash.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.print.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.keyTable.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.select.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/apexcharts.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/Chart.bundle.min.js\"></script>\r\n");
      out.write("        <!-- third party js ends -->\r\n");
      out.write("\r\n");
      out.write("        <!-- demo app -->\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.dashboard.js\"></script>\r\n");
      out.write("        <!-- end demo js-->\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $('#tbl-proses').DataTable({\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $('#tbl-selesai').DataTable({\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("    <!-- end Footer -->\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- End Page content -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END wrapper -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"rightbar-overlay\"></div>\r\n");
      out.write("        <!-- /End-bar -->\r\n");
      out.write("\r\n");
      out.write("        ");

            Gson gson = new Gson();
            String data_bulan=null;

            database db = new database();
            db.connection();
            int yVal [] = new int[12];
            ResultSet rs = null;
            int total= Dashboard.getTotal_peminjaman();
                    
            try{    
                    String sql = "select monthname(tgl_peminjaman) as bulan from tbl_peminjaman where level between 2 and 3";
                    rs = db.getData(sql);
                    
                    for(int i=1; i<total; i++){
                        while(rs.next()){
                                if(rs.getString("bulan").equals("January")){
                                    yVal[0]=yVal[0]+1;
                                } else if(rs.getString("bulan").equals("February")){
                                    yVal[1]=yVal[1]+1;
                                } else if(rs.getString("bulan").equals("March")){
                                    yVal[2]=yVal[2]+1;
                                } else if(rs.getString("bulan").equals("April")){
                                    yVal[3]=yVal[3]+1;
                                } else if(rs.getString("bulan").equals("May")){
                                    yVal[4]=yVal[4]+1;
                                } else if(rs.getString("bulan").equals("June")){
                                    yVal[5]=yVal[5]+1;
                                } else if(rs.getString("bulan").equals("July")){
                                    yVal[6]=yVal[6]+1;
                                } else if(rs.getString("bulan").equals("August")){
                                    yVal[7]=yVal[7]+1;
                                } else if(rs.getString("bulan").equals("September")){
                                    yVal[8]=yVal[8]+1;
                                } else if(rs.getString("bulan").equals("October")){
                                    yVal[9]=yVal[9]+1;
                                } else if(rs.getString("bulan").equals("November")){
                                    yVal[10]=yVal[10]+1;
                                } else if(rs.getString("bulan").equals("December")){
                                    yVal[11]=yVal[11]+1;
                                }
                        }
                    }
                    data_bulan = gson.toJson(yVal);
                    db.disconnect(rs);
            }
            catch(SQLException e){
                    out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
            }
        
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            const ctx = document.getElementById('dashboard_chart');\r\n");
      out.write("            const myChart = new Chart(ctx, {\r\n");
      out.write("                type: 'bar',\r\n");
      out.write("                data: {\r\n");
      out.write("                    labels: [\r\n");
      out.write("                        \"Jan\",\r\n");
      out.write("                        \"Feb\",\r\n");
      out.write("                        \"Mar\",\r\n");
      out.write("                        \"Apr\",\r\n");
      out.write("                        \"Mei\",\r\n");
      out.write("                        \"Jun\",\r\n");
      out.write("                        \"Jul\",\r\n");
      out.write("                        \"Agu\",\r\n");
      out.write("                        \"Sep\",\r\n");
      out.write("                        \"Okt\",\r\n");
      out.write("                        \"Nov\",\r\n");
      out.write("                        \"Des\",\r\n");
      out.write("                    ],\r\n");
      out.write("                    datasets: [{\r\n");
      out.write("                            label: 'Data Peminjaman tiap bulan',\r\n");
      out.write("                            data: ");
      out.print( data_bulan );
      out.write(",\r\n");
      out.write("                            backgroundColor: [\r\n");
      out.write("                                'rgba(255, 99, 132, 0.7)',\r\n");
      out.write("                                'rgba(54, 162, 235, 0.7)',\r\n");
      out.write("                                'rgba(255, 206, 86, 0.7)',\r\n");
      out.write("                                'rgba(75, 192, 192, 0.7)',\r\n");
      out.write("                                'rgba(153, 102, 255, 0.7)',\r\n");
      out.write("                                'rgba(255, 159, 64, 0.7)'\r\n");
      out.write("                            ],\r\n");
      out.write("                            borderColor: [\r\n");
      out.write("                                'rgba(255, 99, 132, 1)',\r\n");
      out.write("                                'rgba(54, 162, 235, 1)',\r\n");
      out.write("                                'rgba(255, 206, 86, 1)',\r\n");
      out.write("                                'rgba(75, 192, 192, 1)',\r\n");
      out.write("                                'rgba(153, 102, 255, 1)',\r\n");
      out.write("                                'rgba(255, 159, 64, 1)'\r\n");
      out.write("                            ],\r\n");
      out.write("                            borderWidth: 1,\r\n");
      out.write("                            barPercentage: 0.5,\r\n");
      out.write("                        }]\r\n");
      out.write("                },\r\n");
      out.write("                options: {\r\n");
      out.write("                    scales: {\r\n");
      out.write("                        x: {\r\n");
      out.write("                            grid: {\r\n");
      out.write("                                display: false\r\n");
      out.write("                            }\r\n");
      out.write("                        },\r\n");
      out.write("                        y: {\r\n");
      out.write("                            beginAtZero: true,\r\n");
      out.write("                            grid: {\r\n");
      out.write("                                display: false\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
 } 
      out.write('\r');
      out.write('\n');
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
