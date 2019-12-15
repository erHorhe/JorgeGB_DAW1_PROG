package Texto;

public class Texto {

	//Attributes:
	private String cadena;
	private long longitudMax;
	String cadenaVocales = "aeiouαινσϊ";
		
	//Constructors:
	public Texto(String cadena, long longitudMax) {
		this.cadena = cadena;
		this.longitudMax = longitudMax;
	}
		
	//Methods:
	public String agnadirCaracterPrincipio(char caracterPrincipio) {
		String caracterAlPrincipio = Character.toString(caracterPrincipio);
		if (cadena.length() < longitudMax) {
			this.cadena = caracterAlPrincipio.concat(this.cadena);
		}
		return cadena;
	}
	public String agnadirCaracterFinal(char caracterFinal) {
		if (cadena.length() < longitudMax) {
			this.cadena+=caracterFinal;
		}
		return cadena;
	}
	public String agnadirCadenaPrincipio(String cadenaPrincipio) {
		if (cadena.length() < longitudMax) {
			this.cadena = cadenaPrincipio.concat(this.cadena);
		}
		return cadena;
	}
	public String agnadirCadenaFinal(String cadenaFinal) {
		if (cadena.length()+cadenaFinal.length() < longitudMax) {
			this.cadena+=cadenaFinal;
		}
		return cadena;
	}
	private boolean esVocal(char caracter) {
		boolean es_vocal = false;
		caracter = Character.toLowerCase(caracter);
		if (cadenaVocales.indexOf(caracter) != -1) {
			es_vocal = true;
		}
		return es_vocal;
	}
	public void contarVocales() {
		int contadorVocales = 0;
		for (int i=0 ; i<cadena.length() ; i++) {
			if (esVocal(cadena.charAt(i))) {
				contadorVocales++;
			}
		}
		System.out.println(cadena + " tiene " + contadorVocales + " vocales.");
	}
	
	public long getLongitudMax() {
		return longitudMax;
	}
	public void setLongitudMax(int longitudMax) {
		this.longitudMax = longitudMax;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
		
}
