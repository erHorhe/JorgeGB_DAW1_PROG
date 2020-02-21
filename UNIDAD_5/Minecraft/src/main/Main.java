package main;

import materiales.*;
import materiales.Cristal.Tipo;
import herramientas.*;

public class Main {

	public static void main(String[] args) {

		Materiales m1 = new Cristal("Zafiro", 50, 10, 5, false,
				Tipo.TRANSLUCIDO);
		Materiales m2 = new Cristal("Rubí", 41, 10, 5, false, Tipo.TRANSLUCIDO);
		Materiales m3 = new Metal("Hierro", 347, 50, 2, true, false);
		Materiales m4 = new Rocas("Obsidiana", 110, 0, 0, true, 900);
		Materiales m5 = new Rocas("Andesita", 99, 0, 0, true, 333);
	}
}