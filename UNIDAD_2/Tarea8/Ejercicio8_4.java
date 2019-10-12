package Tarea8;

import java.util.Scanner;

public class Ejercicio8_4 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.print("Dame un número: ");
		int n = t.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.println(i);
		}
		t.close();
	}
}