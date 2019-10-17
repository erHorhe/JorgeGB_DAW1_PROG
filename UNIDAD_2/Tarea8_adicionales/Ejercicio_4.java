package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		short contadorPositivos = 0;
		short contadorNegativos = 0;
		
		System.out.println("Dame una lista de diez números: ");
		for (int i=0 ; i<10 ; i++) {
			int num = t.nextInt();
			
			if (num > 0) {
				contadorPositivos++;
			} else if (num < 0) {
				contadorNegativos++;
			}
		}
		
		System.out.println("Hay " + contadorPositivos + " números positivos, y " + contadorNegativos + " negativos.");
		
		t.close();
	}
}