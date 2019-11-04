package EXAMEN_UNIDAD_2;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Introduce la altura de altura: ");
		short altura = t.nextShort();
		
		while (altura%2==0 || altura<5) {
			System.out.print("La altura introducida no es correcta.");
			altura = t.nextShort();
		}
		
		for (int i=0 ; i<altura ; i++) {
			
			for (int j=0 ; j<altura+1 ; j++) {
				
				if ((i<(altura-1)/2) &&
						(i!=0) &&
						(j!=0) &&
						(j!=altura) &&
						(i!=(altura-1)) &&
						(j>=1 || j<=altura-1)) {
					
					System.out.print(" ");
					
				} else {
					
					System.out.print("M");
				}
			}
			
			System.out.println();
		}
		
		t.close();
	}
}