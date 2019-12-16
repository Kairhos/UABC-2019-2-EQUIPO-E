/*GARBAGE RECYCLER 1.0
* APLICACION DE ESCRITORIO EN JAVA DONDE EL USUARIO INTERACTUA CON EL ENTORNO SELECCIONANDO IMAGENES QUE PERTENEZCAN
A UN TIPO DE BASURA
* AUTORES: CASTAÑON PUGA MANUEL, RAYGOZA DE LA PAZ BRANDON, LIZARRAGA RODRIGUEZ JESUS ALBERTO, MALDONADO MIGUEL GILBERTO
* CORREO ELECTRONICO: {puga, raygoza.brandon, jlizarraga73,gilberto.maldonado.miguel}@uabc.edu.mx
* UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA
http://www.uabc.mx
*/
package mem;


import java.io.*;

public class ReadFile {
	
	public String ReadAFile()
	{
		File file;
		FileReader fr;
		BufferedReader br;
		
		String cadena= "";

		try {
			
			file = new File ("archivo.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String leyendo;
			
			while((leyendo=br.readLine())!=null)
			{
				cadena=(cadena+leyendo);
				cadena=(cadena+"\n");
			}
			
			
			br.close();
			fr.close();
			
			
		}catch (Exception e)
		{
			System.out.print("error");
		}
		
		return cadena;
		
	}

}
