package tarea2;

import java.util.HashSet;
import java.util.Set;

public class Actividad12 {

	private static boolean incluido(Set<Integer> conjunto1,
			Set<Integer> conjunto2) {
		return conjunto2.containsAll(conjunto1); // Devuelve si conjunto2
													// contiene todos los
													// elementos de conjunto1
	}

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		// A�adimos a <<s1>> los n�meros del 1 al 6:
		for (int i = 1; i <= 6; i++) {
			s1.add(i);
		}

		// A�adimos a <<s2>> los n�meros del 3 al 10:
		for (int i = 3; i <= 10; i++) {
			s2.add(i);
		}

		System.out
				.println("Conjunto n�1: "
						+ s1
						+ "\n"
						+ "Conjunto n�2: "
						+ s2
						+ "\n"
						+ "�El segundo conjunto contiene todos los elementos del primero? "
						+ incluido(s1, s2));
	}
}
