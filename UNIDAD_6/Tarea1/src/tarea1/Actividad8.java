package tarea1;

import java.io.*;

public class Actividad8 {

	public static void main(String[] args) throws Exception {

		try {
			BufferedReader perso1 = new BufferedReader(new FileReader(
					"perso1.txt"));
			BufferedReader perso2 = new BufferedReader(new FileReader(
					"perso2.txt"));
			BufferedWriter todos = new BufferedWriter(new FileWriter(
					"todos.txt"));

			String nombre1 = perso1.readLine();
			String nombre2 = perso2.readLine();

			while (nombre1 != null && nombre2 != null) {
				if (nombre1.compareToIgnoreCase(nombre2) < 0) { // si nombre1 <
																// nombre2
					todos.write(nombre1);
					todos.newLine();
					nombre1 = perso1.readLine();
				} else {
					todos.write(nombre2);
					todos.newLine();
					nombre2 = perso2.readLine();
				}
			}

			if (nombre1 == null) {
				while (nombre2 != null) {
					todos.write(nombre2);
					todos.newLine();
					nombre2 = perso2.readLine();
				}
			} else {
				while (nombre1 != null) {
					todos.write(nombre1);
					todos.newLine();
					nombre1 = perso1.readLine();
				}
			}
			perso1.close();
			perso2.close();
			todos.close();
		} catch (EOFException eof) {
			System.out.println("Error de fichero.");
		} catch (FileNotFoundException fnf) {
			System.out.println("Fichero no encontrado.");
		}
	}
}