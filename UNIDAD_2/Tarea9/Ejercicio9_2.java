package Tarea9;

import java.util.Scanner;

public class Ejercicio9_2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Bienvenidos a <<Acierta la contrase�a>>."
				+ "\n"
				+ "Jugador 1, introduce dicha contrase�a: ");
		String passwordJugador1 = t.next();
		
		System.out.println("Jugador 2, introduce la contrase�a que crees que ha introducido Jugador 1. Aqu� tienes unas pistas:"
				+ "\n"
				+ "N�mero de caracteres -> " + passwordJugador1.length()
				+ "\n"
				+ "Primer car�cter -> " + passwordJugador1.charAt(0)
				+ "\n"
				+ "�ltimo car�cter -> " + passwordJugador1.charAt(passwordJugador1.length()-1));
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