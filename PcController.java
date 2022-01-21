/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecard;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class PcController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MsiLinkButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.msi.com/Monitor/Optix-Mag241c"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void pcshopbutton(ActionEvent event) {
        try {
            Parent question = FXMLLoader.load(getClass().getResource("PrintReceipt.fxml"));
            Scene scene = new Scene(question);
            //scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @FXML
    private void KeyboardShopButton(ActionEvent event) {
        try {
            Parent question = FXMLLoader.load(getClass().getResource("PrintReceipt.fxml"));
            Scene scene = new Scene(question);
            //scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @FXML
    private void keyboardLinkButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.trendhunter.com/trends/portable-gaming-keyboard"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void BackButton(ActionEvent event) {
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

    @FXML
    private void NextButton(ActionEvent event) {
    }
    
}
