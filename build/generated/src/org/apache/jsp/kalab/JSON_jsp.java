package org.apache.jsp.kalab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileWriter;
import java.util.*;
import java.sql.*;
import config.database;
import org.json.*;

public final class JSON_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("application/json;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");

    JSONObject res = new JSONObject();
    database db = new database();
        ArrayList<ArrayList<String>> data = db.getData("select count(*) as jml_pinjam, nama_lab from tbl_peminjaman p, tbl_lab l where level between 2 and 3 "
                                            + "and p.id_lab=l.id_lab group by id_peminjaman");
        
            JSONObject json = new JSONObject();
            for (int i = 1; i < bar; i++) {
                JSONObject list = new JSONObject();
                for (int j = 0; j < col; j++) {
                    list.put(data.get(0).get(j), data.get(i).get(j));
                    //System.out.println(data.get(0).get(j)+"-"+ data.get(i).get(j));
                }
                //System.out.println(list.toString());
                json.put(String.valueOf(i), list);
            }
            String path = getServletContext().getRealPath("/");
            FileWriter file = null;
            file = new FileWriter(path + "/kalab/json_file/output.json");

            if (file != null) {
                file.write(json.toString());
                res.put("Import Data", "Success");
            } else {
                res.put("Import Data", "Error!!!");
            }
            out.println(res.toString());
            out.flush();
            file.close();
    

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
