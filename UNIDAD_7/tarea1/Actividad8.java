package tarea1;

import java.util.*;

public class Actividad8 {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		ArrayList<String> listaNombres = new ArrayList<String>();
		String nombre = "";
		while (!nombre.equalsIgnoreCase("fin")) {
			System.out.println("Introduce nombres (termina con <<fin>>):");
			nombre = t.nextLine();

			if (!nombre.equalsIgnoreCase("fin")) {
				listaNombres.add(nombre);
			}
		}
		System.out.println(eliminaRepetidos(listaNombres));
		t.close();
	}

	private static ArrayList<String> eliminaRepetidos(ArrayList<String> c) {
		HashSet<String> comprobar = new HashSet<String>();
		List<String> repetidos = new ArrayList<String>();
		Iterator<String> iterator = c.iterator();

		for (; iterator.hasNext();) {
			String valor = iterator.next();
			if (comprobar.add(valor) == false) {
				repetidos.add(valor);
			}
		}

		c.removeAll(repetidos);

		return c;
	}
}