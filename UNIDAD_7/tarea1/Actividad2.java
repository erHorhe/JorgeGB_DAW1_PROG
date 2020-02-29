package tarea1;

import java.util.ArrayList;
import java.util.Collections;

public class Actividad2 {

	public static void main(String[] args) {

		ArrayList<Integer> listaAleatorios = new ArrayList<Integer>();
		short contador = 0;

		while (contador < 20) {
			listaAleatorios.add((int) (Math.random() * 100));
			contador++;
		}
		System.out.println("LISTA GENERADA (SIN ORDENAR):" + "\n"
				+ listaAleatorios);

		Collections.sort(listaAleatorios, Collections.reverseOrder());

		System.out.println("LISTA ORDENADA:" + "\n" + listaAleatorios);

		listaAleatorios.removeAll(listaAleatorios);
	}
}
