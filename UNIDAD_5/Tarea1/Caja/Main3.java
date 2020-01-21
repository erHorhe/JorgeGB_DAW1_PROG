package Caja;

public class Main3 {

	public static void main(String[] args) {

		Etiqueta e = new Etiqueta("Jorge Gómez Blanco", "Calle Chamizo", 0);
		Caja c = new Caja(5, 4, 3, Unidades.cm, e);
		System.out.println("CAJA" + "\n" + c.toString());
		System.out.println("\n" + "DATOS DEL SOLICITANTE" + "\n"
				+ "---------------------" + "\n" + e.toString());

		CajaCarton cj = new CajaCarton(6, 6, 4, Unidades.cm, e);
		System.out.println("\n" + "CAJACARTÓN" + "\n" + cj.toString());
	}
}
