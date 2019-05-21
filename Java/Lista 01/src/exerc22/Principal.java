package exerc22;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			float lado1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o lado 1", "Lado 1", JOptionPane.PLAIN_MESSAGE)),
			      lado2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o lado 2", "Lado 2", JOptionPane.PLAIN_MESSAGE)),
			      lado3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o lado 3", "Lado 3", JOptionPane.PLAIN_MESSAGE)),
			      lado4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o lado 4", "Lado 4", JOptionPane.PLAIN_MESSAGE));
			if( (lado1 <= 0 ) || (lado2 <= 0 ) || (lado3 <= 0 ) || (lado4 <= 0 ) ) {
				JOptionPane.showMessageDialog(null,"Tamanho inválido encontrado","Erro",JOptionPane.PLAIN_MESSAGE);
			}else if( (lado1 == lado2) && (lado2==lado3) && (lado3==lado4) ) {
				JOptionPane.showMessageDialog(null,"O objeto é quadrado","Resposta",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"O objeto não é quadrado","Resposta",JOptionPane.PLAIN_MESSAGE);
			}
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
