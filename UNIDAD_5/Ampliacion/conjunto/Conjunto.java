package conjunto;

public class Conjunto {

	private Lista lista;

	public Conjunto() {
		lista = new Lista();
	}

	public Conjunto(int tamagno) {
		lista = new Lista(tamagno);
	}

	int obtenerNumElementos() {
		return lista.numeroElementos();
	}

	boolean pertenece(Integer elemento) {
		return lista.buscarNumero(elemento) >= 0;
	}

	boolean insertarNumero(Integer num) {
		boolean insertado = false;
		if (!pertenece(num)) {
			lista.insertarNumeroAlFinalDeLista(num);
			insertado = true;
		}
		return insertado;
	}

	boolean agnadirNumerosOtroConjunto(Conjunto otroConjunto) {
		boolean modificado = false;
		for (int i = 0; i < otroConjunto.lista.numeroElementos(); i++) {
			boolean insertado = insertarNumero(otroConjunto.lista.get(i));
			if (insertado) {
				modificado = true;
			}
		}
		return modificado;
	}

	boolean eliminarNumero(Integer num) {
		boolean eliminado = false;
		int indice = lista.buscarNumero(num);
		if (indice != -1) {
			lista.eliminarElemento(indice);
			eliminado = true;
		}
		return eliminado;
	}

	boolean eliminarNumerosOtroConjunto(Conjunto otroConjunto) {
		boolean modificado = false;
		for (int i = 0; i < otroConjunto.lista.numeroElementos(); i++) {
			boolean eliminado = eliminarNumero(otroConjunto.lista.get(i));
			if (eliminado) {
				modificado = true;
			}
		}
		return modificado;
	}

	@Override
	public String toString() {
		lista.ordenar();
		return lista.toString();
	}

	// ACTIVIDAD 5:
	static boolean incluido(Conjunto c1, Conjunto c2) {
		boolean incluido = true;
		for (int i = 0; i < c1.obtenerNumElementos() && incluido; i++) {
			if (!c2.pertenece(c1.lista.get(i))) {
				incluido = false;
			}
		}
		return incluido;
	}

	static Conjunto union(Conjunto c1, Conjunto c2) {
		Conjunto nuevo = new Conjunto();
		nuevo.agnadirNumerosOtroConjunto(c1);
		nuevo.agnadirNumerosOtroConjunto(c2);
		return nuevo;
	}

	static Conjunto interseccion(Conjunto c1, Conjunto c2) {
		Conjunto nuevo = new Conjunto();
		for (int i = 0; i < c1.obtenerNumElementos(); i++) {
			if (c2.pertenece(c1.lista.get(i))) {
				nuevo.insertarNumero(c1.lista.get(i));
			}
		}
		return nuevo;
	}

	static Conjunto diferencia(Conjunto c1, Conjunto c2) {
		Conjunto nuevo = new Conjunto();
		for (int i = 0; i < c1.obtenerNumElementos(); i++) {
			if (!c2.pertenece(c1.lista.get(i))) {
				nuevo.insertarNumero(c1.lista.get(i));
			}
		}
		return nuevo;
	}
}