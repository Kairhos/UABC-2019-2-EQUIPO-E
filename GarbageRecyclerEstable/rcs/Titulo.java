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
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Titulo  extends StackPane {
	
	
	Titulo(String name) {
		Rectangle bg = new Rectangle(300, 60);
		bg.setStroke(Color.WHITE);
		bg.setStrokeWidth(2);
		bg.setFill(null);

		Text text = new Text(name);
		text.setFill(Color.WHITE);
		text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 50));

		setAlignment(Pos.CENTER);
		getChildren().addAll(bg, text);
	}
	
	public Titulo(String name,int tam) {
		Rectangle bg = new Rectangle(tam, 50);
		bg.setStroke(Color.WHITE);
		bg.setStrokeWidth(1);
		bg.setFill(null);

		Text text = new Text(name);
		text.setFill(Color.WHITE);
		text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 50));

		setAlignment(Pos.CENTER);
		getChildren().addAll(bg, text);
	}
}