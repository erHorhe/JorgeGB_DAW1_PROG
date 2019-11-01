package Tarea1;

import java.util.Scanner;

public class Ejercicio1_7 {

	static boolean esPrimo(int n) {
		
		boolean esPrimo = true;
		int i = 2; //Como el número 1 no es primo, empezamos por el siguiente.
		
		if (n < 2) {
			esPrimo = false;
		}
		
		/*Si un número no es divisible por ningún entero
		 *comprendido entre 2 y su raíz cuadrada, entonces
		 *ya no será divisible por ningún otro número y será primo.*/
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
		
		System.out.print("Dame un número: ");
		int num = t.nextInt();
		
		System.out.println("¿Es primo el número que has escrito? " + esPrimo(num));
		
		t.close();
	}
}