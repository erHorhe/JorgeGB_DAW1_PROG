package U3_ENTREGABLE;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.println("LONGITUD DE NUESTRO ARRAY:");
		short longitud = t.nextShort();
		
		int[] array = new int[longitud];
		for (int i=0 ; i<array.length ; i++) {
			
			System.out.print(i+1 + "º posición: ");
			array[i] = t.nextInt();
			t.nextLine();
		}
		
		System.out.println("'" + convierteEnString(array) + "'");
		
		t.close();
	}
	
	public static String convierteEnString(int[] a) {
		
		String cadena = "";
		
		for (int i=0 ; i<a.length ; i++) {
			
			cadena = cadena + a[i];
		}
		
		return cadena;
	}
}