package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio4_3 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Número <<n>>: ");
		short n = t.nextShort();
		t.nextLine();
		
		short listaNums[] = new short[n];
		
		short contadorPositivos = 0;
		short cantidadPositivos = 0;
		
		short contadorNegativos = 0;
		short cantidadNegativos = 0;
		
		short contadorDeCeros = 0;
		
		System.out.println("Introduce " + n + " números en el <<array>>:");
		for (int i=0 ; i<listaNums.length ; i++) {
			
			listaNums[i] = t.nextShort();
			
			if (listaNums[i] > 0) {
				cantidadPositivos += listaNums[i];
				contadorPositivos++;
			} else if (listaNums[i] < 0) {
				cantidadNegativos += listaNums[i];
				contadorNegativos++;
			} else {
				contadorDeCeros++;
			}
		}
		
		for (int j=0 ; j<listaNums.length ; j++) {
			
			System.out.print("[" + listaNums[j] + "] ");
		}
		
		System.out.println("\n" + "Media de los positivos = " + cantidadPositivos/contadorPositivos
				+ "\n" + "Media de los negativos = " + cantidadNegativos/contadorNegativos
				+ "\n" + "Cantidad de ceros = " + contadorDeCeros);
		
		t.close();
	}
}