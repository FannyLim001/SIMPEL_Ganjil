<%-- 
    Document   : CekLoginPic
    Created on : Feb 4, 2022, 6:21:28 PM
    Author     : USER
--%>
<%@page session="false" %>
<%@page import="models.pic.ModelPic"%>
<%@page import="controllers.pic.PicController"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
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
%>

<%
    email = request.getParameter("email");
    pass = request.getParameter("pass");
    HttpSession nsession = request.getSession();
    if (validateLogin(email, pass) == true) {
        nsession.setAttribute("id_pic", dbId_pic);
        nsession.setAttribute("nama_pic", dbNama_pic);
        nsession.setAttribute("email_pic", dbEmail);
        nsession.setAttribute("kondisi_login", "berhasil");
        request.getRequestDispatcher("/pic/mengkonfirmasi_peminjaman.jsp").include(request, response);
    }else{
        nsession.setAttribute("kondisi_login", "gagal");
        request.getRequestDispatcher("/pic/login_pic.jsp").include(request, response);
    }
%>