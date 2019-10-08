package Tarea4;

import java.util.Scanner;

public class Ejercicio4_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Primera nota: ");
        int nota1 = teclado.nextInt();
        System.out.print("Segunda nota: ");
        int nota2 = teclado.nextInt();
        System.out.print("Tercera nota: ");
        int nota3 = teclado.nextInt();
        int media = (nota1+nota2+nota3)/3;
        System.out.println("La media de ambas notas es igual a " + media);
        teclado.close();
    }
}
