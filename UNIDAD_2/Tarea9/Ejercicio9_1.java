package Tarea9;

import java.util.Scanner;

public class Ejercicio9_1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("1� frase: ");
		String frase1 = t.next();
		System.out.print("2� frase: ");
		String frase2 = t.next();
		
		if (frase1.length() > frase2.length()) {
			System.out.println("La 1� frase es la m�s larga.");
		} else {
			System.out.println("La 2� frase es la m�s larga.");
		}
		
		t.close();
	}
}