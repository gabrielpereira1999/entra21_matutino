package exerc26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			String nome = JOptionPane.showInputDialog(null, "Informe o nome", "Nome", JOptionPane.PLAIN_MESSAGE);
			float idade = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a idade", "Idade", JOptionPane.PLAIN_MESSAGE));
		if(idade <0) {
			JOptionPane.showMessageDialog(null,"Idade inv�lida","Erro",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <5) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Beb�","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <12) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Crian�a","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <15) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Adolescente","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <31) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Jovem","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <46) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Adulto","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <61) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Idoso I","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <76) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Idoso II","Fim",JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassifica��o: Idoso III","Fim",JOptionPane.PLAIN_MESSAGE);
		}
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
