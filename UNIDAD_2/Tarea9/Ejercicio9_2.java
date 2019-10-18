package Tarea9;

import java.util.Scanner;

public class Ejercicio9_2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Bienvenidos a <<Acierta la contraseña>>."
				+ "\n"
				+ "Jugador 1, introduce dicha contraseña: ");
		String passwordJugador1 = t.next();
		
		System.out.println("Jugador 2, introduce la contraseña que crees que ha introducido Jugador 1. Aquí tienes unas pistas:"
				+ "\n"
				+ "Número de caracteres -> " + passwordJugador1.length()
				+ "\n"
				+ "Primer carácter -> " + passwordJugador1.charAt(0)
				+ "\n"
				+ "Último carácter -> " + passwordJugador1.charAt(passwordJugador1.length()-1));
		String passwordJugador2 = t.next();
		
		while(!passwordJugador1.equals(passwordJugador2)) {
			System.out.println("Fallaste.");
			passwordJugador2 = t.next();
		}
		
		if (passwordJugador1.equals(passwordJugador2)) {
			System.out.println("Acertaste.");
		}
		
		t.close();
	}
}