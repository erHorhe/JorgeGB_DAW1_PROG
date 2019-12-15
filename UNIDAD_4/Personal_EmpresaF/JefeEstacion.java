package Personal_EmpresaF;

public class JefeEstacion {

	//Attributes:
	private String nombreCompleto;
	private String dni;

	//Constructors:
	public JefeEstacion(String nombreCompleto, String dni) {
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
	}
	
	//Methods:
	public void mostrarInformacionJefeEstacion() {
		System.out.println("Nombre: " + nombreCompleto
				+ "\n" + "DNI: " + dni);
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
