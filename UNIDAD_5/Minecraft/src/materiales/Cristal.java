package materiales;

public class Cristal extends Materiales implements Mezclar {

	public enum Tipo {

		TRANSPARENTE, TRANSLUCIDO
	}

	private Tipo tipo;

	public Cristal(String nombre, int masa, int capacidadDeQuemarse,
			int capacidadDeDiluirse, boolean movible, Tipo tipo) {
		super(nombre, masa, capacidadDeQuemarse, capacidadDeDiluirse, movible);
		this.tipo = tipo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.mostrarEstado() + "\n" + "Tipo de cristal: " + getTipo();
	}

	@Override
	public String mezclarConMaterial(Materiales material) {
		return material + " de " + getNombre();
	}
}
