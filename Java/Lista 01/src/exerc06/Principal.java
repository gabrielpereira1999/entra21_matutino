package exerc06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o primeiro número","número 1",JOptionPane.PLAIN_MESSAGE)),
			       num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo número","número 2",JOptionPane.PLAIN_MESSAGE));
			if( num1 == num2) {
				JOptionPane.showMessageDialog(null,"A soma resulta em "+(num1+num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"A multiplicação resulta em "+(num1*num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}
		
	}

}
