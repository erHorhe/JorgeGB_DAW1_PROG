/* Repetir el ejercicio anterior para implementar la clase PilaLista,
 * donde, en vez de usar una tabla para almacenar los valores apilados,
 * usamos un objeto de la clase Lista implementada en el ejercicio 1.*/
package Pila;

import java.util.Arrays;
import Lista.Lista;

public class PilaLista implements Pila{

	//Attributes:
	private Lista lista;
	
	//Constructors:
	public PilaLista() {
		lista = new Lista();
	}
	public PilaLista(int num) {
		lista = new Lista(num);
	}
	
	//Methods:
	@Override
	public void apilar(Integer num) {
		if(lista.listaNumeros[lista.listaNumeros.length-1] != null) {
			lista.listaNumeros = Arrays.copyOf(lista.listaNumeros, lista.listaNumeros.length+1);
		}
		lista.listaNumeros[lista.listaNumeros.length] = num;
	}
	
	@Override
	public Integer desapilar(int posicion) {
		Integer valor = lista.listaNumeros[posicion];
		for(int i=posicion ; i<lista.listaNumeros.length ; i++) {
			lista.listaNumeros[i] = lista.listaNumeros[i+1];
		}
		return valor;
	}
	
	@Override
	public void mostrarInverso() {
		for(int i=lista.listaNumeros.length-1 ; i >= 0 ; i--) {
			System.out.println(lista.listaNumeros[i]);
		}
	}
}
