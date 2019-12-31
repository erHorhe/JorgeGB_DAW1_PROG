package Pila;

import java.util.Arrays;

public class PilaTabla implements Pila{

	//Attributes:
	private Integer[] tabla;
	
	//Constructors:
	public PilaTabla() {
		tabla = new Integer[10];
	}
	public PilaTabla(int num) {
		tabla = new Integer[num];
	}
	
	//Methods:
	public Integer[] getTabla() {
		return tabla;
	}
	public void setTabla(Integer[] tabla) {
		this.tabla = tabla;
	}

	@Override
	public void apilar(Integer num) {
		if(tabla[tabla.length-1] != null) {
			tabla = Arrays.copyOf(tabla, tabla.length+1);
		}
		tabla[tabla.length-1] = num;
	}

	@Override
	public Integer desapilar(int posicion) {
		Integer valor = tabla[posicion];
		for(int i=posicion ; i<tabla.length ; i++) {
			tabla[i] = tabla[i-1];
		}
		return valor;
	}

	@Override
	public void mostrarInverso() {
		for(int i=tabla.length-1 ; i>=0 ; i--) {
			System.out.print(tabla[i] + " ");
		}
	}
}
