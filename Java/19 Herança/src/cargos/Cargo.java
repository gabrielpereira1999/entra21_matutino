package cargos;

public class Cargo {
	
	//Atributos
	protected String cargo;
	protected double salario;
	protected int nivel;
	
	//Vale transporte
	public void vt() {
		System.out.println("Desconto do vale transporte � "+salario*0.06);
	}
	
	//Identifica��o
	public void identificacao() {
		System.out.println("O cargo selecionado � "+cargo);
	}

}
