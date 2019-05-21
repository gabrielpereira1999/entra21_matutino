package exerc24;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			
			float num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor 1", "Valor 1", JOptionPane.PLAIN_MESSAGE)),
			      num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor 2", "Valor 2", JOptionPane.PLAIN_MESSAGE)),
			      num3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor 3", "Valor 3", JOptionPane.PLAIN_MESSAGE));
			if( (num1 < num2) && (num1 < num3)) {
				if(num2 < num3) {
					JOptionPane.showMessageDialog(null,"Em ordem: "+num1+" "+num2+" "+num3,"Resultado",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Em ordem: "+num1+" "+num3+" "+num2,"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
			}else if( (num2 < num1) && (num2 < num3)) {
				if(num1 < num3) {
					JOptionPane.showMessageDialog(null,"Em ordem: "+num2+" "+num1+" "+num3,"Resultado",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Em ordem: "+num2+" "+num3+" "+num1,"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
			}else{
				if(num1 < num2) {
					JOptionPane.showMessageDialog(null,"Em ordem: "+num3+" "+num1+" "+num2,"Resultado",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Em ordem: "+num3+" "+num2+" "+num1,"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
			}
			      
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
