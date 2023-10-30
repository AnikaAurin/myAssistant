/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassistant;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class DBConnector {
    public String username, password, dbName, serverAddress;
    public Connection dbcon;
    private String root;

    public DBConnector(String username, String password, String dbName, String serverAddress) {
        this.username = username;
        this.password = password;
        this.dbName = dbName;
        this.serverAddress = serverAddress;
    }


    
    void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.dbcon = (Connection) DriverManager.getConnection("jdbc:mysql://" + this.serverAddress + "/" + this.dbName, username, password);
        
    }
}
