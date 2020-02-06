package listaNums;

public class RandomNumbers {

	private final int MAX = 20;
	private Integer[] arrayAleatorios = new Integer[MAX];

	void llenarArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			Integer numAleatorio = (int) (Math.random() * 100 + 1);
			arrayAleatorios[i] = numAleatorio;
		}
	}

	public Integer[] getArrayAleatorios() {
		return arrayAleatorios;
	}

	public void setArrayAleatorios(Integer[] arrayAleatorios) {
		this.arrayAleatorios = arrayAleatorios;
	}
}
