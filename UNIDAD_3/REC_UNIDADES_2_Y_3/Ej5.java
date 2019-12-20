/*
Crea una funci�n con la siguiente cabecera:
public static long trozoDeNumero(long x, int inicio, int fin)
Que toma como par�metros las posiciones inicial y final dentro de un n�mero y devuelve
el trozo de n�mero correspondiente. Las posiciones se cuentan de izquierda a derecha
comenzando por el cero.
Util�zala desde funci�n principal llam�ndola con un par de ejemplos.
*/
package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Escribe un n�mero grande: ");
		long x = t.nextLong();
		t.nextLine();
		System.out.print("Posici�n inicial: ");
		int posInicio = t.nextInt();
		t.nextLine();
		System.out.print("Posici�n final: ");
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
