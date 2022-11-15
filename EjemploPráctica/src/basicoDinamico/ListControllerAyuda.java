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
public class ListControllerAyuda {


    @FXML
    private TreeView<String> tree1;
    


    @FXML
    private void initialize() {   
       
                
      
        
        // Ítems para el TreeView
        // Ítem raíz
        TreeItem<String> rootItem = new TreeItem<>("ACERCA DE NUESTRA EMPRESA", new ImageView(new Image("imagenesView/inte.png")));
        TreeItem<String> branchItem1 = new TreeItem<>("Precios");
        TreeItem<String> branchItem2 = new TreeItem<>("Autobús, Coche y Tren");
        TreeItem<String> branchItem3 = new TreeItem<>("Avión");
        TreeItem<String> branchItem4 = new TreeItem<>("Nuevos Viajeros");
        
        
        TreeItem<String> leafItem1 = new TreeItem<>("Hola");
        TreeItem<String> leafItem2 = new TreeItem<>("Hola");
        TreeItem<String> leafItem3 = new TreeItem<>("Hola");
        TreeItem<String> leafItem4 = new TreeItem<>("Hola");

        branchItem1.getChildren().addAll(leafItem1);
        branchItem2.getChildren().addAll(leafItem2);
        branchItem3.getChildren().addAll(leafItem3);
        branchItem4.getChildren().addAll(leafItem4);
        
        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3, branchItem4);
        


        tree1.setRoot(rootItem);    

    }
    
    public void selectItem() {
    	TreeItem<String> item = tree1.getSelectionModel().getSelectedItem();
    	
    	if(item!= null) {
    	System.out.println(item.getValue());
   
    	}
    
    }
   }