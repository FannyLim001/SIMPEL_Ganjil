package controllers.pic;

import config.database;
import java.sql.*;
import java.util.ArrayList;
import models.pic.*;

public class PicController {

    /* Akses models Peminjaman */
    public Peminjaman[] getDataPeminjaman() {
        Peminjaman[] p = null;
        Peminjaman temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT p.id_peminjaman, p.id_lab, p.level,\n"
                    + "p.tgl_peminjaman, p.tgl_mulai, p.tgl_berakhir,\n"
                    + "p.keterangan, p.id_mhs, p.ketua_kegiatan,\n"
                    + "p.kontak_ketua, p.status_peminjaman,\n"
                    + "l.no_lab\n"
                    + "FROM tbl_peminjaman p, tbl_lab l\n"
                    + "WHERE p.id_lab = l.id_lab\n"
                    + "ORDER BY id_peminjaman DESC";
            rs = db.getData(sql);
            while (rs.next()) {
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
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return p;
        }
    }

    public Peminjaman getPeminjamanById(int id) {
        Peminjaman p = null;
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT p.id_peminjaman, p.id_lab, p.level,\n"
                    + "p.tgl_peminjaman, p.tgl_mulai, p.tgl_berakhir,\n"
                    + "p.keterangan, p.id_mhs, p.ketua_kegiatan,\n"
                    + "p.kontak_ketua, p.status_peminjaman,\n"
                    + "l.no_lab\n"
                    + "FROM tbl_peminjaman p, tbl_lab l\n"
                    + "WHERE p.id_lab = l.id_lab\n"
                    + "AND id_peminjaman = " + id + "";
            rs = db.getData(sql);
            if (rs.next()) {
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
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return p;
        }
    }

    public Peminjaman[] getPeminjamanDiajukan() {
        Peminjaman[] p = null;
        Peminjaman temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;

        try {
            String sql = "SELECT p.id_peminjaman, p.id_lab, p.level,\n"
                    + "p.tgl_peminjaman, p.tgl_mulai, p.tgl_berakhir,\n"
                    + "p.keterangan, p.id_mhs, p.ketua_kegiatan,\n"
                    + "p.kontak_ketua, p.status_peminjaman,\n"
                    + "l.no_lab\n"
                    + "FROM tbl_peminjaman p, tbl_lab l\n"
                    + "WHERE p.id_lab = l.id_lab AND\n"
                    + "status_peminjaman LIKE \"Diajukan\"\n"
                    + "ORDER BY id_peminjaman DESC";
            rs = db.getData(sql);
            while (rs.next()) {
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
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return p;
        }
    }

    public Peminjaman[] getStatusPeminjaman() {
        Peminjaman[] p = null;
        Peminjaman temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT status_peminjaman, COUNT(id_peminjaman) as jml\n"
                    + "FROM tbl_peminjaman\n"
                    + "GROUP BY status_peminjaman";
            rs = db.getData(sql);
            while (rs.next()) {
                temp = new Peminjaman();
                temp.setStatus_peminjaman(rs.getString("status_peminjaman"));
                temp.setJml_status_peminjaman(rs.getInt("jml"));

                daftar.add(temp);
            }
            p = new Peminjaman[daftar.size()];
            daftar.toArray(p);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return p;
        }
    }

    public int konfirmasiPeminjaman(int id, String aksi) {
        int rowAffected = 0;
        database db = new database();
        String status = null;
        if (aksi.equalsIgnoreCase("disetujui")) {
            status = "Menunggu";
        } else if (aksi.equalsIgnoreCase("ditolak")) {
            status = "Ditolak";
        }
        try {
            String sql = "UPDATE tbl_peminjaman \n"
                    + "SET status_peminjaman = '" + status + "' \n"
                    + "WHERE id_peminjaman = " + id + "";
            rowAffected = db.saveData(sql);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return rowAffected;
    }

    /* Akses models InformasiLab */
    public static int insertDataLab(InformasiLab l) {
        int rowAffected = 0;
        database db = new database();
        try {
            String Sql = "INSERT INTO tbl_lab(id_pic, id_kalab, no_lab, nama_lab, kapasitas_lab, foto_lab, status_lab)"
                    + "VALUES('" + l.getId_pic() + "','" + l.getId_kalab() + "','" + l.getNo_lab() + "','" + l.getNama_lab() + "','" + l.getKapasitasLab()+ "','" + l.getFoto_lab() + "','" + l.getStatus() + "')";
            rowAffected = db.saveData(Sql);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menyimpan data lab" + ex);
        }
        return rowAffected;
    }

    public static int updateDataLab(InformasiLab l) {
        int rowAffected = 0;
        database db = new database();
        try {
            String Sql = "UPDATE tbl_lab SET\n"
                    + "id_pic = '"+l.getId_pic()+"',\n"
                    + "id_kalab = '"+l.getId_kalab()+"',\n"
                    + "no_lab = '"+l.getNo_lab()+"',\n"
                    + "nama_lab = \""+l.getNama_lab()+"\",\n"
                    + "kapasitas_lab = '"+l.getKapasitasLab()+"',\n"
                    + "foto_lab = \""+l.getFoto_lab()+"\",\n"
                    + "status_lab = \""+l.getStatus()+"\"\n"
                    + "WHERE id_lab = '"+l.getId_lab()+"'";
            rowAffected = db.saveData(Sql);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menyimpan data lab" + ex);
        }
        return rowAffected;
    }

    public static int hapusDataLab(InformasiLab l) {
        int rowAffected = 0;
        database db = new database();
        try {
            String Sql = "DELETE FROM tbl_lab WHERE id_lab='" + l.getId_lab() + "'";
            rowAffected = db.saveData(Sql);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menghapus data lab" + ex);
        }
        return rowAffected;
    }

    public InformasiLab[] getDataLab() {
        InformasiLab[] p = null;
        InformasiLab temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT p.id_lab, c.nama_pic, l.nama_kalab,\n"
                    + "p.no_lab, p.nama_lab, p.kapasitas_lab,\n"
                    + "p.foto_lab, p.status_lab\n"
                    + "FROM tbl_lab p, tbl_kepala_lab l, tbl_pic_lab c\n"
                    + "WHERE p.id_pic = c.id_pic and p.id_kalab = l.id_kalab\n"
                    + "ORDER BY p.id_lab DESC";
            rs = db.getData(sql);
            while (rs.next()) {
                temp = new InformasiLab();
                temp.setId_lab(rs.getInt("id_lab"));
                temp.setPic_lab(rs.getString("nama_pic"));
                temp.setKetua_lab(rs.getString("nama_kalab"));
                temp.setNo_lab(rs.getInt("no_lab"));
                temp.setNama_lab(rs.getString("nama_lab"));
                temp.setKapasitasLab(rs.getInt("kapasitas_lab"));
                temp.setFoto_lab(rs.getString("foto_lab"));
                temp.setStatus(rs.getString("status_lab"));
                daftar.add(temp);
            }
            p = new InformasiLab[daftar.size()];
            daftar.toArray(p);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return p;
        }
    }

    public InformasiLab getLabTersedia() {
        InformasiLab info = null;
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT COUNT(id_lab) as jml_seluruh_lab, (\n"
                    + "    SELECT COUNT(id_lab) \n"
                    + "    FROM tbl_lab \n"
                    + "    WHERE status_lab LIKE \"Available\") as jml_lab_tersedia\n"
                    + "FROM tbl_lab";
            rs = db.getData(sql);
            if (rs.next()) {
                info = new InformasiLab();
                info.setJml_lab(rs.getInt("jml_seluruh_lab"));
                info.setLab_tersedia(rs.getInt("jml_lab_tersedia"));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return info;
        }
    }

    public InformasiLab getLabById(String id_peminjaman) {
        InformasiLab info = null;
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT l.no_lab, l.nama_lab, l.kapasitas_lab, ka.nama_kalab,\n"
                    + "pic.nama_pic, l.foto_lab, l.id_pic, l.id_kalab\n"
                    + "FROM tbl_lab l, tbl_kepala_lab ka, tbl_pic_lab pic, tbl_peminjaman p\n"
                    + "WHERE l.id_kalab = ka.id_kalab AND l.id_pic = pic.id_pic\n"
                    + "AND p.id_lab = l.id_lab AND p.id_peminjaman = '" + id_peminjaman + "'";
            rs = db.getData(sql);
            if (rs.next()) {
                info = new InformasiLab();
                info.setNo_lab(rs.getInt("no_lab"));
                info.setNama_lab(rs.getString("nama_lab"));
                info.setKapasitasLab(rs.getInt("kapasitas_lab"));
                info.setKetua_lab(rs.getString("nama_kalab"));
                info.setPic_lab(rs.getString("nama_pic"));
                info.setFoto_lab(rs.getString("foto_lab"));
                info.setId_pic(rs.getInt("id_pic"));
                info.setId_kalab(rs.getInt("id_kalab"));
            }
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan detail peminjaman" + ex);
        } finally {
            db.disconnect(rs);
            return info;
        }
    }

    public InformasiLab getDataLabById(int id_lab) {
        InformasiLab info = null;
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT l.id_lab, l.id_pic, l.id_kalab,\n" +
                "l.no_lab, l.nama_lab, l.kapasitas_lab,\n" +
                "l.foto_lab, l.status_lab, p.nama_pic, k.nama_kalab\n" +
                "FROM tbl_lab l, tbl_pic_lab p, tbl_kepala_lab k\n" +
                "WHERE l.id_pic = p.id_pic AND l.id_kalab = k.id_kalab\n" +
                "AND l.id_lab = '"+id_lab+"'";
            rs = db.getData(sql);
            if (rs.next()) {
                info = new InformasiLab();
                info.setId_lab(rs.getInt("id_lab"));
                info.setId_pic(rs.getInt("id_pic"));
                info.setId_kalab(rs.getInt("id_kalab"));
                info.setNo_lab(rs.getInt("no_lab"));
                info.setNama_lab(rs.getString("nama_lab"));
                info.setKapasitasLab(rs.getInt("kapasitas_lab"));
                info.setFoto_lab(rs.getString("foto_lab"));
                info.setStatus(rs.getString("status_lab"));
                info.setPic_lab(rs.getString("nama_pic"));
                info.setKetua_lab(rs.getString("nama_kalab"));
            }
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan detail peminjaman" + ex);
        } finally {
            db.disconnect(rs);
            return info;
        }
    }

    /* Akses models Logbook */
    public Logbook getLogbookByPeminjaman(int id_lab, String tgl_berakhir) {
        Logbook lb = null;
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tbl_logbook\n"
                    + "WHERE tgl_pengisian = \"" + tgl_berakhir + "\"\n"
                    + "AND id_lab = " + id_lab + "";
            rs = db.getData(sql);
            if (rs.next()) {
                lb = new Logbook();
                lb.setId_logbook(rs.getInt("id_logbook"));
                lb.setNama_pengisi(rs.getString("nama_pengisi"));
                lb.setTgl_pengisian(rs.getString("tgl_pengisian"));
                lb.setKondisi_lab(rs.getString("kondisi_lab"));
                lb.setPengaduan(rs.getString("pengaduan"));
                lb.setFoto_lab(rs.getString("foto_lab"));
            }
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan logbook" + ex);
        } finally {
            db.disconnect(rs);
            return lb;
        }
    }

    /* Akses ModelPic */
    public ModelPic[] getAllDataPic() {
        ModelPic[] p = null;
        ModelPic temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tbl_pic_lab";
            rs = db.getData(sql);
            while (rs.next()) {
                temp = new ModelPic();
                temp.setId_pic(rs.getInt("id_pic"));
                temp.setNama_pic(rs.getString("nama_pic"));
                temp.setEmail_pic(rs.getString("email_pic"));
                temp.setPass_pic(rs.getString("pass_pic"));
                temp.setKontak_pic(rs.getString("kontak_pic"));
                temp.setRuangan_pic(rs.getString("ruangan_pic"));
                temp.setFoto_pic(rs.getString("foto_pic"));

                daftar.add(temp);
            }
            p = new ModelPic[daftar.size()];
            daftar.toArray(p);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return p;
        }
    }
    
    /* Akses ModelKalab */
    public ModelKalab[] getAllDataKalab() {
        ModelKalab[] k = null;
        ModelKalab temp = null;
        ArrayList daftar = new ArrayList();
        database db = new database();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM tbl_kepala_lab";
            rs = db.getData(sql);
            while (rs.next()) {
                temp = new ModelKalab();
                temp.setId_kalab(rs.getInt("id_kalab"));
                temp.setNama_kalab(rs.getString("nama_kalab"));
                temp.setEmail_kalab(rs.getString("email_kalab"));
                temp.setPass_kalab(rs.getString("pass_kalab"));
                temp.setKontak_kalab(rs.getString("kontak_kalab"));
                temp.setRuangan_kalab(rs.getString("ruangan_kalab"));
                temp.setFoto_kalab(rs.getString("foto_kalab"));

                daftar.add(temp);
            }
            k = new ModelKalab[daftar.size()];
            daftar.toArray(k);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        } finally {
            db.disconnect(rs);
            return k;
        }
    }

    public static void main(String[] args) {
        ModelKalab[] info = new PicController().getAllDataKalab();
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i].getNama_kalab());
        }
    }
}
