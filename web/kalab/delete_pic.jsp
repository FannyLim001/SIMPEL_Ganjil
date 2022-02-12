<%-- 
    Document   : delete_pic
    Created on : Feb 3, 2022, 10:01:52 PM
    Author     : FANNY
--%>

<jsp:useBean id="Pic" class="models.kalab.PicModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id_pic=Integer.parseInt(request.getParameter("id_pic"));

        KalabController.DeletePic(id_pic);
        request.setAttribute("delete", "berhasil");
        response.sendRedirect("data_pic.jsp?delete="+request.getAttribute("delete"));
%>
