package Tarea2;

import java.util.Scanner;

public class Ejercicio2_5 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime una temperatura en grados centígrados: ");
        int grados = teclado.nextInt();
        int resultado = 9*grados/5+32;
        System.out.println(grados + "  grados centígrados = " + resultado + "  grados Fahrenheit.");
    }
}
