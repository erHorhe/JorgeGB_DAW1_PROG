package tarea1;

import java.io.*;

public class Actividad3_1 {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new FileReader(
					"original.txt"));
			
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"copia.txt"));

			int c = in.read();
			while (c != -1) {
				out.write(c);
				c = in.read();
			}

			in.close();
			out.close();
		} catch (IOException i) {
			System.out.println("No se ha podido duplicar el contenido.");
		}
	}
}
