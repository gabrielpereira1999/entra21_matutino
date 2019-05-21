package exerc07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			double num = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira um número para ver sua tabuada","Escolha do número",JOptionPane.PLAIN_MESSAGE));   
			byte i = 0;
			while(i<=10) {
				System.out.println(num+" X "+i+" = "+(num*i));
				i += 1;
			}
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
