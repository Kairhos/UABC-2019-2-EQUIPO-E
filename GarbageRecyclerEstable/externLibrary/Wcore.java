/*GARBAGE RECYCLER 1.0
* APLICACION DE ESCRITORIO EN JAVA DONDE EL USUARIO INTERACTUA CON EL ENTORNO SELECCIONANDO IMAGENES QUE PERTENEZCAN
A UN TIPO DE BASURA
* AUTORES: CASTAÑON PUGA MANUEL, RAYGOZA DE LA PAZ BRANDON, LIZARRAGA RODRIGUEZ JESUS ALBERTO, MALDONADO MIGUEL GILBERTO
* CORREO ELECTRONICO: {puga, raygoza.brandon, jlizarraga73,gilberto.maldonado.miguel}@uabc.edu.mx
* UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA
http://www.uabc.mx
*/

package externLibrary;

import java.util.*;
import java.io.*; 
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Wcore
{

	public static void sonido(String direccion,int temp ,int eleccion)//sonido 
	{
	try {
		if (eleccion ==1) {
		//String soundName = "yourSound.wav";    
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(direccion).getAbsoluteFile());
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		Thread.sleep(temp);
		}
		if (eleccion ==0) {
			Clip sonido = AudioSystem.getClip();
			File a = new File(direccion);
			sonido.open(AudioSystem.getAudioInputStream(a));;
			sonido.start();

			Thread.sleep(temp);
			sonido.close();}
		}
		catch (Exception tipoerror) 
		{
			System.out.println("" + tipoerror);
		}
	}
	
	public static int rng(int dis)
	{
		Random rand = new Random();
		int valor = rand.nextInt(dis);
		
		return valor;
	}
	public static int dec(int cont) {
		cont--;
		return cont;

	}
public static String leer()//String variable = Wcore.leer();
	{
		String lectura = new String();
		InputStreamReader lectroTeclado = new InputStreamReader (System.in);
		BufferedReader buffer =new BufferedReader(lectroTeclado);
		try 
		{
			lectura = buffer.readLine();
		}catch (IOException IOerror){
			System.out.println("Error al leer el teclado");
			System.out.println(IOerror);
		}
		return lectura;
	}
	
public  static void limpiar(int dis)
		{
			for(int i=1;i<dis;i++)
				System.out.println("\n");
		}
	
	
	
	public static float conviertecadenaF(String cadena)
{
	return Float.parseFloat(cadena);
}

	public static int conviertecadenaI(String cadena)
{
	return Integer.parseInt(cadena);
}
public static String convierteInt(int numero) {
	
	return String.valueOf(numero);
	
	
}	
public static int sum(int a) {
	 a++;
	return a;
}
public static Boolean inversor(Boolean x) {
	x=!x;
	return x;
}
}