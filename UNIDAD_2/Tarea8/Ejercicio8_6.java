package Tarea8;

public class Ejercicio8_6 {

	public static void main(String[] args) {
		
		int numDeSuma = 7;
		System.out.println("Múltiplos de 7 hasta 100:" + "\n");
		for (int i=7 ; i<100 && i%7==0 ; i+=numDeSuma) {
			/*
			 * 	i(7) = i+7
				i(14) = 14+7
				i(21) = 21+7
				...
			*/
			System.out.println(i);
		}
	}
}