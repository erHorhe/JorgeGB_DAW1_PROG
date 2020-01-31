package Figura;

public class Circulo implements Figura {

	private double radio;

	public Circulo() {
		this(10.0);
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public String toString() {
		return "CIRCULO" + "\n" + "  -------" + "\n" + "  Radio -> " + radio
				+ "\n" + "  Area del cuadrado: " + getArea() + "\n";
	}
}