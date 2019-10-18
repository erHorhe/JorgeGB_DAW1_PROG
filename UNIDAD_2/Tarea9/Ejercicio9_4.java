package Tarea9;

import java.util.Scanner;

public class Ejercicio9_4 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		//String espacio = " ";
		
		System.out.print("Dame una frase: ");
		String frase = t.nextLine();
		
		//Si la oración tiene una longitud par:
		if (frase.length() % 2 == 0) {
			
			System.out.println("[" + frase.charAt(frase.length()/2) + "]");
			
		} else if (frase.length() % 2 != 0) { //Si la oración tiene una longitud impar:
			
			System.out.println("[" + frase.charAt((frase.length()-1)/2) + "]");
			
		}
		
		t.close();
	}
}