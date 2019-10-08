package Tarea5;

import java.util.Scanner;

public class Ejercicio5_5 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Dame tres números grandes:");
        long num1 = t.nextLong();
        long num2 = t.nextLong();
        long num3 = t.nextLong();
        if (num1>num2 && num1>num3) {
            System.out.println(num1 + " es el mayor número.");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " es el mayor número.");
        } else {
            System.out.println(num3 + " es el mayor número.");
        }
        t.close();
    }
}
