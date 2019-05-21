package exerc31;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			String[][] dados = new String[3][2]; String nvelho="";
			int i=0,velho=0 ;
			
			while(i<=2) {
					dados[i][0] = JOptionPane.showInputDialog(null, "Informe o nome", "Nome", JOptionPane.PLAIN_MESSAGE);
					dados[i][1] = JOptionPane.showInputDialog(null, "Informe a idade", "Idade", JOptionPane.PLAIN_MESSAGE);
					if (Integer.parseInt(dados[i][1]) > velho ) {
						velho = Integer.parseInt(dados[i][1]);
						nvelho = dados[i][0];
					}
					i+=1;
			}
			JOptionPane.showMessageDialog(null,"O mais velho é "+nvelho+" com "+velho+" anos","Fim",JOptionPane.PLAIN_MESSAGE);
			

		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
