package basicoDinamico;


import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ListControllerAyuda {


    @FXML
    private TreeView<String> tree1;
    


    @FXML
    private void initialize() {   
       
                
      
        
        // �tems para el TreeView
        // �tem ra�z
        TreeItem<String> rootItem = new TreeItem<String>("ACERCA DE NUESTRA EMPRESA", new ImageView(new Image("imagenesView/inte.png")));

        // �tem de primer nivel
        TreeItem<String> webItem = new TreeItem<String>("PANTALLA POR PANTALLA");
        webItem.getChildren().add(new TreeItem<String>("Esta es una p�gina de viajes sencilla para la gente que quiere salir f�cil,"
        		+ "\n por Espa�a y en cualquier m�todo de transoprte, "
        		+ "\n navegas por cualquier pesta�a para comprar el billete deseado en el transporte deseado"
        		+ "\n y del resto ya nos encargamos nosotros!!"));
        rootItem.getChildren().add(webItem);
        
        // Otro �tem de primer nivel
        TreeItem<String> javaItem = new TreeItem<String>("FINALIDAD DE LA APLICACI�N");
        javaItem.getChildren().add(new TreeItem<String>("Podr�s ver la lista de precios, podr�s seleccionar el viaje que desees,"
        		+ "\n en el medio de transporte que quieras y comprarlo, "
        		+ "\n todo f�cil y sencillo."
        		+ "\n Tenemos otra pesta�a adiccional que sirve para controlar los nuevos viajeros!"
        		+ "\n Permite a�adir, modificar y eliminar registros de nuevos viajeros "));
  
        rootItem.getChildren().add(javaItem);
        
        // Para que sea editable necesitamos especificar un CellFactory con el tipo que corresponda
        tree1.setCellFactory(TextFieldTreeCell.forTreeView());
        
        // Expadimos por defecto el �tem ra�z
        rootItem.setExpanded(true); 
        tree1.setRoot(rootItem);               
    }
    
}