package Cliente;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		final short MAX = 5;
		Cliente arrayClientes[] = new Cliente[MAX];
		arrayClientes[0] = new Cliente("53343849H", "Jorge Gomez Blanco", 19, 0);
		arrayClientes[1] = new Cliente("89036172X",
				"Jesus Manuel Lopez Hernandez", 31, 300);
		arrayClientes[2] = new Cliente("96124914Y", "Cherminator", 40, 290);
		arrayClientes[3] = new Cliente("10283385D", "Aquiles Castro", 8, 0.1);
		arrayClientes[4] = new Cliente("64154161L", "Leon S. Kennedy", 35, 500);

		Arrays.sort(arrayClientes);
		System.out.println("-ORDENACION POR DNI-" + "\n"
				+ Arrays.toString(arrayClientes));

		Arrays.sort(arrayClientes, new CompararNombre());
		System.out.println("\n" + "-ORDENACION POR NOMBRE-" + "\n"
				+ Arrays.toString(arrayClientes));

		Arrays.sort(arrayClientes, new CompararEdad());
		System.out.println("\n" + "-ORDENACION POR EDAD-" + "\n"
				+ Arrays.toString(arrayClientes));
	}
}
