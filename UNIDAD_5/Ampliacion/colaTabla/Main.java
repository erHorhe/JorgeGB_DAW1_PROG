package colaTabla;

public class Main {

	public static void main(String[] args) {

		// ACTIVIDAD 2:
		ColaTabla colatabla = new ColaTabla();
		System.out.println(colatabla);
		colatabla.encolar(12);
		System.out.println(colatabla);
		colatabla.encolar(34);
		System.out.println(colatabla);
		colatabla.encolar(90);
		System.out.println(colatabla);
		colatabla.encolar(11);
		System.out.println(colatabla);
		colatabla.encolar(56);
		System.out.println(colatabla);
		colatabla.desencolar();
		System.out.println(colatabla);

		// ACTIVIDAD 3:
		ColaLista colalista = new ColaLista();
		for (int i = 0; i < 10; i++) {
			colalista.encolar(i);
		}
		Integer num = colalista.desencolar();

		while (num != null) {
			System.out.println(num);
			num = colalista.desencolar();
		}

		// ACTIVIDAD 6:
		Pila p = new PilaLista();
		for (int i = 0; i < 10; i++) {
			p.apilar(i);
		}
		Integer numero = p.desapilar();
		while (numero != null) {
			System.out.println(numero);
			numero = p.desapilar();
		}
	}
}