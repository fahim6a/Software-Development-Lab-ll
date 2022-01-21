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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class CamOrderController implements Initializable {
    //public String doubleprice;

    @FXML
    private Button tfconfirm;
    @FXML
    private TextField tfquantity;
    @FXML
    private TextArea textfieldareabox;
    @FXML
    private RadioButton tfwithlens;
    @FXML
    private RadioButton tfjustbody;
    @FXML
    private Button tfhome;
    @FXML
    private ToggleGroup tgtype;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmbutton(ActionEvent event) {
        double price = 0.0;
        int quantity =Integer.parseInt(tfquantity.getText());
        if(tfwithlens.isSelected()){
            price = 6750.0;
            textfieldareabox.appendText("Hasselblad X1D 50C With Lens" + price +" "+ quantity +"\n");
        }
        else{
            if(tfjustbody.isSelected()){
                price =5750.0;
                textfieldareabox.appendText("Hasselblad X1D 50C Only Body  "   + price +" "+ quantity +"\n");
            }
        }
    }

    @FXML
    private void homebutton(ActionEvent event) {
        try {
            Parent question = FXMLLoader.load(getClass().getResource("Camera.fxml"));
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
