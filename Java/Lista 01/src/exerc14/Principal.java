package exerc14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			float vcarro= Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do carro","Valor do carro",JOptionPane.PLAIN_MESSAGE));
			      
			
			if(vcarro <= 0) {
				JOptionPane.showMessageDialog(null,"Valor inválido","Valores",JOptionPane.PLAIN_MESSAGE);
		    }else if(vcarro <= 12000) {
				JOptionPane.showMessageDialog(null,"Não há impostos para esse valor e o repasse para o distribuidor foi "
						+ "de 5% que equivale a R$"+(vcarro*0.05),"Valores",JOptionPane.PLAIN_MESSAGE);
			}else if(vcarro <=25000) {
				JOptionPane.showMessageDialog(null,"O valor do carro sem impostos é de R$"+(vcarro*0.85)+
						" e o percentual do distribuidor é de 10%, equivalente a R$"+(vcarro*0.1),"Valores",
						JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"O valor do carro sem impostos é de R$"+(vcarro*0.8)+
						" e o percentual do distribuidor é de 15%, equivalente a R$"+(vcarro*0.15),"Valores",
						JOptionPane.PLAIN_MESSAGE);
			}
					
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
