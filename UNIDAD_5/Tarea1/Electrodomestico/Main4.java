package Electrodomestico;

public class Main4 {

	public static void main(String[] args) {

		Electrodomestico arrayElectrodomestico[] = new Electrodomestico[10];
		arrayElectrodomestico[0] = new Electrodomestico(40, Color.AZUL);
		arrayElectrodomestico[1] = new Lavadora(200, 130, Color.GRIS,
				Consumo_energetico.F, 5);
		arrayElectrodomestico[2] = new Lavadora();
		arrayElectrodomestico[3] = new Television(200, 80);
		arrayElectrodomestico[4] = new Television(100, Color.ROJO,
				Consumo_energetico.D, 30, 30, true);
		arrayElectrodomestico[5] = new Television(151, 500);
		arrayElectrodomestico[6] = new Television();
		arrayElectrodomestico[7] = new Lavadora(201, 110, Color.NEGRO,
				Consumo_energetico.B, 5);
		arrayElectrodomestico[8] = new Lavadora(300, 300);
		arrayElectrodomestico[9] = new Electrodomestico(60, Color.BLANCO,
				Consumo_energetico.E, 20);
		System.out.println("ELETRODOMESTICO" + "\n" + "---------------");
		for (int i = 0; i < arrayElectrodomestico.length; i++) {
			System.out.println("POSICIÓN " + i + "\n"
					+ arrayElectrodomestico[i].toString() + "\n");
		}

		Lavadora arrayLavadora[] = new Lavadora[10];
		arrayLavadora[0] = new Lavadora();
		arrayLavadora[1] = new Lavadora(300, 110);
		arrayLavadora[2] = new Lavadora(400, 120, Color.BLANCO,
				Consumo_energetico.A, 5);
		arrayLavadora[3] = new Lavadora();
		arrayLavadora[4] = new Lavadora();
		arrayLavadora[5] = new Lavadora();
		arrayLavadora[6] = new Lavadora();
		arrayLavadora[7] = new Lavadora();
		arrayLavadora[8] = new Lavadora();
		arrayLavadora[9] = new Lavadora();
		for (int i = 0; i < arrayLavadora.length; i++) {
			System.out.println("POSICIÓN " + i + "\n"
					+ arrayLavadora[i].toString() + "\n");
		}

		Television arrayTelevision[] = new Television[10];
		arrayTelevision[0] = new Television();
		arrayTelevision[1] = new Television(132, 69);
		arrayTelevision[2] = new Television();
		arrayTelevision[3] = new Television();
		arrayTelevision[4] = new Television(1, Color.ROJO,
				Consumo_energetico.F, 50, 40, true);
		arrayTelevision[5] = new Television(199, Color.GRIS,
				Consumo_energetico.C, 99, 60, false);
		arrayTelevision[6] = new Television(30, Color.NEGRO,
				Consumo_energetico.B, 45, 54, true);
		arrayTelevision[7] = new Television();
		arrayTelevision[8] = new Television(202, 66);
		arrayTelevision[9] = new Television();
		for (int i = 0; i < arrayTelevision.length; i++) {
			System.out.println("POSICIÓN " + i + "\n"
					+ arrayTelevision[i].toString() + "\n");
		}
	}
}