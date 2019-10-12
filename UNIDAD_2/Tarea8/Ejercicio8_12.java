package Tarea8;

import java.util.Scanner;

public class Ejercicio8_12 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		boolean suspenso = false;
		short contadorSuspensos = 0;
		System.out.println("¿Qué notas han sacado los alumnos?");
		for (int i=0 ; i<5 ; i++) {
			short nota = t.nextShort();
			if(nota <= 4) {
				suspenso = true;
				contadorSuspensos++;
			}
		}
		System.out.println("¿Ha habido algún suspenso? " + suspenso
				+ "\n"
				+ "Hay " + contadorSuspensos + " suspenso/s.");
		t.close();
	}
}