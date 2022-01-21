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
public class GamesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ValorentDownloadButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://playvalorant.com/en-us/"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void minecraftDownloadButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.techspot.com/downloads/5235-minecraft.html"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void ApexlegendsDownloadButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.ea.com/games/apex-legends"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void GrandDownloadButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://oceanofgamesu.com/grand-theft-auto-5-pc-game-download/"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void GenshinDownloadButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://genshin.mihoyo.com/en/"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void ForzaDownloadButton(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.xbox.com/en-US/games/forza-horizon-5"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
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

    @FXML
    private void nextbutton(ActionEvent event) {
    }
    
}
