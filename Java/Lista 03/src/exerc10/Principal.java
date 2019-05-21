package exerc10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double[][] mat = new double[5][5];
		double somal=0,somac=0,somadp =0,somads =0,soma=0;
		try {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o número para a posição " + i + " " + j));
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ( i==3)
					somal += mat[3][j];
				if ( j == 1 )
					somac += mat[i][1];
				if (i==j)
					somadp += mat[i][i]; 
				soma+= mat[i][j];
			}
		}
		int j = 4;
		for (int i = 0; i <5; i++) {
			somads+= mat[i][j];
			j--;
		}
		JOptionPane.showMessageDialog(null, "Soma dos números na 4º linha: "+somal+"\nSoma dos números na 2° coluna: "+somac+
				"\nSoma da diagonal principal: "+somadp+"\nSoma da diagonal secundária: "+somads+"\nSoma de todos os elementos: "+soma);
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
					JOptionPane.PLAIN_MESSAGE);
		}
	}

}
