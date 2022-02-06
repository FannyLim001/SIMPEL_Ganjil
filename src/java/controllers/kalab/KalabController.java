/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.kalab;

import config.database;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.kalab.*;

/**
 *
 * @author FANNY
 */
public class KalabController {

    public PeminjamanModel[] getDaftarPeminjaman() {
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
            while (rs.next()) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarPeminjaman;
        }
    }

    public PeminjamanModel[] getDaftarPeminjamanBelumSelesai() {
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
            while (rs.next()) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarPeminjamanBelumSelesai;
        }
    }

    public PeminjamanModel[] getDaftarPeminjamanSelesai() {
        PeminjamanModel[] daftarPeminjamanSelesai = null;
        PeminjamanModel tempPeminjaman2 = null;
        ArrayList listPeminjaman2 = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs2 = null;
        String sql2 = "select p.id_peminjaman, l.no_lab, p.level, p.tgl_peminjaman, p.tgl_mulai, "
                + "p.tgl_berakhir, p.keterangan, m.nim, p.ketua_kegiatan, p.kontak_ketua, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l, tbl_mahasiswa m where p.id_lab = l.id_lab and p.id_mhs = m.id_mhs and "
                + "level between 2 and 3 and status_peminjaman in ('Selesai','Dibatalkan','Disetujui','Ditolak')";
        try {
            rs2 = db.getData(sql2);
            while (rs2.next()) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs2);
            return daftarPeminjamanSelesai;
        }
    }

    public PeminjamanModel getDataPeminjamanbyID(int id_peminjaman) {
        PeminjamanModel Peminjaman = null;
        ResultSet rs = null;
        database db = new database();
        db.connection();
        String sql = "select p.id_peminjaman, l.no_lab, p.level, p.tgl_peminjaman, p.tgl_mulai, "
                + "p.tgl_berakhir, p.keterangan, m.nim, p.ketua_kegiatan, p.kontak_ketua, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l, tbl_mahasiswa m where p.id_lab=l.id_lab and p.id_mhs=m.id_mhs and p.id_peminjaman='" + id_peminjaman + "'";
        try {
            rs = db.getData(sql);
            if (rs.next()) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return Peminjaman;
        }
    }

    public PicModel[] getDaftarPic() {
        PicModel[] daftarPic = null;
        PicModel tempPic = null;
        ArrayList listPic = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select p.id_pic, p.nama_pic, p.ruangan_pic, p.email_pic, p.pass_pic from tbl_pic_lab p";
        try {
            rs = db.getData(sql);
            while (rs.next()) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarPic;
        }
    }

    public PicModel getDataPicbyID(int id_pic) {
        PicModel Pic = null;
        ResultSet rs = null;
        database db = new database();
        db.connection();
        String sql = "select p.id_pic, p.nama_pic, p.ruangan_pic, p.email_pic, p.pass_pic, p.kontak_pic from tbl_pic_lab p "
                + "where p.id_pic='" + id_pic + "'";
        try {
            rs = db.getData(sql);
            if (rs.next()) {
                Pic = new PicModel();
                Pic.setId_pic(rs.getInt("id_pic"));
                Pic.setNama_pic(rs.getString("nama_pic"));
                Pic.setRuangan_pic(rs.getString("ruangan_pic"));
                Pic.setEmail_pic(rs.getString("email_pic"));
                Pic.setPass_pic(rs.getString("pass_pic"));
                Pic.setKontak_pic(rs.getString("kontak_pic"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return Pic;
        }
    }

    public KalabModel[] getDaftarKalab() {
        KalabModel[] daftarKalab = null;
        KalabModel tempKalab = null;
        ArrayList listKalab = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select id_kalab, nama_kalab, email_kalab, pass_kalab from tbl_kepala_lab";
        try {
            rs = db.getData(sql);
            while (rs.next()) {
                tempKalab = new KalabModel();
                tempKalab.setId_kalab(rs.getInt("id_kalab"));
                tempKalab.setNama_kalab(rs.getString("nama_kalab"));
                tempKalab.setEmail_kalab(rs.getString("email_kalab"));
                tempKalab.setPass_kalab(rs.getString("pass_kalab"));
                listKalab.add(tempKalab);
            }
            daftarKalab = new KalabModel[listKalab.size()];
            listKalab.toArray(daftarKalab);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarKalab;
        }
    }

    public KalabModel getDataKalabbyID(int id_kalab) {
        KalabModel Kalab = null;
        ResultSet rs = null;
        database db = new database();
        db.connection();
        String sql = "select id_kalab, nama_kalab, email_kalab, pass_kalab from tbl_kepala_lab "
                + "where id_kalab='" + id_kalab + "'";
        try {
            rs = db.getData(sql);
            if (rs.next()) {
                Kalab = new KalabModel();
                Kalab.setId_kalab(rs.getInt("id_kalab"));
                Kalab.setNama_kalab(rs.getString("nama_kalab"));
                Kalab.setEmail_kalab(rs.getString("email_kalab"));
                Kalab.setPass_kalab(rs.getString("pass_kalab"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return Kalab;
        }
    }

    public LabModel[] getDaftarLab() {
        LabModel[] daftarLab = null;
        LabModel tempLab = null;
        ArrayList listLab = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select * from tbl_lab l";
        try {
            rs = db.getData(sql);
            while (rs.next()) {
                tempLab = new LabModel();
                tempLab.setId_lab(rs.getInt("id_lab"));
                tempLab.setId_pic(rs.getInt("id_pic"));
                tempLab.setId_kalab(rs.getInt("id_kalab"));
                tempLab.setNo_lab(rs.getInt("no_lab"));
                tempLab.setNama_lab(rs.getString("nama_lab"));
                tempLab.setKapasitas_lab(rs.getString("kapasitas_lab"));
                tempLab.setFoto_lab(rs.getString("foto_lab"));
                tempLab.setStatus_lab(rs.getString("status_lab"));
                listLab.add(tempLab);
            }
            daftarLab = new LabModel[listLab.size()];
            listLab.toArray(daftarLab);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return daftarLab;
        }
    }
    
    public DashboardModel[] getDataDashboard(int id_kalab) {
        DashboardModel[] dataDashboard = null;
        DashboardModel tempData = null;
        ArrayList listData = new ArrayList();
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select count(id_peminjaman) from tbl_peminjaman p, tbl_lab l where level between 2 and 3 and "
                + "p.id_lab=l.id_lab and l.id_kalab='"+id_kalab+"'";
        String sql2 = "select count(*) from tbl_lab where id_kalab='"+id_kalab+"'";
        String sql3 = "select count(id_peminjaman) from tbl_peminjaman p, tbl_lab l where status_peminjaman='Disetujui' and level between 2 and 3 and "
                + "p.id_lab=l.id_lab and l.id_kalab='"+id_kalab+"'";
        String sql4 = "select count(id_peminjaman) from tbl_peminjaman p, tbl_lab l where status_peminjaman='Ditolak' and level between 2 and 3 and "
                + "p.id_lab=l.id_lab and l.id_kalab='"+id_kalab+"'";
        try {
            
            rs = db.getData(sql);
            tempData = new DashboardModel();
            while (rs.next()) {
                tempData.setTotal_peminjaman(rs.getInt(1));
            }
            
            rs = db.getData(sql2);
            while (rs.next()) {
                tempData.setTotal_lab(rs.getInt(1));
            }
            
            rs = db.getData(sql3);
            while (rs.next()) {
                tempData.setTotal_disetujui(rs.getInt(1));
            }
            
            rs = db.getData(sql4);
            while (rs.next()) {
                tempData.setTotal_ditolak(rs.getInt(1));
            }
            listData.add(tempData);
            dataDashboard = new DashboardModel[listData.size()];
            listData.toArray(dataDashboard);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect(rs);
            return dataDashboard;
        }
    }

    public static void UpdateStatus(PeminjamanModel p) {
        database db = new database();
        db.connection();
        String sql = "update tbl_peminjaman set status_peminjaman='" + p.getStatus_peminjaman() + "' "
                + "where id_peminjaman='" + p.getId_peminjaman() + "'";
        try {
            db.saveData(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void SavePic(PicModel p) {
        database db = new database();
        db.connection();
        String sql = "insert into tbl_pic_lab(nama_pic, email_pic, pass_pic, kontak_pic, ruangan_pic, foto_pic) "
                + "values('" + p.getNama_pic() + "','" + p.getEmail_pic() + "','" + p.getPass_pic() + "','" + p.getKontak_pic() + "','" + p.getRuangan_pic() + "','" + p.getFoto_pic() + "')";
        try {
            db.saveData(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void UpdatePic(PicModel p) {
        database db = new database();
        db.connection();
        String sql = "update tbl_pic_lab set nama_pic='" + p.getNama_pic() + "', email_pic='" + p.getEmail_pic() + "', "
                + "pass_pic='" + p.getPass_pic() + "', kontak_pic='" + p.getKontak_pic() + "', ruangan_pic='" + p.getRuangan_pic() + "' "
                + "where id_pic='" + p.getId_pic() + "'";
        try {
            db.saveData(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void DeletePic(int id_pic) {
        database db = new database();
        db.connection();
        String sql = "delete from tbl_pic_lab where id_pic='" + id_pic + "'";
        try {
            db.saveData(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean CekLogin(KalabModel k){
        boolean status=false;
        database db = new database();
        db.connection();
        ResultSet rs = null;
        String sql = "select * from tbl_kepala_lab where email_kalab='" + k.getEmail_kalab() + "' and pass_kalab='"+k.getPass_kalab()+"'";
        try {
            rs = db.getData(sql);
            
            while (rs.next()) {
            
                String db_email = rs.getString("email_kalab");
                String db_pass = rs.getString("pass_kalab");

                if(k.getEmail_kalab().equals(db_email) && k.getPass_kalab().equals(db_pass)){
                    k.setNama_kalab(rs.getString("nama_kalab"));
                    k.setId_kalab(rs.getInt("id_kalab"));
                    status = true;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
