package basicoDinamico;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;


public class Graficos {
	
    @FXML
    private PieChart pieChart;
    
 
    
    @FXML
    private void initialize() {
    	ObservableList<PieChart.Data> pieChartData
    	= FXCollections.observableArrayList(
    			new PieChart.Data("Autobús",26),
    			new PieChart.Data("Avión",10),
    			new PieChart.Data("Coche",14),
    			new PieChart.Data("Tren",50));
    	pieChart.setData(pieChartData);
    	pieChart.setStartAngle(90);
    	

    	
        
     }
    
    
}


