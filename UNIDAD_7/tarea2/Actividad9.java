package tarea2;

import java.util.HashSet;
import java.util.Set;

public class Actividad9 {

	/*
	 * Creamos un conjunto donde añadir los elemento de los dos conjuntos. Como
	 * los conjuntos no permiten repetidos, el resultado será la unión de ambos:
	 */
	private static Set<Object> union(Set<Integer> conj1, Set<Integer> conj2) {
		Set<Object> resultado = new HashSet<Object>(conj1); // copiamos el
															// primer conjunto
															// en resultado
		resultado.addAll(conj2); // añadimos los elementos del segundo conjunto
		return resultado; // el resultado es la unión
	}

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		// Añadimos a <<s1>> los números del 1 al 6:
		for (int i = 1; i <= 6; i++) {
			s1.add(i);
		}

		// Añadimos a <<s2>> los números del 3 al 10:
		for (int i = 3; i <= 10; i++) {
			s2.add(i);
		}

		System.out.println("Conjunto nº1: " + s1 + "\n" + "Conjunto nº2: " + s2
				+ "\n" + "Unión de ambos conjuntos: " + union(s1, s2));
	}
}
