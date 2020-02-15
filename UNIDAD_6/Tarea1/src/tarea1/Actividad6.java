package tarea1;

import java.io.*;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) throws Exception {

		Scanner t = new Scanner(System.in);
		System.out.println("1. Mostrar libro de firmas." + "\n"
				+ "2. Añadir nombre.");
		System.out
				.print("¿Qué desea hacer? (mostrar firmas -> 1 || insertar firma -> 2) ");
		int opc = t.nextInt();
		t.nextLine();

		switch (opc) {
		case 1:
			muestraFicheroFirmas();
			break;

		case 2:
			System.out.print("Introduzca el nombre que desea insertar: ");
			String nombre = t.nextLine();
			insertarNuevaFirma(nombre);
			break;
		}

		t.close();
	}

	private static void insertarNuevaFirma(String nuevo) throws IOException {
		try {
			BufferedReader in = new BufferedReader(new FileReader("firmas.txt"));
			String nombre = in.readLine();
			boolean encontrado = false;

			while (nombre != null && encontrado == false) {
				if (nombre.equals(nuevo)) {
					encontrado = true;
				}
				nombre = in.readLine();
			}

			in.close();

			if (encontrado == false) {
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"firma.txt", true));
				out.newLine();
				out.write(nuevo);
				System.out.println("\nNuevo nombre insertado");
				out.close();
			} else {
				System.out.println("\nYa había firmado.");
			}

		} catch (EOFException eof) {
			System.out.println("Error de fichero.");
		} catch (FileNotFoundException fnf) {
			System.out.println("No se encuentra el fichero.");
		}
	}

	private static void muestraFicheroFirmas() throws IOException {
		try {
			BufferedReader in = new BufferedReader(new FileReader("firmas.txt"));
			String linea = in.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = in.readLine();
			}
			in.close();
		} catch (EOFException eof) {
			System.out.println("Error de fichero.");
		} catch (FileNotFoundException fnf) {
			System.out.println("No se encuentra el fichero.");
		}
	}
}
