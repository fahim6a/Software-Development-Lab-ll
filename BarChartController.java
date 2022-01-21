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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class BarChartController implements Initializable {

    @FXML
    private NumberAxis navisit;
    @FXML
    private CategoryAxis caProduct;
    @FXML
    private BarChart<String, Number> barchart;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadButton(ActionEvent event) {
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        series.setName("Service Usage ");
        series.getData().add(new XYChart.Data<>("MSI Curve Monitor",50));
        series.getData().add(new XYChart.Data<>("Hassleblad Camera",30));
        series.getData().add(new XYChart.Data<>("Valorent",250));
        series.getData().add(new XYChart.Data<>("Gensin Impact",150));
        series.getData().add(new XYChart.Data<>("Cheiken Wings",500));
        series.getData().add(new XYChart.Data<>("Netfilx",300));
        series.getData().add(new XYChart.Data<>("Adobe Package",70));
        
        XYChart.Series<String,Number> series2 = new XYChart.Series<>();
        series2.setName("Visited Peoples");
        series2.getData().add(new XYChart.Data<>("MSI Curve Monitor",350));
        series2.getData().add(new XYChart.Data<>("Hassleblad Camera",100));
        series2.getData().add(new XYChart.Data<>("Valorent",450));
        series2.getData().add(new XYChart.Data<>("Gensin Impact",350));
        series2.getData().add(new XYChart.Data<>("Cheiken Wings",500));
        series2.getData().add(new XYChart.Data<>("Netfilx",350));
        series2.getData().add(new XYChart.Data<>("Adobe Package",110));
        
        barchart.getData().addAll(series,series2);
        
    }

    @FXML
    private void BackButton(ActionEvent event) {
        try {
            Parent question = FXMLLoader.load(getClass().getResource("Businessmonitor.fxml"));
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
