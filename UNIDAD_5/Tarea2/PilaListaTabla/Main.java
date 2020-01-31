package PilaListaTabla;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		final int MAX = 10;
		int[] array = new int[MAX];
		System.out.println("Rellena el array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = t.nextInt();
		}
		System.out.println(Arrays.toString(array));

		Pila p1 = new PilaLista();
		p1.mostrarNumsInvertidos(array);

		// Pila p2 = new PilaTabla();

		t.close();
	}
}
