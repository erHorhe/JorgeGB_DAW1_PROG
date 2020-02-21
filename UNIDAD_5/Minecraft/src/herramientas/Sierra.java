package herramientas;

public class Sierra extends Herramientas {

	private int diametro;

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		return "Diámetro: " + getDiametro();
	}
}
