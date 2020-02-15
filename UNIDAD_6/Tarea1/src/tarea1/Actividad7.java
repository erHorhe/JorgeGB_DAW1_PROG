package tarea1;

import java.io.*;
import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) throws Exception {

		Scanner t = new Scanner(System.in);

		final int MAX_LINEAS = 24;
		int contadorLineas = 0;

		try {
			BufferedReader in = new BufferedReader(new FileReader("more.txt"));
			String linea = in.readLine();

			while (linea != null) {
				System.out.println(linea);
				contadorLineas++;
				if (contadorLineas == MAX_LINEAS) {
					System.out.println();
					System.out.print("Pulse Intro...");
					t.nextLine();
					System.out.println();
					contadorLineas = 0;
				}
				linea = in.readLine();
			}
			in.close();
		} catch (EOFException eof) {
			System.out.println("Error de fichero.");
		} catch (FileNotFoundException fnf) {
			System.out.println("Fichero no encontrado.");
		}

		t.close();
	}
}
