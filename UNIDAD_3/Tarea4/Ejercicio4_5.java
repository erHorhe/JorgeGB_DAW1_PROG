package UNIDAD_3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		final short cantidadNums = 6;
		short listaNums_1[] = new short[cantidadNums];
		short listaNums_2[] = new short[cantidadNums];
		short listaCompleta[] = new short[listaNums_1.length + listaNums_2.length];
		
		System.out.println("Escribe seis números enteros en la primera tabla:");
		for (int i=0 ; i<listaNums_1.length ; i++) {
			
			listaNums_1[i] = t.nextShort();
		}
		//Ordenamos y mostramos los datos:
		Arrays.sort(listaNums_1);
		System.out.println(Arrays.toString(listaNums_1));
		
		System.out.println("\n" + "Escribe seis números enteros en la segunda tabla:");
		for (int i=0 ; i<listaNums_2.length ; i++) {
			
			listaNums_2[i] = t.nextShort();
		}
		//Ordenamos y mostramos los datos:
		Arrays.sort(listaNums_2);
		System.out.println(Arrays.toString(listaNums_2));
		
		/*Para copiar dos arrays en uno:
		 * ·Array origen
		 * ·Posición inicial del array origen
		 * ·Array destino
		 * ·Posición inicial en el array de destino
		 * ·Número de elementos a copiar del array origen al array destino*/
		System.arraycopy(listaNums_1, 0, listaCompleta, 0, cantidadNums);
		
		System.arraycopy(listaNums_2, 0, listaCompleta, listaNums_1.length, listaNums_2.length);
		
		System.out.println("\n" + "Fusión de ambas listas:");
		System.out.println(Arrays.toString(listaCompleta));
		
		t.close();
	}
}