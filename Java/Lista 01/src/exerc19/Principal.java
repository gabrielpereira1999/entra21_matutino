package exerc19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			float dist = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a distância percorrida","Distância",JOptionPane.PLAIN_MESSAGE)),
				  t = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o tempo total","Distância",JOptionPane.PLAIN_MESSAGE));
			JOptionPane.showInputDialog(null,"A velocidade média é de "+(dist/t)+"m/s","rro",JOptionPane.PLAIN_MESSAGE);
		
		
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
