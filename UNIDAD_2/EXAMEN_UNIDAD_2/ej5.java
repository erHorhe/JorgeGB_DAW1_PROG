package EXAMEN_UNIDAD_2;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de texto: ");
		String cadena = t.nextLine();
		
		short contadorVocales = 0;
		
		for (int i=0 ; i<cadena.length() ; i++) {
			
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A'
					|| cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E'
					|| cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I'
					|| cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O'
					|| cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U') {
				contadorVocales++;
			}
		}
		
		System.out.println("La cadena tiene " + contadorVocales + " vocales.");
		
		t.close();
	}
}