package Maquinaria_EmpresaF;

class Vagon {

	//Attributes:
	private double capMax;	//EN KILOS
	private double capActual;
	private TipoMercancia tm;

	//Constructors:
	public Vagon(double capMax, double capActual, TipoMercancia tm) {
		this.capMax = capMax;
		this.capActual = capActual;
		this.tm = tm;
	}
	
	//Methods:
	public void mostrarInformacionVagon() {
		System.out.println("Capacidad máxima: " + capMax
				+ "\n" + "Capacidad actual: " + capActual
				+ "\n" + "Mercancía: " + tm);
	}
	
	public double getCapMax() {
		return capMax;
	}

	public void setCapMax(double capMax) {
		this.capMax = capMax;
	}

	public double getCapActual() {
		return capActual;
	}

	public void setCapActual(double capActual) {
		this.capActual = capActual;
	}

	public TipoMercancia getTm() {
		return tm;
	}

	public void setTm(TipoMercancia tm) {
		this.tm = tm;
	}
}