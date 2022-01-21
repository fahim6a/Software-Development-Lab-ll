/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fahim
 */
public class PieChartController implements Initializable {

    @FXML
    private PieChart piechart;
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
    private void pieButton(ActionEvent event) {
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList(
                new PieChart.Data("Camera", 20),
                new PieChart.Data("Tv", 20),
                new PieChart.Data("Pc Gear", 15),
                new PieChart.Data("Foods", 35),
                new PieChart.Data("Subscription", 25),
                new PieChart.Data("Games", 30)
        );
        piechart.setData(list);
        for(final PieChart.Data data: piechart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    label.setText(String.valueOf(data.getPieValue()));
                }
                
            });
        }
    }

    @FXML
    private void backbutton(ActionEvent event) {
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
