package Lista;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Lista l = new Lista(); //TABLA CON CAPACIDAD PARA 10 N�MEROS
		Lista l2 = new Lista(15); //EL PARAMETRO ES LA LONGITUD QUE DAMOS A LA NUEVA TABLA
		
		System.out.println("Introduce n�meros en la 1� lista:");
		for(int i=0 ; i<l.listaNumeros.length ; i++) {
			l.listaNumeros[i] = t.nextInt();
		}
		
		System.out.println("Introduce n�meros en la 2� lista:");
		for(int i=0 ; i<l2.listaNumeros.length ; i++) {
			l2.listaNumeros[i] = t.nextInt();
		}
		
		t.close();
		
		System.out.print("Cantidad de n�meros insertados = " + l.obtenerCantidadNumerosInsertados() + "\n");
		l.insertarNumeroAlFinalDeLista(34);
		l.insertarNumeroAlPrincipioDeLista(34);
		l.insertarNumeroEnListaPorIndice(77, 3); //VALOR A INTRODUCIR CON SU �NDICE
		l.agnadirAlFinalElementosDeOtraLista(l2);
		System.out.println("\n" + "Eliminando el elemento de la posici�n indicada...");
		l.eliminarElemento(5); //�NDICE
		System.out.println("\n" + "�Se ha encontrado el elemento deseado? " + l.buscarNumero(2));
		System.out.println("\n" + "Lista de n�meros final:" + "\n" + l.toString());
	}
}
