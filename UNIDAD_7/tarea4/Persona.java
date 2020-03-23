package tarea4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public abstract class Persona {

	private String nombre;
	private String dni;
	private int edad;
	private double estatura;
	private Empleado e;

	public Persona(String nombre, String dni, int edad, double estatura) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.estatura = estatura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public Empleado getE() {
		return e;
	}

	public void setE(Empleado e) {
		this.e = e;
	}

	void visualizarListado(Map<String, Empleado> mapa_empleados) {
		FileInputStream in = null;
		DataInputStream entrada = null;
		int n;
		try {
			in = new FileInputStream("mapa_empleados.dat");
			entrada = new DataInputStream(in);
			while (true) {
				n = entrada.readInt();
				System.out.println(n);
			}
		} catch (IOException io) {
			System.out.println("No se encuentra el fichero.");
		}
	}

	void borrarEmpleado(Map<String, Empleado> mapa_empleados, String dni) {
		if (mapa_empleados.containsKey(dni)) {
			mapa_empleados.remove(dni);
		}
		System.out.println(mapa_empleados);
	}

	void visualizarEmpleado(Map<String, Empleado> mapa_empleados, String dni) {
		if (mapa_empleados.containsKey(dni)) {
			mapa_empleados.get(dni);
			System.out.println(mapa_empleados);
		} else {
			System.out.println("El empleado no existe.");
		}
	}

	void modificarEmpleado(Map<String, Empleado> mapa_empleados, String dni) {
		if (mapa_empleados.containsKey(dni)) {
			mapa_empleados.put(dni, e);
		} else {
			System.out.println("El empleado no existe.");
		}
		System.out.println(mapa_empleados);
	}

	void insertarEmpleado(Map<String, Empleado> mapa_empleados) {
		mapa_empleados.put(dni, e);
		System.out.println(mapa_empleados);
	}
}
