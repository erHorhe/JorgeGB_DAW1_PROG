package Figura;

import java.util.Comparator;

public class Triangulo extends PoligonoRegular implements Comparator<Object> {

	private double altura;

	public Triangulo() {
		this(10, 10, Color.AZUL);
	}

	public Triangulo(double altura, double lado, Color color) {
		this.altura = altura;
		super.lado = lado;
		this.color = color;
	}

	@Override
	public double getArea() {
		return super.lado * altura / 2;
	}

	@Override
	public int compare(Object o1, Object o2) {
		return (int) (((Triangulo) o1).lado - ((Triangulo) o2).lado);
	}

	@Override
	public String toString() {
		return "TRIANGULO" + "\n" + "  ---------" + "\n" + "  Altura -> "
				+ altura + "\n" + "  Base -> " + lado + "\n" + "  Color -> "
				+ color + "\n" + "  Area del triangulo: " + getArea() + "\n";
	}
}

class ordenarColor implements Comparator<Triangulo> {
	public int compare(Triangulo triangulo1, Triangulo triangulo2) {
		return triangulo1.color.toString().compareTo(
				triangulo2.color.toString());
	}
}