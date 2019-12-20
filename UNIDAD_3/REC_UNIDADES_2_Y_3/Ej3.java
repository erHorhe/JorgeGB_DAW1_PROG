/*
Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
*/
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		String colores[] = new String[9];
		colores[0] = "verde";
		colores[1] = "rojo";
		colores[2] = "azul";
		colores[3] = "amarillo";
		colores[4] = "naranja";
		colores[5] = "rosa";
		colores[6] = "negro";
		colores[7] = "blanco";
		colores[8] = "morado";
		
		String original[] = new String[8];
		System.out.println("Escribe 8 palabras:");
		for(int i=0 ; i<original.length ; i++) {
			original[i] = t.next();
		}
		
		String resultado[] = new String[8];
		for(int r=0 ; r<resultado.length ; r++) {
			
			for(int i=0 ; i<colores.length ; i++) {
			
				for(int j=0 ; j<original.length ; j++) {
				
					if(colores[i].equalsIgnoreCase(original[j])) {
						resultado[r] = colores[i];
						break;
					}
					
				}
			}
		}
		System.out.println(Arrays.toString(resultado));
		
		t.close();
	}
}
