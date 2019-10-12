package Tarea6;

import java.util.Scanner;

public class Ejercicio6_3 {

    public static void main(String[] args) {

    	Scanner t = new Scanner(System.in);
    	System.out.print("Dame un número entero: ");
    	int num1 = t.nextInt();
    	int par1;
    	if (num1%2==0) {
    		par1 = 1;
    	} else {
    		par1 = 0;
    	}
    	System.out.println(par1);
    	
    	System.out.print("Probaremos otra vez. Dame un número entero: ");
    	int num2 = t.nextInt();
    	int resultado = num2%2;
    	int par2;
    	switch (resultado) {
    	case 0:
    		par2 = 1;
    		break;
    	default:
    		par2 = 0;
    		break;
    	}
    	System.out.println(par2);
    	t.close();
    }
}
