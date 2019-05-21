package exemplo12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um objeto para armzenar os dados
		Scanner armazenar = new Scanner(System.in);
		
		//Realizar uma pergunta
		System.out.println("Qual é o seu nome?");
		
		//obter o nome
		String nome = armazenar.nextLine();
		
		//Exibir o nome informado
		System.out.println("O nome informado é "+nome);
		
		

	}

}
