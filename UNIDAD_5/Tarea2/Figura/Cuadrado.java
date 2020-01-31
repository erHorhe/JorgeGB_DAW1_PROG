package Figura;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado() {
		this(10, Color.AZUL);
	}

	public Cuadrado(double lado, Color color) {
		this.lado = lado;
		this.color = color;
	}

	@Override
	public double getArea() {
		return Math.pow(super.lado, 2);
	}

	@Override
	public String toString() {
		return "CUADRADO" + "\n" + "  --------" + "\n" + "  Lado -> " + lado
				+ "\n" + "  Color -> " + color + "\n" + "  Area del cuadrado: "
				+ getArea() + "\n";
	}
}
