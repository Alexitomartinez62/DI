package basicoDinamico;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTreeCell;

public class ListController {

    @FXML
    private ChoiceBox<String> choice1;
    
    @FXML
    private ChoiceBox<String> destinoIda1;

    @FXML
    private ChoiceBox<String> destinoVuelta1;
    
    
  

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se a�aden directamente los items 
    	// �tems del ChoiceBox
        choice1.getItems().addAll("1 Billete", "2 Billetes", "3 Billetes", "4 Billetes", "5 Personas", 
        		"6 Personas");      
        
     // �tems del ChoiceBox
        destinoVuelta1.getItems().addAll("Madrid", "Barcelona", "Islas Canarias", "Islas Baleares", "Sevilla");    
        
     // �tems del ChoiceBox
        destinoIda1.getItems().addAll("Madrid", "Barcelona", "Islas Canarias", "Islas Baleares", "Sevilla" );    
        
       
                
          
    }
    
}
