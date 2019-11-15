package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Introduce palabras: ");
		String palabra = t.next();
		t.nextLine();
		
		String cadenaFinal = palabra;
		
		while(!palabra.contains("fin")) {
			
			palabra = t.next();
			
			if (!palabra.contains("fin")) {
				
				cadenaFinal += (" " + palabra);
			}
		}
		
		System.out.println(cadenaFinal);
		
		t.close();
	}
}