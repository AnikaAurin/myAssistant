/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassistant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author shabbir
 */
public class HlinkController implements Initializable {


    @FXML
    private WebView browser_var;
    @FXML
    private ImageView dp;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        //wait matha thanda koro
    }    

    @FXML
    private void visitWeb(MouseEvent event) {
        browser_var.getEngine().load("https://www.youtube.com/watch?v=WntnEzmkQy4");
    }

   


    
}
