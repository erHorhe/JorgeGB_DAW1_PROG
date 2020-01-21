package Caja;

public class Caja {

	protected int ancho;
	protected int alto;
	protected int fondo;
	protected Unidades u;
	protected Etiqueta e;

	public Caja(int ancho, int alto, int fondo, Unidades u, Etiqueta e) {
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.u = u;
		this.e = e;
	}

	protected double getVolumen() {
		int volumen = ancho * alto * fondo;
		if (u.equals(Unidades.cm)) {
			volumen = (int) (volumen / 1000000);
		}
		return volumen;
	}

	@Override
	public String toString() {
		return "Ancho: " + ancho + "\n" + "Alto: " + alto + "\n" + "Fondo: "
				+ fondo + "\n" + "Unidad: " + u;
	}
}
