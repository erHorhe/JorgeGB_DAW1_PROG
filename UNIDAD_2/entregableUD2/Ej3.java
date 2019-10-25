//Realiza un programa que lea un número entero positivo de la pantalla y que lo pase a binario:
package entregableUD2;

import javax.swing.JOptionPane;

public class Ej3 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Dame un número para tranformarlo en binario:");
		
		int num = Integer.parseInt(texto);
		
		String numBinario = transformarABinario(num);
		
		System.out.println(num + " en binario -> " + numBinario);

	}
	
	public static String transformarABinario(int numero) {
		
		String binario = "";
		String digito;
		
		for (int i=numero ; i>0 ; i/=2) {
			
			if (i % 2 == 1) {
				digito = "1";
			} else {
				digito = "0";
			}
			binario = digito + binario; //Añadimos el dígito al principio
		}
		return binario;
	}
}