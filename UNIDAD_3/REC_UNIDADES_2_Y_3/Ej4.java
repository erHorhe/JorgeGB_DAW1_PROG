/*
Implementa una funci�n con nombre nEsimo que busque el n�mero que hay
dentro de un array bidimensional en la posici�n n-�sima contando de izquierda
a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
es el 0. Si la posici�n donde se busca no existe en el array, la funci�n debe
devolver -1. Se debe entregar tanto el c�digo de la funci�n como el c�digo de
prueba que la usa. La cabecera de la funci�n es la siguiente:
public static int nEsimo(int[][] n, int posicion)
Si el array a es el que se muestra a continuaci�n:
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48
12 34 56 78 90 12
nEsimo(a, 0) devuelve 35
nEsimo(a, 2) devuelve 24
nEsimo(a, 5) devuelve 60
nEsimo(a, 6) devuelve 32
nEsimo(a, 21) devuelve 78
nEsimo(a, 23) devuelve 12
nEsimo(a, 24) devuelve -1
nEsimo(a, 100) devuelve -1
*/
package ejercicios;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		
		
	}
	
	public static int nEsimo(int[][] n, int posicion) {
		
		int busqueda = Arrays.binarySearch(n, posicion);
		
		return 0;
	}
}
