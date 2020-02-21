package herramientas;

import materiales.Materiales;

public interface Minar {

	// Recibe 100 de masa:
	void hacer(Materiales material);

	// Resta 100 de masa:
	void deshacer(Materiales material);
}
