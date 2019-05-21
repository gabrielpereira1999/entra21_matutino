package exerc15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			byte quarto = Byte.parseByte(JOptionPane.showInputDialog(null,"Selecione um tipo de quarto. Digite 1 para apartamento simples," + 
					" 2 para apartamento duplo e 3 para su�te de luxo ","Sele��o do quarto",JOptionPane.PLAIN_MESSAGE));
			short dias = Short.parseShort(JOptionPane.showInputDialog(null,"Quantos dias voc� deseja ficar?",
					"Tempo de estadia",JOptionPane.PLAIN_MESSAGE));
			if(dias<1) {
				JOptionPane.showMessageDialog(null,"O n�mero de dias inserido n�o � v�lido","Erro",JOptionPane.PLAIN_MESSAGE);
			}else {switch(quarto) {
					case 1:
						JOptionPane.showMessageDialog(null,"O valor a pagar ser� de R$"+(45*dias)+",00","Apartamento simples",JOptionPane.PLAIN_MESSAGE);
					break;
				
					case 2:
						JOptionPane.showMessageDialog(null,"O valor a pagar ser� de R$"+(65*dias)+",00","Apartamento duplo",JOptionPane.PLAIN_MESSAGE);
					break;
				
					case 3:
						JOptionPane.showMessageDialog(null,"O valor a pagar ser� de R$"+(110*dias)+",00","Su�te de luxo",JOptionPane.PLAIN_MESSAGE);
					break;
				
					default:
						JOptionPane.showMessageDialog(null,"O valor do tipo de quarto selecionado n�o � valido","Erro",JOptionPane.PLAIN_MESSAGE);
				}
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}
	}

}
