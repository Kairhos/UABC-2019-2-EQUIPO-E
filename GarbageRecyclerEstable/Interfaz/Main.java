/*GARBAGE RECYCLER 1.0
* APLICACION DE ESCRITORIO EN JAVA DONDE EL USUARIO INTERACTUA CON EL ENTORNO SELECCIONANDO IMAGENES QUE PERTENEZCAN
A UN TIPO DE BASURA
* AUTORES: CASTAÑON PUGA MANUEL, RAYGOZA DE LA PAZ BRANDON, LIZARRAGA RODRIGUEZ JESUS ALBERTO, MALDONADO MIGUEL GILBERTO
* CORREO ELECTRONICO: {puga, raygoza.brandon, jlizarraga73,gilberto.maldonado.miguel}@uabc.edu.mx
* UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA
http://www.uabc.mx
*/
package Interfaz;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
public void start(Stage primaryStage) {

	  Interfaz menu = new Interfaz();
      menu.iniciaInterfaz(primaryStage);	
	}

	public static void main(String[] args) {
		launch(args);
	}
	

	}
	

