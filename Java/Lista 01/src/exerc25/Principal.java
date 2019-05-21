package exerc25;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try{
	    Calendar now = Calendar.getInstance();   //IMPORTANTE
		int hora = now.get(Calendar.HOUR);
		
		if( (hora >=0) && (hora < 7)) {
			JOptionPane.showMessageDialog(null,"Boa madrugada","Olá",JOptionPane.PLAIN_MESSAGE);
		}else if( (hora>=7 ) && (hora < 12)) {
			JOptionPane.showMessageDialog(null,"Bom dia","Olá",JOptionPane.PLAIN_MESSAGE);
		}else if( (hora>=12 ) && (hora < 19)) {
			JOptionPane.showMessageDialog(null,"Boa tarde","Olá",JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"Boa noite","Olá",JOptionPane.PLAIN_MESSAGE);
		}
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
