package tarea1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad3_2 {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		System.out.print("Fichero fuente: ");
		String ficheroFuente = t.nextLine();
		String ficheroDestino = nombreFichero(ficheroFuente); // anade el
																// prefijo
																// "copia_de_"

		try {
			BufferedReader in = new BufferedReader(
					new FileReader(ficheroFuente));
			BufferedWriter out = new BufferedWriter(new FileWriter(
					ficheroDestino));

			int c = in.read();
			while (c != -1) {
				out.write(c);
				c = in.read();
			}

			in.close();
			out.close();
		} catch (IOException io) {
			System.out.println("Error de fichero.");
		}

		t.close();
	}

	private static String nombreFichero(String nombre) {
		String nuevoNombre;
		int pos = nombre.lastIndexOf('/');
		if (pos == -1) {
			nuevoNombre = "copia_de_" + nombre;
		} else {
			nuevoNombre = nombre.substring(0, pos + 1) + "copia_de_"
					+ nombre.substring(pos + 1);
		}

		return nuevoNombre;
	}
}
