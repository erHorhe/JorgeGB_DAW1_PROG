package Tarea6;

import java.util.Scanner;

public class Ejercicio6_4 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		byte menor;
		System.out.print("Dame un primer n�mero: ");
		byte num1 = t.nextByte();
		System.out.print("Ahora dame el segundo: ");
		byte num2 = t.nextByte();
		//Con "if":
		if (num1<num2) {
			menor = num1;
		} else {
			menor = num2;
		}
		System.out.println("El n�mero m�s peque�o (if) es " + menor);
	
		//Con "switch":
		menor = (num1<num2)? num1:num2;
		System.out.println("El n�mero m�s peque�o (switch) es " + menor);
		t.close();
	}

}