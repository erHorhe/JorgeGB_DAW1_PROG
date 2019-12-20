/*
Una empresa de carteler�a nos ha encargado un programa para realizar uno de
sus dise�os. Debido a los acontecimientos que han tenido lugar en Catalu�a
durante el 2018, han recibido muchos pedidos del cartel que muestra el n�mero
155. Realiza un programa que pinte el n�mero 155 mediante asteriscos. Al
usuario se le pedir�n dos datos, la altura del cartel y el n�mero de espacios
que habr� entre los n�meros. La altura m�nima es 5. La anchura de los n�meros
siempre es la misma. La parte superior de los cincos tambi�n es siempre igual.
La parte inferior del 5 s� que var�a en funci�n de la altura.

Ejemplo 1:
Introduzca la altura (5 como m�nimo): 5 Introduzca el n�mero de
espacios entre los n�meros (1 como m�nimo): 2
* **** ****
* *    *
* **** ****
*    *    *
* **** ****
Ejemplo 2:
Introduzca la altura (5 como m�nimo): 7 Introduzca el n�mero de
espacios entre los n�meros (1 como m�nimo): 3
* **** ****
* *    *
* **** ****
*    *    *
*    *    *
*    *    *
* **** ****
Ejemplo 3:
Introduzca la altura (5 como m�nimo): 6 Introduzca el n�mero de
espacios entre los n�meros (1 como m�nimo): 1
* **** ****
* *    *
* **** ****
*    *    *
*    *    *
* **** ****
*/
package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		int anchura = 11;
		
		System.out.println("Introduzca la altura (5 como m�nimo): ");
		int altura = t.nextInt();
		System.out.println("Introduzca el n�mero de espacios entre los n�meros: ");
		int numEspacios = t.nextInt();
		
		for(int i=0 ; i<altura ; i++) {
			
			for(int j=0 ; j<anchura ; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		t.close();
	}
}
