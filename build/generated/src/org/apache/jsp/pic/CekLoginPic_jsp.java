package org.apache.jsp.pic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.pic.ModelPic;
import controllers.pic.PicController;
import javax.servlet.http.HttpSession;

public final class CekLoginPic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String email, pass;
    String dbEmail, dbPass, dbNama_pic, kondisi_login;
    int dbId_pic;

    public Boolean validateLogin(String paramEmail, String paramPass){
        ModelPic[] pic = new PicController().getAllDataPic();
        for (int i = 0; i < pic.length; i++) {
            dbEmail = pic[i].getEmail_pic();
            dbPass = pic[i].getPass_pic();
            
            if (paramEmail.equals(dbEmail) && paramPass.equals(dbPass)) {
                dbId_pic = pic[i].getId_pic();
                dbNama_pic = pic[i].getNama_pic();
                return true;
            }
        }
        return false;
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

    email = request.getParameter("email");
    pass = request.getParameter("pass");
    HttpSession nsession = request.getSession();
    if (validateLogin(email, pass) == true) {
        nsession.setAttribute("id_pic", dbId_pic);
        nsession.setAttribute("nama_pic", dbNama_pic);
        nsession.setAttribute("email_pic", dbEmail);
        request.setAttribute("kondisi_login", "berhasil");
        request.getRequestDispatcher("/pic/mengkonfirmasi_peminjaman.jsp").include(request, response);
    }else{
        request.setAttribute("kondisi_login", "gagal");
        request.getRequestDispatcher("/pic/login_pic.jsp").include(request, response);
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
