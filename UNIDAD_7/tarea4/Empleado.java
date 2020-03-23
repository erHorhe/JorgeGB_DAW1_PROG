package tarea4;

public class Empleado extends Persona {

	private double sueldo;

	public Empleado(String nombre, String dni, int edad, double estatura,
			double sueldo) {
		super(nombre, dni, edad, estatura);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
