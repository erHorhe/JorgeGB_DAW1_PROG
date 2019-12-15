package Maquinaria_EmpresaF;

import Personal_EmpresaF.Mecanico;

public class Locomotora {

	//Attributes:
	private String matricula;
	private double potenciaMotor;
	private int agnoFabricacion;
	private Mecanico m;

	//Constructors:
	public Locomotora(String matricula, double potenciaMotor, int agnoFabricacion, Mecanico m) {
		this.matricula = matricula;
		this.potenciaMotor = potenciaMotor;
		this.agnoFabricacion = agnoFabricacion;
		this.m = m;
	}
	
	//Methods:
	public void mostrarInformacionLocomotora() {
		System.out.println("Matrícula: " + matricula
				+ "\n" + "Potencia de su motor: " + potenciaMotor
				+ "\n" + "Año de fabricación: " + agnoFabricacion);
		System.out.println("\n" + "MECÁNICO:");
		m.mostrarInformacionMecanico();
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public int getAgnoFabricacion() {
		return agnoFabricacion;
	}

	public void setAgnoFabricacion(int agnoFabricacion) {
		this.agnoFabricacion = agnoFabricacion;
	}

	public Mecanico getM() {
		return m;
	}

	public void setM(Mecanico m) {
		this.m = m;
	}
}
