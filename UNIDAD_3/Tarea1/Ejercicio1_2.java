package Tarea1;

import java.util.Scanner;

public class Ejercicio1_2 {

	static int mostrarNumerosComprendidos(int n1, int n2) {
		
		int i;
		for (i=n1 ; i<n2 ; i++) {
			
			System.out.println(i);
		}
		
		return i;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Primer número: ");
		int num1 = t.nextInt();
		System.out.print("Segundo número: ");
		int num2 = t.nextInt();
		
		System.out.println(mostrarNumerosComprendidos(num1, num2));
		
		t.close();
		
	}
}