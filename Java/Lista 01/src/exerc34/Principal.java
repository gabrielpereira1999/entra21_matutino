package exerc34;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
try{
			Object[] options1 = {"Poupan�a", "CDB", "LCI"};
			float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor a ser aplicado", "Valor", JOptionPane.PLAIN_MESSAGE));
			int tipo = JOptionPane.showOptionDialog(null,"Escolha um meio de aplica��o","Aplica��o",JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE,null,options1,options1[0]);
			switch(tipo) {
			 case 0: JOptionPane.showMessageDialog(null,"Voc� receber� R$"+(0.044*valor)+" pela poupan�a",
					 "Fim",JOptionPane.PLAIN_MESSAGE);
			 break;
			 case 1: JOptionPane.showMessageDialog(null,"Voc� receber� R$"+(0.0465*valor)+" pela aplica��o em CDB",
					 "Fim",JOptionPane.PLAIN_MESSAGE);
			 break;
			 case 2: JOptionPane.showMessageDialog(null,"Voc� receber� R$"+(0.058*valor)+" pela aplica��o em LCI",
					 "Fim",JOptionPane.PLAIN_MESSAGE);
			}
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
