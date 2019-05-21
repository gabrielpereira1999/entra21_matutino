package exerc08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o primeiro n�mero","Escolha do n�mero",JOptionPane.PLAIN_MESSAGE)),   
				   num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo n�mero","Escolha do n�mero",JOptionPane.PLAIN_MESSAGE));
			String oper = JOptionPane.showInputDialog(null,"Insira a opera��o a ser realizada. Escolha entre soma, subtra��o, multiplica��o e divis�o","Escolha da opera��o",JOptionPane.PLAIN_MESSAGE).toLowerCase();
			
				if ( (oper.equals("soma")) || (oper.equals("+")) ) {
					JOptionPane.showMessageDialog(null,+num1+" + "+num2+" = "+(num1+num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				else if ( (oper.equals("subtra��o")) || (oper.equals("subtracao")) || (oper.equals("-")) ) { 
					JOptionPane.showMessageDialog(null,+num1+" - "+num2+" = "+(num1-num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				
				else if ( (oper.equals("multiplica��o")) || (oper.equals("x")) || (oper.equals("multiplicacao")) || (oper.equals("*")) ) {
					JOptionPane.showMessageDialog(null,+num1+" X "+num2+" = "+(num1*num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				
				else if ( (oper.equals("divis�o")) || (oper.equals("divisao")) || (oper.equals("/")) ) { 
					JOptionPane.showMessageDialog(null,+num1+ " / " +num2+" = "+(num1/num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Opera��o n�o idetinficada","Erro",JOptionPane.PLAIN_MESSAGE);
				}
			}
			
		catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}
	}
}

	


