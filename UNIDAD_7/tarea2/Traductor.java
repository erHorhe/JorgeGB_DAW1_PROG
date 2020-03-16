package tarea2;

import java.util.HashMap;

public class Traductor {

	private HashMap<String, String> diccionario;
	private String nombreFichero;

	public Traductor(HashMap<String, String> diccionario, String nombreFichero) {
		this.setDiccionario(diccionario);
		this.nombreFichero = nombreFichero;
	}

	public HashMap<String, String> getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(HashMap<String, String> diccionario) {
		this.diccionario = diccionario;
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}
}
