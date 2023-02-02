package basicoDinamico;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;

public class Graficos3 {
	
    @FXML
    private StackedAreaChart<Number, Number> stackedAreaChart;

    @FXML
    private NumberAxis x;

    @FXML
    private NumberAxis y;
	   
 
    @FXML
    private void initialize() {
    	XYChart.Series<Number, Number> series = new XYChart.Series<>();
    	
    	
    	series.setName("Personas x Años");
    	series.getData().add(new XYChart.Data<>(2017, 15000));
    	series.getData().add(new XYChart.Data<>(2018, 23000));
    	series.getData().add(new XYChart.Data<>(2019, 17000));
    	series.getData().add(new XYChart.Data<>(2020, 19000));
    	series.getData().add(new XYChart.Data<>(2021, 65000));
    	series.getData().add(new XYChart.Data<>(2022, 80000));

  
    	stackedAreaChart.getData().add(series);	    	
    }
   
}

