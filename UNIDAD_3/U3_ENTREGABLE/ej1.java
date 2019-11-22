package U3_ENTREGABLE;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
		short numPersonas = t.nextShort();
		t.nextLine();
		
		while(numPersonas > 4) {
			
			System.out.print("Lo siento, no admitimos grupos de " + numPersonas + ", haga grupos de 4 personas como máximo e intente de nuevo: ");
			numPersonas = t.nextShort();
			t.nextLine();
		}
		
		//ARRAY DEL MÁXIMO DE OCUPANTES POR CADA MESA:
		short ocupacion[] = new short[10];
		for (int i=1 ; i<=ocupacion.length ; i++) {
			
			ocupacion[i] = (short) (Math.random()*4);
		}
		
		for (int i=1 ; i<=ocupacion.length ; i++) {
			
			for (int j=1 ; j<=ocupacion.length ; j++) {
				
				
			}
		}
		
		if (numPersonas == -1) {
			
			System.out.println("Gracias. Hasta pronto.");
		}
		
		t.close();
	}
}