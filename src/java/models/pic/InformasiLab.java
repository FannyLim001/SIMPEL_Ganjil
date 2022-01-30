package models.pic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.database;

public class InformasiLab {
    database db = null;
    int id_lab;
    String no_lab, nama_lab, kapasitas, ketua_lab, pic_lab, foto_lab;
    
    public InformasiLab(){
        db = new database();
    }

    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }

    public String getNo_lab() {
        return no_lab;
    }

    public void setNo_lab(String no_lab) {
        this.no_lab = no_lab;
    }

    public String getNama_lab() {
        return nama_lab;
    }

    public void setNama_lab(String nama_lab) {
        this.nama_lab = nama_lab;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getKetua_lab() {
        return ketua_lab;
    }

    public void setKetua_lab(String ketua_lab) {
        this.ketua_lab = ketua_lab;
    }

    public String getPic_lab() {
        return pic_lab;
    }

    public void setPic_lab(String pic_lab) {
        this.pic_lab = pic_lab;
    }

    public String getFoto_lab() {
        return foto_lab;
    }

    public void setFoto_lab(String foto_lab) {
        this.foto_lab = foto_lab;
    }
    
    public List tampilInfoLab(String id_peminjaman){
        List<InformasiLab> data = new ArrayList<InformasiLab>();
        ResultSet rs = null;
        try{
            String sql = "SELECT l.no_lab, l.nama_lab, l.kapasitas_lab, ka.nama_kalab,\n" + 
                "pic.nama_pic, l.foto_lab\n" +
                "FROM tbl_lab l, tbl_kepala_lab ka, tbl_pic_lab pic, tbl_peminjaman p\n" +
                "WHERE l.id_kalab = ka.id_kalab AND l.id_pic = pic.id_pic\n" +
                "AND p.id_lab = l.id_lab AND p.id_peminjaman = '"+id_peminjaman+"'";
            rs = db.getData(sql);
            while(rs.next()){
                InformasiLab il = new InformasiLab();
                il.setNo_lab(rs.getString("no_lab"));
                il.setNama_lab(rs.getString("nama_lab"));
                il.setKapasitas(rs.getString("kapasitas_lab"));
                il.setKetua_lab(rs.getString("nama_kalab"));
                il.setPic_lab(rs.getString("nama_pic"));
                il.setFoto_lab(rs.getString("foto_lab"));
                
                data.add(il);
            }
            db.disconnect(rs);
        }catch(Exception ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan detail peminjaman" + ex);
        }
        return data;
    }
}
