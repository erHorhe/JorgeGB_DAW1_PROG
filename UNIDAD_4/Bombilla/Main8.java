package Bombilla;

public class Main8 {

	public static void main(String[] args) {
		
		Bombilla b1 = new Bombilla(false);
		Bombilla b2 = new Bombilla(true);
		
		System.out.print("�La bombilla est� encendida o apagada (ON/OFF)? -> ");
		b1.indicarEstadoBombilla();
		b1.tocarInterruptor();
		
		System.out.print("\n" + "�La bombilla est� encendida o apagada (ON/OFF)? -> ");
		b2.indicarEstadoBombilla();
		b2.tocarInterruptor();
	}
}
