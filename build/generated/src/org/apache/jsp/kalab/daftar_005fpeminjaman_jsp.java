package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.kalab.PeminjamanModel;

public final class daftar_005fpeminjaman_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      models.kalab.PeminjamanModel Peminjaman = null;
      synchronized (_jspx_page_context) {
        Peminjaman = (models.kalab.PeminjamanModel) _jspx_page_context.getAttribute("Peminjaman", PageContext.PAGE_SCOPE);
        if (Peminjaman == null){
          Peminjaman = new models.kalab.PeminjamanModel();
          _jspx_page_context.setAttribute("Peminjaman", Peminjaman, PageContext.PAGE_SCOPE);
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
      out.write('\r');
      out.write('\n');
 
    PeminjamanModel[] daftarPeminjaman = KalabController.getDaftarPeminjamanBelumSelesai();
    PeminjamanModel[] daftarPeminjaman2 = KalabController.getDaftarPeminjamanSelesai();

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>Data Peminjaman | SIMPEL</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\r\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\r\n");
      out.write("        <!-- Begin page -->\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <!-- Sidebar Start -->\r\n");
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
      out.write("            <!-- end Sidebar -->\r\n");
      out.write("\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("            <!-- Start Page Content here -->\r\n");
      out.write("            <!-- ============================================================== -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"content-page\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar Start -->\r\n");
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
      out.write("                        <span class=\"account-user-name\">Kelompok 2</span>\r\n");
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
      out.write("                    <!-- end Topbar -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Start Content-->\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- start page title -->\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"page-title-box\">\r\n");
      out.write("                                    <div class=\"page-title-right\">\r\n");
      out.write("                                        <ol class=\"breadcrumb m-0\">\r\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">SIMPEL</a></li>\r\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"dashboard.jsp\">Kepala Lab</a></li>\r\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Daftar Peminjaman</li>\r\n");
      out.write("                                        </ol>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"page-title\">Daftar Peminjaman</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- end page title --> \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-3\">\r\n");
      out.write("                                <ul class=\"nav nav-pills bg-nav-pills nav-justified mb-3\">\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a href=\"#tab1\" data-bs-toggle=\"tab\" aria-expanded=\"false\" class=\"nav-link rounded-0 active\">\r\n");
      out.write("                                            <i class=\"mdi mdi-home-variant d-md-none d-block\"></i>\r\n");
      out.write("                                            <span class=\"d-none d-md-block\">Dalam Proses</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a href=\"#tab2\" data-bs-toggle=\"tab\" aria-expanded=\"true\" class=\"nav-link rounded-0\">\r\n");
      out.write("                                            <i class=\"mdi mdi-account-circle d-md-none d-block\"></i>\r\n");
      out.write("                                            <span class=\"d-none d-md-block\">Selesai</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"tab-content\">\r\n");
      out.write("                                            <div class=\"tab-pane show active\" id=\"tab1\">\r\n");
      out.write("                                                <h5>Peminjaman Proses</h5>\r\n");
      out.write("                                                <table id=\"tbl-proses\" class=\"table dt-responsive nowrap w-100\">\r\n");
      out.write("                                                    <thead class=\"table-light\">\r\n");
      out.write("                                                        <tr class=\"text-center\">\r\n");
      out.write("                                                            <th>Lab</th>\r\n");
      out.write("                                                            <th>Level</th>\r\n");
      out.write("                                                            <th>Tgl Peminjaman</th>\r\n");
      out.write("                                                            <th>Tgl Mulai</th>\r\n");
      out.write("                                                            <th>Tgl Berakhir</th>\r\n");
      out.write("                                                            <th>Ketua Kegiatan</th>\r\n");
      out.write("                                                            <th>Kontak Ketua</th>\r\n");
      out.write("                                                            <th>Status</th>\r\n");
      out.write("                                                            <th>Action</th>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("                                                    <tbody>\r\n");
      out.write("                                                        ");
  
                                                            for(int i=0; i<daftarPeminjaman.length; i++){
                                                            Peminjaman = daftarPeminjaman[i];
                                                        
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "id_peminjaman",
Peminjaman.getId_peminjaman());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "no_lab",
 Peminjaman.getNo_lab());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "level",
 Peminjaman.getLevel());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "tgl_peminjaman",
 Peminjaman.getTgl_peminjaman());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "tgl_mulai",
 Peminjaman.getTgl_mulai());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "tgl_berakhir",
 Peminjaman.getTgl_berakhir());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "ketua_kegiatan",
 Peminjaman.getKetua_kegiatan());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "kontak_ketua",
 Peminjaman.getKontak_ketua());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "status_peminjaman",
 Peminjaman.getStatus_peminjaman());
      out.write("\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getNo_lab())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getLevel())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getTgl_peminjaman())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getTgl_mulai())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getTgl_berakhir())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getKetua_kegiatan())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getKontak_ketua())));
      out.write("</td>\r\n");
      out.write("                                                            ");

                                                                String status = Peminjaman.getStatus_peminjaman();
                                                                if (status.equals("Diajukan")) { 
      out.write("\r\n");
      out.write("                                                                <td><span class=\"badge bg-warning p-2\">");
      out.print( status );
      out.write("</span></td>\r\n");
      out.write("                                                                ");
 } else if (status.equals("Menunggu")) { 
      out.write("\r\n");
      out.write("                                                                <td><span class=\"badge bg-secondary p-2\">");
      out.print( status );
      out.write("</span></td>\r\n");
      out.write("                                                                ");
 }
                                                            
      out.write("\r\n");
      out.write("                                                            <td><a href=\"detail_peminjaman.jsp?id_peminjaman=");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getId_peminjaman())));
      out.write("\" class=\"btn btn-primary mb-2\"><i class=\"mdi mdi-information\"></i>&nbsp;Detail</a></td>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                        ");
}
      out.write("\r\n");
      out.write("                                                    </tbody>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </div> <!-- end preview-->\r\n");
      out.write("                                            <div class=\"tab-pane\" id=\"tab2\">\r\n");
      out.write("                                                <h5>Peminjaman Selesai</h5> \r\n");
      out.write("                                                <table id=\"tbl-selesai\" class=\"table dt-responsive nowrap w-100\">\r\n");
      out.write("                                                    <thead class=\"table-light\">\r\n");
      out.write("                                                        <tr class=\"text-center\">\r\n");
      out.write("                                                            <th>Lab</th>\r\n");
      out.write("                                                            <th>Level</th>\r\n");
      out.write("                                                            <th>Tgl Peminjaman</th>\r\n");
      out.write("                                                            <th>Tgl Mulai</th>\r\n");
      out.write("                                                            <th>Tgl Berakhir</th>\r\n");
      out.write("                                                            <th>Ketua Kegiatan</th>\r\n");
      out.write("                                                            <th>Kontak Ketua</th>\r\n");
      out.write("                                                            <th>Status</th>\r\n");
      out.write("                                                            <th>Action</th>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("                                                    <tbody>\r\n");
      out.write("                                                        ");

                                                            for(int i=0; i<daftarPeminjaman2.length; i++){
                                                            Peminjaman = daftarPeminjaman2[i];
                                                        
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "id_peminjaman",
Peminjaman.getId_peminjaman());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "no_lab",
 Peminjaman.getNo_lab());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "level",
 Peminjaman.getLevel());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "tgl_peminjaman",
 Peminjaman.getTgl_peminjaman());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "tgl_mulai",
 Peminjaman.getTgl_mulai());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "tgl_berakhir",
 Peminjaman.getTgl_berakhir());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "ketua_kegiatan",
 Peminjaman.getKetua_kegiatan());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "kontak_ketua",
 Peminjaman.getKontak_ketua());
      out.write("\r\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Peminjaman"), "status_peminjaman",
 Peminjaman.getStatus_peminjaman());
      out.write("\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getNo_lab())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getLevel())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getTgl_peminjaman())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getTgl_mulai())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getTgl_berakhir())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getKetua_kegiatan())));
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getKontak_ketua())));
      out.write("</td>\r\n");
      out.write("                                                            ");

                                                                String status = Peminjaman.getStatus_peminjaman();
                                                                if (status.equals("Disetujui")) { 
      out.write("\r\n");
      out.write("                                                                <td><span class=\"badge bg-info p-2\">");
      out.print( status );
      out.write("</span></td>\r\n");
      out.write("                                                                ");
 } else if (status.equals("Ditolak")) { 
      out.write("\r\n");
      out.write("                                                                <td><span class=\"badge bg-danger p-2\">");
      out.print( status );
      out.write("</span></td> \r\n");
      out.write("                                                                ");
 } else if (status.equals("Dibatalkan")) { 
      out.write("\r\n");
      out.write("                                                                <td><span class=\"badge bg-danger p-2\">");
      out.print( status );
      out.write("</span></td> \r\n");
      out.write("                                                                ");
 } else if (status.equals("Selesai")) { 
      out.write("\r\n");
      out.write("                                                                <td><span class=\"badge bg-success p-2\">");
      out.print( status );
      out.write("</span></td>   \r\n");
      out.write("                                                                ");
 }
                                                            
      out.write("\r\n");
      out.write("                                                            <td><a href=\"detail_peminjaman.jsp?id_peminjaman=");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((models.kalab.PeminjamanModel)_jspx_page_context.findAttribute("Peminjaman")).getId_peminjaman())));
      out.write("\" class=\"btn btn-primary mb-2\"><i class=\"mdi mdi-information\"></i>&nbsp;Detail</a></td>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                        ");
}
      out.write("\r\n");
      out.write("                                                    </tbody>\r\n");
      out.write("                                                </table>                                           \r\n");
      out.write("                                            </div> <!-- end preview-->\r\n");
      out.write("                                        </div> <!-- end card body-->\r\n");
      out.write("                                    </div> <!-- end card -->\r\n");
      out.write("                                </div><!-- end col-->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- end row -->        \r\n");
      out.write("                        </div> <!-- container -->\r\n");
      out.write("                    </div> <!-- content -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Footer Start -->\r\n");
      out.write("                    ");
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
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.chartjs.js\"></script>\r\n");
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
      out.write("                    <!-- end Footer -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("                <!-- End Page content -->\r\n");
      out.write("                <!-- ============================================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- END wrapper -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"rightbar-overlay\"></div>\r\n");
      out.write("            <!-- /End-bar -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
