package Figura;

public abstract class PoligonoRegular implements Figura {

	protected double lado; // EN CM
	public Color color;
	public static int contadorPoligonos = 0;

	public PoligonoRegular() {
		lado = 10;
		color = Color.AZUL;
		contadorPoligonos++;
	}

	public PoligonoRegular(int lado, Color color, int contadorPoligonos) {
		this.lado = lado;
		this.color = color;
		PoligonoRegular.contadorPoligonos = contadorPoligonos;
	}

	@Override
	public double getArea() {
		return 0;
	}
}
