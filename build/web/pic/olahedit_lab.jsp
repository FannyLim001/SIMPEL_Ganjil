<%-- 
    Document   : simpan_lab
    Created on : Feb 6, 2022, 1:25:31 PM
    Author     : andre
--%>

<jsp:useBean id="PicController" class="controllers.pic.PicController" />
<jsp:useBean id="Lab" class="models.pic.InformasiLab" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id_lab = Integer.parseInt(request.getParameter("id_lab"));
    String nama_lab = request.getParameter("nama_lab");
    int no_lab = Integer.parseInt(request.getParameter("no_lab"));
    int kapasitas_lab = Integer.parseInt(request.getParameter("kapasitas_lab"));
    int id_pic = Integer.parseInt(request.getParameter("id_pic"));
    int id_kalab = Integer.parseInt(request.getParameter("id_kalab"));
    String foto_lab = request.getParameter("foto_lab");
    String status_lab = request.getParameter("status_lab");
    
    
    Lab.setNama_lab("1");
    Lab.setNo_lab(1);
    Lab.setKapasitas(1);
    Lab.setId_pic(1);
    Lab.setId_kalab(1);
    Lab.setFoto_lab("1");
    Lab.setStatus("1");
    PicController.updateDataLab(Lab);
//    
//    out.write(nama_lab);
//    out.write(no_lab);
//    out.write(kapasitas_lab);
//    out.write(id_pic);
//    out.write(id_kalab);
//    out.write(foto_lab);
//    out.write(status_lab);
    response.sendRedirect("daftar_lab.jsp");
%>