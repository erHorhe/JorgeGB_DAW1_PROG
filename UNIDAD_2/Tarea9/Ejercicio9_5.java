package Tarea9;

import java.util.Scanner;

public class Ejercicio9_5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		String muletillaPrincipio = "Javalín, javalón ";
		String muletillaFinal = " javalén, len, len";
		
		System.out.print("Traductor, ¿está hablando en Javalés? ");
		String frase = t.nextLine();
		
		if ((frase.startsWith(muletillaPrincipio)) || (frase.endsWith(muletillaFinal))) {
			
			System.out.println("Está hablando en javalés. Vamos a traducirlo al castellano:"
					+ "\n"
					+ traductor(frase));
			
		} else {
			
			System.out.println("No está hablando en javalés.");
			
		}
		
		t.close();
	}
	
	static String traductor (String cadena) {
		
		if ((cadena.startsWith("Javalín, javalón ")) || (cadena.endsWith(" javalén, len, len"))) {
			
			cadena = cadena.replace("Javalín, javalón "," ");
			cadena = cadena.replace(" javalén, len, len"," ");
			
		}
		
		return cadena;
	}
}