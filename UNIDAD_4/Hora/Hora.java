package Hora;

public class Hora {

	//Attributes:
	private int hora;
	private int minutos;
	private int segundos;
	
	//Constructors:
	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	//Methods:
	public void mostrarHora(int n) {
		if(n+segundos >= 60) {
			this.minutos += 1;
			this.segundos = (n+segundos)-60;
		
			if(minutos>59) {
				this.minutos -= 60;
				this.hora += 1;
			
				if(hora > 23) {
					this.hora = 0;
				}
			}
		}
		System.out.println("Son las " + hora + ":" + minutos + ":" + segundos);
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
}
