package exerc30;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			float valorhora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor ganho por hora", "R$/h", JOptionPane.PLAIN_MESSAGE)),
				  horatrab = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o número de horas trabalhadas normalmente", "Horas trabalhadas", JOptionPane.PLAIN_MESSAGE)),
				  horaesp = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o número de horas extras trabalhadas", "Horas extras", JOptionPane.PLAIN_MESSAGE));
			JOptionPane.showMessageDialog(null,"O salário bruto é de: R$"+((valorhora*horatrab)+(horaesp*2*valorhora)),"Salário",JOptionPane.PLAIN_MESSAGE);
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
