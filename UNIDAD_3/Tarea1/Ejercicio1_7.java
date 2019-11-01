package Tarea1;

import java.util.Scanner;

public class Ejercicio1_7 {

	static boolean esPrimo(int n) {
		
		boolean esPrimo = true;
		int i = 2; //Como el n�mero 1 no es primo, empezamos por el siguiente.
		
		if (n < 2) {
			esPrimo = false;
		}
		
		/*Si un n�mero no es divisible por ning�n entero
		 *comprendido entre 2 y su ra�z cuadrada, entonces
		 *ya no ser� divisible por ning�n otro n�mero y ser� primo.*/
		while (i<=(int)Math.sqrt(n) && esPrimo==true) {
			
			if (n%i == 0) {
				esPrimo = false;
			}
			
			i++;
		}
		
		return esPrimo;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame un n�mero: ");
		int num = t.nextInt();
		
		System.out.println("�Es primo el n�mero que has escrito? " + esPrimo(num));
		
		t.close();
	}
}