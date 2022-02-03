/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.kalab;

import config.database;
import java.sql.*;
import java.util.ArrayList;
import models.kalab.*;

/**
 *
 * @author FANNY
 */
public class KalabController {
    
    public PeminjamanModel[] getDaftarPeminjaman(){
        PeminjamanModel[] daftarPeminjaman = null;
        PeminjamanModel tempPeminjaman = null;
        ArrayList listPeminjaman = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select p.id_peminjaman, l.no_lab, p.level, p.tgl_peminjaman, p.tgl_mulai, "
                + "p.tgl_berakhir, p.keterangan, m.nama_mhs, p.ketua_kegiatan, p.kontak_ketua, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l, tbl_mahasiswa m where p.id_lab = l.id_lab and p.id_mhs = m.id_mhs";
        try {
            rs = db.getData(sql);
            while(rs.next()){
                tempPeminjaman = new PeminjamanModel();
                tempPeminjaman.setId_peminjaman(rs.getInt("id_peminjaman"));
                tempPeminjaman.setNo_lab(rs.getInt("no_lab"));
                tempPeminjaman.setLevel(rs.getInt("level"));
                tempPeminjaman.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                tempPeminjaman.setTgl_mulai(rs.getString("tgl_mulai"));
                tempPeminjaman.setTgl_berakhir(rs.getString("tgl_berakhir"));
                tempPeminjaman.setKeterangan(rs.getString("keterangan"));
                tempPeminjaman.setNim_mhs(rs.getString("nim"));
                tempPeminjaman.setKetua_kegiatan(rs.getString("ketua_kegiatan"));
                tempPeminjaman.setKontak_ketua(rs.getString("kontak_ketua"));
                tempPeminjaman.setStatus_peminjaman(rs.getString("status_peminjaman"));
                listPeminjaman.add(tempPeminjaman);
            }
            daftarPeminjaman = new PeminjamanModel[listPeminjaman.size()];
            listPeminjaman.toArray(daftarPeminjaman);
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarPeminjaman;
        }
    }
    
    public PeminjamanModel[] getDaftarPeminjamanBelumSelesai(){
        PeminjamanModel[] daftarPeminjamanBelumSelesai = null;
        PeminjamanModel tempPeminjaman = null;
        ArrayList listPeminjaman = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select p.id_peminjaman, l.no_lab, p.level, p.tgl_peminjaman, p.tgl_mulai, "
                + "p.tgl_berakhir, p.keterangan, m.nim, p.ketua_kegiatan, p.kontak_ketua, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l, tbl_mahasiswa m where p.id_lab = l.id_lab and p.id_mhs = m.id_mhs and "
                + "level between 2 and 3 and status_peminjaman in ('Diajukan','Menunggu')";
        try {
            rs = db.getData(sql);
            while(rs.next()){
                tempPeminjaman = new PeminjamanModel();
                tempPeminjaman.setId_peminjaman(rs.getInt("id_peminjaman"));
                tempPeminjaman.setNo_lab(rs.getInt("no_lab"));
                tempPeminjaman.setLevel(rs.getInt("level"));
                tempPeminjaman.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                tempPeminjaman.setTgl_mulai(rs.getString("tgl_mulai"));
                tempPeminjaman.setTgl_berakhir(rs.getString("tgl_berakhir"));
                tempPeminjaman.setKeterangan(rs.getString("keterangan"));
                tempPeminjaman.setNim_mhs(rs.getString("nim"));
                tempPeminjaman.setKetua_kegiatan(rs.getString("ketua_kegiatan"));
                tempPeminjaman.setKontak_ketua(rs.getString("kontak_ketua"));
                tempPeminjaman.setStatus_peminjaman(rs.getString("status_peminjaman"));
                listPeminjaman.add(tempPeminjaman);
            }
            daftarPeminjamanBelumSelesai = new PeminjamanModel[listPeminjaman.size()];
            listPeminjaman.toArray(daftarPeminjamanBelumSelesai);
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarPeminjamanBelumSelesai;
        }
    }
    
    public PeminjamanModel[] getDaftarPeminjamanSelesai(){
        PeminjamanModel[] daftarPeminjamanSelesai = null;
        PeminjamanModel tempPeminjaman2 = null;
        ArrayList listPeminjaman2 = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs2 = null;
        String sql2 = "select p.id_peminjaman, l.no_lab, p.level, p.tgl_peminjaman, p.tgl_mulai, "
                + "p.tgl_berakhir, p.keterangan, m.nim, p.ketua_kegiatan, p.kontak_ketua, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l, tbl_mahasiswa m where p.id_lab = l.id_lab and p.id_mhs = m.id_mhs and "
                + "level between 2 and 3 and status_peminjaman in ('Selesai','Disetujui','Ditolak')";
        try {
            rs2 = db.getData(sql2);
            while(rs2.next()){
                tempPeminjaman2 = new PeminjamanModel();
                tempPeminjaman2.setId_peminjaman(rs2.getInt("id_peminjaman"));
                tempPeminjaman2.setNo_lab(rs2.getInt("no_lab"));
                tempPeminjaman2.setLevel(rs2.getInt("level"));
                tempPeminjaman2.setTgl_peminjaman(rs2.getString("tgl_peminjaman"));
                tempPeminjaman2.setTgl_mulai(rs2.getString("tgl_mulai"));
                tempPeminjaman2.setTgl_berakhir(rs2.getString("tgl_berakhir"));
                tempPeminjaman2.setKeterangan(rs2.getString("keterangan"));
                tempPeminjaman2.setNim_mhs(rs2.getString("nim"));
                tempPeminjaman2.setKetua_kegiatan(rs2.getString("ketua_kegiatan"));
                tempPeminjaman2.setKontak_ketua(rs2.getString("kontak_ketua"));
                tempPeminjaman2.setStatus_peminjaman(rs2.getString("status_peminjaman"));
                listPeminjaman2.add(tempPeminjaman2);
            }
            daftarPeminjamanSelesai = new PeminjamanModel[listPeminjaman2.size()];
            listPeminjaman2.toArray(daftarPeminjamanSelesai);
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs2);
            return daftarPeminjamanSelesai;
        }
    }
    
    public PeminjamanModel getDataPeminjamanbyID(int id_peminjaman){
        PeminjamanModel Peminjaman = null;
        ResultSet rs = null;
        database db = new database();
        db.connection();
        String sql = "select p.id_peminjaman, l.no_lab, p.level, p.tgl_peminjaman, p.tgl_mulai, "
                + "p.tgl_berakhir, p.keterangan, m.nim, p.ketua_kegiatan, p.kontak_ketua, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l, tbl_mahasiswa m where p.id_lab=l.id_lab and p.id_mhs=m.id_mhs and p.id_peminjaman='"+id_peminjaman+"'";
        try {
            rs = db.getData(sql);
            if(rs.next()){
                Peminjaman = new PeminjamanModel();
                Peminjaman.setId_peminjaman(rs.getInt("id_peminjaman"));
                Peminjaman.setNo_lab(rs.getInt("no_lab"));
                Peminjaman.setLevel(rs.getInt("level"));
                Peminjaman.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                Peminjaman.setTgl_mulai(rs.getString("tgl_mulai"));
                Peminjaman.setTgl_berakhir(rs.getString("tgl_berakhir"));
                Peminjaman.setKeterangan(rs.getString("keterangan"));
                Peminjaman.setNim_mhs(rs.getString("nim"));
                Peminjaman.setKetua_kegiatan(rs.getString("ketua_kegiatan"));
                Peminjaman.setKontak_ketua(rs.getString("kontak_ketua"));
                Peminjaman.setStatus_peminjaman(rs.getString("status_peminjaman"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return Peminjaman;
        }
    }
    
    public PicModel[] getDaftarPic(){
        PicModel[] daftarPic = null;
        PicModel tempPic = null;
        ArrayList listPic = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select p.id_pic, p.nama_pic, p.ruangan_pic, p.email_pic, p.pass_pic from tbl_pic_lab p";
        try {
            rs = db.getData(sql);
            while(rs.next()){
                tempPic = new PicModel();
                tempPic.setId_pic(rs.getInt("id_pic"));
                tempPic.setNama_pic(rs.getString("nama_pic"));
                tempPic.setRuangan_pic(rs.getString("ruangan_pic"));
                tempPic.setEmail_pic(rs.getString("email_pic"));
                tempPic.setPass_pic(rs.getString("pass_pic"));
                listPic.add(tempPic);
            }
            daftarPic = new PicModel[listPic.size()];
            listPic.toArray(daftarPic);
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarPic;
        }
    }
    
    public PicModel getDataPicbyID(int id_pic){
        PicModel Pic = null;
        ResultSet rs = null;
        database db = new database();
        db.connection();
        String sql = "select p.id_pic, p.nama_pic, p.ruangan_pic, p.email_pic, p.pass_pic from tbl_pic_lab p "
                + "where p.id_pic='"+id_pic+"'";
        try {
            rs = db.getData(sql);
            if(rs.next()){
                Pic = new PicModel();
                Pic.setId_pic(rs.getInt("id_pic"));
                Pic.setNama_pic(rs.getString("nama_pic"));
                Pic.setRuangan_pic(rs.getString("ruangan_pic"));
                Pic.setEmail_pic(rs.getString("email_pic"));
                Pic.setPass_pic(rs.getString("pass_pic"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return Pic;
        }
    }
    
    public KalabModel[] getDaftarKalab(){
        KalabModel[] daftarKalab = null;
        KalabModel tempKalab = null;
        ArrayList listKalab = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select id_kalab, nama_kalab, email_kalab, pass_kalab from tbl_kepala_lab";
        try {
            rs = db.getData(sql);
            while(rs.next()){
                tempKalab = new KalabModel();
                tempKalab.setId_kalab(rs.getInt("id_kalab"));
                tempKalab.setNama_kalab(rs.getString("nama_kalab"));
                tempKalab.setEmail_kalab(rs.getString("email_kalab"));
                tempKalab.setPass_kalab(rs.getString("pass_kalab"));
                listKalab.add(tempKalab);
            }
            daftarKalab = new KalabModel[listKalab.size()];
            listKalab.toArray(daftarKalab);
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarKalab;
        }
    }
    
    public KalabModel getDataKalabbyID(int id_kalab){
        KalabModel Kalab = null;
        ResultSet rs = null;
        database db = new database();
        db.connection();
        String sql = "select id_kalab, nama_kalab, email_kalab, pass_kalab from tbl_kepala_lab "
                + "where id_kalab='"+id_kalab+"'";
        try {
            rs = db.getData(sql);
            if(rs.next()){
                Kalab = new KalabModel();
                Kalab.setId_kalab(rs.getInt("id_kalab"));
                Kalab.setNama_kalab(rs.getString("nama_kalab"));
                Kalab.setEmail_kalab(rs.getString("email_kalab"));
                Kalab.setPass_kalab(rs.getString("pass_kalab"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return Kalab;
        }
    }
    
//    public static int save(PicModel p){
//        database db = new database();
//        db.connection();
//        String sql = "insert into lagu(judul_lagu,durasi,id_penyanyi) values(?,?,?)";
//        int status=0;
//        try {
//            PreparedStatement ps = db.getPreparedStatement(sql);
//            ps.setString(1,lg.getJudul_lagu());
//            ps.setString(2,lg.getDurasi());
//            ps.setInt(3,lg.getId_penyanyi());
//        
//            status = ps.executeUpdate();
//        
//        } catch(SQLException e){
//            e.printStackTrace();
//        } finally {
//            try {
//                db.disconnect();
//            } catch(SQLException e){
//                e.printStackTrace();
//            }
//        }
//        return status;
//    }
    
//    public static int update(PeminjamanModel p){
//        database db = new database();
//        db.connection();
//        String sql = "update tbl_peminjaman set status_peminjaman=? where id_peminjaman=?";
//        int status=0;
//        try {
//            db.saveData(sql);
//            .setString(1,lg.getJudul_lagu());
//            ps.setString(2,lg.getDurasi());
//            ps.setInt(3,lg.getId_penyanyi());
//            ps.setInt(4,lg.getID());
//        
//            status=ps.executeUpdate();
//        
//        } catch(ClassNotFoundException | SQLException e){
//            e.printStackTrace();
//        } finally {
//            try {
//                db.disconnect();
//            } catch(SQLException e){
//                e.printStackTrace();
//            }
//        }
//        return status;
//    }
    
//    public static int delete(int id_lagu){
//        String pwd = "";
//        String login = "root";
//        Connection con = null;
//        AksesJdbc db = new AksesJdbc("javabeans_fanny",login, pwd);
//        String sql = "delete from lagu where id_lagu=?";
//        int status=0;
//        try {
//            con = db.connect();
//            PreparedStatement ps = db.getPreparedStatement(sql);
//            ps.setInt(1,id_lagu);
//        
//            status=ps.executeUpdate();
//        
//        } catch(ClassNotFoundException | SQLException e){
//            e.printStackTrace();
//        } finally {
//            try {
//                db.disconnect();
//            } catch(SQLException e){
//                e.printStackTrace();
//            }
//        }
//        return status;
//    }
    
}
