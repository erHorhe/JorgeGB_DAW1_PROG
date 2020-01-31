package PilaListaTabla;

public class PilaLista implements Pila {

	@Override
	public void mostrarNumsInvertidos(int[] arrayNums) {
		System.out.print("[");
		for (int i = arrayNums.length - 1; i >= 0; i--) {
			System.out.print(arrayNums[i]);
		}
		System.out.print("]");
	}
}