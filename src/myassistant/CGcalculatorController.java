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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class CGcalculatorController implements Initializable {

    @FXML
    private Button reset;
    @FXML
    private Button calculate;
    @FXML
    private TextField totalMarks;
    @FXML
    private TextField cgpa;
    @FXML
    private TextField calculatePc;
    @FXML
    private TextField c1;
    @FXML
    private TextField c2;
    @FXML
    private TextField c3;
    @FXML
    private TextField c4;
    @FXML
    private TextField c5;
   
    @FXML
    private TextField c6;
    @FXML
    private TextField c7;
    @FXML
    private TextField c8;
    @FXML
    private TextField c9;
    @FXML
    private TextField c11;
    @FXML
    private TextField c21;
    @FXML
    private TextField c31;
    @FXML
    private TextField c41;
    @FXML
    private TextField c51;
    @FXML
    private TextField c61;
    @FXML
    private TextField c71;
    @FXML
    private TextField c81;
    @FXML
    private TextField c91;
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleResetAction(ActionEvent event) {
        c1.clear();
        c2.clear();
        c3.clear();
        c4.clear();
        c5.clear();
        c6.clear();
        c7.clear();
        c8.clear();
        c9.clear();
        
        totalMarks.clear();
        cgpa.clear();
        calculatePc.clear();
        
    }

    @FXML
    private void handleCalculateAction(ActionEvent event) {
        
        
        double result = 0, totalCredit;
        totalCredit = Double.parseDouble(c1.getText()) + Double.parseDouble(c2.getText()) + Double.parseDouble(c3.getText()) + Double.parseDouble(c4.getText()) + Double.parseDouble(c5.getText()) + Double.parseDouble(c6.getText()) + Double.parseDouble(c7.getText()) + Double.parseDouble(c8.getText()) + Double.parseDouble(c9.getText());// c2.getText() + c3.getText() + c4.getText() + c5.getText() + c6.getText() + c7.getText() + c8.getText() + c9.getText();
        
        result += (Double.parseDouble(c1.getText()) * Double.parseDouble(c11.getText()));
        result += (Double.parseDouble(c2.getText()) * Double.parseDouble(c21.getText()));
        result += (Double.parseDouble(c3.getText()) * Double.parseDouble(c31.getText()));
        result += (Double.parseDouble(c4.getText()) * Double.parseDouble(c41.getText()));
        result += (Double.parseDouble(c5.getText()) * Double.parseDouble(c51.getText()));
        result += (Double.parseDouble(c6.getText()) * Double.parseDouble(c61.getText()));
        result += (Double.parseDouble(c7.getText()) * Double.parseDouble(c71.getText()));
        result += (Double.parseDouble(c8.getText()) * Double.parseDouble(c81.getText()));
        result += (Double.parseDouble(c9.getText()) * Double.parseDouble(c91.getText()));
        
        result /= totalCredit;
        
        cgpa.setText(String.valueOf(result));
        
    }
    
}
