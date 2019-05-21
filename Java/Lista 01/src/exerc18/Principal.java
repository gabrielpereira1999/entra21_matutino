package exerc18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			float l1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o comprimento do lado 1","Lado 1",JOptionPane.PLAIN_MESSAGE)),
				  l2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o comprimento do lado 2","Lado 2",JOptionPane.PLAIN_MESSAGE)),
				  l3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o comprimento do lado 3","Lado 3",JOptionPane.PLAIN_MESSAGE));
			
			if( (l1>(l2+l3)) || (l2>(l1+l3)) || (l3>(l1+l2)) ) {
				JOptionPane.showMessageDialog(null,"Não existe triângulo com estas dimensões","Erro",JOptionPane.PLAIN_MESSAGE);
			}else if( (l1==l2) && (l1==l3) && (l2==l3)) {
				JOptionPane.showMessageDialog(null,"Este é um triângulo equilátero","Equilátero",JOptionPane.PLAIN_MESSAGE);
			}else if( (l1==l2) || (l1==l3) || (l2==l3)) {
				JOptionPane.showMessageDialog(null,"Este é um triângulo isósceles","Isósceles",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"Este é um triângulo escaleno","Isósceles",JOptionPane.PLAIN_MESSAGE);
			}
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
