package Pila;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		PilaLista pl = new PilaLista();
		Integer num;
		
		System.out.print("Elemento a apilar: ");
		num = t.nextInt();
		pl.apilar(num);
		
		System.out.print("Elemento a desapilar: ");
		num = t.nextInt();
		pl.desapilar(num);
		
		pl.mostrarInverso();
		
		t.close();
	}
}
