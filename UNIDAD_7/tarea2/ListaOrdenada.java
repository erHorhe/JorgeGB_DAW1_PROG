package tarea2;

import java.util.*;

class ListaOrdenada<E> extends LinkedList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Comparator<E> comparador;

	/*
	 * Implemento un constructor (que utiliza el comparador) para obligar a que
	 * toda ListaOrdenada tenga un orden definido:
	 */
	public ListaOrdenada(Comparator<E> c) {
		super();
		comparador = c;
	}

	void insertarOrdendo(E elemento) {
		if (size() == 0) {
			add(elemento);
		} else {
			int indiceInsercion = 0;
			while (indiceInsercion < size()
					&& comparador.compare(elemento, get(indiceInsercion)) > 0) {
				indiceInsercion++;
			}
			add(indiceInsercion, elemento); // insertamos en una posición
											// concreta
		}
	}
}

class EnterosDecrecientes implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}

class compararCadenas implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}