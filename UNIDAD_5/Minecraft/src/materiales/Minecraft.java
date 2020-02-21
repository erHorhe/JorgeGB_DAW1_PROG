package materiales;

public class Minecraft {

	private final short MAX = 10;

	private Materiales arrayMateriales[] = new Materiales[MAX];

	public Materiales[] getArrayMateriales() {
		return arrayMateriales;
	}

	public void setArrayMateriales(Materiales arrayMateriales[]) {
		this.arrayMateriales = arrayMateriales;
	}
}