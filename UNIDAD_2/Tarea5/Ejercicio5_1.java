package Tarea5;

import java.util.Scanner;

public class Ejercicio5_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int num = teclado.nextInt();
        if (num > 0) {
            System.out.println("Es un número positivo.");
        } else {
            System.out.println("No es positivo.");
        }
        teclado.close();
    }
}
