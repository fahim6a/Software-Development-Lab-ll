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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.Printer;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class PrintReceiptController implements Initializable {

    @FXML
    private Button generate;
    @FXML
    private Button reset;
    @FXML
    private Button print;
    @FXML
    private TextArea area;
    @FXML
    private TextField tfname;
    @FXML
    private TextField tfbrand;
    @FXML
    private TextField tfprice;
    @FXML
    private TextField tfdiscount;
    @FXML
    private TextField tfpaymenttype;
    @FXML
    private TextField tfpmethod;
    @FXML
    private TableView<UserData> tableView;
    @FXML
    private TableColumn<UserData, String> NameCoulmn;
    @FXML
    private TableColumn<UserData, String> BrandCoulmn;
    @FXML
    private TableColumn<UserData, Double> PriceCoulmn;
    @FXML
    private TableColumn<UserData, Double> DiscountCoulmn;
    @FXML
    private TableColumn<UserData, String> PtCoulmn;
    @FXML
    private TableColumn<UserData, String> PmCoulmn;
    @FXML
    private Button tfDelete;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         NameCoulmn.setCellValueFactory(new PropertyValueFactory<UserData, String>("Name"));
         BrandCoulmn.setCellValueFactory(new PropertyValueFactory<UserData, String>("Brand"));
         PriceCoulmn.setCellValueFactory(new PropertyValueFactory<UserData, Double>("Price"));
         DiscountCoulmn.setCellValueFactory(new PropertyValueFactory<UserData, Double>("Discount"));
         PtCoulmn.setCellValueFactory(new PropertyValueFactory<UserData, String>("Payment Type"));
         PmCoulmn.setCellValueFactory(new PropertyValueFactory<UserData, String>("Payment Method"));
    }    

    @FXML
    private void GenerateButton(ActionEvent event) {
        
     area.setText("\t\t\teCard Inc Billing Dashboard");
     Date obj = new Date();
     String Date = obj.toString();
     
     area.setText(area.getText()+"\n"  +Date+  "\n\n");
     area.setText(area.getText()+"Product Name     :   "+tfname.getText()+"\n\n");
     area.setText(area.getText()+"Product Brand    :   "+tfbrand.getText()+"\n\n");
     area.setText(area.getText()+"Product Price    :   "+tfprice.getText()+"\n\n");
     area.setText(area.getText()+"Product Discount :   "+tfdiscount.getText()+"\n\n");
     area.setText(area.getText()+"Payment Type     :   "+tfpaymenttype.getText()+"\n\n");
     area.setText(area.getText()+"Payment Method   :   "+tfpmethod.getText()+"\n\n");
     area.setText(area.getText()+"\n                                          Signature");
      
        
        
    }

    @FXML
    private void ResetButton(ActionEvent event) {
        area.setText("");
        tfname.setText("");
        tfbrand.setText("");
        tfprice.setText("");
        tfdiscount.setText("");
        tfpaymenttype.setText("");
        tfpmethod.setText("");
    }

    @FXML
    private void PrintButton(ActionEvent event) {

       /* Printer defaultprinter = Printer.getDefaultPrinter();

        if (defaultprinter != null) {
            String name = defaultprinter.getName();
            area.appendText("Default printer name: " + name);
        } else {
            area.appendText("No printers installed.");
        }*/
    }


    @FXML
    private void BackButton(ActionEvent event) {
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
    private void a(MouseEvent event) {
    }

    @FXML
    private void InsertButton(ActionEvent event) {
         UserData customer = new UserData(tfname.getText(),
         tfbrand.getText(),tfpaymenttype.getText(),tfpmethod.getText(),
          Double.parseDouble(tfprice.getText()),
          Double.parseDouble(tfdiscount.getText()));
        ObservableList<UserData> customers = tableView.getItems();
        customers.add(customer);
        tableView.setItems(customers);
        //System.out.println(tfpmethod.getText());
    }

    @FXML
    private void DeleteButton(ActionEvent event) {
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }

    @FXML
    private void UpdateButton(ActionEvent event) {
         
        
    }

    @FXML
    private void SelectIteamsEdit(MouseDragEvent event) {
        
        
    }
    
}
