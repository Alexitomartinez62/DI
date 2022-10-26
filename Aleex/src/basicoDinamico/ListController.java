package basicoDinamico;

import java.io.IOException;

import application.MenuController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class ListController {

    @FXML
    private ChoiceBox<String> choice1;
    
    @FXML
    private ChoiceBox<String> destinoIda1;

    @FXML
    private ChoiceBox<String> destinoVuelta1;
    
    @FXML
    private CheckBox botonMascotas;
    
    @FXML
    private Button botonSiguiente;
    
  @FXML
  	private BorderPane rootLayout;

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se a�aden directamente los items 
    	// �tems del ChoiceBox
        choice1.getItems().addAll("1 Billete", "2 Billetes", "3 Billetes", "4 Billetes", "5 Personas", 
        		"6 Personas");      
        
     // �tems del ChoiceBox
        destinoVuelta1.getItems().addAll("Barcelona", "Islas Canarias", "Islas Baleares", "Sevilla");    
        
     // �tems del ChoiceBox
        destinoIda1.getItems().addAll("Madrid");    
        
       
                
          
    }
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesGracias.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
   

}