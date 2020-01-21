package Electrodomestico;

public class Television extends Electrodomestico {

	protected int resolucion;
	protected boolean sintonizador_TDT;

	public Television() {
		super();
		this.resolucion = 41;
		this.sintonizador_TDT = true;
	}

	public Television(int precio_base, int peso) {
		this.precio_base = precio_base;
		this.color = Color.BLANCO;
		this.ce = Consumo_energetico.F;
		this.peso = peso;
		this.resolucion = 20;
		this.sintonizador_TDT = false;
	}

	public Television(int precio_base, Color color, Consumo_energetico ce,
			int peso, int resolucion, boolean sintonizador_TDT) {
		super(precio_base, color, ce, peso);
		this.resolucion = resolucion;
		this.sintonizador_TDT = sintonizador_TDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador_TDT() {
		return sintonizador_TDT;
	}

	@Override
	protected int getPrecioFinal() {
		int precioFinal = super.getPrecioFinal();
		if (resolucion > 40) {
			precioFinal = (int) ((precioFinal * 0.3) + precioFinal);
		}
		if (sintonizador_TDT == true) {
			precioFinal = precioFinal+50;
		}
		return precioFinal;

	}

	@Override
	public String toString() {
		return "Precio base: " + precio_base + "\n" + "Color: " + color + "\n"
				+ "Consumo energético: " + ce + "\n" + "Peso: " + peso + "\n"
				+ "Resolución: " + resolucion + "\n"
				+ "¿Tiene sintonizador TDT? " + sintonizador_TDT + "\n"
				+ "PRECIO FINAL = " + getPrecioFinal();
	}
}
