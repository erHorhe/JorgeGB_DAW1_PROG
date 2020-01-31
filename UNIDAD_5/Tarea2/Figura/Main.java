package Figura;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		final short MAX = 5;

		PoligonoRegular arrayFigurasRegulares[] = new PoligonoRegular[MAX];
		arrayFigurasRegulares[0] = new Triangulo(20, 40, Color.VERDE);
		arrayFigurasRegulares[1] = new Cuadrado(12, Color.AMARILLO);
		arrayFigurasRegulares[2] = new Triangulo(30, 50, Color.ROJO);
		arrayFigurasRegulares[3] = new Cuadrado(100, Color.AZUL);
		arrayFigurasRegulares[4] = new Triangulo(9, 4, Color.AMARILLO);
		System.out.println("-ARRAY DE FIGURAS REGULARES-" + "\n"
				+ Arrays.toString(arrayFigurasRegulares));

		Circulo arrayCirculo[] = new Circulo[MAX];
		arrayCirculo[0] = new Circulo(12.3);
		arrayCirculo[1] = new Circulo();
		arrayCirculo[2] = new Circulo(45);
		arrayCirculo[3] = new Circulo();
		arrayCirculo[4] = new Circulo(0.67);
		System.out.println("-ARRAY DE FIGURAS IRREGULARES-" + "\n"
				+ Arrays.toString(arrayCirculo));

		System.out.println("Cantidad de poligonos: "
				+ PoligonoRegular.contadorPoligonos);

		Triangulo arrayTriangulo[] = new Triangulo[MAX];
		arrayTriangulo[0] = new Triangulo(5, 24, Color.VERDE);
		arrayTriangulo[1] = new Triangulo();
		arrayTriangulo[2] = new Triangulo(200, 41, Color.AMARILLO);
		arrayTriangulo[3] = new Triangulo();
		arrayTriangulo[4] = new Triangulo(73, 12, Color.ROJO);

		System.out.println("-ARRAY DE TRIANGULOS-" + "\n"
				+ Arrays.toString(arrayTriangulo));
		Arrays.sort(arrayTriangulo, new Triangulo());

		System.out.println("-ARRAY DE TRIANGULOS (ordenado por lado)-" + "\n"
				+ Arrays.toString(arrayTriangulo));

		Arrays.sort(arrayTriangulo, new ordenarColor());
		System.out.println("-ARRAY DE TRIANGULOS (ordenado por color)-" + "\n"
				+ Arrays.toString(arrayTriangulo));
	}
}