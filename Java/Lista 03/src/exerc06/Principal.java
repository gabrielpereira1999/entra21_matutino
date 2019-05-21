package exerc06;

import javax.swing.JOptionPane;

//MADE BY GABRIEL, CODER POR HOBBY
public class Principal {

	public static void main(String[] args) {
		int i = 0;
		String[][] contato = new String[99999][8];
		Object[] funcao = { "Cadastrar Contato", "Alterar Contato", "Excluir Contato", "Pesquisar", "Sair" };
		Object[] dado = { "Nome", "Data de nascimento", "Estado", "Cidade", "Endereço", "Telefone", "Celular",
				"E-mail" };
		boolean sair = false;
		while (sair == false) {
			try {
				switch (JOptionPane.showOptionDialog(null, "Escolha uma ação", "Ações",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, funcao, funcao[0])) {
				case 4:
					sair = true;
					break;
				case 0:
					contato[i][0] = JOptionPane.showInputDialog("Informe o nome");
					while ((contato[i][0].equals("")) || (contato[i][0] == null)) {
						contato[i][0] = JOptionPane.showInputDialog("Informe o nome");
					}
					contato[i][1] = JOptionPane.showInputDialog("Informe a data de nascimento");
					while ((contato[i][1].equals("")) || (contato[i][1] == null)) {
						contato[i][1] = JOptionPane.showInputDialog("Informe a data de nascimento");
					}
					contato[i][2] = JOptionPane.showInputDialog("Informe o estado");
					while ((contato[i][2].equals("")) || (contato[i][2] == null)) {
						contato[i][2] = JOptionPane.showInputDialog("Informe o estado");
					}
					contato[i][3] = JOptionPane.showInputDialog("Informe a cidade");
					while ((contato[i][3].equals("")) || (contato[i][3] == null)) {
						contato[i][3] = JOptionPane.showInputDialog("Informe a cidade");
					}
					contato[i][4] = JOptionPane.showInputDialog("Informe o endereço");
					while ((contato[i][4].equals("")) || (contato[i][4] == null)) {
						contato[i][4] = JOptionPane.showInputDialog("Informe o endereço");
					}
					contato[i][5] = JOptionPane.showInputDialog("Informe o telefone");
					while ((contato[i][5].equals("")) || (contato[i][5] == null)) {
						contato[i][5] = JOptionPane.showInputDialog("Informe o telefone");
					}
					contato[i][6] = JOptionPane.showInputDialog("Informe o celular");
					while ((contato[i][6].equals("")) || (contato[i][6] == null)) {
						contato[i][6] = JOptionPane.showInputDialog("Informe o celular");
					}
					contato[i][7] = JOptionPane.showInputDialog("Informe o e-mail");
					while ((contato[i][7].equals("")) || (contato[i][7] == null)) {
						contato[i][7] = JOptionPane.showInputDialog("Informe o e-mail");
					}
					break;
				case 1:
					String pesquisa = JOptionPane.showInputDialog("Nome do contato a alterar");
					for (int j = 0; j < contato.length; j++) {
						if (pesquisa.equals(contato[j][0])) {
							switch (JOptionPane.showOptionDialog(null, "Que dado deseja alterar?", "Dado",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, dado, dado[0])) {
							case 0:
								contato[j][0] = JOptionPane.showInputDialog("Informe o nome");
								while ((contato[j][0].equals("")) || (contato[j][0] == null)) {
									contato[j][0] = JOptionPane.showInputDialog("Informe o nome");
								}
								break;
							case 1:
								contato[j][1] = JOptionPane.showInputDialog("Informe a data de nascimento");
								while ((contato[j][1].equals("")) || (contato[j][1] == null)) {
									contato[j][1] = JOptionPane.showInputDialog("Informe a data de nascimento");
								}
								break;
							case 2:
								contato[j][2] = JOptionPane.showInputDialog("Informe o estado");
								while ((contato[j][2].equals("")) || (contato[j][2] == null)) {
									contato[i][2] = JOptionPane.showInputDialog("Informe o estado");
								}
								break;
							case 3:
								contato[j][3] = JOptionPane.showInputDialog("Informe a cidade");
								while ((contato[j][3].equals("")) || (contato[j][3] == null)) {
									contato[j][3] = JOptionPane.showInputDialog("Informe a cidade");
								}
								break;
							case 4:
								contato[j][4] = JOptionPane.showInputDialog("Informe o endereço");
								while ((contato[j][4].equals("")) || (contato[j][4] == null)) {
									contato[j][4] = JOptionPane.showInputDialog("Informe o endereço");
								}
								break;
							case 5:
								contato[j][5] = JOptionPane.showInputDialog("Informe o telefone");
								while ((contato[j][5].equals("")) || (contato[j][5] == null)) {
									contato[j][5] = JOptionPane.showInputDialog("Informe o telefone");
								}
								break;
							case 6:
								contato[j][6] = JOptionPane.showInputDialog("Informe o celular");
								while ((contato[j][6].equals("")) || (contato[j][6] == null)) {
									contato[j][6] = JOptionPane.showInputDialog("Informe o celular");
								}
								break;
							case 7:
								contato[j][7] = JOptionPane.showInputDialog("Informe o e-mail");
								while ((contato[j][7].equals("")) || (contato[j][7] == null)) {
									contato[j][7] = JOptionPane.showInputDialog("Informe o e-mail");
								}
								break;

							}
							break;
						}
					}
					break;
				case 2:
					pesquisa = JOptionPane.showInputDialog("Nome do contato a excluir");
					for (int j = 0; j < contato.length; j++) {
						if (pesquisa.equals(contato[j][0])) {
							contato[j][0] = "";
							contato[j][1] = "";
							contato[j][2] = "";
							contato[j][3] = "";
							contato[j][4] = "";
							contato[j][5] = "";
							contato[j][6] = "";
							contato[j][7] = "";
							break;
						}
					}
					break;
				case 3:
					pesquisa = JOptionPane.showInputDialog("Nome do contato a pesquisar");
					for (int j = 0; j < contato.length; j++) {
						if (pesquisa.equals(contato[j][0])) {
							JOptionPane.showMessageDialog(null, "Nome: "+contato[j][0]+"\nData de nascimento: "+contato[j][1]+
									"\nEstado: "+contato[j][2]+"\nCidade: "+contato[j][3]+"\nEndereço: "+contato[j][4]+
									"\nTelefone "+contato[j][5]+"\nCelular: "+contato[j][6]+"\nE-mail: "+contato[j][7]);
						}
					}
				}
				i++;
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
						JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
