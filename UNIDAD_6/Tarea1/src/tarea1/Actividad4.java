package tarea1;

import java.io.*;

public class Actividad4 {

	public static void main(String[] args) {

		try {
			int contadorCaracteres = 0;
			int contadorLineas = 0;
			int contadorPalabras = 0;

			BufferedReader in = new BufferedReader(new FileReader("carta.txt"));
			int c = in.read();
			while (c != -1) {
				if ((char) c == ' ') { // si la posicion actual es igual a un
										// espacio
					contadorCaracteres++;
					contadorPalabras++;
				} else if ((char) c == '\n') { // si la posicion actual es igual
												// a un salto de linea
					contadorLineas++;
					contadorPalabras++;
				} else {
					contadorCaracteres++;
				}
				c = in.read();
			}
			in.close();

			if (contadorPalabras > 0) { // la ultima palabra no se ha
										// contabilizado
				contadorPalabras++;
			}

			if (contadorLineas > 0) { // la ultima linea no se ha contabilizado
				contadorLineas++;
			}

			System.out.println("Cantidad de caracteres = "
					+ (contadorCaracteres - 1) + "\n"
					+ "Cantidad de palabras = " + contadorPalabras + "\n"
					+ "Cantidad de lineas = " + contadorLineas);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}
}
