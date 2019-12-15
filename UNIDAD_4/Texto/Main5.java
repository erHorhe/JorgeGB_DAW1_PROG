package Texto;

public class Main5 {

	public static void main(String[] args) {
		
		Texto t1 = new Texto("PIKACHU", 2000);
		
		t1.agnadirCaracterPrincipio('W');
		t1.agnadirCaracterFinal('X');
		t1.agnadirCadenaPrincipio("skruppappapp");
		t1.agnadirCadenaFinal("hola_");
		t1.contarVocales();
	}
}
