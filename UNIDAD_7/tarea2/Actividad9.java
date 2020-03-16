package tarea2;

import java.util.HashSet;
import java.util.Set;

public class Actividad9 {

	/*
	 * Creamos un conjunto donde a�adir los elemento de los dos conjuntos. Como
	 * los conjuntos no permiten repetidos, el resultado ser� la uni�n de ambos:
	 */
	private static Set<Object> union(Set<Integer> conj1, Set<Integer> conj2) {
		Set<Object> resultado = new HashSet<Object>(conj1); // copiamos el
															// primer conjunto
															// en resultado
		resultado.addAll(conj2); // a�adimos los elementos del segundo conjunto
		return resultado; // el resultado es la uni�n
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
				+ "\n" + "Uni�n de ambos conjuntos: " + union(s1, s2));
	}
}
