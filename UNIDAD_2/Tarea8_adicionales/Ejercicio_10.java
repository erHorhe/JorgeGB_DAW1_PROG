package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dime la altura de la <<U>>: ");
		byte altura = t.nextByte();
		
		for (int i=0 ; i<(altura-1) ; i++) {
			
			System.out.print("*");
			
			for (int j=0 ; j<2 ; j++) {
				System.out.print(" ");
			}
			
			for (int espacio=0 ; espacio<1 ; espacio++) {
				System.out.print("*");
			}
			
			System.out.println(); //Salto de línea
		}
		
		for (int i=0 ; i<1 ; i++) {
			System.out.print(" ");
			
			for (int j=0 ; j<2 ; j++) {
				System.out.print("*");
			}
		}
		
		t.close();
	}
}