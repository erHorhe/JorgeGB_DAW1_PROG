package Tarea6;

import java.util.Scanner;

public class Ejercicio6_5 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.println("Dame el valor del radio de tu parcela: ");
		double radio = t.nextDouble();
		
		double numPI = 3.14;
		double diametro = radio*2;
		double perimetro = 2*numPI*radio;
		double area = numPI*Math.pow(radio, 2);
		
		System.out.println("Tu parcela mide:"
				+ "\n" + diametro + " de diámetro." + "\n"
				+ perimetro + " de perímetro." + "\n"
				+ area + " de área.");
		t.close();
	}
}