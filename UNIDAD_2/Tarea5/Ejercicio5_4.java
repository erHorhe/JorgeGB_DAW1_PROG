package Tarea5;

import java.util.Scanner;

public class Ejercicio5_4 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Dame dos números:");
        int num1 = t.nextInt();
        int num2 = t.nextInt();
        if ((num1%2==0 && num2%2!=0) || (num1%2!=0 && num2%2==0)) {
            System.out.println("Solo uno es par.");
        } else if (num1%2!=0 && num2%2!=0) {
            System.out.println("Ninguno es par.");
        } else {
            System.out.println("Ambos son pares.");
        }
        t.close();
    }
}
