/* Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan) y se retiran (se desapilan) siguiendo la norma
 * de que el último que se apila será el primero en desapilarse, como ocurre con una pila de platos.
 * Se llama cima de la pila al último elemento apilado (o al primero en desapilar).
 * Las funciones fundamentales de una pila son, por tanto, apilar() y desapilar().
 * 
 * Implementar la clase PilaTabla para números Integer, donde se usa una tabla para guardar los elementos apilados.*/
package Lista;

import java.util.Arrays;

public class Lista {

	//Attributes:
	public Integer[] listaNumeros;
	
	//Constructors:
	public Lista() {
		this.listaNumeros = new Integer[10];
	}
	public Lista(int tamagno) {
		this.listaNumeros = new Integer[tamagno];
	}
	
	//Methods:
	public short obtenerCantidadNumerosInsertados() {
		short contador = 0;
		for(int i=0 ; i<listaNumeros.length ; i++) {
			if(listaNumeros[i] != null) {
				contador++;
			}
		}
		return contador;
	}
	public void insertarNumeroAlFinalDeLista(Integer valor) {
		if(listaNumeros[listaNumeros.length-1] != null) {
			listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length+1);
			listaNumeros[listaNumeros.length-1] = valor;
		} else {
			boolean insertado = false;
			for (int i=0 ; i<listaNumeros.length && insertado==false ; i++) {
				if(listaNumeros[i] == null) {
					listaNumeros[i] = valor;
					insertado = true;
				}
			}
		}
	}
	public void insertarNumeroAlPrincipioDeLista(Integer valor) {
		if(listaNumeros[listaNumeros.length-1] != null) {
			listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length+1);
			listaNumeros[0] = valor;
		} else {
			boolean insertado = false;
			for(int i=0 ; i<listaNumeros.length && insertado==false ; i++) {
				if(listaNumeros[0] != null) {
					listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length+1);
					for(int j=obtenerCantidadNumerosInsertados() ; j>=1 ; j--) {
						listaNumeros[j] = listaNumeros[j-1];
					}
					listaNumeros[0] = valor;
					insertado = true;
				}
			}
		}
	}
	public void insertarNumeroEnListaPorIndice(Integer valor, int indice) {
		if (listaNumeros[listaNumeros.length-1] != null) {
			listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length+1);
		}
		for (int i=listaNumeros.length-2 ; i<1 ; i--) {
			listaNumeros[i+1] = listaNumeros[i];
		}
		listaNumeros[indice] = valor;
	}
	public void agnadirAlFinalElementosDeOtraLista(Lista nuevaLista) {
		if(obtenerCantidadNumerosInsertados()+nuevaLista.obtenerCantidadNumerosInsertados() > listaNumeros.length) {
			listaNumeros = Arrays.copyOf(listaNumeros, obtenerCantidadNumerosInsertados()+nuevaLista.obtenerCantidadNumerosInsertados());
		}
		int j = 0;
		int iLimite = obtenerCantidadNumerosInsertados()+nuevaLista.obtenerCantidadNumerosInsertados();
		for(int i=obtenerCantidadNumerosInsertados() ; i<iLimite ; i++) {
			listaNumeros[i] = nuevaLista.listaNumeros[j];
			j++;
		}
	}
	public void eliminarElemento(int indice) {
		for(int i=indice ; i<listaNumeros.length-1 ; i++) {
			listaNumeros[i] = listaNumeros[i+1];
		}
		Arrays.copyOf(listaNumeros, listaNumeros.length-1);
	}
	public Integer buscarNumero(Integer indice) {
		int res = 0;
		for(int i=0 ; i<listaNumeros.length ; i++) {
			if(i != indice) {
				res = i;
			} else {
				return -1;
			}
		}
		return res;
	}
	@Override
	public String toString() {
		return Arrays.deepToString(listaNumeros);
	}

	public Integer[] getListaNumeros() {
		return listaNumeros;
	}

	public void setListaNumeros(Integer[] listaNumeros) {
		this.listaNumeros = listaNumeros;
	}
}
