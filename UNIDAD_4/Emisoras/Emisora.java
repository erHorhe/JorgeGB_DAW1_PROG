package Emisoras;

public class Emisora {

	//Attributes:
	private double controlador;
	
	//Constructors:
	public Emisora(double controlador) {
		this.controlador = Frecuencias.FRECUENCIA_MINIMA;
	}
	
	//Methods:
	public double subirFrecuencia() {
		if (controlador+Frecuencias.INCREMENTO > Frecuencias.FRECUENCIA_MAXIMA) {
			this.controlador = Frecuencias.FRECUENCIA_MINIMA;
		} else {
			this.controlador += Frecuencias.INCREMENTO;
		}
		
		return this.controlador;
	}
	
	public double bajarFrecuencia() {
		if (controlador-Frecuencias.INCREMENTO < Frecuencias.FRECUENCIA_MINIMA) {
			this.controlador = Frecuencias.FRECUENCIA_MAXIMA;
		} else {
			this.controlador -= Frecuencias.INCREMENTO;
		}
		
		return this.controlador;
	}

	public double getControlador() {
		return controlador;
	}

	public void setControlador(double controlador) {
		this.controlador = controlador;
	}
}