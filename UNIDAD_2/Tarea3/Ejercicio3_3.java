package Tarea3;

import java.util.Scanner;

public class Ejercicio3_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame dos números:");
        double num1 = teclado.nextFloat();
        double num2 = teclado.nextFloat();
        double division = num1/num2;
        System.out.println(division);
        teclado.close();
    }
}
