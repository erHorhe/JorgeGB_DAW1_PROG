package materiales;

public abstract class Materiales {

	// Minecraft minecraft;
	private String nombre;
	private int masa;
	private int capacidadDeQuemarse;
	private int capacidadDeDiluirse;
	private boolean movible;

	public Materiales(String nombre, int masa, int capacidadDeQuemarse,
			int capacidadDeDiluirse, boolean movible) {
		this.nombre = nombre;
		this.masa = masa; // Entre 1 y 1000
		this.capacidadDeQuemarse = capacidadDeQuemarse; // Entre 0 y 100
		this.capacidadDeDiluirse = capacidadDeDiluirse; // Entre 0 y 100
		this.movible = movible;
	}

	// A�adir� un material, pero nunca se podr� tener m�s de 10:
	void agnadirMateriales() {
		int contadorMateriales = 0;
		for (int i = 0; i < getArrayMateriales().length; i++) {
			if (getArrayMateriales()[i] != null) {
				contadorMateriales++;
			}
		}
		if (contadorMateriales == 10) {
			System.out.println("Ya no se puede a�adir ning�n material m�s.");
		} else {

		}
	}

	// Borrar� el material sin masa, actualizando el tama�o de la lista:
	void borrarMaterialSinMasa() {
		// for (int i = 0; i < getArrayMateriales().length; i++) {
		// if (getArrayMateriales()[i].getMasa() <= 0) {
		// arrayMateriales = Arrays.copyOf(getArrayMateriales(),
		// getArrayMateriales().length - 1);
		// }
		// }
	}

	// Mostrar� el estado de todos los materiales por consola:
	String mostrarEstado() {
		return "Nombre: " + getNombre() + "\n" + "Masa: " + getMasa() + "\n"
				+ "Capacidad de quemarse: " + getCapacidadDeQuemarse() + "\n"
				+ "Capacidad de diluirse: " + getCapacidadDeDiluirse();
	}

	// Me avisar� cuando haya un solo material con masa y que muestre toda su
	// informaci�n por pantalla:
	void ultimoMaterialQueQueda() {
		for (int i = 0; i < getArrayMateriales().length; i++) {
			if (getArrayMateriales()[i].getMasa() <= 0) {
				getArrayMateriales()[i].mostrarEstado();
				break;
			}
		}
	}

	public Materiales[] getArrayMateriales() {
		return getArrayMateriales();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMasa() {
		return masa;
	}

	public void setMasa(int masa) {
		this.masa = masa;
	}

	public int getCapacidadDeQuemarse() {
		return capacidadDeQuemarse;
	}

	public void setCapacidadDeQuemarse(int capacidadDeQuemarse) {
		this.capacidadDeQuemarse = capacidadDeQuemarse;
	}

	public int getCapacidadDeDiluirse() {
		return capacidadDeDiluirse;
	}

	public void setCapacidadDeDiluirse(int capacidadDeDiluirse) {
		this.capacidadDeDiluirse = capacidadDeDiluirse;
	}

	public boolean isMovible() {
		return movible;
	}

	public void setMovible(boolean movible) {
		this.movible = movible;
	}
}