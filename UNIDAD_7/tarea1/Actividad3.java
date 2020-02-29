package tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Actividad3 {

	public static void main(String[] args) {

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		Comparator<Integer> ordenInverso = Collections.reverseOrder();

		while (listaNumeros.size() < 20) {
			listaNumeros.add((int) (Math.random() * 10));
			Collections.sort(listaNumeros, ordenInverso);
			System.out.println(listaNumeros);
		}

	}
}