package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Usuario, ¿cuántos números deseas introducir? ");
		short cantidadNum = t.nextShort();
		t.nextLine();
		
		float listaNums[] = new float[cantidadNum];
		
		System.out.println("Ahora escribe " + cantidadNum + " números:");
		for (int i=0 ; i<listaNums.length ; i++) {
			
			listaNums[i] = t.nextFloat();
		}
		
		for (int j=listaNums.length-1 ; j>=0 ; j--) {
			
			System.out.print("[" + listaNums[j] + "] ");
		}
		
		t.close();
	}
}