package exerc03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4,media;
		nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota 1", "Nota 1", JOptionPane.QUESTION_MESSAGE));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota 2", "Nota 2", JOptionPane.QUESTION_MESSAGE));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota 3", "Nota 3", JOptionPane.QUESTION_MESSAGE));
		nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota 4", "Nota 4", JOptionPane.QUESTION_MESSAGE));
		media = ((nota1+nota2+nota3+nota4)/4);
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Ótimo, você foi aprovado com média"+media, "Situação", JOptionPane.PLAIN_MESSAGE);
		}else if (media >= 5) {
			JOptionPane.showMessageDialog(null, "Você está em exame com média"+media, "Situação", JOptionPane.PLAIN_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "Você está reprovado com média"+media, "Situação", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
