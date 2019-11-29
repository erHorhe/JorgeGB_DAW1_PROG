package actividades;

import java.util.Arrays;

public class ej1 {

	public static void main(String[] args) {
		
		short columnas = 9;
		short filas = 9;
		int array9_9[][] = new int[columnas][filas];
		int valoresDiagonal[][] = new int[columnas][filas];
		
		//Aquí relleno el array con los números aleatorios indicados:
		for (int i=0 ; i<columnas ; i++) {
			 
			for (int j=0 ; j<filas ; j++) {
				
				array9_9[i][j] = (int) (Math.random()*900+500);
			}
			System.out.println(Arrays.deepToString(array9_9));
		}
		
		for (int i=columnas-1 ; i>=0 ; i--) {
			
			for (int j=0 ; j>filas ; j++) {
				
				valoresDiagonal[i][j] = array9_9[i][j];
			}
		}
		
		
	}
}