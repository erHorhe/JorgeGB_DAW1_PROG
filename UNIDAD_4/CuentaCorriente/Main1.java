package CuentaCorriente;

public class Main1 {

	public static void main(String[] args) {
		
		Banco b1 = new Banco("TU TÍA FRAHCA", "Calle Diegorl, nº8");
		Banco b2 = new Banco("Er Horbanco", "Calle Telás Comido, nº6");
		CuentaCorriente c1 = new CuentaCorriente("Er Horhe", "53343849H", b1);
		CuentaCorriente c2 = new CuentaCorriente("Er Puyaneh", "17452732P");
		
		c1.ingresarDinero(100);
		System.out.println("\n" + "DATOS DEL USUARIO" + "\n" + "-----------------");
		c1.mostrarInformacion();
		
		System.out.println();	//SALTO DE LINEA
		
		if (c1.sacarDinero(60)) {
			System.out.println("Operación realizada exitosamente.");
		} else {
			System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
		}
		if (c1.sacarDinero(95)) {
			System.out.println("Operación realizada exitosamente.");
		} else {
			System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
		}
	
		System.out.println();
		
		c1.cambiarNombreB(b2);
		System.out.println("\n" + "Se ha cambiado el nombre del banco a <<" + b1.getNombre() + ">>");
		
		System.out.println("\n" + "DATOS DEL USUARIO" + "\n" + "-----------------");	//DOBLE SALTO DE LINEA
		c1.mostrarInformacion();
		
		System.out.println("\n" + "DATOS DEL USUARIO" + "\n" + "-----------------"); 
		c2.mostrarInformacion();
		
		c2.cambiarNombreB(b2);
		System.out.println("\n" + "Se ha cambiado el nombre del banco a <<" + b2.getNombre() + ">>");
		
		System.out.println("\n" + "DATOS DEL USUARIO" + "\n" + "-----------------");
		c2.mostrarInformacion();
	}
}