package materiales;

public class Metal extends Materiales implements Mezclar {

	private boolean imantable;

	public Metal(String nombre, int masa, int capacidadDeQuemarse,
			int capacidadDeDiluirse, boolean movible, boolean imantable) {
		super(nombre, masa, capacidadDeQuemarse, capacidadDeDiluirse, movible);
		this.imantable = imantable;
	}

	public boolean getImantable() {
		return imantable;
	}

	public void setInmantable(boolean inmantable) {
		this.imantable = inmantable;
	}

	@Override
	public String toString() {
		return super.mostrarEstado() + "\n" + "¿En imantable? "
				+ getImantable();
	}

	@Override
	public String mezclarConMaterial(Materiales material) {
		return material + " de " + getNombre();
	}
}
