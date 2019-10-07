package Tarea2;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ejercicio2_4 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime una longitud en millas: ");
        double milla = teclado.nextDouble();
        double resultado = milla*1609;
        System.out.println(milla + " millas = " + resultado + " metros.");
    }
}
