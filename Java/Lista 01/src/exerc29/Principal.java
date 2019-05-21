package exerc29;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
try{
			
			int hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora", "Hora", JOptionPane.PLAIN_MESSAGE));
			Object[] options1 = {"Fran�a", "Jap�o", "�frica do Sul"};   
			int pais = JOptionPane.showOptionDialog(null,"Escolha um pa�s para saber a hora equivalente",
					"Pa�s",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options1,options1[0]);
			if(hora>24) {
				JOptionPane.showMessageDialog(null,"Hora inv�lida","erro",JOptionPane.PLAIN_MESSAGE);
			}
			else {
				switch(pais) {
					case 0: if((hora+5) > 24) {
								JOptionPane.showMessageDialog(null,"Na Fran�a agora � "+(hora + 5 -24),"Resposta",JOptionPane.PLAIN_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null,"Na Fran�a agora � "+(hora + 5),"Resposta",JOptionPane.PLAIN_MESSAGE);
							}
					break;
					case 1: if((hora+12) > 24) {
								JOptionPane.showMessageDialog(null,"No Jap�o agora � "+(hora + 12 -24),"Resposta",JOptionPane.PLAIN_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null,"No Jap�o agora � "+(hora + 12),"Resposta",JOptionPane.PLAIN_MESSAGE);
							}
					break;
					case 2: if((hora+5) > 24) {
								JOptionPane.showMessageDialog(null,"Na �frica do Sul agora � "+(hora + 5 -24),"Resposta",JOptionPane.PLAIN_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null,"Na �frica do Sul agora � "+(hora + 5),"Resposta",JOptionPane.PLAIN_MESSAGE);
							}
					break;
				
				}
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
