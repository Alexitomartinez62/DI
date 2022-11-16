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
	        TreeItem<String> branchItem2 = new TreeItem<>("AUTOBÚS, COCHE Y TREN");
	        TreeItem<String> branchItem3 = new TreeItem<>("AVIÓN");
	        TreeItem<String> branchItem4 = new TreeItem<>("NUEVOS VIAJEROS");
		
		TreeItem<String> leafItem1 = new TreeItem<>("En esta pestaña podremos ver los precios de los viajes"
        		+ "\n de cualquier método de transporte y a cualquiera de los destinos a elegir");
        TreeItem<String> leafItem2 = new TreeItem<>("En estas pestañas podemos elegir el método de transporte que deseemos"
        		+ "\n con sus posibles destinos, también puedes elegir día y números de billetes que desee sacar."
        		+ "\n A medida que vaya avanzando la compra habrá disponible una barra de progreso que se irá rellenadndo a medida que vaya realizando su compra.");
        TreeItem<String> leafItem3 = new TreeItem<>("En este caso, tenemos únicamente el método de transporte de avión, que aunque también es económico,"
        		+ "\n no tanto como los anteriores, igual que en las otras puedes seleccionar día, a donde quieres viajar y cuántos billetes desea sacar."
        		+ "\n En esta pestaña también aparecerá la barra de progreso a medida que avance la compra");
        TreeItem<String> leafItem4 = new TreeItem<>("En la pestaña de nuevos viajeros puedes tanto añadir, como modificar, como eliminar nuevos usuarios viajeros");
		
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
