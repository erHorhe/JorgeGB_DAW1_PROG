package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio1_12 {

	static int calcularFactorial(int n) {
		
		int factorial = 1;
		
		if (n == 0) {
			return factorial;
		} else {
			return n*calcularFactorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Escribe un número entero: ");
		int num = t.nextInt();
		
		System.out.println(calcularFactorial(num));
		
		t.close();
	}
}