package actividades;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("1º número: ");
		long num1 = t.nextLong();
		t.nextLine();
		
		System.out.print("2º número: ");
		long num2 = t.nextLong();
		t.nextLine();
		
		System.out.println("Fusión de ambos números -> " + juntaNumeros(num1, num2) + "\n");
		
		long num3 = 909;
		long num4 = 1212;
		System.out.println("Otro ejemplo:"
				+ "\n"
				+ "Aquí tienes otra fusión -> " + juntaNumeros(num3, num4));
		
		
		t.close();
	}
	
	public static long juntaNumeros(long a, long b) {
		
		String num1 = String.valueOf(a);
		String num2 = String.valueOf(b);
		
		String union = num1 + "" + num2;
		
		Integer res = Integer.parseInt(union);
		
		return res;
	}
}