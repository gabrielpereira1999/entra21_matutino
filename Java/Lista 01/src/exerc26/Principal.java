package exerc26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			String nome = JOptionPane.showInputDialog(null, "Informe o nome", "Nome", JOptionPane.PLAIN_MESSAGE);
			float idade = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a idade", "Idade", JOptionPane.PLAIN_MESSAGE));
		if(idade <0) {
			JOptionPane.showMessageDialog(null,"Idade inválida","Erro",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <5) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Bebê","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <12) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Criança","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <15) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Adolescente","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <31) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Jovem","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <46) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Adulto","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <61) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idoso I","Fim",JOptionPane.PLAIN_MESSAGE);
		}else if(idade <76) {
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idoso II","Fim",JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idoso III","Fim",JOptionPane.PLAIN_MESSAGE);
		}
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
