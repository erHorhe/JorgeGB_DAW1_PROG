package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio1_6 {

	static boolean esVocal(String caracter) {
		boolean esVocal = false;
		if (caracter.equalsIgnoreCase("a")
				||
				caracter.equalsIgnoreCase("e")
				||
				caracter.equalsIgnoreCase("i")
				||
				caracter.equalsIgnoreCase("o")
				||
				caracter.equalsIgnoreCase("u")) {
			esVocal = true;
		}
		return esVocal;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame un carácter de la <<a>> a la <<z>>: ");
		String caracter = t.next();
		
		System.out.println("¿Es tu carácter una vocal? " + esVocal(caracter));
		
		t.close();
	}
}