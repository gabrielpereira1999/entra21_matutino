package acao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import beans.IMC;
import dado.Pessoas;

public class Acao {

	public static int MAbaixo = 0, Abaixo = 0, Normal = 0, Sobre = 0, Obe1 = 0, Obe2 = 0, Obe3 = 0;

	// Validar repeticao
	public boolean validar(IMC c) {

		for (int i = 0; i < Pessoas.arrayIMC.size(); i++) {
			if ((Pessoas.arrayIMC.get(i).getNome().contentEquals(c.getNome()))) {
				return false;
			}
		}

		return true;
	}

	// Cadastrar
	public void cadastrar(IMC c) {
		
		if( campos(c.getNome(), c.getAlt().toString(), c.getPeso().toString(),""+c.getIdade() ) ){
			if(validar(c)) {
				Pessoas.arrayIMC.add(c);
			}else
				JOptionPane.showMessageDialog(null, "Pessoa j� cadastrada");
		}
	}

	// Selecionar
	public DefaultTableModel selecionar() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Peso");
		modelo.addColumn("Altura");
		modelo.addColumn("IMC");

		for (int i = 0; i < Pessoas.arrayIMC.size(); i++) {
			modelo.addRow(new Object[] { Pessoas.arrayIMC.get(i).getNome(), Pessoas.arrayIMC.get(i).getIdade(),
					Pessoas.arrayIMC.get(i).getPeso(), Pessoas.arrayIMC.get(i).getAlt(),
					Pessoas.arrayIMC.get(i).getIMC(), });
		}
		return modelo;
	}

	// Soma nas estat�sticas
	public void somaEst(double imc) {
		if (imc < 17) {
			MAbaixo++;
		} else if (imc < 18.5) {
			Abaixo++;
		} else if (imc < 25) {
			Normal++;
		} else if (imc < 30) {
			Sobre++;
		} else if (imc < 35) {
			Obe1++;
		} else if (imc < 40) {
			Obe2++;
		} else
			Obe3++;
	}

	// Subtrai na estat�stica
	public void subtraiEst(double imc) {
		if (imc < 17) {
			MAbaixo--;
		} else if (imc < 18.5) {
			Abaixo--;
		} else if (imc < 25) {
			Normal--;
		} else if (imc < 30) {
			Sobre--;
		} else if (imc < 35) {
			Obe1--;
		} else if (imc < 40) {
			Obe2--;
		} else
			Obe3--;
	}

	// Alterar
	public void alterar(int indice, IMC c) {
		Pessoas.arrayIMC.set(indice, c);

	}

	// Tabela estat�stica
	public DefaultTableModel tabelaEst() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Situa��o");
		modelo.addColumn("Quantidade");

		if (MAbaixo > 0) {
			modelo.addRow(new Object[] { "Muito Abaixo", MAbaixo });
		}
		if (Abaixo > 0) {
			modelo.addRow(new Object[] { "Abaixo", Abaixo });
		}
		if (Normal > 0) {
			modelo.addRow(new Object[] { "Normal", Normal });
		}
		if (Sobre > 0) {
			modelo.addRow(new Object[] { "Sobre", Sobre });
		}
		if (Obe1 > 0) {
			modelo.addRow(new Object[] { "Obesidade I", Obe1 });
		}
		if (Obe2 > 0) {
			modelo.addRow(new Object[] { "Obesidade II", Obe2});
		}
		if (Obe3 > 0) {
			modelo.addRow(new Object[] { "Obesidade III", Obe3});
		}

		return modelo;
	}
	
	//Excluir
	public void excluir(int i) {
		Pessoas.arrayIMC.remove(i);
	}
	
	//Verifica campos preenchidos
	public boolean campos(String a, String b,String c,String d) {
		if ( (!a.equals("")) && (!b.equals("")) && (!c.equals("")) && (!d.equals("")) )
			return true;
		return false;
		
	}
	
}
