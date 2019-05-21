package exerc08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[][] mat = new int[5][6];
		int par = 0, imp = 0, soma = 0, maior = 0;
		double media;

		try {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 6; j++) {
					mat[i][j] = Integer
							.parseInt(JOptionPane.showInputDialog("Informe o valor para a posição " + i + " " + j));
					if (mat[i][j] != 0) {
						if ((mat[i][j] % 2) == 0)
							par++;
						else
							imp++;
					}
					soma += mat[i][j];
				}
			}

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
					JOptionPane.PLAIN_MESSAGE);
		}
		media = ((double)soma) / 30;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (mat[i][j] >= media)
					maior++;
			}
		}
		System.out.println("Quantidade de números pares: " + par + "\nQuantidade de números ímpares: " + imp
				+ "\nMédia: " + media + "\n" + "Quantidade de números maiores ou iguais a média: " + maior);
		System.out.println("\nMatriz");
		for (int i = 0; i < 5; i++) {
			System.out.print("\n");
			for (int j = 0; j < 6; j++) {
				System.out.print(" "+mat[i][j]);
			}
		}
	}

}
