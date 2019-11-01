package Tarea1;

import java.util.Scanner;

public class Ejercicio1_11 {

	static float calcularIterativa(float a, int n) {
		
		float resultadoIterativa = 1;
		if (n == 0) {
			resultadoIterativa = 1;
		} else {
			for (int i=1 ; i<=n ; i++) {
				resultadoIterativa *= a;
			}
		}
		
		return resultadoIterativa;
	}

	static float calcularRecursiva(float a, int n) {
		
		float resultadoRecursiva;
		//Caso base, que permite salir de la recursividad:
		if (n == 0) {
			resultadoRecursiva = 1;		
		} else {
			//Llamada recursiva:
			resultadoRecursiva = a*calcularRecursiva(a, n-1);
		}
		
		return resultadoRecursiva;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Número real: ");
		float a = t.nextFloat();
		System.out.print("Número entero no negativo: ");
		int n = t.nextInt();
		
		System.out.println("Resultado de función iterativa: " + calcularIterativa(a, n));
		System.out.println("Resultado de función recursiva: " + calcularRecursiva(a, n));
		
		t.close();
	}
}