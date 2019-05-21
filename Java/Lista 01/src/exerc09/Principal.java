package exerc09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o primeiro valor ","Primeiro Número",JOptionPane.PLAIN_MESSAGE)),
				   num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo valor ","Segundo Número",JOptionPane.PLAIN_MESSAGE)),
				   num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o terceiro valor ","Terceiro Número",JOptionPane.PLAIN_MESSAGE)),
				   menor = num1;
			if(menor > num2) {
				menor = num2;
			}
		    if (menor > num3) {
				menor = num3;
			}
			JOptionPane.showMessageDialog(null,"O menor valor é "+menor,"Menor Valor",JOptionPane.PLAIN_MESSAGE);
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
