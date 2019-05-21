package exemplo09;

public class Principal {

	public static void main(String[] args) {

		//idade
		int idade = 18;
		String condicao;
		
		//Operador ternário
		condicao = idade >=18 ? "Maior de idade" : "Menor de idade";
		
		System.out.println(condicao);
	}

}
