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
    	    new Person("Jacob", "Smith", "jacob.smith@example.com", 30),
    	    new Person("Isabella", "Johnson", "isabella.johnson@example.com", 40),
    	    new Person("Ethan", "Williams", "ethan.williams@example.com", 50),
    	    new Person("Emma", "Jones", "emma.jones@example.com", 61),
    	    new Person("Michael", "Brown", "michael.brown@example.com", 34)
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
