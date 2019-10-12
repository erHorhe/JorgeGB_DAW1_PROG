package Tarea8;

import java.util.Scanner;

public class Ejercicio8_15 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);

		short contadorNumPrimos = 0;
		
		System.out.print("Dame un número <<n>>: ");
		int n = t.nextInt();
		
		for (int dividendo=n ; dividendo>0 ; dividendo--) {
			
			short contadorDivisibles = 0;
			
			for (int divisor=1 ; divisor<=dividendo ; divisor++) {
				if (dividendo%divisor == 0) {
					contadorDivisibles++;
				}
			}
			
			if (contadorDivisibles <= 2) {
				System.out.println(dividendo + " es primo.");
				contadorNumPrimos++;
			} else {
				System.out.println(dividendo + " no es primo.");
			}
			
		}
		
		System.out.println("Entre 1 y " + n + " hay " + contadorNumPrimos + " números primos.");
		
		t.close();
	}
}