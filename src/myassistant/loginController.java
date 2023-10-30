/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassistant;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class loginController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private PasswordField password;
    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private TextField new_user;
    @FXML
    private PasswordField new_userpass;
    @FXML
    private Button create;
    @FXML
    private Label signup_status;
    @FXML
    private Label login_status;

    /**
     * Initializes the controller class.
     
* 
    * */

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleLoginAction(javafx.event.ActionEvent event) throws SQLException {
        System.out.println("You clicked me!");
        DBConnector dbc = new DBConnector("root", "", "loginCredentials", "localhost:3306");
        try {
            dbc.connect();
            System.out.println("success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyAssistant.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyAssistant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement query = dbc.dbcon.createStatement();
        String q = "SELECT `password` FROM `logindata` WHERE `username`=\"" + username.getText() + "\"";
        ResultSet answer = query.executeQuery(q);
        answer.next();
        if( answer.getString("password").equals(password.getText())) login_status.setText("Success!");
        else login_status.setText("No account found");
    }

    @FXML
    private void handleCreateAction(javafx.event.ActionEvent event) throws SQLException {
        DBConnector dbc = new DBConnector("root", "", "loginCredentials", "localhost:3306");
        try {
            dbc.connect();
            System.out.println("success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyAssistant.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyAssistant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement query = dbc.dbcon.createStatement();
        String write = "INSERT INTO `logindata`(`username`, `password`) VALUES (\"" + new_user.getText() + "\"" + "," + "\"" + new_userpass.getText() + "\"" + ")";
        query.execute(write);
        
        signup_status.setText("Success! \nplease LOgin");
       
        
    }

    
    
    
}
