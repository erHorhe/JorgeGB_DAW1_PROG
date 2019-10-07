//Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario:
package Tarea2;

import java.util.Scanner;

public class Ejercicio2_3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo número: ");
        int num2 = keyboard.nextInt();
        double division = num1/num2;
        System.out.println("División -> " + division);
    }
}
