package Tarea8;

import java.util.Scanner;

public class Ejercicio8_14 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.print("Altura para un triángulo: ");
        int n = t.nextInt();
        System.out.println("Vamos a dibujar un triángulo con esa altura:");

        for (int columna=0 ; columna<=n ; columna++) {

            for (int fila=columna ; fila<n ; fila++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        t.close();
    }
}