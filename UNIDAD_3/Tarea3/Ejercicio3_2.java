package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String frase = t.nextLine();
		
		short contadorEspacios = 0;
		
		for (int i=0 ; i<frase.length() ; i++) {
			
			if (frase.charAt(i) == ' ') {
				
				contadorEspacios++;
			}
		}
		
		System.out.println("Cantidad de espacios = " + contadorEspacios);
		
		t.close();
	}
}