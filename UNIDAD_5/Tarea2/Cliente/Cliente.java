package Cliente;

import java.util.Comparator;

public class Cliente implements Comparable<Object>, Comparator<Object> {

	private String dni;
	private String nombre;
	protected int edad;
	private double saldo;

	public Cliente(String dni, String nombre, int edad, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "DNI: " + getDni() + "\n" + "Nombre: " + getNombre() + "\n"
				+ "Edad: " + getEdad() + "\n" + "Saldo: " + getSaldo() + "\n"
				+ "--------------------" + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		return dni.equals(((Cliente) obj).dni);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int compareTo(Object o) {
		return dni.compareTo(((Cliente) o).dni);
	}

	@Override
	public int compare(Object o1, Object o2) {
		Cliente edad1 = (Cliente) o1;
		Cliente edad2 = (Cliente) o2;

		return edad1.edad - edad2.edad;
	}
}