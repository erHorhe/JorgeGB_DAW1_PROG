package Pila;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Pila p = new PilaTabla();
		Integer num;
		
		System.out.print("Introduce un valor para apilar: ");
		num = t.nextInt();
		t.nextLine();
		p.apilar(num);
		
		System.out.print("Introduce un valor para desapilar: ");
		num = t.nextInt();
		t.nextLine();
		p.desapilar(num);
		
		p.mostrarInverso();
		
		t.close();
	}
}
