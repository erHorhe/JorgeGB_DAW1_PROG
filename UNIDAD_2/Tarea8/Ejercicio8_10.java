package Tarea8;

import java.util.Scanner;

public class Ejercicio8_10 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		short num = t.nextShort();
		
		while(num<1 || num>10) {
			System.out.print("No está dentro del rango requerido. Otra vez: ");
			num = t.nextShort();
		}
		
		for (int i=1 ; i<11 ; i++) {
			System.out.println(i*num);
		}
		t.close();
	}
}