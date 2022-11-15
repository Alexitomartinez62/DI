package basicoDinamico;

import java.io.IOException;

import application.MenuController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ListController {
	
    @FXML
    private ChoiceBox<String> choice1;
    
    @FXML
    private ChoiceBox<String> destinoIda1;

    @FXML
    private ChoiceBox<String> destinoVuelta1;
    
    
    @FXML
    private Button botonSiguiente;
    
    @FXML
    private DatePicker dia;
    @FXML
    private BorderPane rootlayoout;

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se añaden directamente los items 
    	// Ítems del ChoiceBox
        choice1.getItems().addAll("1 Billete", "2 Billetes", "3 Billetes", "4 Billetes", "5 Personas", 
        		"6 Personas");      
        
     // Ítems del ChoiceBox
        destinoVuelta1.getItems().addAll("Barcelona", "Islas Canarias", "Islas Baleares", "Sevilla");    
        
     // Ítems del ChoiceBox
        destinoIda1.getItems().addAll("Madrid");    
        
        
        
       
                
          
    }
  
    @FXML
     public void abrirFormulario(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesGracias.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootlayoout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
   

}
