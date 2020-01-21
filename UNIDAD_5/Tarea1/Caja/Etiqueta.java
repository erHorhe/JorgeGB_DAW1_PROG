package Caja;

public class Etiqueta {

	protected String nombre;
	protected String direccion;
	protected int num;

	protected Etiqueta(String nombre, String direccion, int num) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.num = num;
	}

	@Override
	public String toString() {
		return nombre + ", " + direccion + ", " + num;
	}
}