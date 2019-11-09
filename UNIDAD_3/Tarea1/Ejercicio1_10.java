package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio1_10 {

	static boolean decirAmigos(int n1, int n2) {
		
		short sumaDivisoresNum1 = 0;
		
		boolean amigo = false;
		
		for (int divisor1=1 ; divisor1<n1 ; divisor1++) {
			if (n1%divisor1 == 0) {
				sumaDivisoresNum1 += divisor1;
			}
		}
		
		if (sumaDivisoresNum1 == n2) {
			amigo = true;
		}
		
		return amigo;
	}
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Primer número: ");
		int num1 = t.nextShort();
		System.out.print("Segundo número: ");
		int num2 = t.nextShort();
		
		System.out.println(decirAmigos(num1, num2));
		
		t.close();
	}

}