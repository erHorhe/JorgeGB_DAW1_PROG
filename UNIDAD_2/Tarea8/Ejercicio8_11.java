package Tarea8;

public class Ejercicio8_11 {

	public static void main(String[] args) {
		
		for (int i=1 ; i<11 ; i++) {
			System.out.println("Tabla de multiplicar de " + i + ":");
			for (int j=1 ; j<11 ; j++) {
				System.out.println(i*j);
			}
			System.out.println(""); //Salto de línea
		}
	}
}