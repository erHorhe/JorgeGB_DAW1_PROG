package Hora;

public class Hora12 extends Hora {

	protected EstadoDia estadoDia;

	public Hora12(int hora, int minuto, EstadoDia estadoDia) {
		super(hora, minuto);
		setHora(hora);
		this.estadoDia = estadoDia;
	}

	@Override
	public void inc() {
		super.inc();
		if (hora > 12) {
			hora = 1;
			//Comparación de si el estado de día es AM o PM; si es AM, lo cambia al otro y viceversa:
			estadoDia = estadoDia == EstadoDia.AM ? EstadoDia.PM : EstadoDia.AM;
		}
	}

	@Override
	public void setHora(int hora) {
		if (1 <= hora && hora <= 12) {
			this.hora = hora;
		}
	}

	@Override
	public String toString() {
		String result;
		result = super.toString(); //TOMAMOS EL MÉTODO DE LA SUPERCLASE
		result += " " + estadoDia;
		return result;
	}
}
