package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio4_8 {
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		final short capMax = 5;
		
		System.out.println("Rellena el siguiente array bidimensional: ");
		
		short arrayBi[][] = new short[capMax][capMax];
		for (int i=0 ; i<arrayBi.length ; i++) {
			
			for (int j=0 ; j<arrayBi.length ; j++) {
				
				arrayBi[i][j] = (short) (i+j);
			}
		}
		
		for (int n=0 ; n<arrayBi.length && n<capMax ; n++) {
			
			for (int m=0 ; m<arrayBi.length && n<capMax ; m++) {
				
				System.out.print("[" + arrayBi[n][m] + "]");
			}
			
			System.out.println();
		}
		
		t.close();
	}
}