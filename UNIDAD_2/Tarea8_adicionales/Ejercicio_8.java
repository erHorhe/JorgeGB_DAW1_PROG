package Tarea8_adicionales;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("D�a <<1>> de la semana (n�mero del 1 al 7): ");
		short diaSemana1 = t.nextShort();
		while(diaSemana1 < 0 || diaSemana1 > 7) {
			System.out.print("D�a de la semana no v�lido: ");
			diaSemana1 = t.nextShort();
		}
		
		System.out.print("D�a <<2>> de la semana (n�mero del 1 al 7): ");
		short diaSemana2 = t.nextShort();
		while(diaSemana2 < 0 || diaSemana2 > 7) {
			System.out.print("D�a de la semana no v�lido: ");
			diaSemana2 = t.nextShort();
		}
		
		short diferencia = 0;
		
		if (diaSemana1 - diaSemana2 < 0) {
			diferencia = (short) (diaSemana2-diaSemana1);
		}
		
		System.out.println("Entre el d�a <<"+diaSemana1+">> y el d�a <<"+diaSemana2+">> hay " + (diferencia*24) + " horas.");
		
		t.close();
	}
}