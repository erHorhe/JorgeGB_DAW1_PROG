package Personal_EmpresaF;

public class Mecanico {

	//Attributes:
	private String nombreCompleto;
	private String numTlfno;
	private String especialidad;
	
	//Constructors:
	public Mecanico(String nombreCompleto, String numTlfno, String especialidad) {
		this.nombreCompleto = nombreCompleto;
		this.numTlfno = numTlfno;
		this.especialidad = especialidad;
	}

	//Methods:
	public void mostrarInformacionMecanico() {
		System.out.println("Nombre: " + nombreCompleto
				+ "\n" + "Nº de teléfono: " + numTlfno
				+ "\n" + "Especialidad: " + especialidad);
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNumTlfno() {
		return numTlfno;
	}

	public void setNumTlfno(String numTlfno) {
		this.numTlfno = numTlfno;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
