package exerc32;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
try{
			
			float orca = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o orçamento", "Orçamento", JOptionPane.PLAIN_MESSAGE));
			JOptionPane.showMessageDialog(null,"O orçamento fica:\n5% 30 dias : R$"+(orca*1.05)
					+"\n10% 60 dias : R$"+(orca*1.1)+"\n20% 90 dias : R$"+(orca*1.2)+
					"\n30% 120 dias : R$"+(orca*1.3)+"\n40% 180 dias : R$"+(orca*1.4)+
					"\n50% 270 dias : R$"+(orca*1.5),"Valores",JOptionPane.PLAIN_MESSAGE);
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
