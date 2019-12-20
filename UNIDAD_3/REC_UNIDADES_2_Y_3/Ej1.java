/*
Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los nombres de los países se deben mostrar utilizando el array de 
países (no se pueden escribir directamente).
Ejemplo:
                                                     MED MIN MAX
   España: 178 165 148 185 155 141 165 149 155 201 | 164 141 201
    Rusia: 179 189 208 167 186 174 152 192 173 179 | 179 152 179
    Japón: 173 182 168 170 181 197 146 168 166 177 | 172 146 177
Australia: 172 170 187 186 197 143 190 199 187 191 | 182 143 191
*/
package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Ej1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		String paises[] = new String[4];
		paises[0] = "España";
		paises[1] = "Rusia";
		paises[2] = "Japón";
		paises[3] = "Australia";
		
		int columnas = 10;
		int filas = 4;
		int estaturas[][] = new int[columnas][filas];
		for(int i=0 ; i<columnas ; i++) {
			
			System.out.print(paises[0] + ": ");
			for(int j=0 ; j<filas ; j++) {
				
				estaturas[i][j] = r.nextInt(210-140)+140;
				
				System.out.print(estaturas[i][j] + " | ");
			}
		}
	}
}
