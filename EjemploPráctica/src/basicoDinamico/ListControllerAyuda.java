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
       
                
      
        
        // �tems para el TreeView
        // �tem ra�z
        TreeItem<String> rootItem = new TreeItem<String>("Acerca de nuestra empresa");

        // �tem de primer nivel
        TreeItem<String> webItem = new TreeItem<String>("Pantalla por pantalla");
        webItem.getChildren().add(new TreeItem<String>("Esta es una p�gina de vuelo sencilla para la gente que quiere volar f�cil,"
        		+ "\n por Espa�a y en cualquier m�todo de transoprte, "
        		+ "\n navegas por cualquier pesta�a para comprar el billete deseado en el transporte deseado"
        		+ "\n y del resto ya nos encargamos nosotros!!"));
        rootItem.getChildren().add(webItem);
        
        // Otro �tem de primer nivel
        TreeItem<String> javaItem = new TreeItem<String>("Java Tutorials");
        javaItem.getChildren().add(new TreeItem<String>("Java Language"));
        javaItem.getChildren().add(new TreeItem<String>("Java Collections"));
        javaItem.getChildren().add(new TreeItem<String>("Java Concurrency"));
        rootItem.getChildren().add(javaItem);
        
        // Para que sea editable necesitamos especificar un CellFactory con el tipo que corresponda
        tree1.setCellFactory(TextFieldTreeCell.forTreeView());
        
        // Expadimos por defecto el �tem ra�z
        rootItem.setExpanded(true); 
        tree1.setRoot(rootItem);               
    }
    
}