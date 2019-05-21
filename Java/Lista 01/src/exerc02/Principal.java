package exerc02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		short valor = Short.parseShort(JOptionPane.showInputDialog(null,"Por favor, informe o valor do produto","Valor do "
				+"produto",JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showInternalMessageDialog(null, "Com um desconto de 10%, o valor do seu produto fica R$"+(valor*0.9),
				"Valor com desconto",JOptionPane.PLAIN_MESSAGE);
	}

}
