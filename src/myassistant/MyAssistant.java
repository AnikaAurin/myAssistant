/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassistant;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class MyAssistant extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hlink.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("My Assistant");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        //db
        
        DBConnector dbc = new DBConnector("root", "", "loginCredentials", "localhost:3306");
        try {
            dbc.connect();
            System.out.println("success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyAssistant.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyAssistant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        launch(args);
    }

    
}

