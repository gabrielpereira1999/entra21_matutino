
public class Principal {
	
	/*
	  VALORES GEN�RICOS
	  E -> Tipos de classe
	  K -> Chave (Utilizado com HashMap)
	  V -> Valor (Utilizado com HashMap)
	  T -> Tipo (int, double, char)
	*/
	
	//M�todo est�tico de exibi��o
	public static <E> void exibirDados(E[] vetor) {
		for(E elemento : vetor) {
			System.out.println(elemento);
		}
	}
	
	//M�todo principal
	public static void main(String[] args) {

		//Dados
		Integer[] dadosInt = {1,5,7,8};
		Double[] dadosDouble = {7.5, 8.3, 1.2};
		String[] dadosString = {"Computador", "Impressora"};
		
		exibirDados(dadosString);

	}

}
