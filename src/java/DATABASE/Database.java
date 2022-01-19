/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author DOSEN329
 */

public class Database {
    private Connection con;
    private Statement stmt;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String dsn;
    private String login;
    private String pwd;
    
    public Database(String dsn, String login, String pwd){
        this.dsn = dsn;
        this.login = login;
        this.pwd = pwd;
    }
    
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dsn, login, pwd);
        stmt = con.createStatement();
        return con;
    }
    
    public int executeUpdate(String str) throws SQLException {
        return stmt.executeUpdate(str);
    }
    
    public ResultSet executeQuery(String str) throws SQLException {
        resultSet = stmt.executeQuery(str);
        return resultSet;
    }
    
    public void disconnect() throws SQLException {
        if(resultSet != null){
            resultSet.close();
        }
        if(stmt != null){
            stmt.close();
        }
        if(con != null){
            con.close();
        }
    }
    
    public Statement getStmt(){
        return stmt;
    }
    
    public ResultSet getResultSet(){
        return resultSet;
    }
    
    public PreparedStatement getPreparedStatement(String str) throws SQLException {
        preparedStatement = con.prepareStatement(str);
        return preparedStatement;
    }
}
