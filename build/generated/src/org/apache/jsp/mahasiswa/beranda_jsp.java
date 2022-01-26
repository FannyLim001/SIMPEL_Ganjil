package org.apache.jsp.mahasiswa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Beranda Mahasiswa | SIMPEL</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\n");
      out.write("        <!-- App favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- App css -->\n");
      out.write("        <link href=\" <!--base_url()-->assets/css/icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\" <!--base_url()-->assets/css/app.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"light-style\" />\n");
      out.write("        <link href=\" <!--base_url()-->assets/css/app-dark.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"dark-style\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\n");
      out.write("        <!-- Begin page -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!--Disini Sidebar-->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Start Page Content here -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("            <div class=\"content-page\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                  <!--Disini topbar-->\n");
      out.write("\n");
      out.write("                    <!-- Start Content-->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"page-title-box\">\n");
      out.write("                                    <div class=\"page-title-right\">\n");
      out.write("                                        <ol class=\"breadcrumb m-0\">\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">Ihsao</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">Admin</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Beranda</li>\n");
      out.write("                                        </ol>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h4 class=\"page-title\">Ihsao Administrator</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end page title --> \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xxl-3 col-lg-4\">\n");
      out.write("                                <div class=\"card widget-flat bg-success text-white\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"float-end\">\n");
      out.write("                                            <i class=\"mdi mdi-account-multiple widget-icon bg-white text-success\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h5 class=\"fw-normal mt-0\" title=\"Jumlah Peserta\">Jumlah Peserta</h5>\n");
      out.write("                                        <h3 class=\"mt-3 mb-3\">3</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div> <!-- end col-->\n");
      out.write("\n");
      out.write("                            <div class=\"col-xxl-3 col-lg-4\">\n");
      out.write("                                <div class=\"card widget-flat bg-primary text-white\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"float-end\">\n");
      out.write("                                            <i class=\"mdi mdi-currency-usd widget-icon bg-light-lighten rounded-circle text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h5 class=\"fw-normal mt-0\" title=\"Jumlah Quiz\">Jumlah Quiz</h5>\n");
      out.write("                                        <h3 class=\"mt-3 mb-3 text-white\">3</h3>\n");
      out.write("                                      \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div> <!-- end col-->\n");
      out.write("\n");
      out.write("                            <div class=\"col-xxl-3 col-lg-4\">\n");
      out.write("                                <div class=\"card widget-flat bg-info text-white\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"float-end\">\n");
      out.write("                                            <i class=\"mdi mdi-currency-usd widget-icon bg-light-lighten rounded-circle text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h5 class=\"fw-normal mt-0\" title=\"Jumlah Soal\">Jumlah Soal</h5>\n");
      out.write("                                        <h3 class=\"mt-3 mb-3 text-white\">3</h3>\n");
      out.write("                                      \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div> <!-- end col-->\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div> <!-- container -->\n");
      out.write("\n");
      out.write("                </div> <!-- content -->\n");
      out.write("             <!--Disini Footer-->\n");
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
      out.write("        <script src=\" <!--base_url()-->assets/js/vendor.min.js\"></script>\n");
      out.write("        <script src=\" <!--base_url()-->assets/js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- third party js -->\n");
      out.write("        <script src=\" <!--base_url()-->assets/js/vendor/Chart.bundle.min.js\"></script>\n");
      out.write("        <!-- third party js ends -->\n");
      out.write("\n");
      out.write("        <!-- demo app -->\n");
      out.write("        <script src=\" <!--base_url()-->assets/js/pages/demo.dashboard-projects.js\"></script>\n");
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
