<!-- Models -->
<%@page import="models.pic.Peminjaman" %>

<!-- Controllers -->
<%@page import="controllers.pic.PicController" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    String aksi = request.getParameter("aksi");
    
    PicController pc = new PicController();
    pc.konfirmasiPeminjaman(id, aksi);
    
    response.sendRedirect("mengkonfirmasi_peminjaman.jsp");
%>