/* Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan) y se retiran (se desapilan) siguiendo la norma
 * de que el último que se apila será el primero en desapilarse, como ocurre con una pila de platos.
 * Se llama cima de la pila al último elemento apilado (o al primero en desapilar).
 * Las funciones fundamentales de una pila son, por tanto, apilar() y desapilar().
 * 
 * Implementar la clase PilaTabla para números Integer, donde se usa una tabla para guardar los elementos apilados.*/
package colaTabla;

import java.util.Arrays;

public class Lista {

	protected int numeroElementos;
	public Integer[] listaNumeros;

	public Lista() {
		numeroElementos = 0;
		listaNumeros = new Integer[10];
	}

	public Lista(int tamagno) {
		numeroElementos = 0;
		this.listaNumeros = new Integer[tamagno];
	}

	int numeroElementos() {
		return numeroElementos;
	}

	boolean listaLlena() {
		return numeroElementos == listaNumeros.length;
	}

	void insertarNumeroAlPrincipioDeLista(Integer valor) {
		if (listaLlena()) {
			listaNumeros = Arrays
					.copyOf(listaNumeros, listaNumeros.length + 10);
		}
		listaNumeros[numeroElementos] = valor;
		numeroElementos++;
	}

	void insertarNumeroAlFinalDeLista(Integer valor) {
		if (listaLlena()) {
			listaNumeros = Arrays
					.copyOf(listaNumeros, listaNumeros.length + 10);
		}
		listaNumeros[0] = valor;
		numeroElementos++;
	}

	void agnadirAlFinalElementosDeOtraLista(Lista otraLista) {
		while (numeroElementos + otraLista.numeroElementos > listaNumeros.length) {
			listaNumeros = Arrays
					.copyOf(listaNumeros, listaNumeros.length + 10);
		}
		for (int i = numeroElementos, j = 0; j < otraLista.numeroElementos; i++, j++) {
			listaNumeros[i] = otraLista.listaNumeros[j];
			numeroElementos++;
		}
	}

	boolean insertarNumeroEnListaPorIndice(int posicion, Integer nuevo) {
		boolean insertado = true;
		if (posicion < 0 || posicion > numeroElementos) {
			insertado = false;
		} else {
			if (listaLlena()) {
				listaNumeros = Arrays.copyOf(listaNumeros,
						listaNumeros.length + 10);
			}
			for (int i = numeroElementos; i > posicion; i--) {
				listaNumeros[i] = listaNumeros[i - 1];
			}
			listaNumeros[posicion] = nuevo;
			numeroElementos++;
		}

		return insertado;
	}

	Integer eliminarElemento(int indice) {
		Integer eliminado = null;
		if (indice >= 0 && indice < numeroElementos) {
			eliminado = listaNumeros[indice];
			for (int i = indice; i < numeroElementos - 1; i++) {
				listaNumeros[i] = listaNumeros[i + 1];
			}
			numeroElementos--;
		}
		return eliminado;
	}

	Integer get(int indice) {
		Integer resultado = null;
		if (indice >= 0 && indice < numeroElementos) {
			resultado = listaNumeros[indice];
		}
		return resultado;
	}

	Integer buscarNumero(Integer claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < numeroElementos && indice == -1; i++) {
			if (listaNumeros[i].equals(claveBusqueda)) {
				indice = i;
			}
		}
		return indice;
	}

	void ordenar() {
		Arrays.sort(listaNumeros, 0, numeroElementos);
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < numeroElementos; i++) {
			res += listaNumeros[i] + " ";
		}
		return res;
	}

	// public Integer[] getListaNumeros() {
	// return listaNumeros;
	// }
	//
	// public void setListaNumeros(Integer[] listaNumeros) {
	// this.listaNumeros = listaNumeros;
	// }
	//
	// public int getNumeroElementos() {
	// return numeroElementos;
	// }
	//
	// public void setNumeroElementos(int numeroElementos) {
	// this.numeroElementos = numeroElementos;
	// }
}
