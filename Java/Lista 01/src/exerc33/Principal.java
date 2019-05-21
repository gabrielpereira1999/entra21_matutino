package exerc33;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
try{
			
			byte mes = Byte.parseByte(JOptionPane.showInputDialog(null, "Informe seu mês de nascimento", "Mês", JOptionPane.PLAIN_MESSAGE)),
			     dia = Byte.parseByte(JOptionPane.showInputDialog(null, "Informe seu dia de nascimento", "Dia", JOptionPane.PLAIN_MESSAGE));
			      
			if( (mes>12) || (mes<1) || (dia<1) || (dia>31)) {
				JOptionPane.showMessageDialog(null,"Dados incorretos","erro",JOptionPane.PLAIN_MESSAGE);
			}else if(mes==1) {
				if(dia>19) {
					JOptionPane.showMessageDialog(null,"Você é de aquário","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de capricórnio","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==2) {
				if(dia>18) {
					JOptionPane.showMessageDialog(null,"Você é de peixes","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de aquário","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==3) {
				if(dia>20) {
					JOptionPane.showMessageDialog(null,"Você é de áries","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de peixes","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==4) {
				if(dia>19) {
					JOptionPane.showMessageDialog(null,"Você é de touro","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de áries","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==5) {
				if(dia>20) {
					JOptionPane.showMessageDialog(null,"Você é de gêmeos","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de touro","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==6) {
				if(dia>20) {
					JOptionPane.showMessageDialog(null,"Você é de câncer","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de gemeos","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==7) {
				if(dia>22) {
					JOptionPane.showMessageDialog(null,"Você é de leão","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de câncer","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==8) {
				if(dia>22) {
					JOptionPane.showMessageDialog(null,"Você é de virgem","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de leão","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==9) {
				if(dia>22) {
					JOptionPane.showMessageDialog(null,"Você é de libra","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de virgem","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==10) {
				if(dia>22) {
					JOptionPane.showMessageDialog(null,"Você é de escorpião","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de libra","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==11) {
				if(dia>21) {
					JOptionPane.showMessageDialog(null,"Você é de sagitário","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de escorpião","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(mes==12) {
				if(dia>18) {
					JOptionPane.showMessageDialog(null,"Você é de capricórnio","Fim",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Você é de sagitário","Fim",JOptionPane.PLAIN_MESSAGE);
				}
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
