package basicoDinamico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class TreeController implements Initializable{
	
	@FXML
	private TreeView<String> treeView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TreeItem<String> rootItem = new TreeItem<>("ACERCA DE NUESTRA EMPRESA", new ImageView(new Image("imagenesView/inte.png")));
		//TreeItem<String> rootItem = new TreeItem<>("Files", new ImageView(new Image("Folder_Icon.png")));
		
	        TreeItem<String> branchItem1 = new TreeItem<>("PRECIOS");
	        TreeItem<String> branchItem2 = new TreeItem<>("AUTOB�S, COCHE Y TREN");
	        TreeItem<String> branchItem3 = new TreeItem<>("AVI�N");
	        TreeItem<String> branchItem4 = new TreeItem<>("NUEVOS VIAJEROS");
		
		TreeItem<String> leafItem1 = new TreeItem<>("En esta pesta�a podremos ver los precios de los viajes"
        		+ "\n de cualquier m�todo de transporte y a cualquiera de los destinos a elegir");
        TreeItem<String> leafItem2 = new TreeItem<>("En estas pesta�as podemos elegir el m�todo de transporte que deseemos"
        		+ "\n con sus posibles destinos, tambi�n puedes elegir d�a y n�meros de billetes que desee sacar."
        		+ "\n A medida que vaya avanzando la compra habr� disponible una barra de progreso que se ir� rellenadndo a medida que vaya realizando su compra.");
        TreeItem<String> leafItem3 = new TreeItem<>("En este caso, tenemos �nicamente el m�todo de transporte de avi�n, que aunque tambi�n es econ�mico,"
        		+ "\n no tanto como los anteriores, igual que en las otras puedes seleccionar d�a, a donde quieres viajar y cu�ntos billetes desea sacar."
        		+ "\n En esta pesta�a tambi�n aparecer� la barra de progreso a medida que avance la compra");
        TreeItem<String> leafItem4 = new TreeItem<>("En la pesta�a de nuevos viajeros puedes tanto a�adir, como modificar, como eliminar nuevos usuarios viajeros");
		
        branchItem1.getChildren().addAll(leafItem1);
        branchItem2.getChildren().addAll(leafItem2);
        branchItem3.getChildren().addAll(leafItem3);
        branchItem4.getChildren().addAll(leafItem4);
		
		rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3, branchItem4);
		
		//treeView.setShowRoot(false);
		treeView.setRoot(rootItem);
	}
	
	public void selectItem() {
	
		TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
		
		if(item != null) {
			System.out.println(item.getValue());
		}
	}

	public void setRootLayout(AnchorPane rootLayout) {
		// TODO Auto-generated method stub
		
	}
}
