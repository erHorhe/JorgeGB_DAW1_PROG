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
		
		System.out.print("N�mero real: ");
		float a = t.nextFloat();
		System.out.print("N�mero entero no negativo: ");
		int n = t.nextInt();
		
		System.out.println("Resultado de funci�n iterativa: " + calcularIterativa(a, n));
		System.out.println("Resultado de funci�n recursiva: " + calcularRecursiva(a, n));
		
		t.close();
	}
}