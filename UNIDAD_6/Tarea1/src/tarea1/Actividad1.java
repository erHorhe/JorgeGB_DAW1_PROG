package tarea1;

import java.util.Scanner;
import java.io.*;

public class Actividad1 {

	public static void main(String[] args)  {

		Scanner t = new Scanner(System.in);
		final String POR_DEFECTO = "prueba.txt";

		System.out
				.println("Escriba nombre del fichero (por defecto <<prueba.txt>>) -> ");
		String nombreFichero = t.nextLine();
		if (nombreFichero.isEmpty()) {
			nombreFichero = POR_DEFECTO;
		}
		t.close();

		try {
			BufferedReader in = new BufferedReader(
					new FileReader(nombreFichero));
			int c = in.read();
			while (c != -1) {
				System.out.print((char) c);
				c = in.read();
			}
			in.close();
		} catch (IOException e) {
			System.out.println("¡Fichero no se pudo abrir!");
		}
	}
}
