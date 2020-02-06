package listaNums;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		RandomNumbers r = new RandomNumbers();
		Integer arrayAleatorio[] = r.getArrayAleatorios();

		r.llenarArray(arrayAleatorio);

		System.out.println(Arrays.toString(arrayAleatorio));

		Arrays.sort(arrayAleatorio, new Numero());
		System.out.println(Arrays.toString(arrayAleatorio));
	}
}
