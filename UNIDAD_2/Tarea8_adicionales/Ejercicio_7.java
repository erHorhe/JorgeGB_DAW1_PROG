package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		int cifra;
		
		System.out.print("Dame un número para ponerlo al revés: ");
		int num = t.nextInt();
		
		String inversion = String.valueOf(num);
		
		for (int i=inversion.length() ; i>0 ; i--) {
			cifra = i;
			System.out.print(cifra);
		}
		
		t.close();
	}
}