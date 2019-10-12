package Tarea8;

import java.util.Scanner;

public class Ejercicio8_8 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		long factorial = 1;
		System.out.print("Dame un número para calcular su factorial: ");
		short n = t.nextShort();
		
		for (int i=n ; i>0 ; i--) {
			factorial = i*factorial;
		}
		
		System.out.println(factorial);
		
		t.close();
	}
}