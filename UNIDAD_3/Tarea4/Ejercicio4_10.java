package UNIDAD_3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_10 {

	static void rellenaPares(int size) {
		
		Scanner t = new Scanner (System.in);
		
		int tablaPares[] = new int[size];
		short contadorImpares = 0;
		
		System.out.println("Vamos a introducir números enteros en nuestra tabla."
				+ "\n"
				+ "Por cada impar, nos pedirá introducir otro en la misma posición hasta que sea par:");
		for (int i=0 ; i<tablaPares.length ; i++) {
			
			System.out.print((i+1) + "º posición: ");
			tablaPares[i] = t.nextShort();
			t.nextLine();
			
			if (tablaPares[i]%2 != 0) {
				
				i--;
				contadorImpares++;
			}
		}
		
		System.out.println(Arrays.toString(tablaPares)
				+ "\n"
				+ "Cantidad de impares = " + contadorImpares);

		t.close();
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		final short MAX = 6;
		
		rellenaPares(MAX);
		
		t.close();
	}
}