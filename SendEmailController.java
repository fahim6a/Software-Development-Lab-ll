/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecard;

import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.mail.*;
import javax.mail.internet.*;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class SendEmailController implements Initializable {

    @FXML
    private Button tfemail;
    @FXML
    private TextField tfSendTo;
    @FXML
    private TextField tfSendFrom;
    @FXML
    private TextField tfSubject;
    @FXML
    private TextArea area;
    @FXML
    private Label massage;
    @FXML
    private TextField tfPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SendMailButton(ActionEvent event) {
        String to = tfSendTo.getText();
        String from = tfSendFrom.getText();
        String host = "smtp.gmail.com";
        final String username = tfSendFrom.getText();
        final String password = tfPassword.getText();

        //setup mail server

        Properties props = System.getProperties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        
         Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try{

            //create mail
            MimeMessage m = new MimeMessage(session);
            m.setFrom(new InternetAddress(from));
            m.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress(to));
            m.setSubject(tfSubject.getText());
            m.setText(area.getText());

            //send mail

            Transport.send(m);
            massage.setVisible(true);
            System.out.println("Message sent!");

        }   catch (MessagingException e){
            e.printStackTrace();
        }
         
    }

    @FXML
    private void BackButton(ActionEvent event) {
    }
    
}
