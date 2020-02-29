package tarea1;

import java.util.*;

public class Actividad5 {

	public static void main(String[] args) {

		TreeSet<Integer> listaNumeros = new TreeSet<Integer>();

		/*
		 * El método NavigableSet<E> es utilizado para devolver una vista del
		 * orden inverso de los elementos contenidos en el SET
		 */
		NavigableSet<Integer> ordenarDesc = listaNumeros.descendingSet();

		/* Para representar la vista iterada de NavigableSet */
		Iterator<Integer> iterator = ordenarDesc.iterator();

		while (listaNumeros.size() < 20) {
			listaNumeros.add((int) (Math.random() * 100));
			System.out.println(listaNumeros);
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
}