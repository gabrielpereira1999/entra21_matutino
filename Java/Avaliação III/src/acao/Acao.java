package acao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import beans.Produto;
import dados.Dado;

public class Acao {

	public static String Vale, Imposto, SalLiquido;
	
	//Conta qntd
	public int conta() {
		int qnt =0;
		
		for(int i =0; i<Dado.arrayProdutos.size();i++) {
			qnt += Dado.arrayProdutos.get(i).getQuantidade();
		}
		return qnt;
	}

	// Incrementa qntd

	public int incrementa(String c) {
		boolean test = true;
		
		for (int i = 0; i < Dado.arrayProdutos.size(); i++) {
			if (c.equals(Dado.arrayProdutos.get(i).getNome())) {
				Dado.arrayProdutos.get(i).setQuantidade(Dado.arrayProdutos.get(i).getQuantidade() + 1);
				test = false;
				break;
			}
		}
		if (test) {
			Produto a = new Produto();
			a.setNome(c);
			a.setQuantidade(1);
			Dado.arrayProdutos.add(a);
		}
		
		return conta();

	}

	// Decrementa qntd

	public int decrementa(String c) {
		boolean test = true;

		for (int i = 0; i < Dado.arrayProdutos.size(); i++) {
			if ((c.equals(Dado.arrayProdutos.get(i).getNome()))) {
				if ((Dado.arrayProdutos.get(i).getQuantidade() > 0)) {
					Dado.arrayProdutos.get(i).setQuantidade(Dado.arrayProdutos.get(i).getQuantidade() - 1);
					test = false;
					break;
				} else {
					test = false;
					JOptionPane.showMessageDialog(null, "Já não há nenhuma unidade deste item no carrinho");
					break;
				}
			}
		}
		if(test) {
			JOptionPane.showMessageDialog(null, "Já não há nenhuma unidade deste item no carrinho");
		}
		
		return conta();

	}
	
	//Tabela produtos
	public DefaultTableModel tabela() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Quantidade");
		
		for(int i =0; i<Dado.arrayProdutos.size();i++) {
			modelo.addRow(new Object[] {
					Dado.arrayProdutos.get(i).getNome(),Dado.arrayProdutos.get(i).getQuantidade()
			});;
		}
		return modelo;
	}

}
