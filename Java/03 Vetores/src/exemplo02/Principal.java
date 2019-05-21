package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor de nomes
		String[] nomes = new String[3];
		
		//Laço While - Perguntar nome
		int indice = 0;
		while(indice < 3) {
			nomes[indice] = JOptionPane.showInputDialog((indice+1)+"° nome: ");
			indice++;
		}
		indice = 0;
		while(indice < 3) {
			System.out.println((indice+1)+"° nome é: "+nomes[indice]);
			indice++;
		}
		
		
		
		
	}

}
