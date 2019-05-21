package exerc21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			int[][] produto = new int[5][3];
			produto[0][0]= 150; produto[0][1]= 165; produto[0][2]= 180; produto[1][0]= 300; produto[1][1]= 330;
			produto[1][2]= 360;	produto[2][0]= 250 ;produto[2][1]= 275; produto[2][2]= 300; produto[3][0]= 30; 
			produto[3][1]= 33; produto[3][2]= 36; produto[4][0]= 450; produto[4][1]= 495; produto[4][2]= 540;
			Object[] options1 = {"Calça", "Camisa", "Casaco", "Meias", "Paletó"};
			Object[] options2 = {"A vista", "A prazo 30 dias", "A prazo 60 dias"};
			int escolhapr = JOptionPane.showOptionDialog(null,"Escolha um produto",
				"Produto",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options1,options1[0]);
			int escolhapa = JOptionPane.showOptionDialog(null,"Escolha um método de pagamento",
					"Pagamento",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options2,options2[0]);
			JOptionPane.showMessageDialog(null, "Produto: "+options1[escolhapr]+"\nPreço: R$"+produto[escolhapr][escolhapa]+",00",
					"Fim da compra", JOptionPane.PLAIN_MESSAGE);
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
