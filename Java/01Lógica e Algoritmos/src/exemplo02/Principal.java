package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//N�meros inteiros
		byte numero1 = 10;  //-128 a 127
		short numero2 = 30; //-32.768 a 32.767
		int numero3 = 20;   //-2.147.483.648 a 2.147.483.647
		long numero4 = 50;  //-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
		
		//N�meros reais
		float numero5 = 5.8f;  // at� 7 casas decimais
		double numero6 = 7.98; // at� 15 casas decimais
		
		//L�gico
		boolean acao = true; //Pode armazenar TRUE ou FALSE
		
		//Textos
		char letra = 'a'; //Armazenar apenas uma letra
		char ascii = 65;  //Trabalhar com o c�digo da tecla
		String texto = "Aprendendo Java na Proway!";
		
		//Concatenando dados
		System.out.println("A variavel do tipo byte � "+numero1);
		System.out.println("A variavel do tipo short � "+numero2);
		System.out.println("A variavel do tipo int � "+numero3);
		System.out.println("A variavel do tipo long � "+numero4);
		System.out.println("A variavel do tipo float � "+numero5);
		System.out.println("A variavel do tipo doule � "+numero6);
		System.out.println("A variavel do tipo boolean � "+acao);
		System.out.println("A variavel do tipo char � "+letra);
		System.out.println("A variavel do tipo char � "+ascii);
		System.out.println("A variavel do tipo String � "+texto);
		
		
	}
	
}
