package org.apache.jsp.pic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import models.pic.Peminjaman;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Konfirmasi Peminjaman | SIMPEL</title>\n");
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
      out.write("        <!-- third party css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/buttons.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/select.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- third party css end -->\n");
      out.write("\n");
      out.write("        <!-- Datatables css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\n");
      out.write("        <!-- Begin page -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Sidebar Start -->\n");
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
      out.write("\n");
      out.write("            <!-- end Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Start Page Content here -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("            <div class=\"content-page\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Topbar Start -->\n");
      out.write("                    ");
      out.write("  <!-- Topbar Start -->\n");
      out.write("  <div class=\"navbar-custom\">\n");
      out.write("                        <ul class=\"list-unstyled topbar-menu float-end mb-0\">\n");
      out.write("                            <li class=\"dropdown notification-list\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle nav-user arrow-none me-0\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"false\"\n");
      out.write("                                    aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"account-user-avatar\"> \n");
      out.write("                                        <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/users/avatar-1.jpg\" alt=\"user-image\" class=\"rounded-circle\">\n");
      out.write("                                    </span>\n");
      out.write("                                    <span>\n");
      out.write("                                        <span class=\"account-user-name\">Kelompok 1</span>\n");
      out.write("                                        <span class=\"account-position\">PIC Lab</span>\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown\">\n");
      out.write("                                    <!-- item-->\n");
      out.write("                                    <a href=\"http://localhost:8080/SIMPEL_Ganjil/admin/auth/logout\" class=\"dropdown-item notify-item\">\n");
      out.write("                                        <i class=\"mdi mdi-logout me-1\"></i>\n");
      out.write("                                        <span>Logout</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <button class=\"button-menu-mobile open-left\">\n");
      out.write("                            <i class=\"mdi mdi-menu\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end Topbar -->");
      out.write("\n");
      out.write("                    <!-- end Topbar -->\n");
      out.write("\n");
      out.write("                    <!-- Start Content-->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <!-- start page title -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"page-title-box\">\n");
      out.write("                                    <div class=\"page-title-right\">\n");
      out.write("                                        <ol class=\"breadcrumb m-0\">\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">SIMPEL</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">PIC Lab</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Konfirmasi Peminjaman</li>\n");
      out.write("                                        </ol>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h4 class=\"page-title\">Konfirmasi Peminjaman</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>     \n");
      out.write("                        <!-- end page title --> \n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"tab-content\">\n");
      out.write("                                            <div class=\"tab-pane show active\" id=\"basic-datatable-preview\">\n");
      out.write("                                                <h5>Konfirmasi Peminjaman Lab</h5>\n");
      out.write("                                                <table id=\"tbl-proses\" class=\"table display nowrap\">\n");
      out.write("                                                    <thead class=\"table-light\">\n");
      out.write("                                                        <tr class=\"text-center\">\n");
      out.write("                                                            <th>Lab</th>\n");
      out.write("                                                            <th>Ketua Kegiatan</th>\n");
      out.write("                                                            <th>Kontak Ketua</th>\n");
      out.write("                                                            <th>Level</th>\n");
      out.write("                                                            <th>Tgl Peminjaman</th>\n");
      out.write("                                                            <th>Tgl Mulai</th>\n");
      out.write("                                                            <th>Tgl Berakhir</th>\n");
      out.write("                                                            <th>Keterangan</th>\n");
      out.write("                                                            <th>Aksi</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");

                                                            Peminjaman dpDalamProses = new Peminjaman();
                                                            List<Peminjaman> daftar = new ArrayList<Peminjaman>();
                                                            daftar = dpDalamProses.peminjamanMenunggu();
                                                            for (int i = 0; i < daftar.size(); i++) {
                                                        
      out.write("\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>");
      out.print( daftar.get(i).getNo_lab() );
      out.write("</td>\n");
      out.write("                                                            <td>");
      out.print( daftar.get(i).getKetua_kegiatan() );
      out.write("</td>\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( daftar.get(i).getKontak_ketua() );
      out.write("</td>\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( daftar.get(i).getLevel() );
      out.write("</td>\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( daftar.get(i).getTgl_peminjaman() );
      out.write("</td>\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( daftar.get(i).getTgl_mulai() );
      out.write("</td>\n");
      out.write("                                                            <td class=\"text-center\">");
      out.print( daftar.get(i).getTgl_berakhir() );
      out.write("</td>\n");
      out.write("                                                            <td>");
      out.print( daftar.get(i).getKeterangan() );
      out.write("</td>\n");
      out.write("                                                            <td class=\"text-center\">\n");
      out.write("                                                                ");

                                                                    String status = daftar.get(i).getStatus_peminjaman();
                                                                    if (status.equalsIgnoreCase("diajukan")) { 
      out.write("\n");
      out.write("                                                                    <span class=\"badge bg-warning p-2\">");
      out.print( status );
      out.write("</span>\n");
      out.write("                                                                ");

                                                                    }else if (status.equalsIgnoreCase("menunggu")){ 
      out.write("\n");
      out.write("                                                                    <span class=\"badge bg-secondary p-2\">");
      out.print( status );
      out.write("</span>\n");
      out.write("                                                                ");

                                                                    }else if (status.equalsIgnoreCase("ditolak")){ 
      out.write("\n");
      out.write("                                                                    <span class=\"badge bg-danger p-2\">");
      out.print( status );
      out.write("</span>\n");
      out.write("                                                                ");
    
                                                                    }else if (status.equalsIgnoreCase("disetujui")){ 
      out.write("\n");
      out.write("                                                                    <span class=\"badge bg-success p-2\">");
      out.print( status );
      out.write("</span>\n");
      out.write("                                                                ");
    
                                                                    }
                                                                
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        ");
 } 
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>                                           \n");
      out.write("                                            </div> <!-- end preview-->\n");
      out.write("                                        </div> <!-- end card body-->\n");
      out.write("                                    </div> <!-- end card -->\n");
      out.write("                                </div><!-- end col-->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- end row -->        \n");
      out.write("                        </div> <!-- container -->\n");
      out.write(" \n");
      out.write("                    <!-- Footer Start -->\n");
      out.write("                    <!-- Footer Start -->\n");
      out.write("                    ");
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
      out.write("\n");
      out.write("                    <!-- end Footer -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Page content -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- END wrapper -->\n");
      out.write("\n");
      out.write("            <div class=\"rightbar-overlay\"></div>\n");
      out.write("            <!-- /End-bar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- bundle -->\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- third party js -->\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.bootstrap5.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.responsive.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/responsive.bootstrap5.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.buttons.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.bootstrap5.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.html5.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.flash.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.print.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.keyTable.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.select.min.js\"></script>\n");
      out.write("            <!-- third party js ends -->\n");
      out.write("\n");
      out.write("            <!-- demo app -->\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js\"></script>\n");
      out.write("            <!-- end demo js-->\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('table.display').DataTable({\n");
      out.write("                        \"scrollX\": true\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
