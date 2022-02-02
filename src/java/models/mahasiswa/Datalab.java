g/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.mahasiswa;

/**
 *
 * @author Mahendra
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.database;

public class Datalab {
    int id_lab,nolab,kapasitaslab;

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }
    String namalab, statuslab;

    public int getNolab() {
        return nolab;
    }

    public void setNolab(int nolab) {
        this.nolab = nolab;
    }

    public int getKapasitaslab() {
        return kapasitaslab;
    }

    public void setKapasitaslab(int kapasitaslab) {
        this.kapasitaslab = kapasitaslab;
    }

    public String getNamalab() {
        return namalab;
    }

    public void setNamalab(String namalab) {
        this.namalab = namalab;
    }

    public String getStatuslab() {
        return statuslab;
    }

    public void setStatuslab(String statuslab) {
        this.statuslab = statuslab;
    }

    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }
    
    database db = null;
       
    public Datalab() {
        db = new database();
    }
    
    public List tampil() {
        List<Datalab> data = new ArrayList<Datalab>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_lab order by nama_lab asc";
            rs = db.getData(sql);
            while (rs.next()) {
                Datalab dl = new Datalab();
                dl.setId_lab(rs.getInt("id_lab"));
                dl.setNolab(rs.getInt("no_lab"));
                dl.setNamalab(rs.getString("nama_lab"));
                dl.setKapasitaslab(rs.getInt("kapasitas_lab"));
                dl.setStatuslab(rs.getString("status_lab"));
                data.add(dl);

            }
            db.disconnect(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data lab" + ex);
        }
        return data;
    }
}
