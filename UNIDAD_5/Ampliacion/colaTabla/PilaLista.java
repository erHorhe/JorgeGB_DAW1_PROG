package colaTabla;

public class PilaLista implements Pila {

	private int indiceCima;
	private Lista lista;

	public PilaLista() {
		indiceCima = -1;
		lista = new Lista();
	}

	public PilaLista(int capacidadInicial) {
		lista = new Lista(capacidadInicial);
	}

	@SuppressWarnings("unused")
	private boolean pilaVacia() {
		return indiceCima == -1;
	}

	@SuppressWarnings("unused")
	private boolean pilaLlena() {
		return lista.listaLlena();
	}

	int cima() {
		return lista.numeroElementos() - 1;
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
		lista.insertarNumeroAlFinalDeLista(elemento);
		indiceCima++;
	}

	@Override
	public Integer desapilar() {
		// TODO Auto-generated method stub
		Integer elemento = lista.eliminarElemento(indiceCima);
		if (elemento != null) {
			indiceCima--;
		}
		return elemento;
	}

	@Override
	public String toString() {
		return lista.toString() + "(cima)";
	}
}