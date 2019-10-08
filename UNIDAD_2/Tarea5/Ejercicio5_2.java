package Tarea5;

import java.util.Scanner;

public class Ejercicio5_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe el número 12 -> ");
        int num = teclado.nextInt();
        if (num == 12) {
            System.out.println("¡Muy bien!");
        } else {
            System.out.println("¡¿QUÉ HAS HECHO?!");
        }
        teclado.close();
    }

}
