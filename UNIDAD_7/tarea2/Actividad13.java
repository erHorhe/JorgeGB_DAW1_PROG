package tarea2;

import java.util.*;

public class Actividad13 {

	private static List<Integer> fusion(List<Integer> lista1,
			List<Integer> lista2) {
		List<Integer> resultado = new ArrayList<Integer>();
		int i = 0, j = 0;

		while (i < lista1.size() && j < lista2.size()) {
			if (lista1.get(i) < lista2.get(j)) {
				resultado.add(lista1.get(i));
				i++;
			} else {
				resultado.add(lista2.get(j));
				j++;
			}
		}

		while (i < lista1.size()) {
			resultado.add(lista1.get(i));
			i++;
		}

		while (j < lista2.size()) {
			resultado.add(lista2.get(j));
			j++;
		}

		return resultado;
	}

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			lista1.add(i);
		}

		for (int i = 1; i <= 10; i++) {
			lista2.add(i + 3);
		}

		System.out.println("Conjunto nº1: " + lista1 + "\n" + "Conjunto nº2: "
				+ lista2 + "\n" + "Diferencia: " + fusion(lista1, lista2));
	}
}
