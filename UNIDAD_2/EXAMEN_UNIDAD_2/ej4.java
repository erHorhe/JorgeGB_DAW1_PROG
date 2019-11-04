package EXAMEN_UNIDAD_2;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Escribe números enteros (sal introduciendo uno primo): ");
		short num = t.nextShort();
		
		short contadorNoPrimos = 0;
		
		do {
			if (num!=2 || num!=3 || num!=5 || (num%2==0 && num%3==0)) {
				contadorNoPrimos++;
			}
			num = t.nextShort();
			
		} while (num!=2 || num!=3 || num!=5 || (num%2!=0 && num%3!=0 && num%5!=0));

		System.out.println("Ha introducido " + contadorNoPrimos + " números no primos.");
		
		t.close();
	}
}