package controllers.pic;

import config.database;
import java.sql.*;
import java.util.ArrayList;
import models.pic.*;

public class PicController {
    
    /* Akses models Peminjaman */
    public Peminjaman[] allPeminjaman(){
        Peminjaman[] p = null;
        Peminjaman temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        try{
            String sql = "SELECT p.id_peminjaman, p.id_lab, p.level,\n" +
                "p.tgl_peminjaman, p.tgl_mulai, p.tgl_berakhir,\n" +
                "p.keterangan, p.id_mhs, p.ketua_kegiatan,\n" +
                "p.kontak_ketua, p.status_peminjaman,\n" +
                "l.no_lab\n" +
                "FROM tbl_peminjaman p, tbl_lab l\n" +
                "WHERE p.id_lab = l.id_lab\n" +
                "ORDER BY id_peminjaman DESC";
            rs = db.getData(sql);
            while(rs.next()){
                temp = new Peminjaman();
                temp.setId_peminjaman(rs.getInt("id_peminjaman"));
                temp.setId_lab(rs.getInt("id_lab"));
                temp.setLevel(rs.getInt("level"));
                temp.setId_mhs(rs.getInt("id_mhs"));
                temp.setNo_lab(rs.getInt("no_lab"));
                temp.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                temp.setTgl_mulai(rs.getString("tgl_mulai"));
                temp.setTgl_berakhir(rs.getString("tgl_berakhir"));
                temp.setKeterangan(rs.getString("keterangan"));
                temp.setKetua_kegiatan(rs.getString("ketua_kegiatan"));
                temp.setKontak_ketua(rs.getString("kontak_ketua")); 
                temp.setStatus_peminjaman(rs.getString("status_peminjaman"));
                
                daftar.add(temp);
            }
            p = new Peminjaman[daftar.size()];
            daftar.toArray(p);
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }finally{
            db.disconnect(rs);
            return p;
        }
    }
    
    public Peminjaman peminjamanById(int id){
        Peminjaman p = null;
        database db = new database();
        ResultSet rs = null;
        try{
            String sql = "SELECT p.id_peminjaman, p.id_lab, p.level,\n" +
                "p.tgl_peminjaman, p.tgl_mulai, p.tgl_berakhir,\n" +
                "p.keterangan, p.id_mhs, p.ketua_kegiatan,\n" +
                "p.kontak_ketua, p.status_peminjaman,\n" +
                "l.no_lab\n" +
                "FROM tbl_peminjaman p, tbl_lab l\n" +
                "WHERE p.id_lab = l.id_lab\n" +
                "AND id_peminjaman = "+id+"";
            rs = db.getData(sql);
            if(rs.next()){
                p = new Peminjaman();
                p.setId_peminjaman(rs.getInt("id_peminjaman"));
                p.setId_lab(rs.getInt("id_lab"));
                p.setLevel(rs.getInt("level"));
                p.setId_mhs(rs.getInt("id_mhs"));
                p.setNo_lab(rs.getInt("no_lab"));
                p.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                p.setTgl_mulai(rs.getString("tgl_mulai"));
                p.setTgl_berakhir(rs.getString("tgl_berakhir"));
                p.setKeterangan(rs.getString("keterangan"));
                p.setKetua_kegiatan(rs.getString("ketua_kegiatan"));
                p.setKontak_ketua(rs.getString("kontak_ketua")); 
                p.setStatus_peminjaman(rs.getString("status_peminjaman"));
            }
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }finally{
            db.disconnect(rs);
            return p;
        }
    }
    
    public Peminjaman[] peminjamanDiajukan(){
        Peminjaman[] p = null;
        Peminjaman temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        
        try{
            String sql = "SELECT p.id_peminjaman, p.id_lab, p.level,\n" +
                "p.tgl_peminjaman, p.tgl_mulai, p.tgl_berakhir,\n" +
                "p.keterangan, p.id_mhs, p.ketua_kegiatan,\n" +
                "p.kontak_ketua, p.status_peminjaman,\n" +
                "l.no_lab\n" +
                "FROM tbl_peminjaman p, tbl_lab l\n" +
                "WHERE p.id_lab = l.id_lab AND\n" +
                "status_peminjaman LIKE \"Diajukan\"\n" +
                "ORDER BY id_peminjaman DESC";
            rs = db.getData(sql);
            while(rs.next()){
                temp = new Peminjaman();
                temp.setId_peminjaman(rs.getInt("id_peminjaman"));
                temp.setId_lab(rs.getInt("id_lab"));
                temp.setLevel(rs.getInt("level"));
                temp.setId_mhs(rs.getInt("id_mhs"));
                temp.setNo_lab(rs.getInt("no_lab"));
                temp.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                temp.setTgl_mulai(rs.getString("tgl_mulai"));
                temp.setTgl_berakhir(rs.getString("tgl_berakhir"));
                temp.setKeterangan(rs.getString("keterangan"));
                temp.setKetua_kegiatan(rs.getString("ketua_kegiatan"));
                temp.setKontak_ketua(rs.getString("kontak_ketua")); 
                temp.setStatus_peminjaman(rs.getString("status_peminjaman"));
                
                daftar.add(temp);
            }
            
            p = new Peminjaman[daftar.size()];
            daftar.toArray(p);
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }finally{
            db.disconnect(rs);
            return p;
        }
    }
    
    public Peminjaman[] statusPeminjaman(){
        Peminjaman[] p = null;
        Peminjaman temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        try{
            String sql = "SELECT status_peminjaman, COUNT(id_peminjaman) as jml\n" +
                "FROM tbl_peminjaman\n" +
                "GROUP BY status_peminjaman";
            rs = db.getData(sql);
            while(rs.next()){
                temp = new Peminjaman();
                temp.setStatus_peminjaman(rs.getString("status_peminjaman"));
                temp.setJml_status_peminjaman(rs.getInt("jml"));
                
                daftar.add(temp);
            }
            p = new Peminjaman[daftar.size()];
            daftar.toArray(p);
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }finally{
            db.disconnect(rs);
            return p;
        }
    }
    
    /* Akses models InformasiLab */
    public InformasiLab labTersedia(){
        InformasiLab info = null;
        database db = new database();
        ResultSet rs = null;
        try{
            String sql = "SELECT COUNT(id_lab) as jml_seluruh_lab, (\n" +
                "    SELECT COUNT(id_lab) \n" +
                "    FROM tbl_lab \n" +
                "    WHERE status_lab LIKE \"Available\") as jml_lab_tersedia\n" +
                "FROM tbl_lab";
            rs = db.getData(sql);
            if(rs.next()){
                info = new InformasiLab();
                info.setJml_lab(rs.getInt("jml_seluruh_lab"));
                info.setLab_tersedia(rs.getInt("jml_lab_tersedia"));
            }
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }finally{
            db.disconnect(rs);
            return info;
        }
    }
    
    public InformasiLab labById(String id_peminjaman){
        InformasiLab info = null;
        database db = new database();
        ResultSet rs = null;
        try{
            String sql = "SELECT l.no_lab, l.nama_lab, l.kapasitas_lab, ka.nama_kalab,\n" + 
                "pic.nama_pic, l.foto_lab\n" +
                "FROM tbl_lab l, tbl_kepala_lab ka, tbl_pic_lab pic, tbl_peminjaman p\n" +
                "WHERE l.id_kalab = ka.id_kalab AND l.id_pic = pic.id_pic\n" +
                "AND p.id_lab = l.id_lab AND p.id_peminjaman = '"+id_peminjaman+"'";
            rs = db.getData(sql);
            if(rs.next()){
                info = new InformasiLab();
                info.setNo_lab(rs.getString("no_lab"));
                info.setNama_lab(rs.getString("nama_lab"));
                info.setKapasitas(rs.getString("kapasitas_lab"));
                info.setKetua_lab(rs.getString("nama_kalab"));
                info.setPic_lab(rs.getString("nama_pic"));
                info.setFoto_lab(rs.getString("foto_lab"));
            }
        }catch(Exception ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan detail peminjaman" + ex);
        }finally{
            db.disconnect(rs);
            return info;
        }
    }
    
    /* Akses models Logbook */
    public Logbook logbookByPeminjaman(int id_lab, String tgl_berakhir){
        Logbook lb = null;
        database db = new database();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM tbl_logbook\n" +
                "WHERE tgl_pengisian = \""+tgl_berakhir+"\"\n" +
                "AND id_lab = "+id_lab+"";
            rs = db.getData(sql);
            if(rs.next()){
                lb = new Logbook();
                lb.setId_logbook(rs.getInt("id_logbook"));
                lb.setNama_pengisi(rs.getString("nama_pengisi"));
                lb.setTgl_pengisian(rs.getString("tgl_pengisian"));
                lb.setKondisi_lab(rs.getString("kondisi_lab"));
                lb.setPengaduan(rs.getString("pengaduan"));
                lb.setFoto_lab(rs.getString("foto_lab"));
            }
        }catch(Exception ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan logbook" + ex);
        }finally{
            db.disconnect(rs);
            return lb;
        }
    }
}
