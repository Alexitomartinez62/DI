package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class MenuController {
	
	// Pantalla principal en la que se añade o quita contenido
	private BorderPane rootLayout;
  
    @FXML
    private void initialize() {
        
    }
    
    @FXML
    private Button botonSiguiente;
    
    
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    void abrirFormulario2(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamico2.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario3(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamico3.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario4(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamico4.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario5(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesPrecios.fxml"));
			GridPane listadoControles = (GridPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    void abrirAyuda(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlAyuda.fxml"));
			GridPane listadoControles = (GridPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario6(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/Sample.fxml"));
			AnchorPane listadoControles = (AnchorPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
   

    

    
    
    @FXML
    private void cerrarListado(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	rootLayout.setCenter(null);	
    }

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}	
    
}
