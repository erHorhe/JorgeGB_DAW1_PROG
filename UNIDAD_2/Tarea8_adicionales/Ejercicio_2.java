package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int num = t.nextInt();
		
		int numAuxiliar = num-1;
		
		for(int i=0; i<5 ;i++) {
			numAuxiliar++;
			System.out.print(numAuxiliar);

			for(int j=0 ; j<20 ; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<1 ; k++) {
				System.out.print(Math.pow(numAuxiliar, 2));
			}
			
			for(int j=0 ; j<20 ; j++) {
				System.out.print(" ");
			}
			
			for(int l=0 ; l<1 ; l++) {
				System.out.println(Math.pow(numAuxiliar, 3));
			}
		}
		
		t.close();
	}
}