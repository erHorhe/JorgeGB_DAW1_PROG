package EXAMEN_UNIDAD_2;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame un número entero: ");
		int num = t.nextInt();
	
		System.out.print("Posición en la que lo partiremos: ");
		short posicion = t.nextShort();
		
		for (int i=2 ; i<=posicion ; i++) {
			
			
		}
		
		System.out.println();
		
		t.close();
	}
}