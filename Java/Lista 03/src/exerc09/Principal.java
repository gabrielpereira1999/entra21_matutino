package exerc09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double[][] mat = new double[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o número para a posição " + i + " " + j));

			}
		}
		for (int i = 0; i < 2; i++) {
			System.out.print("\n");
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + mat[i][j]);
			}
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("\n");
			for (int j = 0; j < 2; j++) {
				System.out.print(" " + mat[j][i]);
			}
		}
	}

}
