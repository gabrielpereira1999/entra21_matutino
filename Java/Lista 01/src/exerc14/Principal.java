package exerc14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			float vcarro= Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do carro","Valor do carro",JOptionPane.PLAIN_MESSAGE));
			      
			
			if(vcarro <= 0) {
				JOptionPane.showMessageDialog(null,"Valor inv�lido","Valores",JOptionPane.PLAIN_MESSAGE);
		    }else if(vcarro <= 12000) {
				JOptionPane.showMessageDialog(null,"N�o h� impostos para esse valor e o repasse para o distribuidor foi "
						+ "de 5% que equivale a R$"+(vcarro*0.05),"Valores",JOptionPane.PLAIN_MESSAGE);
			}else if(vcarro <=25000) {
				JOptionPane.showMessageDialog(null,"O valor do carro sem impostos � de R$"+(vcarro*0.85)+
						" e o percentual do distribuidor � de 10%, equivalente a R$"+(vcarro*0.1),"Valores",
						JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"O valor do carro sem impostos � de R$"+(vcarro*0.8)+
						" e o percentual do distribuidor � de 15%, equivalente a R$"+(vcarro*0.15),"Valores",
						JOptionPane.PLAIN_MESSAGE);
			}
					
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
