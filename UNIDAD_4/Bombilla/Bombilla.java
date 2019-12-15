package Bombilla;

public class Bombilla {

	//Attributes:
	private boolean on_off;
	private static boolean interruptor;
	
	//Constructors:
	public Bombilla(boolean on_off) {
		this.on_off = on_off;
	}
	
	//Methods:
	public void indicarEstadoBombilla() {
		if (on_off) {
			System.out.println(EstadoBombilla.ON);
		} else {
			System.out.println(EstadoBombilla.OFF);
		}
	}
	
	public void tocarInterruptor() {
		if (on_off) {
			this.on_off = false;
			System.out.println("Has apagado las luces.");
		} else {
			this.on_off = true;
			System.out.println("Has encendido las luces.");
		}
	}
	
	public boolean getOn_off() {
		return on_off;
	}

	public void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}

	public static boolean getInterruptor() {
		return interruptor;
	}

	public static void setInterruptor(boolean interruptor) {
		Bombilla.interruptor = interruptor;
	}
}
