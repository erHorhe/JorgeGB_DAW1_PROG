package actividades;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Escribe un número <<n>>: ");
		int numN = t.nextInt();
		t.nextLine();
		
		System.out.println(convierteEnMorse(numN));
		
		t.close();
	}
	
	public static String convierteEnMorse(int n) {
		
		String codMorse = "";
		String num = String.valueOf(n);
		
		for (int i=0 ; i<num.length() ; i++) {
			
			//Dependiendo de cada cifra de nuestro número <<n>>:
			switch(num.charAt(i)) {
			case '1':
				codMorse += "· _ _ _ _";
				break;
			case '2':
				codMorse += "· · _ _ _";
				break;
			case '3':
				codMorse += "· · · _ _";
			case '4':
				codMorse += "· · · · _";
				break;
			case '5':
				codMorse += "· · · · ·";
				break;
			case '6':
				codMorse += "_ · · · ·";
				break;
			case '7':
				codMorse += "_ _ · · ·";
				break;
			case '8':
				codMorse += "_ _ _ · ·";
				break;
			case '9':
				codMorse += "_ _ _ _ ·";
				break;
			default:
				codMorse += "_ _ _ _ _";
			}
		}
		
		return codMorse;
	}
}