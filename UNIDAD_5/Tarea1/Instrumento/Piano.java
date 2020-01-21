package Instrumento;

public class Piano extends Instrumento {

	public Piano() {
		super();
	}

	@Override
	public void interpretar() {
		for (int i = 0; i < cantidadNotas; i++) {
			switch (notasMusicales[i]) {
			case DO:
				System.out.println("*doo ");
				break;
			case RE:
				System.out.println("*ree ");
				break;
			case MI:
				System.out.println("*mii ");
				break;
			case FA:
				System.out.println("*faa ");
				break;
			case SOL:
				System.out.println("*soll ");
				break;
			case LA:
				System.out.println("*laa ");
				break;
			case SI:
				System.out.println("*sii ");
				break;
			}
		}
	}
}
