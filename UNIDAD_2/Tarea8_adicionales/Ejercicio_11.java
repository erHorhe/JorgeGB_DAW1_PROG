package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dime la altura de la <<X>>: ");
		short altura = t.nextShort();
		
		while(altura%2==0 || altura<3) {
			System.out.print("Altura no permitida: ");
			altura = t.nextShort();
		}
		
		for (int i=1 ; i<=altura ; i++) {
			
			for (int j=1 ; j<=altura ; j++) {
				
				if (i == j || j == (altura-i)+1) {
					
					System.out.print("*");
				
				} else {
					
					System.out.print(" ");
				}
			}
			
			System.out.println();//Salto de línea
		}
		
		t.close();
	}
}