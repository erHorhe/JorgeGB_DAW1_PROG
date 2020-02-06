package colaTabla;

public class ColaLista implements Cola {

	private Lista lista;

	public ColaLista() {
		lista = new Lista();
	}

	public ColaLista(int capacidadInicial) {
		lista = new Lista(capacidadInicial);
	}

	@Override
	public void encolar(Integer num) {
		lista.insertarNumeroAlFinalDeLista(num);
	}

	@Override
	public Integer desencolar() {
		return lista.eliminarElemento(0);
	}

	@Override
	public String toString() {
		return "(primero) " + lista.toString() + "(ultimo)";
	}
}