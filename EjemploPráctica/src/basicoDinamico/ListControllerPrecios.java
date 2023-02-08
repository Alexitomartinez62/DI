package basicoDinamico;

import java.util.jar.Attributes.Name;

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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeCell;

public class ListControllerPrecios {
    
    @FXML
    private TableView<Person> table1;
    
    
    @FXML
    private TableColumn<Person, String> firstNameCol;

    @FXML
    private TableColumn<Person, String> lastNameCol;

    @FXML
    private TableColumn<Person, String> emailCol;
    
    @FXML
    private TableColumn<Person, Integer> ageColumn;
    
    
     // Lista auxiliar para TableView
    private ObservableList<Person> data = FXCollections.observableArrayList(
    	    new Person("Tren", "Toledo o Cuidad Real", "13$", 1231),
    	    new Person("Tren", "Burgos o Avila", "15$", 970),
    	    new Person("Coche", "Toledo o Cuidad Real", "16$", 189),
    	    new Person("Coche", "Burgos o Avila", "20$", 247),
    	    new Person("Autobus", "Toledo o Cuidad Real", "10$", 222),
    	    new Person("Autobus", "Burgos o Avila", "13$", 389),
    	    new Person("Avion", "Barcelona o Sevilla", "40$", 520),
    	    new Person("Avion", "Islas Canarias o Baleares", "55$", 633)
    	   
    	    
    	);

    @FXML
    private void initialize() {   
        
       
                
        
        // Asociamos cada columna del TableView a una propiedad de la clase Person 
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Person,String>("lastName"));
        emailCol.setCellValueFactory(new PropertyValueFactory<Person,String>("email"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person,Integer>("age"));
        // Se rellena la tabla con objetos de la clase Person
        table1.setItems(data);     
        
        
       
          
    
    
    }
}