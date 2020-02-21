package herramientas;

import materiales.Materiales;

public class Pico extends Herramientas implements Minar {

	private int grosor; // en milímetros

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	@Override
	public void hacer(Materiales material) {
		
	}

	@Override
	public void deshacer(Materiales material) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Grosor: " + getGrosor();
	}
}
