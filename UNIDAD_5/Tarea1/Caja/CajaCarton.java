package Caja;

public class CajaCarton extends Caja {

	public CajaCarton(int ancho, int alto, int fondo, Unidades u, Etiqueta e) {
		super(ancho, alto, fondo, u, e);
	}

	@Override
	protected double getVolumen() {
		return (super.getVolumen() * 0.8);
	}

	@Override
	public String toString() {
		return (super.toString() + "\n" + "Número de etiqueta: " + e.num);
	}
}