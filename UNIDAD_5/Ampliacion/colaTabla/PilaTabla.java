package colaTabla;

import java.util.Arrays;

public class PilaTabla implements Pila {

	private int indiceCima;
	private Integer[] tabla;

	public PilaTabla() {
		indiceCima = -1;
		tabla = new Integer[10];
	}

	public PilaTabla(int capacidadInicial) {
		indiceCima = -1;
		tabla = new Integer[capacidadInicial];
	}

	private boolean pilaVacia() {
		return indiceCima == -1;
	}

	private boolean pilaLlena() {
		return indiceCima == tabla.length - 1;
	}

	Integer cima() {
		Integer elementoCima = null;
		if (!pilaVacia()) {
			elementoCima = tabla[indiceCima];
		}
		return elementoCima;
	}

	@Override
	public void mostrarNumsInvertidos(int[] arrayNums) {
		System.out.print("[");
		for (int i = arrayNums.length - 1; i >= 0; i--) {
			System.out.print(arrayNums[i]);
		}
		System.out.print("]");
	}

	@Override
	public void apilar(Integer elemento) {
		// TODO Auto-generated method stub
		if (pilaLlena()) {
			tabla = Arrays.copyOf(tabla, tabla.length + 10);
		}
		indiceCima++;
		tabla[indiceCima] = elemento;
	}

	@Override
	public Integer desapilar() {
		// TODO Auto-generated method stub
		Integer elemento = null;
		if (!pilaVacia()) {
			elemento = tabla[indiceCima];
			indiceCima--;
		}
		return elemento;
	}

	@Override
	public String toString() {
		String resultado = "";
		for (int i = 0; i <= indiceCima; i++) {
			resultado += tabla[i] + " ";
		}
		resultado += "(cima)";

		return resultado;
	}

}