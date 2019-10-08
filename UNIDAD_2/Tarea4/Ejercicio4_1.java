package Tarea4;

public class Ejercicio4_1 {

    public static void main(String[] args) {

        short valorMin = -32768;
        short valorMax = 32767;

        System.out.println(valorMin + " llega al otro extremo al sumarle una unidad -> " + (--valorMin));
        System.out.println(valorMax + " llega al otro extremo al sumarle una unidad -> " + (++valorMax));
    }
}