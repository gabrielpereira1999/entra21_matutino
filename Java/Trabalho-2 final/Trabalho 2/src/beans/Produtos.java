package beans;

import javax.swing.ImageIcon;

public class Produtos {
	
	String produto, departamento, descricao;
	int quantidade;
	double valor;
	ImageIcon foto;
	
	
	
	public ImageIcon getFoto() {
		return foto;
	}
	public void setFoto(ImageIcon foto) {
		this.foto = foto;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
