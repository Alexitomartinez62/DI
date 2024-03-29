package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuController {
	
	// Pantalla principal en la que se anade o quita contenido
	private BorderPane rootLayout;
  
    @FXML
    private void initialize() {
        
    }
    
  
    @FXML
    private Button botonSiguiente;
    
    
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamicos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    void abrirFormulario2(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamico2.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario3(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamico3.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario4(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesDinamico4.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario5(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesPrecios.fxml"));
			GridPane listadoControles = (GridPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario7(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesPersona.fxml"));
			AnchorPane listadoControles = (AnchorPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void abrirFormulario8(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/Tree.fxml"));
			AnchorPane listadoControles = (AnchorPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    
    @FXML
    void abrirFormulariografica(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesGraficos.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    void abrirFormulariografica2(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesGraficos2.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    @FXML
    void abrirFormulariografica3(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Dinamicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/basicoDinamico/ControlesGraficos3.fxml"));
			BorderPane listadoControles = (BorderPane) loader.load();

			// Se situa en el centro del diseno principal
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
