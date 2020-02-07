package ejercicios;

public class Helicoptero extends Vehiculo {

	private double altitud;
	private String codigoOaci;

	public Helicoptero(double altitud, String codigoOaci) {
		super("Cucoptero", 8, TipoVehiculo.AEREO);
		this.altitud = altitud;
		this.codigoOaci = codigoOaci;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Altitud: " + getAltitud() + "\n"
				+ "Codigo OACI: " + getCodigoOaci() + "\n"
				+ "Tipo de aeronave: " + "Helicoptero";
	}

	public String getCodigoOaci() {
		return codigoOaci;
	}

	public void setCodigoOaci(String codigoOaci) {
		this.codigoOaci = codigoOaci;
	}
}
