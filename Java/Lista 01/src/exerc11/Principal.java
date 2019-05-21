package exerc11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota 1","Nota 1",JOptionPane.PLAIN_MESSAGE)),
				  nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota 2","Nota 2",JOptionPane.PLAIN_MESSAGE)),
				  nota3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota 3","Nota 3",JOptionPane.PLAIN_MESSAGE)),
				  nota4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota 4","Nota 4",JOptionPane.PLAIN_MESSAGE)),
				  media = (nota1+nota2+nota3+nota4)/4;
			short faltas = Short.parseShort(JOptionPane.showInputDialog(null,"Insira o n�mero de faltas","N�mero de faltas",JOptionPane.PLAIN_MESSAGE));
			
			
			if(faltas > 15) {
				JOptionPane.showMessageDialog(null,"Voc� est� reprovado por excesso de faltas","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if( media > 10) {
				JOptionPane.showMessageDialog(null,"Houve um erro durante a inser��o das notas","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if( media == 10) {
				JOptionPane.showMessageDialog(null,"Parab�ns, voc� foi aprovado com m�dia 10","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if( media >=9) {
				JOptionPane.showMessageDialog(null,"�timo, voc� foi aprovado com m�dia "+media,"Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if( media >= 7) {
				JOptionPane.showMessageDialog(null,"Bom, voc� foi aprovado com m�dia "+media,"Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if( media >= 5.1) {
				JOptionPane.showMessageDialog(null,"Voc� est� em exame com m�dia "+media,"Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"Voc� foi Reprovado com m�dia "+media,"Situa��o",JOptionPane.PLAIN_MESSAGE);
			}
			
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
