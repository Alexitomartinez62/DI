package basicoDinamico;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Graficos2 {
	
	  @FXML
	    private BarChart<?, ?> barChart;

	    @FXML
	    private CategoryAxis x;

	    @FXML
	    private NumberAxis y;
	    
	    @FXML
	    private void initialize() {
	    	XYChart.Series set1 = new XYChart.Series<>();
	    	
	    	
	    	set1.setName("Meses");
	    	set1.getData().add(new XYChart.Data("Enero", 10000));
	    	set1.getData().add(new XYChart.Data("Febrero", 5000));
	    	set1.getData().add(new XYChart.Data("Marzo", 23000));
	    	set1.getData().add(new XYChart.Data("Abril", 12000));
	    	set1.getData().add(new XYChart.Data("Mayo", 30000));
	    	set1.getData().add(new XYChart.Data("Junio", 75000));
	    	set1.getData().add(new XYChart.Data("Julio", 60000));
	    	set1.getData().add(new XYChart.Data("Agosto", 65000));
	    	set1.getData().add(new XYChart.Data("Septiembre", 10000));
	    	set1.getData().add(new XYChart.Data("Octubre", 15000));
	    	set1.getData().add(new XYChart.Data("Noviembre", 24000));
	    	set1.getData().add(new XYChart.Data("Diciembre", 40000));
	  
	    	barChart.getData().addAll(set1);	    	
	    }
	   
}

