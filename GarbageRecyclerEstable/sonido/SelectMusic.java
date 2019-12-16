/*GARBAGE RECYCLER 1.0
* APLICACION DE ESCRITORIO EN JAVA DONDE EL USUARIO INTERACTUA CON EL ENTORNO SELECCIONANDO IMAGENES QUE PERTENEZCAN
A UN TIPO DE BASURA
* AUTORES: CASTAÑON PUGA MANUEL, RAYGOZA DE LA PAZ BRANDON, LIZARRAGA RODRIGUEZ JESUS ALBERTO, MALDONADO MIGUEL GILBERTO
* CORREO ELECTRONICO: {puga, raygoza.brandon, jlizarraga73,gilberto.maldonado.miguel}@uabc.edu.mx
* UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA
http://www.uabc.mx
*/
package sonido;

import javafx.scene.media.AudioClip;

class SelectMusic {
	public static AudioClip music;
	int seleccion = 0;		
	public AudioClip  seleccionM() {
		seleccion = (int) Math.floor(Math.random() * 1);
		if (seleccion == 0)
			try {					
		//music = new AudioClip(this.getClass().getResource("Hymn - Scott Buckley [Vlog No Copyright Music].wav").toString());				
			}
		catch (Exception tipoerror) 
		{
			System.out.println("" + tipoerror);
		}
		return music;							
	}
}