package Tarea8;

import java.util.Scanner;

public class Ejercicio8_1 {

	/*System.out.print(num + " es un número impar."
	+ "\n" + "Para salir, escriba un 0: ");
num = t.nextInt();*/
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.print("Escribe un número entero: ");
		int num = t.nextInt();
		while(num != 0) {
			if (num%2==0 && num>0) {
				System.out.print(num + " es un número par positivo."
						+ "\n" + "Para salir, escriba un 0: ");
				num = t.nextInt();
			} else if(num%2==0 && num<0){
				System.out.println(num + " es un número par negativo."
						+ "\n" + "Para salir, escriba un 0: ");
				num = t.nextInt();
			} else if(num%2!=0 && num>0) {
				System.out.println(num + " es un número impar positivo."
						+ "\n" + "Para salir, escriba un 0: ");
				num = t.nextInt();
			} else {
				System.out.println(num + " es un número impar negativo."
						+ "\n" + "Para salir, escriba un 0: ");
				num = t.nextInt();
			}
		}
		if (num==0) {
			System.out.println("FIN DEL PROGRAMA.");
		}
		t.close();
	}
}