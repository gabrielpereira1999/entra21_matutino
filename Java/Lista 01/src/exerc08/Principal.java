package exerc08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o primeiro número","Escolha do número",JOptionPane.PLAIN_MESSAGE)),   
				   num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo número","Escolha do número",JOptionPane.PLAIN_MESSAGE));
			String oper = JOptionPane.showInputDialog(null,"Insira a operação a ser realizada. Escolha entre soma, subtração, multiplicação e divisão","Escolha da operação",JOptionPane.PLAIN_MESSAGE).toLowerCase();
			
				if ( (oper.equals("soma")) || (oper.equals("+")) ) {
					JOptionPane.showMessageDialog(null,+num1+" + "+num2+" = "+(num1+num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				else if ( (oper.equals("subtração")) || (oper.equals("subtracao")) || (oper.equals("-")) ) { 
					JOptionPane.showMessageDialog(null,+num1+" - "+num2+" = "+(num1-num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				
				else if ( (oper.equals("multiplicação")) || (oper.equals("x")) || (oper.equals("multiplicacao")) || (oper.equals("*")) ) {
					JOptionPane.showMessageDialog(null,+num1+" X "+num2+" = "+(num1*num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				
				else if ( (oper.equals("divisão")) || (oper.equals("divisao")) || (oper.equals("/")) ) { 
					JOptionPane.showMessageDialog(null,+num1+ " / " +num2+" = "+(num1/num2),"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Operação não idetinficada","Erro",JOptionPane.PLAIN_MESSAGE);
				}
			}
			
		catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}
	}
}

	


