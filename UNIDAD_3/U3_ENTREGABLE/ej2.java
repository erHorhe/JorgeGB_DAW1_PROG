package U3_ENTREGABLE;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		/*Creamos e inicializamos el array,
		 *y acto seguido lo recorremos para rellenarlo:*/
		final short columnas = 4;
		final short filas = 5;
		short array[][] = new short[columnas][filas];
		
		System.out.println("RELLENA EL ARRAY CON 20 NUMS:");
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=0 ; j<filas ; j++) {
				
				array[i][j] = t.nextShort();
			}
		}
		
		//RELLENAMOS CADA FILA:
		short fila0 = 0;
		for (int i=0 ; i<1 ; i++) {
			
			for (int j=0 ; j<filas ; j++) {
				
				fila0 += array[i][j];
			}
		}
		
		short fila1 = 0;
		for (int i=1 ; i<2 ; i++) {
			
			for (int j=0 ; j<filas ; j++) {
				
				fila1 += array[i][j];
			}
		}
		
		short fila2 = 0;
		for (int i=2 ; i<3 ; i++) {
			
			for (int j=0 ; j<filas ; j++) {
				
				fila2 += array[i][j];
			}
		}
		
		short fila3 = 0;
		for (int i=3 ; i<4 ; i++) {
			
			for (int j=0 ; j<filas ; j++) {
				
				fila3 += array[i][j];
			}
		}
		
		short totalFilas = (short) (fila0 + fila1 + fila2 + fila3);
		
		//RELLENAMOS CADA COLUMNA:
		short columna0 = 0;
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=0 ; j<1 ; j++) {
				
				columna0 += array[i][j];
			}
		}
		
		short columna1 = 0;
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=1 ; j<2 ; j++) {
				
				columna1 += array[i][j];
			}
		}
		
		short columna2 = 0;
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=2 ; j<3 ; j++) {
				
				columna2 += array[i][j];
			}
		}
		
		short columna3 = 0;
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=3 ; j<4 ; j++) {
				
				columna3 += array[i][j];
			}
		}
		
		short columna4 = 0;
		for (int i=0 ; i<columnas ; i++) {
			
			for (int j=4 ; j<5 ; j++) {
				
				columna4 += array[i][j];
			}
		}
		
		short totalColumnas = (short) (columna0 + columna1 + columna2 + columna3 + columna4);
		
		short totalDefinitivo = (short) (totalFilas + totalColumnas);
		
		System.out.println("TOTAL = " + totalDefinitivo);
		
		t.close();
	}
}