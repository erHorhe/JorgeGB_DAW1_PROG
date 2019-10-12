package Tarea8;

import java.util.Scanner;

public class Ejercicio8_3 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		int numAleat = (int) (Math.random()*101);
		
		System.out.println("Intenta adivinar el número oculto:");
		short miNum = t.nextShort();
		
		do {
			if (miNum > numAleat) {
				System.out.println("Mayor. Inténtalo otra vez:");
			} else if (miNum < numAleat) {
				System.out.println("Menor. Inténtalo de nuevo:");
			}
			miNum = t.nextShort();
		} while ((miNum != -1) && (miNum != numAleat));
		
		if (miNum == -1) {
			System.out.println("Pero no te rindas, macho...");
		} else if (miNum == numAleat) {
			System.out.println("¡LO ACERTASTE, ENHORABUENA!");
		}
		t.close();
	}
}