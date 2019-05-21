package exerc10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			int coin1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de moedas de 1 centavo ","Moeda 1 centavo",JOptionPane.PLAIN_MESSAGE)),
			    coin5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de moedas de 5 centavos ","Moeda 5 centavos",JOptionPane.PLAIN_MESSAGE)),
			    coin10 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de moedas de 10 centavos ","Moeda 10 centavos",JOptionPane.PLAIN_MESSAGE)),
			    coin25 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de moedas de 25 centavos ","Moeda 25 centavos",JOptionPane.PLAIN_MESSAGE)),
			    coin50 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de moedas de 50 centavos ","Moeda 50 centavos",JOptionPane.PLAIN_MESSAGE)),
			    coin100 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de moedas de 1 real ","Moeda 1 real",JOptionPane.PLAIN_MESSAGE));
			JOptionPane.showMessageDialog(null,"Você tem um total de R$"+(coin1*0.01+coin5*0.05+coin10*0.1+coin25*0.25+coin50*0.5+coin100),"Valo total",JOptionPane.PLAIN_MESSAGE);
		
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
