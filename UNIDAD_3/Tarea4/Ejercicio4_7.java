package UNIDAD_3;

import java.util.Scanner;

public class Ejercicio4_7 {
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		final short NOTA = 5;
		short sumaNota1 = 0;
		short sumaNota2 = 0;
		short sumaNota3 = 0;
		float expedienteAlumnos1[] = new float[NOTA];
		float expedienteAlumnos2[] = new float[NOTA];
		float expedienteAlumnos3[] = new float[NOTA];
		
		System.out.print("�Alumno del cual se sacar� su media en cada trimestre (posici�n)? ");
		short posicion = t.nextShort();
		t.nextLine();
		
		System.out.println("Notas de los alumnos en el primer trimestre:");
		for (int i=0 ; i<expedienteAlumnos1.length ; i++) {
			
			System.out.print("Alumno n�" + (i+1) + ": ");
			expedienteAlumnos1[i] = t.nextFloat();
			t.nextLine();
			sumaNota1 += expedienteAlumnos1[i];
		}
		float mediaAlumno1 = expedienteAlumnos1[posicion]/NOTA;
		
		System.out.println("\n" + "Notas de los alumnos en el segundo trimestre:");
		for (int i=0 ; i<expedienteAlumnos2.length ; i++) {
			
			System.out.print("Alumno n�" + (i+1) + ": ");
			expedienteAlumnos2[i] = t.nextFloat();
			t.nextLine();
			sumaNota2 += expedienteAlumnos2[i];
		}
		float mediaAlumno2 = expedienteAlumnos2[posicion]/NOTA;
		
		System.out.println("\n" + "Notas de los alumnos en el tercer trimestre:");
		for (int i=0 ; i<expedienteAlumnos3.length ; i++) {
			
			System.out.print("Alumno n�" + (i+1) + ": ");
			expedienteAlumnos3[i] = t.nextFloat();
			t.nextLine();
			sumaNota3 += expedienteAlumnos3[i];
		}
		float mediaAlumno3 = expedienteAlumnos3[posicion]/NOTA;
		
		float media1 = sumaNota1/NOTA;
		float media2 = sumaNota2/NOTA;
		float media3 = sumaNota3/NOTA;
		
		System.out.println("\n" + "Media del 1� trimestre -> " + media1
				+ "\n"
				+ "Media del 2� trimestre -> " + media2
				+ "\n"
				+ "Media del 3� trimestre -> " + media3);
		System.out.println("Media del alumno seleccionado en el 1� trimestre -> " + mediaAlumno1
				+ "\n"
				+ "Media del alumno seleccionado en el 2� trimestre -> " + mediaAlumno2
				+ "\n"
				+ "Media del alumno seleccionado en el 3� trimestre -> " + mediaAlumno3);
		
		t.close();
	}
}