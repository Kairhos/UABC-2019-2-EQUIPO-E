/*GARBAGE RECYCLER 1.0
* APLICACION DE ESCRITORIO EN JAVA DONDE EL USUARIO INTERACTUA CON EL ENTORNO SELECCIONANDO IMAGENES QUE PERTENEZCAN
A UN TIPO DE BASURA
* AUTORES: CASTAÑON PUGA MANUEL, RAYGOZA DE LA PAZ BRANDON, LIZARRAGA RODRIGUEZ JESUS ALBERTO, MALDONADO MIGUEL GILBERTO
* CORREO ELECTRONICO: {puga, raygoza.brandon, jlizarraga73,gilberto.maldonado.miguel}@uabc.edu.mx
* UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA
http://www.uabc.mx
*/
package rcs;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import sonido.Sonidos;


public class MenuItem extends StackPane {
	//ImageView img;
	//private String baseImg;
	
	
	public MenuItem(String name, int ancho, int alto) {
		LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop(0, Color.GREEN),
				new Stop(0.1, Color.BLACK), new Stop(0.9, Color.BLACK), new Stop(1, Color.GREEN));

		Rectangle bg = new Rectangle(ancho, alto);
		bg.setOpacity(0.4);

		Text text = new Text(name);
		text.setFill(Color.WHITE);
		text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 22));

		setAlignment(Pos.CENTER);
		getChildren().addAll(bg, text);

		
		setOnMouseEntered(event -> {
			bg.setFill(gradient);
			Sonidos.PreSonidoBoton();
			text.setFill(Color.WHITE);
		});

		setOnMouseExited(event -> {
			bg.setFill(Color.BLACK);
			text.setFill(Color.WHITE);
		});

		setOnMousePressed(event -> {
			bg.setFill(Color.GREEN);
			Sonidos.sonidoBoton();
		});

		setOnMouseReleased(event -> {
			bg.setFill(gradient);
		});
		
	}
	
	public MenuItem(ImageView icon) {
		LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop(0, Color.GREEN),
				new Stop(0.1, Color.BLACK), new Stop(0.9, Color.BLACK), new Stop(1, Color.GREEN));

		Rectangle bg = new Rectangle(110, 110);
		bg.setOpacity(0.4);
		
		//img = icon;
		
		setAlignment(Pos.CENTER);
		getChildren().addAll(bg, icon);

		setOnMouseEntered(event -> {
			bg.setFill(gradient);
			Sonidos.PreSonidoBoton();
		});

		setOnMouseExited(event -> {
			bg.setFill(Color.BLACK);
		});

		setOnMousePressed(event -> {
			bg.setFill(Color.GREEN);
			Sonidos.sonidoBoton();
		});

		setOnMouseReleased(event -> {
			bg.setFill(gradient);
		});
	}

	public MenuItem() {
		// TODO Auto-generated constructor stub
	}
	
	
}
