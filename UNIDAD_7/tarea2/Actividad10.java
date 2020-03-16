package tarea2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Actividad10 {

	/*
	 * La idea es recorrer el primer conjunto con un iterador y comprobar si
	 * cada elemento se encuentra en el segundo conjunto. El elemento que
	 * pertenece a ambos conjuntos pertenece a la intersección:
	 */
	private static Set<Object> interseccion(Set<Integer> conj1,
			Set<Integer> conj2) {
		Set<Object> resultado = new HashSet<Object>(conj1); // creamos el
															// conjunto
															// resultante
		for (Iterator<Integer> it = conj1.iterator(); it.hasNext();) { // recorremos
																		// conj1
			Object temp = it.next(); // Elemento referenciado por <<it>>
			if (conj2.contains(temp)) { // si el elemento se encuentra en el
										// conj2...
				resultado.add(temp); // ...lo añadimos al conjunto
										// "intersección"
			}
		}
		return resultado;
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
				+ "\n" + "Intersección: " + interseccion(s1, s2));
	}
}
