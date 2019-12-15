package Maquinaria_EmpresaF;

import Personal_EmpresaF.*;

public class Main9 {

	public static void main(String[] args) {
		
		JefeEstacion j = new JefeEstacion("Homer Simpson", "5015734F");
		Maquinista maq = new Maquinista("Aquiles Castro", "65008152W", 6000.2, "Alto");
		Mecanico mec = new Mecanico("Ricardo el Titubeante", "+34 764 123 098", "Instalador de maquinaria");
		Vagon v1 = new Vagon(5000, 1660, TipoMercancia.CABRAS);
		Vagon v2 = new Vagon(5000, 2000, TipoMercancia.LADRILLOS);
		Vagon v3 = new Vagon(5000, 1003, TipoMercancia.MIEL);
		Vagon v4 = new Vagon(6000, 2499, TipoMercancia.QUESO);
		Vagon v5 = new Vagon(6000, 50, TipoMercancia.PELUCHES);
		Locomotora l = new Locomotora("141F 2352", 550, 1977, mec);
		Tren t = new Tren(l, maq);
		
		System.out.println("JEFES DE ESTACIÓN" + "\n" + "-----------------");
		j.mostrarInformacionJefeEstacion();
		
		System.out.println("\n" + "MAQUINISTAS" + "\n" + "-----------");
		maq.mostrarInformacionMaquinista();
		
		System.out.println("\n" + "MECÁNICOS" + "\n" + "---------");
		mec.mostrarInformacionMecanico();
		
		System.out.println("\n" + "VAGONES" + "\n" + "-------");
		v1.mostrarInformacionVagon();
		v2.mostrarInformacionVagon();
		v3.mostrarInformacionVagon();
		v4.mostrarInformacionVagon();
		v5.mostrarInformacionVagon();
		
		System.out.println("\n" + "TREN" + "\n" + "----------");
		t.mostrarInformacionTren();
	}
}
