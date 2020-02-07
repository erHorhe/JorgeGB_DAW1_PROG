package ejercicios;

public class Avioneta extends Vehiculo {

	private double altitud;
	private String codigoOaci;

	public Avioneta(double altitud, String codigoOaci) {
		super("Indiana Co-Jones", 2, TipoVehiculo.AEREO);
		this.altitud = altitud;
		this.codigoOaci = codigoOaci;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	public String getCodigoOaci() {
		return codigoOaci;
	}

	public void setCodigoOaci(String codigoOaci) {
		this.codigoOaci = codigoOaci;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Altitud: " + getAltitud() + "\n"
				+ "Codigo OACI: " + getCodigoOaci() + "\n"
				+ "Tipo de aeronave: " + "Avioneta";
	}
}
