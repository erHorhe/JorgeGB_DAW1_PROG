package Tarea1;

import java.util.Scanner;

public class Ejercicio1_5 {

	static short decirNumMayor(short n1, short n2, short n3) {
		if (n1 > n2) {
			return n1;
		} else if (n2>n1) {
			return n2;
		}
		return n3;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Primer n�mero: ");
		short num1 = t.nextShort();
		System.out.print("Segundo n�mero: ");
		short num2 = t.nextShort();
		System.out.print("Tercer n�mero: ");
		short num3 = t.nextShort();
		
		System.out.println(decirNumMayor(num1, num2, num3) + " es el mayor n�mero.");
		
		t.close();
	}
}