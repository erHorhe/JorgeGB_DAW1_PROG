package tarea3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		Map<Integer, String> compagneros = new HashMap<Integer, String>();

		compagneros.put(calcularDni(53343849), "Jorge");
		compagneros.put(calcularDni(78236478), "Zu");
		compagneros.put(calcularDni(81162341), "Maricarmen");
		compagneros.put(calcularDni(87125632), "Pacomé");
		compagneros.put(calcularDni(28736523), "Sarah");
		compagneros.forEach((k, v) -> System.out.println("La clave " + k
				+ " está asociada al nombre '" + v + "'"));

		System.out.print("\nAhora escribe un DNI (sin su letra): ");
		Integer dni = t.nextInt();
		for (@SuppressWarnings("unused")
		Map.Entry<Integer, String> entry : compagneros.entrySet()) {
			if (compagneros.containsKey(calcularDni(dni))) {
				System.out.println(calcularDni(dni));
				break;
			} else {
				System.out.println("La clave no existe.");
				break;
			}
		}
		t.close();
	}

	private static Integer calcularDni(Integer dni) {
		Integer suma = 0;
		String dniConLetra = Integer.toString(dni);
		for (int i = 0; i < dniConLetra.length(); i++) {
			Integer num = Character.getNumericValue(dniConLetra.charAt(i));
			suma += num;
		}
		return suma;
	}
}
