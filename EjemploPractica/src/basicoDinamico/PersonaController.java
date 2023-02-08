package basicoDinamico;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import basicoDinamico.Persona;
import javafx.scene.input.KeyEvent;

public class PersonaController implements Initializable {

    @FXML
    private Button btnAgregar;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtEdad;
    @FXML
    private TableView<Persona> tblPersonas;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colApellidos;
    @FXML
    private TableColumn colEdad;

    private ObservableList<Persona> personas;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnEliminar;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        personas = FXCollections.observableArrayList();

        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        
        txtNombre.setOnKeyPressed((event) -> mostrarTecla(event));
        txtNombre.setOnKeyReleased((event) -> mostrarTecla(event));
        txtNombre.setOnKeyTyped((event) -> mostrarTecla(event));
        
        txtApellidos.setOnKeyPressed((event) -> mostrarTecla(event));
        txtApellidos.setOnKeyReleased((event) -> mostrarTecla(event));
        txtApellidos.setOnKeyTyped((event) -> mostrarTecla(event));
        
        txtEdad.setOnKeyPressed((event) -> mostrarTecla(event));
        txtEdad.setOnKeyReleased((event) -> mostrarTecla(event));
        txtEdad.setOnKeyTyped((event) -> mostrarTecla(event));
		
		
    
    
    
    
    }
    
    
    
    private void mostrarTecla(KeyEvent event) {
		System.out.println("Key code " + event.getEventType().getName() + ": " + event.getCode() + ","
				+ " Key text " + event.getEventType().getName() + ": " + event.getText() + ","
				+ " Key character " + event.getEventType().getName() + ": " +  (int) event.getCharacter().charAt(0));
	}
    
    @FXML
    private void agregarPersona(ActionEvent event) {

        try {

            // Obtengo los datos del formulario
            String nombre = this.txtNombre.getText();
            String apellidos = this.txtApellidos.getText();
            int edad = Integer.parseInt(this.txtEdad.getText());

            // Creo una persona
            Persona p = new Persona(nombre, apellidos, edad);

            // Compruebo si la persona esta en la lista
            if (!this.personas.contains(p)) {
                // Lo anado a la lista
                this.personas.add(p);
                // Seteo los items
                this.tblPersonas.setItems(personas);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Info");
                alert.setContentText("Persona anadida correctamente!");
                alert.showAndWait();
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Esta persona ya existe");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto, introduzca de nuevo");
            alert.showAndWait();
        }

    }

    @FXML
    private void seleccionar(MouseEvent event) {

        // Obtengo la persona seleccionada
        Persona p = this.tblPersonas.getSelectionModel().getSelectedItem();

        // Sino es nula seteo los campos
        if (p != null) {
            this.txtNombre.setText(p.getNombre());
            this.txtApellidos.setText(p.getApellidos());
            this.txtEdad.setText(p.getEdad() + "");
        }

    }

    @FXML
    private void modificar(ActionEvent event) {

        // Obtengo la persona seleccionada
        Persona p = this.tblPersonas.getSelectionModel().getSelectedItem();

        // Si la persona es nula, lanzo error
        if (p == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar una persona para poder modificar");
            alert.showAndWait();
        } else {

            try {
                // Obtengo los datos del formulario
                String nombre = this.txtNombre.getText();
                String apellidos = this.txtApellidos.getText();
                int edad = Integer.parseInt(this.txtEdad.getText());

                // Creo una persona
                Persona aux = new Persona(nombre, apellidos, edad);

                // Compruebo si la persona esta en el lista
                if (!this.personas.contains(aux)) {

                    // Modifico el objeto
                    p.setNombre(aux.getNombre());
                    p.setApellidos(aux.getApellidos());
                    p.setEdad(aux.getEdad());

                    // Refresco la tabla
                    this.tblPersonas.refresh();

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Info");
                    alert.setContentText("Persona modificada correctamente");
                    alert.showAndWait();

                } else {

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Esta persona ya existe");
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Formato incorrecto, introduzca de nuevo");
                alert.showAndWait();
            }

        }

    }

    @FXML
    private void eliminar(ActionEvent event) {

        // Obtengo la persona seleccionada
        Persona p = this.tblPersonas.getSelectionModel().getSelectedItem();

        // Si la persona es nula, lanzo error
        if (p == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar una persona para poder eliminar");
            alert.showAndWait();
        } else {

            // La elimino de la lista
            this.personas.remove(p);
            // Refresco la lista
            this.tblPersonas.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Persona eliminada correctamente");
            alert.showAndWait();

        }
        
        
       
    
        
        
        

    }

}