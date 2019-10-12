package Tarea8;

public class Ejercicio8_7 {

	public static void main(String[] args) {
		
		//Llegará hasta 10, que será cuando detenga el bucle que usaremos:
		short contador = 0;
		
		//Multiplicaremos su valor por el número impar con el que nos encontraremos.
		/*
		 * producto = producto*1
		 * producto(1) = producto*3
		 * producto(3) = producto*5
		 * ...
		*/
		int producto = 1;
		
		for (int i=1 ; contador<10; i++) {
			contador++;
			if (i%2 != 0) {
				producto = producto*i;
			}
		}
		System.out.println(producto);
	}
}