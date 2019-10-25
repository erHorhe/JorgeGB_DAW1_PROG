/*Escribe un programa que diga si un n�mero introducido por teclado es o no capic�a.
 *Los n�meros capic�a se leen igual hacia delante y hacia atr�s.
 *El programa debe aceptar n�meros de cualquier longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se dar� por bueno.
 *Se recomienda usar long en lugar de int ya que el primero admite n�meros m�s largos.

  NOTA: No puedo utilizar funciones de cadenas.

*/
package entregableUD2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		short numAuxiliar, inverso=0, cifra;
		
		System.out.print("Dame un n�mero: ");
		long num = t.nextLong();
		
		numAuxiliar = (short) num;
		
		while (numAuxiliar != 0) {
			
			cifra = (short) (numAuxiliar % 10);
			inverso = (short) ((inverso*10) + cifra);
			numAuxiliar /= 10;
		}
		
		if (num == inverso) {
			
			System.out.println(num + " es un n�mero capic�a.");
		
		} else {
			
			System.out.println(num + " no es un n�mero capic�a.");
			
		}
		
		t.close();
	}
}