package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio1_9 {

	static boolean esPrimo(int n) {
		
		boolean esPrimo = true;
		int i = 2; //Como el número 1 no es primo, empezamos por el siguiente.
		
		if (n < 2) {
			esPrimo = false;
		}

		while (i<=(int)Math.sqrt(n) && esPrimo==true) {
			
			if (n%i == 0) {
				esPrimo = false;
			}
			
			i++;
		}
		
		return esPrimo;
	}
	
	static void divisoresPrimos(int num) {
		
		for (int i=1 ; i<=num ; i++) {
			
			if (esPrimo(i) && num%i==0) { //si <<i>> es primo y divide a num
				//i es un divisor primo de num
				System.out.print("[" + i + "] ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = t.nextInt();
		
		divisoresPrimos(num);
		
		t.close();
	}
}