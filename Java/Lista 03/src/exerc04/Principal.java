package exerc04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String[] gabarito = new String[10];
		String[] alunos = new String[999999];
		int[] acertos = new int[999999];
		String nome,resp,auxnome;
		int acert=0,errou=0,aux;
		for (int i = 0; i < 10; i++) {
			try {
				gabarito[i] = JOptionPane.showInputDialog("Informe a resposta da questão " + (i + 1)).toLowerCase();
				if ((!gabarito[i].equals("a")) && (!gabarito[i].equals("b")) && (!gabarito[i].equals("c"))
						&& (!gabarito[i].equals("d"))) {
					i--;
					JOptionPane.showMessageDialog(null, "Resposta inválida");
				}
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
						JOptionPane.PLAIN_MESSAGE);
			}

		}
		boolean val = true;
		int j=0;
		while (val == true) {
			nome = JOptionPane.showInputDialog("Informe o nome do aluno");
			if ((nome == null) || (nome.equals(""))) {
				JOptionPane.showMessageDialog(null, "Nenhum nome inserido");
				continue;
			}else if( nome.toLowerCase().equals("sair"))
				break;
			alunos[j] = nome;
			for (int i = 0; i < 10; i++) {
				try {
					resp = JOptionPane.showInputDialog("Informe a resposta da questão " + (i + 1)).toLowerCase();
					if (resp.equals(gabarito[i])) {
						acert++;
						acertos[j] ++;
						continue;
					}
					if ((!resp.equals("a")) && (!resp.equals("b")) && (!resp.equals("c"))
							&& (!resp.equals("d"))) {
						i--;
						JOptionPane.showMessageDialog(null, "Resposta inválida");
						continue;
					}
					errou++;
					
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
							JOptionPane.PLAIN_MESSAGE);
				}

			}
			
			JOptionPane.showMessageDialog(null, "O aluno "+nome+" acertou "+acert+" questões e errou "+errou);
			j++;
		}
		
		for(int i=0;i<alunos.length;i++) {
			boolean teste = false;
			for(j=i+1;j<alunos.length;j++) {
				if( alunos[j] == null) {
					teste = true;
					break;
				}else if( acertos[j] > acertos[i] ) {
					aux = acertos[i];
					acertos[i] = acertos[j];
					acertos[j] = aux;
					auxnome = alunos[i];
					alunos[i] = alunos[j];
					alunos[j] = auxnome;
					
				}
			}
			if (teste == true)
				break;
		}
		int i =0;
		while(alunos[i] != null) {
			System.out.println(alunos[i]+" Acertos: "+acertos[i]);
			i++;
		}
	}

}
