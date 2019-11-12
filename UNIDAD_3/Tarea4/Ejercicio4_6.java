package UNIDAD_3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_6 {

	static int[] sinRepetidos(int t[]) {
		
		short longitud = (short) t.length;
		
		for (int i=0 ; i<longitud ; i++) {
			
			for (int j=i+1 ; j<longitud ; j++) {
				
				if (t[i] == t[j]) { //Se comparará la primera posición del array con las siguientes del mismo y, si coinciden...
					
					t[j] = t[longitud-1]; //..., el contenido de la posición 'j' será el de la posición siguiente. 
					longitud--;
				}
			}
		}
		int tablaSinRepetidos[] = Arrays.copyOf(t, longitud);
		Arrays.sort(tablaSinRepetidos);
		
		return tablaSinRepetidos;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		final short MAX = 5;
		
		System.out.println("Escribe " + MAX +" números enteros en el array:");
		int[] array = new int[MAX];
		
		for (int i=0 ; i<array.length ; i++) {
			
			array[i] = t.nextInt();
			
		}
		
		System.out.println(Arrays.toString(sinRepetidos(array)));
	
		t.close();
	}
}