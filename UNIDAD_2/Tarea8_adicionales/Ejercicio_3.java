package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame un número <<n>>: ");
		short n = t.nextShort();
		int a = 0;
		int b = 1;
		int c;
		
		for (int i=0 ; i<n ; i++) {
			System.out.print(a + ", ");
			c = a+b; //
			a = b; //
			b = c; //
		}
		
		t.close();
	}
}