package exerc13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um n�mero","N�mero",JOptionPane.PLAIN_MESSAGE));
			JOptionPane.showMessageDialog(null,"O antecessor � "+(num-1)+" e o sucessor � o "+(num+1),"Fim",JOptionPane.PLAIN_MESSAGE);
					
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
