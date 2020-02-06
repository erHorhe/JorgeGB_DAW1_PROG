package colaTabla;

import java.util.Arrays;

public class ColaTabla implements Cola {

	private int ultimo;
	private Integer[] tabla;

	public ColaTabla() {
		ultimo = -1;
		tabla = new Integer[10];
	}

	public ColaTabla(int capacidadInicial) {
		ultimo = -1;
		tabla = new Integer[capacidadInicial];
	}

	boolean colaVacia() {
		return ultimo == -1;
	}

	boolean colaLlena() {
		return ultimo == tabla.length - 1;
	}

	@Override
	public void encolar(Integer num) {
		if (colaLlena()) {
			tabla = Arrays.copyOf(tabla, tabla.length + 10);
		}
		ultimo++;
		tabla[ultimo] = num;
	}

	@Override
	public Integer desencolar() {
		Integer elemento = null;
		if (!colaVacia()) {
			elemento = tabla[0];
			for (int i = 0; i < ultimo; i++) {
				tabla[i] = tabla[i + 1];
			}
			ultimo--;
		}
		return elemento;
	}

	@Override
	public String toString() {
		String resultado = "(primero) ";
		for (int i = 0; i <= ultimo; i++) {
			resultado += tabla[i] + " ";
		}
		resultado += "(ultimo)";
		return resultado;
	}
}