package exemplo02;

public class Produto {

	//Atributo
	private static int contador = 0;//generaliza o atributo para todos os objetos
	
	//Construtor
	public Produto() {
		System.out.println(contador);
		contador++;
	}
	
}
