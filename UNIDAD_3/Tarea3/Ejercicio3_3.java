package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre completo: ");
		String tuNombre = t.nextLine();
		
		String subcadenaVocales = "[aeiouAEIOUáéíóúÁÉÍÓÚ]";	
		
		String nombreSinVocales = tuNombre.replaceAll(subcadenaVocales, "");
		
		System.out.println("Mi nombre sin vocales es: " + nombreSinVocales);
		
		t.close();
	}
}