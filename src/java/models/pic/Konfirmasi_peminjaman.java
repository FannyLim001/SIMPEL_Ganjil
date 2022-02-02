/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.pic;

/**
 *
 * @author Mahendra
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.database;

public class Konfirmasi_peminjaman {

    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }
    int id;
    database db = null;

    public Konfirmasi_peminjaman() {
        db = new database();
    }

    public void proses(int id, String status) {
        int getid = id;
        String getstatus = status;
        return getstatus;
    }
}
