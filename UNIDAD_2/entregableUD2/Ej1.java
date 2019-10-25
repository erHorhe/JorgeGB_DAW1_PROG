/*Calcula la nota de un trimestre de la asignatura Programación.
 *El programa pedirá las tres notas que ha sacado el alumno en los tres primeros controles.
 *Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media y la nota correspondiente.
 *Atendiendo a esa media el alumno tendrá las siguientes notas:
 *
 *	·Suficiente si la media en mayor o igual que 5 y menor que 6.
 *	·Bien si la media es mayor o igual que 6 y menor que 7.
 *	·Notable si la media es mayor o igual que 7 y menor que 9.
 *	·Sobresaliente en culaquier otro caso.
 *
 *En caso de que la media sea un número menor que 5,...
 *...el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto,...
 *...por tanto se debe preguntar al usuario "¿cuál ha sido el resultado de la recuperación?" (apto/no apto).
 *Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantienela nota media anterior.
*/
package entregableUD2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Nota del primer control: ");
		short nota1 = t.nextShort();
		t.nextLine();
		
		System.out.print("Nota del segundo control: ");
		short nota2 = t.nextShort();
		t.nextLine();
		
		float media = (float)(nota1+nota2)/2;
		String recuperacion;
		
		if (media < 5) {
			
			System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
			recuperacion = t.nextLine();
			switch(recuperacion) {
			case "apto":
				media = 5;
				System.out.println("Tu nota de Programación es " + media + " - Suficiente");
				break;
			case "no apto":
				System.out.println("Tu nota de Programación es " + media + " - Suspenso");
			}
			
		} else {
			
			System.out.println("Tu nota de Programación es " + media);
		}
		
		t.close();
	}
}