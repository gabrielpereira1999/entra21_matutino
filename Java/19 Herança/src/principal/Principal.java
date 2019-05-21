package principal;

import cargos.Analista;
import cargos.Desenvolvedor;
import cargos.Estagiario;

public class Principal {

	public static void main(String[] args) {

		//Instanciar objetos
		Estagiario e = new Estagiario();
		Analista a = new Analista(5000, 2);
		Desenvolvedor d = new Desenvolvedor(3000, 3);
		
		//Chamando os m�todos de identifica��o
		e.identificacao();
		a.identificacao();
		d.identificacao();
		
		//Chamando os m�todos de vale transporte
		e.vt();
		a.vt();
		d.vt();
		
		//Chamando os m�todos de IR
		e.ir();
		a.ir();
		d.ir();
		
	}
	
	
}
