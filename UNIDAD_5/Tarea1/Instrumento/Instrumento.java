package Instrumento;

public abstract class Instrumento {

	protected Notas notasMusicales[];
	static final protected int max = 100;
	protected int cantidadNotas;
	
	public Instrumento() {
		this.notasMusicales = new Notas[max];
	}

	public void add(Notas nota) {
		if (cantidadNotas < notasMusicales.length) {
			notasMusicales[cantidadNotas] = nota;
			cantidadNotas++;
		}
	}

	public abstract void interpretar();
}
