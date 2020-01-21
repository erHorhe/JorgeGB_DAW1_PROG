package Hora;

public class Hora {

	protected int hora;
	protected int minuto;

	public Hora(int hora, int minutos) {
		this.hora = 0;
		this.minuto = 0;
		setHora(hora);
		setMinutos(minutos);
	}

	public void inc() {
		minuto++;
		if (minuto > 59) {
			minuto = 0;
			hora++;
			if (hora > 23) {
				hora = 0;
			}
		}
	}

	public void setHora(int hora) {
		if (hora >= 0 || hora <= 23) {
			this.hora = hora;
		}
	}

	public void setMinutos(int minutos) {
		if (minutos >= 0 || minutos <= 59) {
			this.minuto = minutos;
		}
	}

	public String toString() {
		return hora + ":" + minuto;
	}
}
