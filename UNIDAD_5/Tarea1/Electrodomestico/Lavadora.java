package Electrodomestico;

public class Lavadora extends Electrodomestico {

	protected int carga;

	public Lavadora() {
		super();
		this.carga = 5;
	}

	public Lavadora(int precio_base, int peso) {
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = Color.BLANCO;
		this.ce = Consumo_energetico.F;
		this.carga = 5;
	}

	public Lavadora(int precio_base, int peso, Color color,
			Consumo_energetico ce, int carga) {
		super(precio_base, color, ce, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	protected int getPrecioFinal() {
		int precioFinal = super.getPrecioFinal();
		if (carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		String stringSuperclase = super.toString();
		stringSuperclase += ("\n" + "Carga: " + carga + "\n"
				+ "PRECIO FINAL = " + getPrecioFinal());
		return stringSuperclase;
	}

	protected void ordenarPorPeso(Object o1, Object o2) {
		Lavadora lavadora1 = (Lavadora) o1;
		Lavadora lavadora2 = (Lavadora) o2;
		if (lavadora1.peso > lavadora2.peso) {
			System.out.println("La lavadora 1 es la mayor lavadora.");
		} else {
			System.out.println("La lavadora 2 es la menor lavadora.");
		}
	}

	@Override
	public boolean equals(Object o) {
		boolean mismoPrecio = false;
		Lavadora otraLavadora = (Lavadora) o;
		if (getPrecioFinal() == otraLavadora.getPrecioFinal()) {
			return true;
		} else {
			return mismoPrecio;
		}
	}
}
