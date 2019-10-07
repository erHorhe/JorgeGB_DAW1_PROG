package Tarea3;

import java.util.Scanner;

public class Ejercicio3_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame dos números:");
        byte num1 = teclado.nextByte();
        byte num2 = teclado.nextByte();
        byte suma = (byte) (num1+num2);
        System.out.println(suma);
        teclado.close();
    }
}
