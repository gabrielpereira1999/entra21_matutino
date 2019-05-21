package colaborador;

public class Pessoa {
	
	//Atributos
	private String nomePessoa, emailPessoa, enderecoPessoa;
	private int idadePessoa;
	
	//construtor
	public Pessoa(String nomePessoa, String emailPessoa, String enderecoPessoa, int idadePessoa) {
		this.nomePessoa = nomePessoa;
		this.emailPessoa = emailPessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.idadePessoa = idadePessoa;
		
		exibirDadosPessoa();
	}
	
	//M�todo para exibir os dados da pessoa
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nomePessoa);
		System.out.println("E-mail: "+emailPessoa);
		System.out.println("Endere�o: "+enderecoPessoa);
		System.out.println("Idade: "+idadePessoa);
	}
	
}
