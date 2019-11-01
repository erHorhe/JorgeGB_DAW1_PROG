package Tarea1;

import java.util.Scanner;

public class Ejercicio1_8 {

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
		
		return (esPrimo);
	}
	
	static short contarDivisoresPrimos(int num) {
		
		short contadorDivisoresPrimos = 0;
		for (int i=2 ; i<=num ; i++) {
			
			if (esPrimo(i) && num%i==0) { //Si <<i>> es primo y divide a <<num>>:
				contadorDivisoresPrimos++;
			}
			
		}
		return contadorDivisoresPrimos;
	}
	
	public static void main(String[] args) {
		
		Scanner rt = new Scanner(System.in);
		
		System.out.print("Dame un número entero: ");
		int num = rt.nextInt();
		
		System.out.println(num + " tiene " + contarDivisoresPrimos(num) + " divisor/es primos.");
		
		rt.close();
	}
}