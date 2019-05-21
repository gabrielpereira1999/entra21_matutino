package exerc12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String[][] velha = new String[3][3];
		Object[] botao = { "0 0", "0 1", " 0 2", "1 0", "1 1", "1 2", "2 0", "2 1", "2 2" };
		boolean winner = false, skip = false, skip2 = false;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				velha[i][j] = " ";
			}
		}

		while (winner == false) {
			if (skip2 == false) {
				switch (JOptionPane.showOptionDialog(null, "Jogador 1, escolha a posição que deseja marcar", "Posição",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, botao, botao[0])) {
				case 0:
					if (velha[0][0] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[0][0] = "X";
					break;
				case 1:
					if (velha[0][1] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[0][1] = "X";
					break;
				case 2:
					if (velha[0][2] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[0][2] = "X";
					break;
				case 3:
					if (velha[1][0] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[1][0] = "X";
					break;
				case 4:
					if (velha[1][1] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[1][1] = "X";
					break;
				case 5:
					if (velha[1][2] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[1][2] = "X";
					break;
				case 6:
					if (velha[2][0] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[2][0] = "X";
					break;
				case 7:
					if (velha[2][1] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[2][1] = "X";
					break;
				case 8:
					if (velha[2][2] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip = true;
					} else
						velha[2][2] = "X";
					break;
				}
			}
			skip2 = false;
			for (int i = 0; i < 3; i++) {
				if (i != 0)
					System.out.print("\n----------\n");
				for (int j = 0; j < 3; j++) {
					if (j < 2)
						System.out.print(velha[i][j] + " | ");
					if (j == 2)
						System.out.print(velha[i][j]);
				}
			}
			System.out.println();
			System.out.println();

			if (((velha[0][0] == velha[1][1]) && (velha[2][2] == velha[0][0]) && (velha[0][0] != " "))
					|| ((velha[0][0] == velha[0][1]) && (velha[0][0] == velha[0][2]) && (velha[0][0] != " "))
					|| ((velha[1][0] == velha[1][1]) && (velha[1][0] == velha[1][2]) && (velha[1][1] != " "))
					|| ((velha[2][0] == velha[2][1]) && (velha[2][0] == velha[2][2]) && (velha[2][0] != " "))
					|| ((velha[0][0] == velha[1][0]) && (velha[0][0] == velha[2][0]) && (velha[0][0] != " "))
					|| ((velha[0][1] == velha[1][1]) && (velha[0][1] == velha[2][1]) && (velha[1][1] != " "))
					|| ((velha[0][2] == velha[1][2]) && (velha[0][2] == velha[2][2]) && (velha[1][2] != " "))
					|| ((velha[2][0] == velha[1][1]) && (velha[2][0] == velha[0][2]) && (velha[1][1] != " "))) {
				winner = true;
				JOptionPane.showMessageDialog(null, "O jogador 1 venceu");
				break;
			}
			if (skip == false) {
				switch (JOptionPane.showOptionDialog(null, "Jogador 2, escolha a posição que deseja marcar", "Posição",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, botao, botao[0])) {
				case 0:
					if (velha[0][0] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[0][0] = "O";
					break;
				case 1:
					if (velha[0][1] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[0][1] = "O";
					break;
				case 2:
					if (velha[0][2] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[0][2] = "O";
					break;
				case 3:
					if (velha[1][0] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[1][0] = "O";
					break;
				case 4:
					if (velha[1][1] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[1][1] = "O";
					break;
				case 5:
					if (velha[1][2] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[1][2] = "O";
					break;
				case 6:
					if (velha[2][0] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[2][0] = "O";
					break;
				case 7:
					if (velha[2][1] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[2][1] = "O";
					break;
				case 8:
					if (velha[2][2] != " ") {
						JOptionPane.showMessageDialog(null, "Você não pode alterar esta posição");
						skip2 = true;
					} else
						velha[2][2] = "O";
					break;
				}
			}
			skip = false;
			for (int i = 0; i < 3; i++) {
				if (i != 0)
					System.out.print("\n----------\n");
				for (int j = 0; j < 3; j++) {
					if (j < 2)
						System.out.print(velha[i][j] + " | ");
					if (j == 2)
						System.out.print(velha[i][j]);
				}
			}
			System.out.println();
			System.out.println();

			if (((velha[0][0] == velha[1][1]) && (velha[2][2] == velha[0][0]) && (velha[0][0] != " "))
					|| ((velha[0][0] == velha[0][1]) && (velha[0][0] == velha[0][2]) && (velha[0][0] != " "))
					|| ((velha[1][0] == velha[1][1]) && (velha[1][0] == velha[1][2]) && (velha[1][1] != " "))
					|| ((velha[2][0] == velha[2][1]) && (velha[2][0] == velha[2][2]) && (velha[2][0] != " "))
					|| ((velha[0][0] == velha[1][0]) && (velha[0][0] == velha[2][0]) && (velha[0][0] != " "))
					|| ((velha[0][1] == velha[1][1]) && (velha[0][1] == velha[2][1]) && (velha[1][1] != " "))
					|| ((velha[0][2] == velha[1][2]) && (velha[0][2] == velha[2][2]) && (velha[1][2] != " "))
					|| ((velha[2][0] == velha[1][1]) && (velha[2][0] == velha[0][2]) && (velha[1][1] != " "))) {
				winner = true;
				JOptionPane.showMessageDialog(null, "O jogador 2 venceu");
				break;
			}

		}
	}

}
