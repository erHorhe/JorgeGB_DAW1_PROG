package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("¿Altura de la pirámide? ");
		int alturaPiramide = t.nextInt();
		System.out.print("¿Y el carácter a utilizar? ");
		String caracter = t.next();
		
		int alt=1;
		int i=0;
		int espacio1 = alturaPiramide-1;
		int espacio2=0;

		while (alt<alturaPiramide) {
			
			for (i=1 ; i<=espacio1 ; i++) {
				System.out.print(" ");
			}
			
			System.out.print(caracter);
			
			for (i=1 ; i<espacio2 ; i++) {
				System.out.print(" ");
			}
		
		if (alt>1) {
			System.out.print(caracter);
		}
		
		System.out.println(); //Salto de línea
		alt++;
		espacio1--;
		espacio2+= 2;
		
		}
		
		for (i=1 ; i<alt*2 ; i++) {
			System.out.print(caracter);
		}
		
		t.close();
	}
}