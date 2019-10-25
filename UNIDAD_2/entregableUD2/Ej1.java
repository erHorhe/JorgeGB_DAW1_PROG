/*Calcula la nota de un trimestre de la asignatura Programaci�n.
 *El programa pedir� las tres notas que ha sacado el alumno en los tres primeros controles.
 *Si la media de los dos controles da un n�mero mayor o igual a 5, el alumno est� aprobado y se mostrar� la media y la nota correspondiente.
 *Atendiendo a esa media el alumno tendr� las siguientes notas:
 *
 *	�Suficiente si la media en mayor o igual que 5 y menor que 6.
 *	�Bien si la media es mayor o igual que 6 y menor que 7.
 *	�Notable si la media es mayor o igual que 7 y menor que 9.
 *	�Sobresaliente en culaquier otro caso.
 *
 *En caso de que la media sea un n�mero menor que 5,...
 *...el alumno habr� tenido que hacer el examen de recuperaci�n que se califica como apto o no apto,...
 *...por tanto se debe preguntar al usuario "�cu�l ha sido el resultado de la recuperaci�n?" (apto/no apto).
 *Si el resultado de la recuperaci�n es apto, la nota ser� un 5; en caso contrario, se mantienela nota media anterior.
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
			
			System.out.print("�Cu�l ha sido el resultado de la recuperaci�n? (apto/no apto)");
			recuperacion = t.nextLine();
			switch(recuperacion) {
			case "apto":
				media = 5;
				System.out.println("Tu nota de Programaci�n es " + media + " - Suficiente");
				break;
			case "no apto":
				System.out.println("Tu nota de Programaci�n es " + media + " - Suspenso");
			}
			
		} else {
			
			System.out.println("Tu nota de Programaci�n es " + media);
		}
		
		t.close();
	}
}