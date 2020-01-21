package Hora;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		setSegundo(segundo);
	}

	@Override
	public void inc() {
		segundo++;
		if (segundo > 59) {
			segundo = 0;
			super.inc();
		}
	}

	@Override
	public boolean equals(Object o) {
		HoraExacta otroReloj = (HoraExacta) o;
		boolean sonIguales = false;
		if (this.hora == otroReloj.hora && this.minuto == otroReloj.minuto
				&& this.segundo == otroReloj.segundo) {
			return true;
		} else {
			return sonIguales;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 || segundo <= 59) {
			this.segundo = segundo;
		}
	}
}
