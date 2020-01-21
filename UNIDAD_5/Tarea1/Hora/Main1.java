package Hora;

public class Main1 {

	public static void main(String[] args) {

		Hora h = new Hora(22, 59);
		h.inc();
		System.out.println("Hora -> " + h.toString());

		Hora12 h12 = new Hora12(12, 23, EstadoDia.AM);
		h12.inc(); // INCREMENTAMOS LOS MINUTOS EN UNA UNIDAD
		System.out.println("Hora12 -> " + h12.toString());
		
		HoraExacta he1 = new HoraExacta(12, 12, 12);
		HoraExacta he2 = new HoraExacta(12, 12, 12);
		System.out.println("\n" + "¿Son iguales las horas? -> "
				+ he1.equals(he2));
	}
}
