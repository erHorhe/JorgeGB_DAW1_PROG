package Instrumento;

public class Campana extends Instrumento {

	public Campana() {
		super();
	}

	@Override
	public void interpretar() {
		for (int i = 0; i < cantidadNotas; i++) {
			switch (notasMusicales[i]) {
			case DO:
				System.out.println("*donggg ");
				break;
			case RE:
				System.out.println("*renggg ");
				break;
			case MI:
				System.out.println("*minggg ");
				break;
			case FA:
				System.out.println("*fanggg");
				break;
			case SOL:
				System.out.println("*solnggg ");
				break;
			case LA:
				System.out.println("*langgg ");
				break;
			case SI:
				System.out.println("*singgg ");
				break;
			}
		}
	}
}
