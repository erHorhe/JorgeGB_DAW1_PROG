package tarea2;

import java.util.*;

public class Actividad14 {

	static List<Character> leeCadena() {
		Scanner t = new Scanner(System.in);

		List<Character> resultado = new ArrayList<Character>();
		System.out.print("Escribe una frase: ");
		String frase = t.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			resultado.add(frase.charAt(i));
		}

		t.close();
		return resultado;
	}

	public static void main(String[] args) {
		List<Character> lista = leeCadena();
		System.out.println("Lista: " + lista);
	}
}
