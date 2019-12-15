package Maquinaria_EmpresaF;

import Personal_EmpresaF.Maquinista;

public class Tren {

	//Attributes:
	private Locomotora l;
	private Vagon v[] = new Vagon[5];
	private Maquinista m;
	
	//Constructors:
	public Tren(Locomotora l, Maquinista m) {
		this.l = l;
		this.m = m;
	}
	
	//Methods:
	public void mostrarInformacionTren() {
		System.out.println("MAQUINISTA:");
		m.mostrarInformacionMaquinista();
		System.out.println("\n" + "LOCOMOTORA:");
		l.mostrarInformacionLocomotora();
	}
	
	public Locomotora getL() {
		return l;
	}

	public void setL(Locomotora l) {
		this.l = l;
	}

	public Vagon[] getV() {
		return v;
	}

	public void setV(Vagon v[]) {
		this.v = v;
	}
	
	public Maquinista getM() {
		return m;
	}

	public void setM(Maquinista m) {
		this.m = m;
	}
}
