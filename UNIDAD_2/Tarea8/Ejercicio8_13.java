package Tarea8;

import java.util.Scanner;

public class Ejercicio8_13 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		short notaAprobada = 0;
		short notaSuspensa = 0;
		short notaCondicionada = 0;
		
		System.out.println("Dime las notas de nuestros seis alumnos:");
		for (int i=0 ; i<6 ; i++) {
			short nota = t.nextShort();
			if (nota >= 5) {
				notaAprobada++;
			} else if (nota == 4) {
				notaCondicionada++;
			} else {
				notaSuspensa++;
			}
		}
		System.out.println("Aprobados: " + notaAprobada
				+ "\n" + "Condicionados: " + notaCondicionada
				+ "\n" + "Suspensos: " + notaSuspensa);
		t.close();
	}
}