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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class LoginController implements Initializable {
    
    public String email, password;
    public String adminMail = "fahim@gmail.com";
    public String adminPassword = "12345";
    
    @FXML
    private TextField tbemail;
    @FXML
    private PasswordField tbpassword;
    @FXML
    private Button loginButton;
    @FXML
    private Label tferrorMassage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void doLogin(ActionEvent event) {
        //System.out.println("It's work");
        email = tbemail.getText();
        password = tbpassword.getText();
        if(adminMail.equals(email) && adminPassword.equals(password)){
            System.out.println("Success");
            try {
                Parent question = FXMLLoader.load(getClass().getResource("Road.fxml"));
                Scene scene = new Scene(question);
                //scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }else{
            System.out.println("Error");
            tferrorMassage.setVisible(true);
        }
        
    }

    @FXML
    private void signupbutton(ActionEvent event) {
        try {
                Parent question = FXMLLoader.load(getClass().getResource("Account.fxml"));
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
