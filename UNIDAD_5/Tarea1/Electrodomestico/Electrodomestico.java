package Electrodomestico;

public class Electrodomestico {

	protected int precio_base;
	protected Color color;
	protected Consumo_energetico ce;
	protected int peso;

	public Electrodomestico() {
		this.precio_base = 100;
		this.color = Color.BLANCO;
		this.ce = Consumo_energetico.F;
		this.peso = 5;
	}

	public Electrodomestico(int precio_base, Color color) {
		this.precio_base = precio_base;
		this.color = color;
		this.ce = Consumo_energetico.F;
		this.peso = 5;
	}

	public Electrodomestico(int precio_base, Color color,
			Consumo_energetico ce, int peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.ce = ce;
		this.peso = peso;
	}

	public int getPrecio_base() {
		return precio_base;
	}

	public Color getColor() {
		return color;
	}

	public Consumo_energetico getCe() {
		return ce;
	}

	public int getPeso() {
		return peso;
	}

	protected int getPrecioFinal() {
		switch (ce) {
		case A:
			precio_base += 100;
			break;
		case B:
			precio_base += 80;
			break;
		case C:
			precio_base += 60;
			break;
		case D:
			precio_base += 50;
			break;
		case E:
			precio_base += 30;
			break;
		case F:
			precio_base += 10;
			break;
		}

		if (peso >= 0 || peso <= 29) {
			precio_base += 10;
		} else if (peso >= 30 || peso <= 49) {
			precio_base += 60;
		} else if (peso >= 50 || peso <= 79) {
			precio_base += 80;
		} else {
			precio_base += 100;
		}

		return precio_base;
	}

	@Override
	public String toString() {
		return "Precio base: " + precio_base + "€" + "\n" + "Color: " + color
				+ "\n" + "Consumo energético: " + ce + "\n" + "Peso: " + peso;
	}
}
