package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import config.database;
import models.kalab.DashboardModel;

public final class laporan_005fpeminjaman_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>Laporan Peminjaman | SIMPEL</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\r\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\r\n");
      out.write("    </head>\r\n");
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
      out.write("                                            <li class=\"breadcrumb-item active\">Laporan Peminjaman</li>\r\n");
      out.write("                                        </ol>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"page-title\">Laporan Peminjaman SIMPEL</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- end page title --> \r\n");
      out.write("\r\n");
      out.write("                        ");

                            Gson gson = new Gson();
                            String no_lab=null;
                            String jumlah_nolab=null;
                            
                            String nama_lab=null;
                            String jumlah_lab=null;
                            
                            String level=null;
                            String jumlah_level=null;
                            
                            String thn_peminjaman=null;
                            String jumlah_thn=null;
                            
                            String status_peminjaman=null;
                            String jumlah_status=null;
                            
                            ArrayList ar=new ArrayList();
                            ArrayList ar2 = new ArrayList();
                            ArrayList ar3 = new ArrayList();
                            ArrayList ar4 = new ArrayList();
                            ArrayList ar5 = new ArrayList();
                            ArrayList ar6 = new ArrayList();
                            ArrayList ar7 = new ArrayList();
                            ArrayList ar8 = new ArrayList();
                            ArrayList ar9 = new ArrayList();
                            ArrayList ar10 = new ArrayList();
                            
                            database db = new database();
                            db.connection();
                            ResultSet rs = null;
                    
                            try{
                                String sql = "select count(*) as jml_pinjam, no_lab from tbl_peminjaman p, tbl_lab l where p.id_lab=l.id_lab group by l.id_lab";
                                
                                String sql2 = "select count(*) as jml_lab, nama_lab from tbl_peminjaman p, tbl_lab l where p.id_lab=l.id_lab group by l.id_lab";
                                
                                String sql3 = "select count(*) as jml_level, level from tbl_peminjaman group by level";
                                
                                String sql4 = "select count(year(tgl_peminjaman)) as jml_thn, year(tgl_peminjaman) as thn from tbl_peminjaman group by thn";
                                
                                String sql5 = "select count(status_peminjaman) as jml_status, status_peminjaman from tbl_peminjaman group by status_peminjaman";
                                
                                rs = db.getData(sql);
                                while(rs.next())
                                {
                                    no_lab = rs.getString("no_lab");
                                    jumlah_nolab = rs.getString("jml_pinjam");
                                    ar.add(no_lab);
                                    ar2.add(jumlah_nolab);
                                }
                                
                                rs = db.getData(sql2);
                                while(rs.next())
                                {
                                    nama_lab = rs.getString("nama_lab");
                                    jumlah_lab = rs.getString("jml_lab");
                                    ar3.add(nama_lab);
                                    ar4.add(jumlah_lab);
                                }
                                
                                rs = db.getData(sql3);
                                while(rs.next())
                                {
                                    level = rs.getString("level");
                                    jumlah_level = rs.getString("jml_level");
                                    ar5.add(level);
                                    ar6.add(jumlah_level);
                                }
                                
                                rs = db.getData(sql4);
                                while(rs.next())
                                {
                                    thn_peminjaman = rs.getString("thn");
                                    jumlah_thn = rs.getString("jml_thn");
                                    ar7.add(thn_peminjaman);
                                    ar8.add(jumlah_thn);
                                }
                                
                                rs = db.getData(sql5);
                                while(rs.next())
                                {
                                    status_peminjaman = rs.getString("status_peminjaman");
                                    jumlah_status = rs.getString("jml_status");
                                    ar9.add(status_peminjaman);
                                    ar10.add(jumlah_status);
                                }
                                
                            }
                            catch(SQLException e){
                                    out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
                            }
                            
                                no_lab = gson.toJson(ar);
                                jumlah_nolab = gson.toJson(ar2);
                                
                                nama_lab = gson.toJson(ar3);
                                jumlah_lab = gson.toJson(ar4);
                                
                                level = gson.toJson(ar5);
                                jumlah_level = gson.toJson(ar6);
                                
                                thn_peminjaman = gson.toJson(ar7);
                                jumlah_thn = gson.toJson(ar8);
                                
                                status_peminjaman = gson.toJson(ar9);
                                jumlah_status = gson.toJson(ar10);
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-lg-10\">\r\n");
      out.write("                                                <h4>Data Peminjaman Lab</h4>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-2\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#standard-modal\"><i class=\"mdi mdi-printer\"></i>&nbsp;&nbsp;Cetak</button>\r\n");
      out.write("                                                <div id=\"standard-modal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"standard-modalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                                                    <div class=\"modal-dialog modal-sm modal-dialog-centered\">\r\n");
      out.write("                                                        <div class=\"modal-content\">\r\n");
      out.write("                                                            <div class=\"modal-header\">\r\n");
      out.write("                                                                <h4 class=\"modal-title\" id=\"standard-modalLabel\">Cetak Data Peminjaman</h4>\r\n");
      out.write("                                                                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-hidden=\"true\"></button>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"modal-body\">\r\n");
      out.write("                                                                <form class=\"ps-3 pe-3\" action=\"format_laporan.jsp\">\r\n");
      out.write("                                                                    <div class=\"mb-3\">\r\n");
      out.write("                                                                        <div class=\"form-check\">\r\n");
      out.write("                                                                            <input type=\"radio\" id=\"customRadio3\" name=\"format\" value=\"xlsx\" class=\"form-check-input\">\r\n");
      out.write("                                                                            <label class=\"form-check-label\" for=\"customRadio3\">Excel (.xlsx)</label>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"mb-3\">\r\n");
      out.write("                                                                        <div class=\"form-check\">\r\n");
      out.write("                                                                            <input type=\"radio\" id=\"customRadio4\" name=\"format\" value=\"pdf\" class=\"form-check-input\">\r\n");
      out.write("                                                                            <label class=\"form-check-label\" for=\"customRadio4\">PDF (.pdf)</label>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"mb-3 text-center\">\r\n");
      out.write("                                                                        <button class=\"btn btn-primary\" type=\"submit\">Cetak</button>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </form>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div><!-- /.modal-content -->\r\n");
      out.write("                                                    </div><!-- /.modal-dialog -->\r\n");
      out.write("                                                </div><!-- /.modal -->\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-xl-3\">\r\n");
      out.write("                                                <h4>Tampilkan berdasarkan</h4>\r\n");
      out.write("                                                <div class=\"col-7\">\r\n");
      out.write("                                                    <select class=\"form-select\" id=\"filter\" onchange=\"updateData(this)\">\r\n");
      out.write("                                                        <option value=\"no_lab\">No Lab</option>\r\n");
      out.write("                                                        <option value=\"nama_lab\">Nama Lab</option>\r\n");
      out.write("                                                        <option value=\"level\">Level</option>\r\n");
      out.write("                                                        <option value=\"tahun_peminjaman\">Tahun Peminjaman</option>\r\n");
      out.write("                                                        <option value=\"status\">Status Peminjaman</option>\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div><!-- end col-->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-xl-9\">\r\n");
      out.write("                                                <div dir=\"ltr\">\r\n");
      out.write("                                                    <canvas id=\"myChart\"></canvas>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div><!-- end col-->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- end row-->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> <!-- end card -->\r\n");
      out.write("                            </div> <!-- end col-->        \r\n");
      out.write("                        </div> <!-- end row -->\r\n");
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
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/Chart.bundle.min.js\"></script>\r\n");
      out.write("        <!-- third party js ends -->\r\n");
      out.write("\r\n");
      out.write("        <!-- demo app -->\r\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js\"></script>\r\n");
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
      out.write("        <script>\r\n");
      out.write("            const no_lab = ");
      out.print( jumlah_nolab );
      out.write(";\r\n");
      out.write("            const nama_lab = ");
      out.print( jumlah_lab );
      out.write(";\r\n");
      out.write("            const level = ");
      out.print( jumlah_level );
      out.write(";\r\n");
      out.write("            const tahun_peminjaman = ");
      out.print( jumlah_thn );
      out.write(";\r\n");
      out.write("            const status = ");
      out.print( jumlah_status );
      out.write(";\r\n");
      out.write("\r\n");
      out.write("            const label_no = ");
      out.print( no_lab );
      out.write(";\r\n");
      out.write("            const label_nama = ");
      out.print( nama_lab );
      out.write(";\r\n");
      out.write("            const label_level = ");
      out.print( level );
      out.write(";\r\n");
      out.write("            const label_thn = ");
      out.print( thn_peminjaman );
      out.write(";\r\n");
      out.write("            const label_status = ");
      out.print( status_peminjaman );
      out.write(";\r\n");
      out.write("            //setup\r\n");
      out.write("            const data = {\r\n");
      out.write("                labels: ");
      out.print( no_lab );
      out.write(",\r\n");
      out.write("                datasets: [{\r\n");
      out.write("                        label: 'No Lab',\r\n");
      out.write("                        data: no_lab,\r\n");
      out.write("                        backgroundColor: [\r\n");
      out.write("                            'rgba(255, 99, 132, 0.2)',\r\n");
      out.write("                            'rgba(54, 162, 235, 0.2)',\r\n");
      out.write("                            'rgba(255, 206, 86, 0.2)',\r\n");
      out.write("                            'rgba(75, 192, 192, 0.2)',\r\n");
      out.write("                            'rgba(153, 102, 255, 0.2)',\r\n");
      out.write("                            'rgba(255, 159, 64, 0.2)'\r\n");
      out.write("                        ],\r\n");
      out.write("                        borderColor: [\r\n");
      out.write("                            'rgba(255, 99, 132, 1)',\r\n");
      out.write("                            'rgba(54, 162, 235, 1)',\r\n");
      out.write("                            'rgba(255, 206, 86, 1)',\r\n");
      out.write("                            'rgba(75, 192, 192, 1)',\r\n");
      out.write("                            'rgba(153, 102, 255, 1)',\r\n");
      out.write("                            'rgba(255, 159, 64, 1)'\r\n");
      out.write("                        ],\r\n");
      out.write("                        borderWidth: 1,\r\n");
      out.write("                        barPercentage: 0.5\r\n");
      out.write("                    }]\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            //config\r\n");
      out.write("            const config = {\r\n");
      out.write("                type: 'bar',\r\n");
      out.write("                data,\r\n");
      out.write("                options: {\r\n");
      out.write("                    scales: {\r\n");
      out.write("                        yAxes: [{\r\n");
      out.write("                                ticks: {\r\n");
      out.write("                                    beginAtZero: true\r\n");
      out.write("                                }\r\n");
      out.write("                            }]\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            //render\r\n");
      out.write("            const myChart = new Chart(\r\n");
      out.write("                    document.getElementById('myChart'),\r\n");
      out.write("                    config\r\n");
      out.write("                    );\r\n");
      out.write("\r\n");
      out.write("            const filter = document.getElementById('filter');\r\n");
      out.write("\r\n");
      out.write("            function updateData(data) {\r\n");
      out.write("                const label = filter.options[filter.selectedIndex].text;\r\n");
      out.write("                if (data.value === 'no_lab') {\r\n");
      out.write("                    myChart.config.data.datasets[0].data = no_lab;\r\n");
      out.write("                    myChart.config.data.datasets[0].label = label;\r\n");
      out.write("                    myChart.config.data.labels = label_no;\r\n");
      out.write("                }\r\n");
      out.write("                if (data.value === 'nama_lab') {\r\n");
      out.write("                    myChart.config.data.datasets[0].data = nama_lab;\r\n");
      out.write("                    myChart.config.data.datasets[0].label = label;\r\n");
      out.write("                    myChart.config.data.labels = label_nama;\r\n");
      out.write("                }\r\n");
      out.write("                if (data.value === 'level') {\r\n");
      out.write("                    myChart.config.data.datasets[0].data = level;\r\n");
      out.write("                    myChart.config.data.datasets[0].label = label;\r\n");
      out.write("                    myChart.config.data.labels = label_level;\r\n");
      out.write("                }\r\n");
      out.write("                if (data.value === 'tahun_peminjaman') {\r\n");
      out.write("                    myChart.config.data.datasets[0].data = tahun_peminjaman;\r\n");
      out.write("                    myChart.config.data.datasets[0].label = label;\r\n");
      out.write("                    myChart.config.data.labels = label_thn;\r\n");
      out.write("                }\r\n");
      out.write("                if (data.value === 'status') {\r\n");
      out.write("                    myChart.config.data.datasets[0].data = status;\r\n");
      out.write("                    myChart.config.data.datasets[0].label = label;\r\n");
      out.write("                    myChart.config.data.labels = label_status;\r\n");
      out.write("                }\r\n");
      out.write("                myChart.update();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
 } 
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
