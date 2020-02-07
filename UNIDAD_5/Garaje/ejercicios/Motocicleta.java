package ejercicios;

import java.util.Comparator;

public class Motocicleta extends Vehiculo implements Comparable<String>, Comparator<Integer> {

	private String matricula;
	private Integer agnoFabricacion;
	private ColorVehiculo colorvehiculo;

	public Motocicleta(String matricula, int agnoFabricacion,
			ColorVehiculo colorvehiculo) {
		super("Death Moting", 2, TipoVehiculo.TERRESTRE);
		this.matricula = matricula;
		this.agnoFabricacion = agnoFabricacion;
		this.colorvehiculo = colorvehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getAgnoFabricacion() {
		return agnoFabricacion;
	}

	public void setAgnoFabricacion(Integer agnoFabricacion) {
		this.agnoFabricacion = agnoFabricacion;
	}

	public ColorVehiculo getColorvehiculo() {
		return colorvehiculo;
	}

	public void setColorvehiculo(ColorVehiculo colorvehiculo) {
		this.colorvehiculo = colorvehiculo;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Matricula: " + getMatricula() + "\n"
				+ "Agno de fabricacion: " + getAgnoFabricacion() + "\n"
				+ "Color del vehiculo: " + getColorvehiculo();
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	public int compareTo(String arg0) {

		return 0;
	}

	@Override
	public int compare(Integer agno1, Integer agno2) {
		// TODO Auto-generated method stub
		return 0;
	}

}