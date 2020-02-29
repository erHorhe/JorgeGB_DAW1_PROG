package tarea1;

import java.util.*;

public class Actividad4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su frase");
		String frase = teclado.nextLine();
		String[] palabras = frase.split(" ");

		ArrayList<String> lista = new ArrayList<>(Arrays.asList(palabras));
		HashSet<String> comprobar = new HashSet<>();
		HashSet<String> repetidos = new HashSet<>();
		Iterator<String> iterator = lista.iterator();

		for (; iterator.hasNext();) {
			String valor = iterator.next();
			if (comprobar.add(valor) == false) {
				repetidos.add(valor);
			}
		}

		lista.removeAll(repetidos);

		System.out.println(repetidos);
		System.out.println(lista);

		teclado.close();
	}
}
