package Tarea5;

import java.util.Scanner;

public class Ejercicio5_6 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        double gravedad = 9.8;
        double valorTiempo;
        System.out.print("Escribe el valor de tiempo: ");
        valorTiempo = t.nextDouble();
        if (valorTiempo==0) {
            System.out.println("Tiempo incorrecto.");
        } else {
            double valorVelocidad = gravedad*valorTiempo;
            System.out.println("Velocidad = " + valorVelocidad);
        }


        t.close();
    }
}
