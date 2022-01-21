/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecard;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class CommentController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField email;
    @FXML
    private TextField comment;
    @FXML
    private TextArea area;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitbutton(ActionEvent event) {
        area.setText("\t\t\t\t\t\tUser Comments\n\n");
     //Date obj = new Date();
     //String Date = obj.toString();
     
     //area.setText(area.getText()+"\n"  +Date+  "\n\n");
     area.setText(area.getText()+"Your Name     :   "+name.getText()+"\n\n");
     area.setText(area.getText()+"Your Email    :   "+email.getText()+"\n\n");
     area.setText(area.getText()+"Your Comments    :   "+comment.getText()+"\n\n");
     
     area.setText(area.getText()+"\n\n\n\n                                          Signature");
    }

    @FXML
    private void clearbutton(ActionEvent event) {
         area.setText("");
         name.setText("");
         email.setText("");
         comment.setText("");
    }

    @FXML
    private void backbutton(ActionEvent event) {
         try {
            Parent question = FXMLLoader.load(getClass().getResource("CategoryView.fxml"));
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
