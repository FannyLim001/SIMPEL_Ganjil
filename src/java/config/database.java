package config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PH4NTHOM
 */
public class database {
    private Connection conn;
    private Statement st;

    public static void getconnection() {
        try {
            String db = "jdbc:mysql://localhost:3306/sistem_peminjamanlab";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db, user, pass);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan ambil koneksi : " + x);
        }
    }

    public void connection() {
        try {
            String db = "jdbc:mysql://localhost:3306/sistem_peminjamanlab";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db, user, pass);
            st = conn.createStatement();
        } catch (Exception x) {

            System.out.println("Terjadi kesalahan koneksi : " + x);
        }
    }

    public void disconnect(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            st.close();
            conn.close();
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan diskoneksi : " + x);
        }
    }

    public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            connection();
            rs = st.executeQuery(sql);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan ambil data : " + x);
        }
        return rs;
    }

    public int saveData(String sql) {
        int rowAffected = 0;
        try {
            connection();
            rowAffected = st.executeUpdate(sql);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan simpan data : " + x);
        }
        return rowAffected;
    }
}