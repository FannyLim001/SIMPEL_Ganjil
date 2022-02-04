<%-- 
    Document   : CekLoginPic
    Created on : Feb 4, 2022, 6:21:28 PM
    Author     : USER
--%>

<%@page import="models.pic.ModelPic"%>
<%@page import="controllers.pic.PicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    String email, pass, dbEmail, dbPass; 

    public Boolean validateLogin(String paramEmail, String paramPass){
        ModelPic[] pic = new PicController().getAllDataPic();
        for (int i = 0; i < pic.length; i++) {
            dbEmail = pic[i].getEmail_pic();
            dbPass = pic[i].getPass_pic();

            if (email.equals(dbEmail) && pass.equals(dbPass)) {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
%>

<%
    email = request.getParameter("email");
    pass = request.getParameter("pass");
    
    if (validateLogin(email, pass) == true) {
        request.getRequestDispatcher("/pic/mengkonfirmasi_peminjaman.jsp").include(request, response);
    }else{
        request.getRequestDispatcher("/pic/login_pic.jsp").include(request, response);
    }
%>