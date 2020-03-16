package tarea2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Actividad11 {

	/*
	 * Seguiremos el siguiente algoritmo: recorremos el primer conjunto,
	 * qued�ndonos con los elementos que no se encuentran en el segundo conjunto
	 */
	private static Set<Object> diferencia(Set<Integer> conjunto1,
			Set<Integer> conjunto2) {
		Set<Object> resultado = new HashSet<Object>();
		for (Iterator<?> it = conjunto1.iterator(); it.hasNext();) {
			Object temp = it.next(); // Elemento referenciado por <<it>>
			if (!conjunto2.contains(temp)) { // Si el elemento no est� en el
												// segundo conjunto...
				resultado.add(temp); // ...lo a�adimos al conjunto resultante.
			}
		}
		return resultado;
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

		System.out.println("Conjunto n�1: " + s1 + "\n" + "Conjunto n�2: " + s2
				+ "\n" + "Diferencia: " + diferencia(s1, s2)); // s1 - s2
	}
}
