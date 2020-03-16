package tarea2;

public class Actividad15 {

	public static void main(String[] args) {

		ListaOrdenada<Integer> lista1 = new ListaOrdenada<Integer>(
				new EnterosDecrecientes());

		for (int i = 0; i < 20; i++) {
			Integer temp = (int) (Math.random() * 10);
			lista1.insertarOrdendo(temp);
		}

		System.out
				.println("Números aleatorios insertados en orden decreciente: "
						+ "\n" + lista1);

		ListaOrdenada<String> nombres = new ListaOrdenada<String>(
				new compararCadenas());
		nombres.insertarOrdendo("Juan");
		nombres.insertarOrdendo("Ana");
		nombres.insertarOrdendo("Pedro");
		nombres.insertarOrdendo("Mónica");
		nombres.insertarOrdendo("Juan");

		System.out.println("\nLista ordenada de nombres:" + "\n" + nombres);
	}
}
