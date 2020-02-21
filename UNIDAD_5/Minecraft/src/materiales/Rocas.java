package materiales;

public class Rocas extends Materiales implements Mezclar {

	private int dureza;

	public Rocas(String nombre, int masa, int capacidadDeQuemarse,
			int capacidadDeDiluirse, boolean movible, int dureza) {
		super(nombre, masa, capacidadDeQuemarse, capacidadDeDiluirse, movible);
		this.dureza = dureza;
	}

	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	@Override
	public String toString() {
		return super.mostrarEstado() + "\n" + "Dureza: " + getDureza();
	}

	@Override
	public String mezclarConMaterial(Materiales material) {
		return material + " de " + getNombre();
	}
}
