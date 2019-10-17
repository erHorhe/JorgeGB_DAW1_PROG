package Tarea8_adicionales;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Random r = new Random();
		
		short contador = 0;
		int min = 1000;
		int max = 9999;
		int randomPassword = r.nextInt(max-min)+min;
		
		System.out.print("Introduce la contraseña de la caja fuerte: ");
		int myPassword = t.nextInt();
		
		while (myPassword != randomPassword && contador<3) {
			System.out.print("Lo siento, esa no es la combinación: ");
			myPassword = t.nextInt();
			contador++;
		}
		contador++;
	
		if (myPassword == randomPassword) {
			System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
		} else if (contador == 4) {
			System.out.println("Intentos agotados.");
		}
		t.close();
	}
}