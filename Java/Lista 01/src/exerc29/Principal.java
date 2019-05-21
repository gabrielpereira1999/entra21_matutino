package exerc29;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
try{
			
			int hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora", "Hora", JOptionPane.PLAIN_MESSAGE));
			Object[] options1 = {"França", "Japão", "África do Sul"};   
			int pais = JOptionPane.showOptionDialog(null,"Escolha um país para saber a hora equivalente",
					"País",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options1,options1[0]);
			if(hora>24) {
				JOptionPane.showMessageDialog(null,"Hora inválida","erro",JOptionPane.PLAIN_MESSAGE);
			}
			else {
				switch(pais) {
					case 0: if((hora+5) > 24) {
								JOptionPane.showMessageDialog(null,"Na França agora é "+(hora + 5 -24),"Resposta",JOptionPane.PLAIN_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null,"Na França agora é "+(hora + 5),"Resposta",JOptionPane.PLAIN_MESSAGE);
							}
					break;
					case 1: if((hora+12) > 24) {
								JOptionPane.showMessageDialog(null,"No Japão agora é "+(hora + 12 -24),"Resposta",JOptionPane.PLAIN_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null,"No Japão agora é "+(hora + 12),"Resposta",JOptionPane.PLAIN_MESSAGE);
							}
					break;
					case 2: if((hora+5) > 24) {
								JOptionPane.showMessageDialog(null,"Na África do Sul agora é "+(hora + 5 -24),"Resposta",JOptionPane.PLAIN_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null,"Na África do Sul agora é "+(hora + 5),"Resposta",JOptionPane.PLAIN_MESSAGE);
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
