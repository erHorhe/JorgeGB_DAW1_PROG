package Tarea1;

import java.util.Scanner;

public class Ejercicio1_4 {

	static short decirNumMayor(short n1, short n2) {
		if (n1 > n2) {
			return n1;
		}
		return n2;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Primer n�mero: ");
		short num1 = t.nextShort();
		System.out.print("Segundo n�mero: ");
		short num2 = t.nextShort();
		
		System.out.println(decirNumMayor(num1, num2) + " es el n�mero mayor.");
		
		t.close();
	}
}