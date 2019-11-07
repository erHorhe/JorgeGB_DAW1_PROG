package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio1_5 {

	static short decirNumMayor(short n1, short n2) {
		
		short resultadoMayor = 0;
		if (n1 > n2) {
			
			resultadoMayor = n1;
		
		} else if (n2>n1) {
			
			resultadoMayor = n2;
			
		}
		
		return resultadoMayor;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Primer número: ");
		short num1 = t.nextShort();
		System.out.print("Segundo número: ");
		short num2 = t.nextShort();
		System.out.print("Tercer número: ");
		short num3 = t.nextShort();
		
		short numMayor = decirNumMayor(num1,num2);
		
		System.out.println(decirNumMayor(numMayor, num3) + " es el mayor número.");
		
		t.close();
	}
}
