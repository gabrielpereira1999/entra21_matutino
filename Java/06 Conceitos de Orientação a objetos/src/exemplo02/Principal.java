package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//Inst�ncia
		Calculadora c = new Calculadora();
		c.somar(5, 10);
		
		int resultadoSubtracao = c.subtracao(5,2);
		System.out.println(resultadoSubtracao);
		

	}

}
