package exerc02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String texto;
		int vogal = 0;
		texto = JOptionPane.showInputDialog("Informe uma palavra/frase");
		for(int i = 0;i<texto.length();i++) {
			if( (texto.charAt(i)=='a') || (texto.charAt(i)=='e') || (texto.charAt(i)=='i') || (texto.charAt(i)=='o') || (texto.charAt(i)=='u')) {
				vogal++;
			}
		}
		JOptionPane.showMessageDialog(null,"Quantidade de vogais = "+vogal);

	}

}
