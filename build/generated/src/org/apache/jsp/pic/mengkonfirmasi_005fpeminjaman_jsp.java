package org.apache.jsp.pic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import models.pic.Peminjaman;
import models.pic.Konfirmasi_peminjaman;
import models.pic.InformasiLab;
import controllers.pic.PicController;

public final class mengkonfirmasi_005fpeminjaman_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/pic/include/sidebar.jsp");
    _jspx_dependants.add("/pic/include/topbar.jsp");
    _jspx_dependants.add("/pic/include/footer.jsp");
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
      out.write("\r\n");
      out.write("<!-- Models -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Controllers -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>Konfirmasi Peminjaman | SIMPEL</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\r\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\r\n");
      out.write("        <!-- App favicon -->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/favicon.ico\">\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\r\n");
      out.write("        <!-- Begin page -->\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <!-- Sidebar Start -->\r\n");
      out.write("            ");
      out.write(" <!-- ========== Left Sidebar Start ========== -->\r\n");
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
      out.write("    <!-- LOGO -->\r\n");
      out.write("    <a href=\"index.html\" class=\"logo text-center logo-dark\">\r\n");
      out.write("        <span class=\"logo-lg\">\r\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\r\n");
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
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/beranda_pic.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"uil-home-alt\"></i>\r\n");
      out.write("                    <span> Beranda </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a data-bs-toggle=\"collapse\" href=\"#peminjaman\" aria-expanded=\"false\" aria-controls=\"quiz\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"uil-package\"></i>\r\n");
      out.write("                    <span> Peminjaman </span>\r\n");
      out.write("                    <span class=\"menu-arrow\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"collapse\" id=\"peminjaman\">\r\n");
      out.write("                    <ul class=\"side-nav-second-level\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/mengkonfirmasi_peminjaman.jsp\">Konfirmasi Peminjaman</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/daftar_peminjaman.jsp\">Daftar Peminjaman</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/daftar_lab.jsp\">Daftar Lab</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/datalab.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-office-building\"></i>\r\n");
      out.write("                    <span> Data Lab </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/laporan.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-trophy\"></i>\r\n");
      out.write("                    <span> Laporan </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/panduan.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-help-circle\"></i>\r\n");
      out.write("                    <span> Panduan </span>\r\n");
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
      out.write("<!-- Left Sidebar End -->");
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
      out.write("  <!-- Topbar Start -->\r\n");
      out.write("  <div class=\"navbar-custom\">\r\n");
      out.write("                        <ul class=\"list-unstyled topbar-menu float-end mb-0\">\r\n");
      out.write("                            <li class=\"dropdown notification-list\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle nav-user arrow-none me-0\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"false\"\r\n");
      out.write("                                    aria-expanded=\"false\">\r\n");
      out.write("                                    <span class=\"account-user-avatar\"> \r\n");
      out.write("                                        <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/users/avatar-1.jpg\" alt=\"user-image\" class=\"rounded-circle\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <span class=\"account-user-name\">Kelompok 1</span>\r\n");
      out.write("                                        <span class=\"account-position\">PIC Lab</span>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown\">\r\n");
      out.write("                                    <!-- item-->\r\n");
      out.write("                                    <a href=\"http://localhost:8080/SIMPEL_Ganjil/admin/auth/logout\" class=\"dropdown-item notify-item\">\r\n");
      out.write("                                        <i class=\"mdi mdi-logout me-1\"></i>\r\n");
      out.write("                                        <span>Logout</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <button class=\"button-menu-mobile open-left\">\r\n");
      out.write("                            <i class=\"mdi mdi-menu\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end Topbar -->");
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
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">PIC Lab</a></li>\r\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Konfirmasi Peminjaman</li>\r\n");
      out.write("                                        </ol>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h4 class=\"page-title\">Konfirmasi Peminjaman</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>     \r\n");
      out.write("                        <!-- end page title --> \r\n");
      out.write("                        \r\n");
      out.write("                        <!-- Start dasboard stuff -->\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            ");

                                Peminjaman[] p = new PicController().getStatusPeminjaman();
                                String bgcard = null; 
                                String stat = null;
                                for (int i = 0; i < p.length; i++) {
                                    stat = p[i].getStatus_peminjaman();
                                    if (stat.equals("Diajukan")) {
                                        bgcard = "bg-warning";
                                    }else if (stat.equals("Menunggu")) {
                                        bgcard = "bg-secondary";
                                    }else if (stat.equals("Disetujui")) {
                                        bgcard = "bg-info";
                                    }else if (stat.equals("Ditolak")) {
                                        bgcard = "bg-danger";
                                    }else if (stat.equals("Selesai")) {
                                        bgcard = "bg-success";
                                    }
                            
      out.write("\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <div class=\"card text-light ");
      out.print( bgcard );
      out.write("\">\r\n");
      out.write("                                    <div class=\"card-body d-flex flex-column align-items-center\">\r\n");
      out.write("                                        <h1 class=\"mt-1 mb-1\">\r\n");
      out.write("                                            ");
      out.print( p[i].getJml_status_peminjaman() );
      out.write("\r\n");
      out.write("                                        </h1>\r\n");
      out.write("                                        <p class=\"fw-normal mb-0\">Peminjaman</p>\r\n");
      out.write("                                        <h4 class=\"fw-bold mt-0 mb-1 text-center\">\r\n");
      out.write("                                            ");
      out.print( stat );
      out.write("\r\n");
      out.write("                                        </h4>                                        \r\n");
      out.write("                                    </div> <!-- end card-body-->\r\n");
      out.write("                                </div> <!-- end card-->\r\n");
      out.write("                            </div> <!-- end col-->\r\n");
      out.write("                            ");

                                }
                                InformasiLab info = new PicController().getLabTersedia();
                            
      out.write("\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-body d-flex flex-column align-items-center\">\r\n");
      out.write("                                            <h1 class=\"mt-1 mb-1 d-inline\">\r\n");
      out.write("                                                ");
      out.print( info.getLab_tersedia() );
      out.write(" / \r\n");
      out.write("                                                ");
      out.print( info.getJml_lab() );
      out.write(" \r\n");
      out.write("                                            </h1>\r\n");
      out.write("                                        <p class=\"fw-normal mb-0\">Lab Yang</p>\r\n");
      out.write("                                        <h4 class=\"fw-bold mt-0 mb-1 text-center\">\r\n");
      out.write("                                            Tersedia\r\n");
      out.write("                                        </h4>                                        \r\n");
      out.write("                                    </div> <!-- end card-body-->\r\n");
      out.write("                                </div> <!-- end card-->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- end row -->\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"tab-content\">\r\n");
      out.write("                                            <div class=\"tab-pane show active\" id=\"basic-datatable-preview\">\r\n");
      out.write("                                                <h5>Peminjaman Yang Diajukan</h5>\r\n");
      out.write("                                                <table id=\"tbl-proses\" class=\"table display nowrap\">\r\n");
      out.write("                                                    <thead class=\"table-light\">\r\n");
      out.write("                                                        <tr class=\"text-center\">\r\n");
      out.write("                                                            <th>Lab</th>\r\n");
      out.write("                                                            <th>Ketua Kegiatan</th>\r\n");
      out.write("                                                            <th>Kontak Ketua</th>\r\n");
      out.write("                                                            <th>Level</th>\r\n");
      out.write("                                                            <th>Tgl Peminjaman</th>\r\n");
      out.write("                                                            <th>Tgl Mulai</th>\r\n");
      out.write("                                                            <th>Tgl Berakhir</th>\r\n");
      out.write("                                                            <th>Keterangan</th>\r\n");
      out.write("                                                            <th>Status</th>\r\n");
      out.write("                                                            <th>Action</th>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("                                                    <tbody>\r\n");
      out.write("                                                        ");

                                                            Peminjaman[] peminjaman = new PicController().getPeminjamanDiajukan();
                                                            for (int i = 0; i < peminjaman.length; i++) {
                                                        
      out.write("\r\n");
      out.write("                                                        <tr>\r\n");
      out.write("                                                            <td>");
      out.print( peminjaman[i].getNo_lab() );
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.print( peminjaman[i].getKetua_kegiatan() );
      out.write("</td>\r\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( peminjaman[i].getKontak_ketua() );
      out.write("</td>\r\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( peminjaman[i].getLevel() );
      out.write("</td>\r\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( peminjaman[i].getTgl_peminjaman() );
      out.write("</td>\r\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( peminjaman[i].getTgl_mulai() );
      out.write("</td>\r\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( peminjaman[i].getTgl_berakhir() );
      out.write("</td>\r\n");
      out.write("                                                            <td>");
      out.print( peminjaman[i].getKeterangan() );
      out.write("</td>\r\n");
      out.write("                                                            <td class=\"text-center\">\r\n");
      out.write("                                                                ");

                                                                    String status = peminjaman[i].getStatus_peminjaman();
                                                                    if (status.equalsIgnoreCase("diajukan")) { 
      out.write("\r\n");
      out.write("                                                                <span class=\"badge bg-warning p-2\">");
      out.print( status );
      out.write("</span>\r\n");
      out.write("                                                                ");

                                                                    }else if (status.equalsIgnoreCase("menunggu")){ 
      out.write("\r\n");
      out.write("                                                                <span class=\"badge bg-secondary p-2\">");
      out.print( status );
      out.write("</span>\r\n");
      out.write("                                                                ");

                                                                    }else if (status.equalsIgnoreCase("ditolak")){ 
      out.write("\r\n");
      out.write("                                                                <span class=\"badge bg-danger p-2\">");
      out.print( status );
      out.write("</span>\r\n");
      out.write("                                                                ");
    
                                                                     }else if (status.equalsIgnoreCase("disetujui")){ 
      out.write("\r\n");
      out.write("                                                                <span class=\"badge bg-success p-2\">");
      out.print( status );
      out.write("</span>\r\n");
      out.write("                                                                ");
    
                                                                    }
                                                                
      out.write("\r\n");
      out.write("                                                            </td>\r\n");
      out.write("                                                            <td class=\"text-center\">\r\n");
      out.write("                                                                ");
 if(status.equalsIgnoreCase("disetujui") || status.equalsIgnoreCase("ditolak")){
                                                                    System.out.println("-");
                                                                }else{
                                                                
      out.write("\r\n");
      out.write("                                                                <a href=\"proses_konfirmasi.jsp?id=");
      out.print( peminjaman[i].getId_peminjaman() );
      out.write("&aksi=Disetujui\" class=\"btn btn-success btn-sm\">\r\n");
      out.write("                                                                    Setujui\r\n");
      out.write("                                                                </a>\r\n");
      out.write("                                                                <a href=\"proses_konfirmasi.jsp?id=");
      out.print( peminjaman[i].getId_peminjaman() );
      out.write("&aksi=Ditolak\" class=\"btn btn-danger btn-sm\">\r\n");
      out.write("                                                                    Tolak\r\n");
      out.write("                                                                </a>\r\n");
      out.write("                                                                ");

                                                                    }
                                                                
      out.write("\r\n");
      out.write("                                                            </td>\r\n");
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
      out.write("\r\n");
      out.write("                        <!-- Footer Start -->\r\n");
      out.write("                        <!-- Footer Start -->\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                <!-- Footer Start -->\r\n");
      out.write("                <footer class=\"footer\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <script>document.write(new Date().getFullYear())</script> © SIMPEL - Development by Ganjil 2TID\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <div class=\"text-md-end footer-links d-none d-md-block\">\r\n");
      out.write("                                    <a href=\"https://github.com/FannyLim001/SIMPEL_Ganjil\">Developer Page</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("                <!-- end Footer -->");
      out.write("\r\n");
      out.write("                        <!-- end Footer -->\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("                    <!-- End Page content -->\r\n");
      out.write("                    <!-- ============================================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- END wrapper -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"rightbar-overlay\"></div>\r\n");
      out.write("                <!-- /End-bar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- bundle -->\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- third party js -->\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery.dataTables.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.bootstrap5.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.responsive.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/responsive.bootstrap5.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.buttons.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.bootstrap5.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.html5.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.flash.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.print.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.keyTable.min.js\"></script>\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.select.min.js\"></script>\r\n");
      out.write("                <!-- third party js ends -->\r\n");
      out.write("\r\n");
      out.write("                <!-- demo app -->\r\n");
      out.write("                <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js\"></script>\r\n");
      out.write("                <!-- end demo js-->\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $('table.display').DataTable({\r\n");
      out.write("                            \"scrollX\": true\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>");
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
