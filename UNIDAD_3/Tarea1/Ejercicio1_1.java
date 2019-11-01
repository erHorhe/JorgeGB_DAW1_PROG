package Tarea1;

import java.util.Scanner;

public class Ejercicio1_1 {

	static String eco(int n) {
		
		String eco = "Eco...";
		
		for (int i=0 ; i<n-1 ; i++) {
			
			System.out.print(eco);
		}
		
		return eco;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int num = t.nextInt();
		
		System.out.println(eco(num));
		
		t.close();
	}
}