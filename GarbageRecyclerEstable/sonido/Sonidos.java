/*GARBAGE RECYCLER 1.0
* APLICACION DE ESCRITORIO EN JAVA DONDE EL USUARIO INTERACTUA CON EL ENTORNO SELECCIONANDO IMAGENES QUE PERTENEZCAN
A UN TIPO DE BASURA
* AUTORES: CASTAÑON PUGA MANUEL, RAYGOZA DE LA PAZ BRANDON, LIZARRAGA RODRIGUEZ JESUS ALBERTO, MALDONADO MIGUEL GILBERTO
* CORREO ELECTRONICO: {puga, raygoza.brandon, jlizarraga73,gilberto.maldonado.miguel}@uabc.edu.mx
* UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA
http://www.uabc.mx
*/
package sonido;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sonidos {

	
	public static void sonido(String direccion,int temp )//sonido 
	{
	try {
		
		//String soundName = "yourSound.wav";    
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(direccion).getAbsoluteFile());
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
	   
		Thread.sleep(temp);
		}
		catch (Exception tipoerror) 
		{
			System.out.println("" + tipoerror);
		}
	}

	
	public static void sonidoBoton() {
	sonido("recursos/Sonido/boton.wav",1);
	}
	
	public static void PreSonidoBoton() {
	sonido("recursos/Sonido/preboton.wav",1);
	}
	public static void SonidoFondo() {
		sonido("recursos/Sonido/Dirty Deeds Done Dirt Cheap.wav", 10);
		}
}
