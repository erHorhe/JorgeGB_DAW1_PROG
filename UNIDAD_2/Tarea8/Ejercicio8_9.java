package Tarea8;

import java.util.Scanner;

public class Ejercicio8_9 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce la altura de cada árbol (salir con -1):");
		byte altura;
		short contador = 0;
		byte mayor = 0;
		do {
			altura = t.nextByte();
			contador++;
			for (int i=0 ; i<contador ; i++) {
				if (altura > mayor) {
					mayor = altura;
				}
			}
			
		} while(altura != -1);
		
		System.out.println("El árbol más alto es el de " + mayor + " centímetros.");
		t.close();
	}
}