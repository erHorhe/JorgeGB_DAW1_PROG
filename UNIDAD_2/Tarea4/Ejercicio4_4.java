package Tarea4;

import java.util.Scanner;

public class Ejercicio4_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un número decimal: ");
        float num = teclado.nextFloat();
        System.out.println(num + " redondeado -> " + (Math.round(num)));
        teclado.close();
    }
}
