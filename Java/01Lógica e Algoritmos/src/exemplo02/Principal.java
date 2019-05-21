package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//Números inteiros
		byte numero1 = 10;  //-128 a 127
		short numero2 = 30; //-32.768 a 32.767
		int numero3 = 20;   //-2.147.483.648 a 2.147.483.647
		long numero4 = 50;  //-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
		
		//Números reais
		float numero5 = 5.8f;  // até 7 casas decimais
		double numero6 = 7.98; // até 15 casas decimais
		
		//Lógico
		boolean acao = true; //Pode armazenar TRUE ou FALSE
		
		//Textos
		char letra = 'a'; //Armazenar apenas uma letra
		char ascii = 65;  //Trabalhar com o código da tecla
		String texto = "Aprendendo Java na Proway!";
		
		//Concatenando dados
		System.out.println("A variavel do tipo byte é "+numero1);
		System.out.println("A variavel do tipo short é "+numero2);
		System.out.println("A variavel do tipo int é "+numero3);
		System.out.println("A variavel do tipo long é "+numero4);
		System.out.println("A variavel do tipo float é "+numero5);
		System.out.println("A variavel do tipo doule é "+numero6);
		System.out.println("A variavel do tipo boolean é "+acao);
		System.out.println("A variavel do tipo char é "+letra);
		System.out.println("A variavel do tipo char é "+ascii);
		System.out.println("A variavel do tipo String é "+texto);
		
		
	}
	
}
