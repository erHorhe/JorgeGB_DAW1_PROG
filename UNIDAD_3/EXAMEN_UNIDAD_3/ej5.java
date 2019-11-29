package actividades;

import java.util.Arrays;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		int columnas = 4;
		int filas = 6;
		
		int array[][] = new int[columnas][filas];
		
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=0 ; j<filas ; j++) {
				
				array[i][j] = t.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(array));
		
		t.close();
	}

	public static int[] corteza(int[][] n, int columnas, int filas) {
		
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=0 ; j<filas ; j++) {
				
				if ((i>0 && j>0) && j<filas-1) {
					
					continue;
				
				} else {
					
					
				}
			}
		}
		
		return null;
	}
}
