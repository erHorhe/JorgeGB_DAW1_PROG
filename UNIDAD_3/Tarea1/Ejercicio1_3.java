package Tarea1;

import java.util.Scanner;

public class Ejercicio1_3 {

	static double calcularVolumen(double r, double h) {
		
		double volumen = Math.PI*Math.pow(r, 2)*h;
		
		return volumen;
		
	}
	
	static double calcularArea(double r) {
		
		double areaTotal = (2*Math.PI) + (2*Math.PI*Math.pow(r, 2));
		
		return areaTotal;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		double radioA;
		double radioV;
		double altura;
		
		System.out.print("¿Calcular volumen o área (v/a)? ");
		String respuesta = t.next();
		t.nextLine();
		
		if (respuesta.equals("v")) {
			
			System.out.print("Radio del cilindro -> ");
			radioV = t.nextDouble();
			System.out.print("Altura -> ");
			altura = t.nextDouble();
			System.out.println(calcularVolumen(radioV, altura));
			
		} else if (respuesta.equals("a")){
			
			System.out.print("Radio del cilindro -> ");
			radioA = t.nextDouble();
			System.out.println(calcularArea(radioA));
		}
		
		t.close();
	}
}