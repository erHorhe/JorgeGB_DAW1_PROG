package Instrumento;

public class Main2 {

	public static void main(String[] args) {

		Campana c = new Campana();
		Piano p = new Piano();

		System.out.println("Toquemos la campana:");
		c.add(Notas.DO);
		c.add(Notas.SOL);
		c.add(Notas.RE);
		c.interpretar();

		System.out.println("\n" + "Toquemos el piano:");
		p.add(Notas.FA);
		p.add(Notas.LA);
		p.add(Notas.SI);
		p.add(Notas.MI);
		p.interpretar();
	}
}
