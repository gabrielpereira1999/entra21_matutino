package exerc28;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o n�mero", "N�mero", JOptionPane.PLAIN_MESSAGE));
			if(num==0) {
				JOptionPane.showMessageDialog(null, "O n�mero 0 n�o pode ser avaliado", "Erro", JOptionPane.PLAIN_MESSAGE);
			}else if ((num%2)==0){
				if(num>0) {
					JOptionPane.showMessageDialog(null, +num+" � par e positivo", "Resposta", JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, +num+" � par e negativo", "Resposta", JOptionPane.PLAIN_MESSAGE);
				}
			}else {
				if(num>0){
					JOptionPane.showMessageDialog(null, +num+" � �mpar e positivo", "Resposta", JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, +num+" � �mpar e negativo", "Resposta", JOptionPane.PLAIN_MESSAGE);
				}
			}
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}finally {
				JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);		
			}
	}
}