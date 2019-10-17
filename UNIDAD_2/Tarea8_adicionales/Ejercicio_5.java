package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args)  {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame la altura de la pirámide: ");
		int altura = t.nextInt();
		
		System.out.print("¿Carácter con el cual dibujarla? ");
		String caracter = t.next();
		
		for (int i=1 ; i<=altura ; i++) {
			
			for (int j=1 ; j<=altura-i ; j++) {
				System.out.print(" ");
			}
			
			for (int posicionCaracter=1 ; posicionCaracter<=(i*2)-1 ; posicionCaracter++) {
				System.out.print(caracter);
			}
			
			System.out.println(); //Salto de línea
		}
		
		t.close();
	}
}