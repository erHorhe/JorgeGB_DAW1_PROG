package Tarea5;

import java.util.Scanner;

public class Ejercicio5_3 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Escribe un número entero: ");
        int num = a.nextInt();
        if (num%2 != 0) {
            System.out.println(num + " es un número impar");
        } else {
            System.out.println(num + " no es un número impar.");
        }
        a.close();
    }
}
