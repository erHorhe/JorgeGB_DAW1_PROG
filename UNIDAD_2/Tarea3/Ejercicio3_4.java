package Tarea3;

import java.util.Scanner;

public class Ejercicio3_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una longitud en millas: ");
        float milla = teclado.nextFloat();
        float resultadoEnKm = milla*1609;
        System.out.println(milla + " millas = " + resultadoEnKm + " kilómetros.");
    }
}
