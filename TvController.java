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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class TvController implements Initializable {

    @FXML
    private Button tfvisit;
    @FXML
    private Button tforder;
    @FXML
    private Button tfgfmdetals;
    @FXML
    private Button tfconfirm;
    @FXML
    private Button tfback;
    @FXML
    private Button tfnext;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void visitbutton(ActionEvent event) {
          Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.indiatoday.in/technology/news/story/samsung-qled-8k-tv-india-launch-price-features-availability-1542364-2019-06-04"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void orderbutton(ActionEvent event) {
    }

    @FXML
    private void detailsbutton(ActionEvent event) {
          Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://9to5mac.com/2020/02/06/new-apple-tv-4k-hardware-appears-closer-to-launching-based-on-tvos-13-4-beta-code/"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void confirmbutton(ActionEvent event) {
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
