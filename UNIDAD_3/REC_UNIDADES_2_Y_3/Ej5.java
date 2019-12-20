/*
Crea una función con la siguiente cabecera:
public static long trozoDeNumero(long x, int inicio, int fin)
Que toma como parámetros las posiciones inicial y final dentro de un número y devuelve
el trozo de número correspondiente. Las posiciones se cuentan de izquierda a derecha
comenzando por el cero.
Utilízala desde función principal llamándola con un par de ejemplos.
*/
package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Escribe un número grande: ");
		long x = t.nextLong();
		t.nextLine();
		System.out.print("Posición inicial: ");
		int posInicio = t.nextInt();
		t.nextLine();
		System.out.print("Posición final: ");
		int posFinal = t.nextInt();
		t.nextLine();
		
		t.close();
		
		System.out.println(trozoDeNumero(x, posInicio, posFinal));
	}

	public static long trozoDeNumero(long x, int inicio, int fin) {
		if(x < 10) {
			return x;
		} else {
			
		}
		return 0;
	}
}
