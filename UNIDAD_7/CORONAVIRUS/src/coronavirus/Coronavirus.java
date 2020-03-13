package coronavirus;

import java.io.*;
import java.util.*;

public class Coronavirus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cantidadInfectados;
	private String nombreVirus;
	private String localidadDeOrigen;
	private Map<Character, HashSet<Paciente>> cepa = new HashMap<>();

	public Coronavirus(int cantidadInfectados,
			Map<Character, HashSet<Paciente>> cepa) {
		this.setCantidadInfectados(cantidadInfectados);
		setNombreVirus("COVID-19");
		setLocalidadDeOrigen("Wuhan");
		this.cepa = cepa;
	}

	void addPaciente(Character cepa, Paciente paciente) {

	}

	void darDeAltaPaciente(Paciente paciente) {

	}

	void pacientesDeUnDoctor(Medico medico) {

	}

	void pacientesPorPeso(Character cepa) {

	}

	void pacientesPorEdad(Character cepa) {

	}

	void cargarPacientes() {
		
	}

	void guardarPacientes() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("pacientes.dat"));
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"pacientes.dat"));

			out.writeObject(null);

			out.close();
			in.close();
		} catch (IOException io) {
			System.out.println("Fichero no encontrado");
		}
	}

	public int getCantidadInfectados() {
		return cantidadInfectados;
	}

	public void setCantidadInfectados(int cantidadInfectados) {
		this.cantidadInfectados = cantidadInfectados;
	}

	public String getNombreVirus() {
		return nombreVirus;
	}

	public void setNombreVirus(String nombreVirus) {
		this.nombreVirus = nombreVirus;
	}

	public String getLocalidadDeOrigen() {
		return localidadDeOrigen;
	}

	public void setLocalidadDeOrigen(String localidadDeOrigen) {
		this.localidadDeOrigen = localidadDeOrigen;
	}

	public Map<Character, HashSet<Paciente>> getCepa() {
		return cepa;
	}

	public void setCepa(Map<Character, HashSet<Paciente>> cepa) {
		this.cepa = cepa;
	}
}
