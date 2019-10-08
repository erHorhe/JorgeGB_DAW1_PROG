package Tarea4;

import java.util.Scanner;

public class Ejercicio4_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Primera nota: ");
        int nota1 = teclado.nextInt();
        System.out.print("Segunda nota: ");
        int nota2 = teclado.nextInt();
        float media = (float)(nota1+nota2)/2;
        System.out.println("La media de ambas notas es igual a " + media);
        teclado.close();
    }
}
