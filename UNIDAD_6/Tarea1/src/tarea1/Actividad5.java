package tarea1;

import java.io.*;

public class Actividad5 {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(
					new FileReader("numeros.txt"));
			int num, max, min;

			String cifra = in.readLine();
			num = Integer.valueOf(cifra);
			max = num;
			min = num;

			cifra = in.readLine();
			while (cifra != null) {
				num = Integer.valueOf(cifra);

				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
				cifra = in.readLine();
			}

			in.close();

			System.out.println("Mayor: " + max + "\n" + "Menor: " + min);
		} catch (IOException io) {
			System.out.println("No se encuentra el fichero.");
		}
	}
}
