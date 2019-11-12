package UNIDAD_3;

import java.util.Arrays;

public class Ejercicio4_9 {

	static short contarAciertos(int tabla1[], int tabla2[], int tablaCombi[][], final short MAX) {
		
		short contador = 0;
		for (int i=0 ; i<tabla1.length && i<MAX*2 ; i++) {
			
			for (int j=0 ; j<tabla2.length && j<MAX*2 ; j++) {
				
				if ((tabla1[i] == tabla2[j])) {
					
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	public static void main(String[] args) {
		
		final short MAX = 6;
		
		int primitiva1[] = new int[MAX];
		int primitiva2[] = new int[MAX];
		int fusion[][] = new int[MAX][MAX];
		
		System.out.println("Primera primitiva:");
		for (int i=0 ; i<primitiva1.length ; i++) {
			
			primitiva1[i] = (short) (Math.random()*50);
		}
		Arrays.sort(primitiva1);
		System.out.println(Arrays.toString(primitiva1));
		
		System.out.println("Segunda primitiva:");
		for (int i=0 ; i<primitiva2.length ; i++) {
			
			primitiva2[i] = (short) (Math.random()*50);
		}
		Arrays.sort(primitiva2);
		System.out.println(Arrays.toString(primitiva2));
		
		System.out.println("Aciertos -> " + contarAciertos(primitiva1, primitiva2, fusion, MAX));
	}
}