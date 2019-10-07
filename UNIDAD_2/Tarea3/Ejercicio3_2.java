package Tarea3;

import java.util.Scanner;

public class Ejercicio3_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame tu año de nacimiento: ");
        short agnoNac = teclado.nextShort();
        short agnoActual = 2019;
        System.out.println("Mi edad = " + (agnoActual - agnoNac));
        teclado.close();
    }
}
