package exerc12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			float vmax= Float.parseFloat(JOptionPane.showInputDialog(null,"Velocidade m�xima permitida","Velocidade",JOptionPane.PLAIN_MESSAGE)),
			      vcarro = Float.parseFloat(JOptionPane.showInputDialog(null,"Velocidade do carro","Velocidade",JOptionPane.PLAIN_MESSAGE)),
			      dif = vmax - vcarro;
			if(dif >= 0) {
				JOptionPane.showMessageDialog(null,"Dentro da velocidade permitida, bom motorista","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if(dif >= -10) {
				JOptionPane.showMessageDialog(null,"At� 10 Km/h acima da velocidade m�xima, multado em R$50,00","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if(dif >= -30) {
				JOptionPane.showMessageDialog(null,"Entre 11 e 30 Km/h acima da velocida m�xima, multado em R$100,00","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"Mais que 30 Km/h acima da velocida m�xima, multado em R$200,00","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}
					
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
