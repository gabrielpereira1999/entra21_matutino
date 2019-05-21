package exerc08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int i,num;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número para saber seu fatorial(inteiro e maior ou igual a 1)"));
			if(num>=1) {
				for(i=(num-1);i>=1;i--) {
					JOptionPane.showMessageDialog(null,""+num+" X "+i+" = "+(num*i));
					num *= i;
				}
			
			}else {
				JOptionPane.showMessageDialog(null,"O número inserido não possui fatorial");
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro, o valor inserido não é um inteiro","Erro",JOptionPane.PLAIN_MESSAGE);
		}
	}

}
