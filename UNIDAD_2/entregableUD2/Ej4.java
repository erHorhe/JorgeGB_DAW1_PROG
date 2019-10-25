/*Crear programa que pinte una flecha doble hacia la izquierda.
 *Se pide al usuario la altura de la figura, que debe ser un número impar mayor o igual que 3.
 *La distancia entre cada flecha de asteriscos es siempre de 5 espacios.
 *Si la altura introducida por el usuario no es un número impar mayor o igual que 3, el programa debe mostrar un mensaje de error.
*/
package entregableUD2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("¿Cuánto mide de alto la flecha? ");
		short altura = t.nextShort();
		
		while (altura%2==0 || altura<3) {
			
			System.out.print("Número no válido. Escribe otra vez: ");
			altura = t.nextShort();
			
		}
		
		for (int i=0 ; i<altura ; i++) {
			
			for (int espacioExterno=0 ; espacioExterno<5 ; espacioExterno++) {
			
				System.out.print(" ");
			}
			
			for (int x=5 ; x<12 ; x++) {
			
				if (x==5 || x==11) {
				
					System.out.print("*");
			
				} else {
				
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		t.close();
	}
}