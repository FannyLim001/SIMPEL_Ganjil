package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import config.database;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public final class laporan_005fpeminjamanXLSX_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "attachment; filename=LaporanPeminjaman.xlsx");
    
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
    
    database db = new database();
    db.connection();
    ResultSet rs = null;
        
    String sql = "select l.no_lab, p.level, date(p.tgl_peminjaman), date(p.tgl_mulai), "
                + "date(p.tgl_berakhir), p.keterangan, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l where p.id_lab = l.id_lab and "
                + "level between 2 and 3 and status_peminjaman != 'Diajukan'";
        
    rs = db.getData(sql);
        
        
    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet sheet = wb.createSheet("Data Peminjaman");
    
    // create excel
    // header
    Row row = sheet.createRow(1);
    Cell cell;
    cell = row.createCell(1);
    cell.setCellValue("Lab");
    
    cell = row.createCell(2);
    cell.setCellValue("Level");
    
    cell = row.createCell(3);
    cell.setCellValue("Tanggal Peminjaman");
    
    cell = row.createCell(4);
    cell.setCellValue("Tanggal Mulai");
    
    cell = row.createCell(5);
    cell.setCellValue("Tanggal Berakhir");
    
    cell = row.createCell(6);
    cell.setCellValue("Keterangan");
    
    cell = row.createCell(7);
    cell.setCellValue("Ketua Kegiatan");
    
    cell = row.createCell(8);
    cell.setCellValue("Kontak Ketua");
    
    cell = row.createCell(9);
    cell.setCellValue("Status");
    int i = 2;
    
    // details
    while(rs.next()){
        row = sheet.createRow(i);
        cell = row.createCell(1);
        cell.setCellValue(rs.getString(1));

        cell = row.createCell(2);
        cell.setCellValue(rs.getString(2));

        cell = row.createCell(3);
        cell.setCellValue(rs.getString(3));

        cell = row.createCell(4);
        cell.setCellValue(rs.getString(4));
        
        cell = row.createCell(5);
        cell.setCellValue(rs.getString(5));
        
        cell = row.createCell(6);
        cell.setCellValue(rs.getString(6));
        
        cell = row.createCell(7);
        cell.setCellValue(rs.getString(7));
        
        cell = row.createCell(8);
        cell.setCellValue(rs.getString(8));
        
        cell = row.createCell(9);
        cell.setCellValue(rs.getString(9));
        i++;
    }
    // end of excel
    
    wb.write(response.getOutputStream());
    wb.close();
}

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
