package exerc17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			float num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Primeiro número","N° 1",JOptionPane.PLAIN_MESSAGE)),
		          num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Segundo número","N° 2",JOptionPane.PLAIN_MESSAGE));
			
			JOptionPane.showMessageDialog(null,"O resultado de "+num1+" / "+num2+" é: "+(num1/num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
