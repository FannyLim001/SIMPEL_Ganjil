<%-- 
    Document   : laporan_peminjamanPDF
    Created on : Feb 9, 2022, 8:42:09 PM
    Author     : FANNY
--%>

<%@page import="com.itextpdf.text.pdf.PdfPCell"%>
<%@page import="com.itextpdf.text.pdf.PdfPTable"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="com.itextpdf.text.*"%>
<%@page import="java.io.*,java.sql.*"%>
<%@page import="config.database"%>
<%@page import="models.kalab.PeminjamanModel"%>
<jsp:useBean id="Peminjaman" class="models.kalab.PeminjamanModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />

<%  
    response.setContentType("application/pdf");
    response.setHeader("Content-Disposition", "attachment; filename=LaporanPeminjaman.pdf");
    OutputStream out1 = response.getOutputStream();
    
    try{
        
        database db = new database();
        db.connection();
        ResultSet rs = null;
        
        String sql = "select l.no_lab, p.level, date(p.tgl_peminjaman), date(p.tgl_mulai), "
                + "date(p.tgl_berakhir), p.keterangan, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l where p.id_lab = l.id_lab and "
                + "level between 2 and 3 and status_peminjaman != 'Diajukan'";
        
        rs = db.getData(sql);
        
        Document doc = new Document();
        PdfWriter.getInstance(doc, out1);
        doc.open();
        
        Paragraph head = new Paragraph();
        Font title = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.BLACK);
        head.add(new Phrase ("Laporan Peminjaman Lab", title));
        head.setAlignment(Element.ALIGN_CENTER);
        head.add(new Phrase(Chunk.NEWLINE));
        head.add(new Phrase(Chunk.NEWLINE));
        doc.add(head);
        
        float [] pointColumnWidths = {90F, 90F, 185F, 170F, 170F, 170F, 160F};
        PdfPTable table = new PdfPTable(pointColumnWidths);
        PdfPCell kol1 = new PdfPCell(new Paragraph("No Lab", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
        PdfPCell kol2 = new PdfPCell(new Paragraph("Level", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
        PdfPCell kol3 = new PdfPCell(new Paragraph("Tanggal Peminjaman", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
        PdfPCell kol4 = new PdfPCell(new Paragraph("Tanggal Mulai", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
        PdfPCell kol5 = new PdfPCell(new Paragraph("Tanggal Berakhir", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
        PdfPCell kol6 = new PdfPCell(new Paragraph("Keterangan", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
        PdfPCell kol7 = new PdfPCell(new Paragraph("Status", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
        
        table.addCell(kol1);
        table.addCell(kol2);
        table.addCell(kol3);
        table.addCell(kol4);
        table.addCell(kol5);
        table.addCell(kol6);
        table.addCell(kol7);
       
        while (rs.next()) {
            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(3));
            table.addCell(rs.getString(4));
            table.addCell(rs.getString(5));
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
        }
        
        doc.add(table);
        
        doc.close();
        
    } catch(Exception e){
        out.println("Error");
    }
%>
