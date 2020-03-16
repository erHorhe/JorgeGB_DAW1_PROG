package tarea2;

import java.io.*;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Actividad16 {

	public static void main(String[] args) {

		Traductor traductor = new Traductor(new HashMap<String, String>(),
				"diccionario.txt");

		try {
			BufferedWriter escribir = new BufferedWriter(new FileWriter(
					"diccionario.txt", true));
			BufferedReader leer = new BufferedReader(new FileReader(
					"diccionario.txt"));

			String palabraEsp = JOptionPane
					.showInputDialog("Escribe una palabra en castellano:");
			escribir.write(palabraEsp + ", ");

			String significadoEng = JOptionPane
					.showInputDialog("Su traducción al inglés:");
			escribir.write(significadoEng + "\n");

			escribir.newLine();

			escribir.close();
			leer.close();
		} catch (IOException io) {
			System.out.println("¡¡ARCHIVO NO ENCONTRADO!!");
		}
	}
}
