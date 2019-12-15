package Emisoras;

public class Main7 {

	public static void main(String[] args) {
		
		Emisora e = new Emisora(10);
		
		System.out.print("Frecuencia inicial: " + e.getControlador()
				+ "\n"
				+ "Bajada de frecuencia a ");
		System.out.println(e.bajarFrecuencia() + "\n");
		
		System.out.print("Frecuencia actual: " + e.getControlador()
				+ "\n"
				+ "Subida de frecuencia a ");
		System.out.println(e.subirFrecuencia() + "\n");
		System.out.print("Frecuencia actual: " + e.getControlador());
	}
}
