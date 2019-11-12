package UNIDAD_3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_4 {
	
	static short[] generarPassword(short claveSecreta[]) {
		
		final short NUM_MAX = 5;
		
		for (int i=0 ; i<claveSecreta.length ; i++) {
			claveSecreta[i] = (short)((Math.random()*NUM_MAX)+1);
		}
		
		return claveSecreta;
	}
	
	static String darPistas(short miClave[], short claveSecreta[], short posicion) {
		
		String respuesta = null;
				
			if (miClave[posicion] > claveSecreta[posicion]) {
					
				respuesta = "Te has pasado.";
			} else if (miClave[posicion] < claveSecreta[posicion]) {
					
				respuesta = "Te has quedado corto.";
			} else {
				
				respuesta = "Es igual.";
			}
		
		return respuesta;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Introduce longitud de la clave: ");
		short longitudClave = t.nextShort();
		t.nextLine();
		
		short claveSecreta[] = new short[longitudClave]; 
		short miClave[] = new short[longitudClave];
		
		generarPassword(claveSecreta);
		System.out.println(Arrays.toString(claveSecreta));
		System.out.println("CLAVE SECRETA GENERADA..." + "\n");
		
		
		System.out.println("Intente acertarla:");

		for (int i_miClave=0 ; i_miClave<miClave.length ; i_miClave++) {
			
			miClave[i_miClave] = t.nextShort();
			System.out.println(darPistas(miClave, claveSecreta, (short) i_miClave));
		}
		
		while (!Arrays.equals(miClave, claveSecreta)) {
			System.out.print("Inténtalo de nuevo: ");
			for (int i_miClave=0 ; i_miClave<miClave.length ; i_miClave++) {
				
				miClave[i_miClave] = t.nextShort();
				t.nextLine();
				System.out.println(darPistas(miClave, claveSecreta, (short) i_miClave));
			}
		}
		
		if (Arrays.equals(miClave, claveSecreta)) {
		
			System.out.println("¡Has abierto la cámara!");
		}
		
		t.close();
		
	}
}