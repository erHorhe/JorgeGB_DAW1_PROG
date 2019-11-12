package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio4_1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		float listaNums[] = new float[5];
		
		System.out.println("Dame cinco números decimales:");
		for (int i=0 ; i<listaNums.length ; i++) {
			
			listaNums[i] = t.nextFloat();
		}
		
		for (int j=0 ; j<listaNums.length ; j++) {
			
			System.out.print("[" + listaNums[j] + "]");
		}
		
		t.close();
	}
}