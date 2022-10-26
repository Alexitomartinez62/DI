package basicoDinamico;


import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import javafx.scene.control.cell.TextFieldTreeCell;

public class ListControllerAyuda {


    @FXML
    private TreeView<String> tree1;
    


    @FXML
    private void initialize() {   
       
                
      
        
        // Ítems para el TreeView
        // Ítem raíz
        TreeItem<String> rootItem = new TreeItem<String>("Acerca de nuestra empresa");

        // Ítem de primer nivel
        TreeItem<String> webItem = new TreeItem<String>("Pantalla por pantalla");
        webItem.getChildren().add(new TreeItem<String>("Esta es una página de vuelo sencilla para la gente que quiere volar fácil,"
        		+ "\n por España y en cualquier método de transoprte, "
        		+ "\n navegas por cualquier pestaña para comprar el billete deseado en el transporte deseado"
        		+ "\n y del resto ya nos encargamos nosotros!!"));
        rootItem.getChildren().add(webItem);
        
        // Otro ítem de primer nivel
        TreeItem<String> javaItem = new TreeItem<String>("Finalidad de la aplicación");
        javaItem.getChildren().add(new TreeItem<String>("Podrás ver la lista de precios, podrás seleccionar el viaje que desees,"
        		+ "\n en el medio de transporte que quieras y comprarlo, "
        		+ "\n todo fácil y sencillo."
        		+ "\n También podrás editar una tabla si llevas tu mascota encima en tu viaje "));
  
        rootItem.getChildren().add(javaItem);
        
        // Para que sea editable necesitamos especificar un CellFactory con el tipo que corresponda
        tree1.setCellFactory(TextFieldTreeCell.forTreeView());
        
        // Expadimos por defecto el ítem raíz
        rootItem.setExpanded(true); 
        tree1.setRoot(rootItem);               
    }
    
}