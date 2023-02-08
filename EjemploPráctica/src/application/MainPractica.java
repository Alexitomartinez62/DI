	package application;
		
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Scene;
	import javafx.scene.layout.BorderPane;
	import javafx.stage.Stage;
	
	/**
	* Clase Main donde se inicia la aplicación
	*
	* @author Alejandro Martinez DAM
	* @version 1.0
	*
	*/
	public class MainPractica extends Application {
		private BorderPane rootLayout;	
		
		@Override
		public void start(Stage primaryStage) {
			try {
				// Carga el diseno del archivo FXML en la variable rootLayout
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainPractica.class.getResource("Menu.fxml"));
				rootLayout = (BorderPane) loader.load();
				
				// Pasamos al controlador de menu el objeto con el BorderPane principal
				MenuController menuController = loader.getController();
				menuController.setRootLayout(rootLayout);
	
				// Mostramos la escena del BorderPane de la variable rootLayot
				Scene scene = new Scene(rootLayout);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Proyecto Alejandro");
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		public static void main(String[] args) {
			launch(args);
		} 
	
		
	}
