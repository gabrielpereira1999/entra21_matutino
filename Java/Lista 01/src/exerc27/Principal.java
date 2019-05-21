package exerc27;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano a ser verificado","Ano",JOptionPane.PLAIN_MESSAGE));
			if( ((ano%4)==0)) {
				if((ano%100)==0) {
					if((ano%400)==0) {
						JOptionPane.showMessageDialog(null,"O ano "+ano+" é bissexto","Fim",JOptionPane.PLAIN_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null,"O ano "+ano+" não é bissexto","Fim",JOptionPane.PLAIN_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null,"O ano "+ano+" é bissexto","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null,"O ano "+ano+" não é bissexto","Fim",JOptionPane.PLAIN_MESSAGE);
			}
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
