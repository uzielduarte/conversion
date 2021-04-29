/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzielduarte.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sistemas-08
 */
public class TemperaturaFXMLController implements Initializable {

    @FXML
    public TextField txtCelcius;
    @FXML
    public TextField txtFah;
    @FXML
    public Button btnCompute;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnComputeAction(){
        
    }
}
