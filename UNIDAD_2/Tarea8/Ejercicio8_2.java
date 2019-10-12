package Tarea8;

import java.util.Scanner;

public class Ejercicio8_2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		short edad = 0;
		short sumaEdades = 0;
		short contadorEdadEscrita = 0;
		short contadorMayoresDeEdad = 0;
		
		System.out.println("Introduce la edad de cada alumno del centro:");
		
		do {
			edad = t.nextShort();
			sumaEdades += edad;
			contadorEdadEscrita++;
			if (edad >= 18) {
				contadorMayoresDeEdad++;
			}
		} while (edad >= 0);
		
		System.out.println("Suma de las edades = " + sumaEdades + "\n"
		+ "Media de las edades = " + Math.round(sumaEdades/contadorEdadEscrita) + "\n"
		+ "Edades escritas: " + (contadorEdadEscrita-1) + "\n"
		+ "Alumnos mayores de edad: " + contadorMayoresDeEdad);
		t.close();
	}
}