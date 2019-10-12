package Tarea8;

import java.util.Scanner;

public class Ejercicio8_5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.print("Valor m�ximo de un rango: ");
		int valorMax = t.nextInt();
		System.out.print("Valor m�nimo de un rango: ");
		int valorMin = t.nextInt();
		System.out.println("Ahora escribe un valor que est� en ese rango:");
		int valorUsuario = t.nextInt();
		
		do {
			if (valorUsuario<valorMin || valorUsuario>valorMax) {
				System.out.println("Fuera de rango. Int�ntalo otra vez:");
			}
			valorUsuario = t.nextInt();
		} while (valorUsuario<valorMin || valorUsuario>valorMax);
		
		if (valorUsuario>valorMin && valorUsuario<valorMax) {
			System.out.println(valorUsuario + " est� dentro del rango.");
		}
		t.close();
	}
}