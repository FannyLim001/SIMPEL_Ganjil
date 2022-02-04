package models.pic;

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
    }
}
