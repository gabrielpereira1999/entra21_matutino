package exerc35;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			String nome = JOptionPane.showInputDialog(null, "Informe o nome", "Nome", JOptionPane.PLAIN_MESSAGE);
			float sal = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o salário bruto", "Salário bruto", JOptionPane.PLAIN_MESSAGE));
			short falta = Short.parseShort(JOptionPane.showInputDialog(null, "Informe o número de faltas", "Faltas", JOptionPane.PLAIN_MESSAGE)); 
			      
			if( (sal<=0) || (falta<0))
				JOptionPane.showMessageDialog(null,"Dados incorretos","Aviso",JOptionPane.PLAIN_MESSAGE);
			else if(sal<=937) {
				if(falta == 0) {
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.94)+100),"Fim",JOptionPane.PLAIN_MESSAGE);
				}else if (falta <=5) {
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.94)-50),"Fim",JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.94)-100),"Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(sal<=1999.99) {
				if(falta == 0) 
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.89)+100),"Fim",JOptionPane.PLAIN_MESSAGE);
				else if (falta <=5) 
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.89)-50),"Fim",JOptionPane.PLAIN_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.89)-100),"Fim",JOptionPane.PLAIN_MESSAGE);
			}else if(sal<=3449.99) {
				if(falta == 0) 
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.86)+100),"Fim",JOptionPane.PLAIN_MESSAGE);
				else if (falta <=5) 
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.86)-50),"Fim",JOptionPane.PLAIN_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.86)-100),"Fim",JOptionPane.PLAIN_MESSAGE);
			}else if(sal<=5999.99) {
				if(falta == 0) 
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.83)+100),"Fim",JOptionPane.PLAIN_MESSAGE);
				else if (falta <=5) 
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.83)-50),"Fim",JOptionPane.PLAIN_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.83)-100),"Fim",JOptionPane.PLAIN_MESSAGE);
			}else {if(falta == 0) 
				JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.80)+100),"Fim",JOptionPane.PLAIN_MESSAGE);
			else if (falta <=5)
				JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.80)-50),"Fim",JOptionPane.PLAIN_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nSalário líquido: R$"+((sal*0.80)-100),"Fim",JOptionPane.PLAIN_MESSAGE);
				
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
