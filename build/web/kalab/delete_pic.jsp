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

        int status = KalabController.delete(id_pic);
        if(status>0){
            out.print("<p>Record deleted successfully!</p>");
            request.getRequestDispatcher("data_pic.jsp").include(request,response);
        }else{
            out.println("Sorry! unable to delete record");
        }
        out.close();
%>
