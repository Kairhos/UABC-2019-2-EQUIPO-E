/*GARBAGE RECYCLER 1.0
* APLICACION DE ESCRITORIO EN JAVA DONDE EL USUARIO INTERACTUA CON EL ENTORNO SELECCIONANDO IMAGENES QUE PERTENEZCAN
A UN TIPO DE BASURA
* AUTORES: CASTAÑON PUGA MANUEL, RAYGOZA DE LA PAZ BRANDON, LIZARRAGA RODRIGUEZ JESUS ALBERTO, MALDONADO MIGUEL GILBERTO
* CORREO ELECTRONICO: {puga, raygoza.brandon, jlizarraga73,gilberto.maldonado.miguel}@uabc.edu.mx
* UNIVERSIDAD AUTONOMA DE BAJA CALIFORNIA
http://www.uabc.mx
*/
package mem;

import java.io.FileWriter;
import java.io.*;

public class WriteFile {

		public void WriteOnFile(String cadena, String score)
		{
			File file;
			FileWriter w;
			BufferedWriter bw;
			PrintWriter wr;
			
			ReadFile leer = new ReadFile();
			String aux = "";
			aux=leer.ReadAFile();
			System.out.print(aux);
			
			try {
				
				file= new File("archivo.txt");
				w= new FileWriter(file);
				bw= new BufferedWriter(w);
				wr= new PrintWriter(bw);
				
				wr.println(aux);
				//wr.println(cadena);
				
				wr.println(cadena+"................................"+score);
				
				
				wr.close();
				bw.close();
				
			}catch (Exception e)
			{
				System.out.print("error");
			}
			
		}
}
