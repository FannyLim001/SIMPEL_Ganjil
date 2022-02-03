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
                + "level between 2 and 3 and status_peminjaman != 'Selesai'";
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
                + "level between 2 and 3 and status_peminjaman = 'Selesai'";
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
    
//    public static int update(PeminjamanModel p){
//        
//        database db = new database();
//        db.connection();
//        String sql = "update tbl_peminjaman set status_peminjaman=? where id_peminjaman=?";
//        int status=0;
//        try {
//            db.saveData(sql);
//            ps.setString(1,lg.getJudul_lagu());
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
}
