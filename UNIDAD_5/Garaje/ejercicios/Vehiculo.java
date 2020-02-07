package ejercicios;

public abstract class Vehiculo {

	protected String nombreVehiculo;
	protected int numPasajeros;
	protected TipoVehiculo tipovehiculo;

	public Vehiculo(String nombreVehiculo, int numPasajeros,
			TipoVehiculo tipovehiculo) {
		this.nombreVehiculo = nombreVehiculo;
		this.numPasajeros = numPasajeros;
		this.tipovehiculo = tipovehiculo;
	}

	void transportar() {
		
	}

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public TipoVehiculo getTipovehiculo() {
		return tipovehiculo;
	}

	public void setTipovehiculo(TipoVehiculo tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombreVehiculo() + "\n" + "Nº de pasajeros: "
				+ getNumPasajeros() + "\n" + "Tipo de vehiculo: "
				+ getTipovehiculo();
	}
}
