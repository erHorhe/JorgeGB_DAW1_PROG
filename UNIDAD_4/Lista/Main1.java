package Lista;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Lista l = new Lista(); //TABLA CON CAPACIDAD PARA 10 NÚMEROS
		Lista l2 = new Lista(15); //EL PARAMETRO ES LA LONGITUD QUE DAMOS A LA NUEVA TABLA
		
		System.out.println("Introduce números en la 1ª lista:");
		for(int i=0 ; i<l.listaNumeros.length ; i++) {
			l.listaNumeros[i] = t.nextInt();
		}
		
		System.out.println("Introduce números en la 2ª lista:");
		for(int i=0 ; i<l2.listaNumeros.length ; i++) {
			l2.listaNumeros[i] = t.nextInt();
		}
		
		t.close();
		
		System.out.print("Cantidad de números insertados = " + l.obtenerCantidadNumerosInsertados() + "\n");
		l.insertarNumeroAlFinalDeLista(34);
		l.insertarNumeroAlPrincipioDeLista(34);
		l.insertarNumeroEnListaPorIndice(77, 3); //VALOR A INTRODUCIR CON SU ÍNDICE
		l.agnadirAlFinalElementosDeOtraLista(l2);
		System.out.println("\n" + "Eliminando el elemento de la posición indicada...");
		l.eliminarElemento(5); //ÍNDICE
		System.out.println("\n" + "¿Se ha encontrado el elemento deseado? " + l.buscarNumero(2));
		System.out.println("\n" + "Lista de números final:" + "\n" + l.toString());
	}
}
