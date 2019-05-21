package exemplo04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		/*Exibir mensagem
		JOptionPane.showMessageDialog(null, "Bom dia!");
		JOptionPane.showMessageDialog(null,"Tudo ok?","Título",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Informação","Título",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Perigo","Título",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Falha","Título",JOptionPane.ERROR_MESSAGE);
		*/
		
		/*Armazenar valores
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		//JOptionPane.showMessageDialog(null, "Bom dia \n"+nome);
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		//System.out.println(idade);
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		//System.out.println(altura);
		
		String mensagem = "Nome: "+nome;
			   mensagem+= "\nIdade: "+idade;
			   mensagem+= "\nAltura: "+altura;
		JOptionPane.showMessageDialog(null, mensagem);
		*/
		
		/*Caixa de confimação
		int resposta = JOptionPane.showConfirmDialog(null, "Gostando de Java?");
		//System.out.println(resposta);
		switch(resposta) {
			case 0:
				JOptionPane.showInternalMessageDialog(null, "Que bom!");
			break;
				
			case 1:
				JOptionPane.showInternalMessageDialog(null, "Que pena!");
			break;
			
			case 2:
				JOptionPane.showInternalMessageDialog(null, "Você cancelou");
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Você saiu");
			
		}
		*/
		
		//Caixa de confirmação 2
		//int resposta = JOptionPane.showConfirmDialog(null, "Hoje é terça?","Título", JOptionPane.OK_CANCEL_OPTION);
		
		//Comparando Strings
		String nome1 = JOptionPane.showInputDialog("Informe o primeiro nome");
		String nome2 = JOptionPane.showInputDialog("Informe o segundo nome");
		
		System.out.println(nome1.equals(nome2)); //Captura de string não pode ser comparada por ==, deve-se usar .equals()
		
	}

}

