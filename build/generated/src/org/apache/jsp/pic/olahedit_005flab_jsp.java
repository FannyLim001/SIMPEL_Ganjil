package org.apache.jsp.pic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class olahedit_005flab_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      controllers.pic.PicController PicController = null;
      synchronized (_jspx_page_context) {
        PicController = (controllers.pic.PicController) _jspx_page_context.getAttribute("PicController", PageContext.PAGE_SCOPE);
        if (PicController == null){
          PicController = new controllers.pic.PicController();
          _jspx_page_context.setAttribute("PicController", PicController, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      models.pic.InformasiLab Lab = null;
      synchronized (_jspx_page_context) {
        Lab = (models.pic.InformasiLab) _jspx_page_context.getAttribute("Lab", PageContext.PAGE_SCOPE);
        if (Lab == null){
          Lab = new models.pic.InformasiLab();
          _jspx_page_context.setAttribute("Lab", Lab, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    int id_lab = Integer.parseInt(request.getParameter("id_lab"));
    String nama_lab = request.getParameter("nama_lab");
    int no_lab = Integer.parseInt(request.getParameter("no_lab"));
    int kapasitas_lab = Integer.parseInt(request.getParameter("kapasitas_lab"));
    int id_pic = Integer.parseInt(request.getParameter("id_pic"));
    int id_kalab = Integer.parseInt(request.getParameter("id_kalab"));
    String foto_lab = request.getParameter("foto_lab");
    String status_lab = request.getParameter("status_lab");
    
    
    Lab.setNama_lab(nama_lab);
    Lab.setNo_lab(no_lab);
    Lab.setKapasitas(kapasitas_lab);
    Lab.setId_pic(id_pic);
    Lab.setId_kalab(id_kalab);
    Lab.setFoto_lab(foto_lab);
    Lab.setStatus(status_lab);
    PicController.UpdateDataLab(Lab);
//    
//    out.write(nama_lab);
//    out.write(no_lab);
//    out.write(kapasitas_lab);
//    out.write(id_pic);
//    out.write(id_kalab);
//    out.write(foto_lab);
//    out.write(status_lab);
    response.sendRedirect("daftar_lab.jsp");

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
