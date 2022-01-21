/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecard;

import static com.sun.glass.ui.Cursor.setVisible;
import java.io.FileWriter;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class AccountController implements Initializable {

   // public String name, id, email, phone, dob, address;

    @FXML
    private Button updateprofile;
    @FXML
    private Button bhome;
    @FXML
    private TextField tffullname;
    @FXML
    private TextField tfemail;
    @FXML
    private TextField tfpnumber;
    @FXML
    private TextField tfdobirth;
    @FXML
    private TextField tfaddress;
    @FXML
    private Button buttonsave;
    @FXML
    private TextField tfid;

    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void updateprofilebutton(ActionEvent event) {
    }

    @FXML
    private void homebutton(ActionEvent event) {
        try {
            Parent question = FXMLLoader.load(getClass().getResource("Insights.fxml"));
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
    private void buttonsave(ActionEvent event) {
        
     String id= tfid.getText();
     String name =  tffullname.getText();
     String email =  tfemail.getText();
     String phonenb =  tfpnumber.getText();
     String date =  tfdobirth.getText();
     String address =  tfaddress.getText();
      
      try{
           
          FileWriter Writer = new FileWriter("fahim.txt",true);
          Writer.write(""+id+"  "+name+"  "+email+"  "+phonenb+"  "+date+"  "+address);
          Writer.write(System.getProperty("line.separator"));
          Writer.close();
          
          JOptionPane.showMessageDialog(null,"Your data saved");
          setVisible(false);
         
          
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Your data does not save");
        }
      
    }}
       


