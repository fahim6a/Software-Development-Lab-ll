/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecard;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class LoadingController implements Initializable {

    @FXML
    private Button tfbutton;
    @FXML
    private Circle tfc1;
    @FXML
    private Circle tfc2;
    @FXML
    private Circle tfc3;
    @FXML
    private Circle tfc4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODo
        
   
    }    

    @FXML
    private void buttonexplorenow(ActionEvent event) {
        try {
            Parent question = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(question);
            //scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
