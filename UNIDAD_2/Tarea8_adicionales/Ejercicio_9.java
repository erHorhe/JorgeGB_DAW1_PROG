package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame la altura de la <<L>>: ");
		int altura = t.nextInt();
		
		for (int columna=0 ; columna<(altura-1) ; columna++) {
			System.out.println("*");
		}
		
		int paloL = (altura/2)+1;
		for (int i=0 ; i<paloL ; i++) {
			System.out.print("*");
		}
		
		t.close();
	}
}