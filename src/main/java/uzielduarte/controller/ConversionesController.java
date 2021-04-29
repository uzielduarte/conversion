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
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import uzielduarte.conversionfx.App;

/**
 * FXML Controller class
 *
 * @author Sistemas-08
 */
public class ConversionesController implements Initializable {

    @FXML
    public Button btnTemperatura;
    @FXML
    public Button btnCurrency;
    @FXML
    public VBox vBoxCenter;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void btnTemperaturaAction(){
        try {
            Node parent = App.loadFXML("TemperaturaFXML");
            vBoxCenter.getChildren().add(parent);
        } catch (Exception e) {
        }
    }
    
    @FXML
    public void btnCurrencyAction(){
        
    }
}
