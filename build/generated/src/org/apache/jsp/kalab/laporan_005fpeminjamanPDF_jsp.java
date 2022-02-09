package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import java.io.*;

public final class laporan_005fpeminjamanPDF_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      models.kalab.PeminjamanModel Peminjaman = null;
      synchronized (_jspx_page_context) {
        Peminjaman = (models.kalab.PeminjamanModel) _jspx_page_context.getAttribute("Peminjaman", PageContext.PAGE_SCOPE);
        if (Peminjaman == null){
          Peminjaman = new models.kalab.PeminjamanModel();
          _jspx_page_context.setAttribute("Peminjaman", Peminjaman, PageContext.PAGE_SCOPE);
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
  
    response.setContentType("application/pdf");
    response.setHeader("Content-Disposition", "attachment; filename=LaporanPeminjaman.pdf");
    OutputStream out1 = response.getOutputStream();
    
    try{
        Document doc = new Document();
        PdfWriter.getInstance(doc, out1);
        doc.open();
        
        Paragraph par = new Paragraph();
        Font title = new Font(Font.FontFamily.TIMES_ROMAN, 16, font.BOLD, BaseColor.BLACK);
        par.add(new Phrase ("Laporan Peminjaman Lab", title));
        par.add(new Phrase(Chunk.NEWLINE));
        doc.add(par);
        
        doc.close();
        
    } catch(Exception e){
        out.println("Error");
    }
    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
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
