package tarea1;

import java.util.Scanner;
import java.util.TreeSet;

public class Actividad7 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		TreeSet<String> nombres = new TreeSet<String>();
		
		System.out.print("Escribe nombres (termina con <<fin>>): ");
		String nombre = t.nextLine();

		if (!nombre.equals("fin")) {
			nombres.add(nombre);
			while (!nombre.equalsIgnoreCase("fin")) {
				System.out
						.print("Sigue escribiendo nombres (termina con <<fin>>): ");
				nombre = t.nextLine();
				if (!nombre.equalsIgnoreCase("fin")) {
					nombres.add(nombre);
				} else {
					break;
				}
			}
		}
		System.out.println(nombres);
		t.close();
	}
}
