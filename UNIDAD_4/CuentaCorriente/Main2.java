package CuentaCorriente;

public class Main2 {

	public static void main(String[] args) {
		
		CuentaCorriente c2 = new CuentaCorriente(4000);
		System.out.println("Saldo inicial: " + c2.getSaldo()
				+ "\n"
				+ "Límite de descubierto: " + c2.getLimiteDesc()
				+ "\n"
				+ "DNI: " + c2.getDni()
				+ "\n");
		
		CuentaCorriente c2_1 = new CuentaCorriente(3500,10,"54438719Q");
		System.out.println("Saldo inicial: " + c2_1.getSaldo()
				+ "\n"
				+ "Límite de descubierto: " + c2_1.getLimiteDesc()
				+ "\n"
				+ "DNI: " + c2.getDni());
	}
}