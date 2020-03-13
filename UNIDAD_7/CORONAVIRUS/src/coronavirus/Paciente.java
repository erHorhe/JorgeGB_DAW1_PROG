package coronavirus;

public class Paciente {

	private String nombre;
	private int edad;
	private double peso;
	private boolean tiene_vacuna;
	private Medico medico;
	private Character cepa;
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isTiene_vacuna() {
		return tiene_vacuna;
	}
	public void setTiene_vacuna(boolean tiene_vacuna) {
		this.tiene_vacuna = tiene_vacuna;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Character getCepa() {
		return cepa;
	}
	public void setCepa(Character cepa) {
		this.cepa = cepa;
	}
}
