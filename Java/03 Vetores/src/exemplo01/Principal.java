package exemplo01;

import java.util.Vector;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		//Vetor � um tipo de vari�vel que armazena v�rios dados
		String[] nomes = new String[3];
		int Vetores = 10;
		int vetores[] = new int[Vetores];
		
		//Pedir os tr�s nomes, pode ser feito com loop(como for)
		/*nomes[0] = JOptionPane.showInputDialog("Primeiro nome: ");
		nomes[1] = JOptionPane.showInputDialog("Segundo nome: ");
		nomes[2] = JOptionPane.showInputDialog("Terceiro nome: ");*/
		
		for(int i = 0;i<=2;i++) {
			nomes[i] = JOptionPane.showInputDialog((i+1)+"� nome: ");
		}
		
		//Exibir os tr�s nomes
		String exibirNomes = "";
		/*String exibirNomes = nomes[0];
		exibirNomes += "\n"+nomes[1];
		exibirNomes += "\n"+nomes[2];
		JOptionPane.showMessageDialog(null, exibirNomes);*/
		
		for(int i = 0;i<=2;i++) {
			exibirNomes += "\n"+nomes[i];
		}
		JOptionPane.showMessageDialog(null, exibirNomes);
		
		
	}

}
