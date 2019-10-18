package Tarea9;

import java.util.Scanner;

public class Ejercicio9_5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		String muletillaPrincipio = "Javal�n, javal�n ";
		String muletillaFinal = " javal�n, len, len";
		
		System.out.print("Traductor, �est� hablando en Javal�s? ");
		String frase = t.nextLine();
		
		if ((frase.startsWith(muletillaPrincipio)) || (frase.endsWith(muletillaFinal))) {
			
			System.out.println("Est� hablando en javal�s. Vamos a traducirlo al castellano:"
					+ "\n"
					+ traductor(frase));
			
		} else {
			
			System.out.println("No est� hablando en javal�s.");
			
		}
		
		t.close();
	}
	
	static String traductor (String cadena) {
		
		if ((cadena.startsWith("Javal�n, javal�n ")) || (cadena.endsWith(" javal�n, len, len"))) {
			
			cadena = cadena.replace("Javal�n, javal�n "," ");
			cadena = cadena.replace(" javal�n, len, len"," ");
			
		}
		
		return cadena;
	}
}