package tarea1;

import java.io.*;
import javax.swing.JOptionPane;

public class Actividad2 {

	public static void main(String[] args) {

		String nombre = JOptionPane.showInputDialog("Escriba su nombre:");
		int edad = Integer.parseInt(JOptionPane
				.showInputDialog("Escriba su edad:"));

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt", true));
			out.write("Nombre: " + nombre);
			out.newLine();
			out.write("Edad: " + edad);
			out.newLine();
			out.close();

			BufferedReader in = new BufferedReader(new FileReader("datos.txt"));
			int c = in.read();
			while (c != -1) {
				System.out.print((char)c);
				c = in.read();
			}
			in.close();
		} catch (IOException e) {
			System.out.println("Fichero no se pudo abrir.");
		}
	}
}
