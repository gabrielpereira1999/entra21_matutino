package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import dados.Dado;

public class Acao {

	//Cadastrar
	public void cadastrar(Jogo c) {
		
		Dado.arrayDados.add(c);
		
	}
	
	//Excluir
	public void excluir(int i, String c, String b) {
		Dado.arrayDados.remove(i);
		
		//Estatistica plataforma
		for(int j = 0;j<Dado.arrayPlat.size();j++) {
			if( (c.equals(Dado.arrayPlat.get(j)[0])) ) {
				Dado.arrayPlat.set(j, new String[] {c,""+(Integer.parseInt(Dado.arrayPlat.get(j)[1])-1)});
			}
		}
		
		//Estatística gênero
		for(int j = 0;j<Dado.arrayGenero.size();j++) {
			if( (b.equals(Dado.arrayGenero.get(j)[0])) ) {
				Dado.arrayGenero.set(j, new String[] {b,""+(Integer.parseInt(Dado.arrayGenero.get(j)[1])-1)});
			}
		}
		
	}
	
	//Alterar
	public void alterar(int indice, Jogo c, String plat, String genero) {
		Dado.arrayDados.set(indice, c);
		boolean aux = true;
		for(int j = 0;j<Dado.arrayPlat.size();j++) {
			if( (plat.equals(Dado.arrayPlat.get(j)[0])) ) {
				Dado.arrayPlat.set(j, new String[] {plat,""+(Integer.parseInt(Dado.arrayPlat.get(j)[1])-1)});
				for(int i = 0;i<Dado.arrayPlat.size();i++) {
					if(c.getPlataforma().equals(Dado.arrayPlat.get(i)[0])) {
						Dado.arrayPlat.set(i, new String[] {c.getPlataforma(),""+(Integer.parseInt(Dado.arrayPlat.get(i)[1])+1)});
						aux = false;
					}
				}
				if(aux) {
					Dado.arrayPlat.add(new String[] {c.getPlataforma(),"1"});
					break;
				}
			}
		}
		
		for(int j = 0;j<Dado.arrayGenero.size();j++) {
			if( (genero.equals(Dado.arrayGenero.get(j)[0])) ) {
				Dado.arrayGenero.set(j, new String[] {genero,""+(Integer.parseInt(Dado.arrayGenero.get(j)[1])-1)});
				for(int i = 0;i<Dado.arrayGenero.size();i++) {
					if(c.getGenero().equals(Dado.arrayGenero.get(i)[0])) {
						Dado.arrayGenero.set(i, new String[] {c.getGenero(),""+(Integer.parseInt(Dado.arrayGenero.get(i)[1])+1)});
						return;
					}
				}
				Dado.arrayGenero.add(new String[] {c.getGenero(),"1"});
				break;
			}
		}
		
		
		
		
	}
	
	//Selecionar
	public DefaultTableModel selecionar() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Jogo");
		modelo.addColumn("Gênero");
		modelo.addColumn("Plataforma");
		modelo.addColumn("Classificação Indicativa");
		modelo.addColumn("Valor");
		
		for(int i = 0;i<Dado.arrayDados.size();i++) {
			modelo.addRow(new Object[] {
					Dado.arrayDados.get(i).getNome(),
					Dado.arrayDados.get(i).getGenero(),
					Dado.arrayDados.get(i).getPlataforma(),
					Dado.arrayDados.get(i).getClassificao(),
					Dado.arrayDados.get(i).getValor(),
			});
		}
		return modelo;
	}
	
	//Estatística plataforma
	public DefaultTableModel plataforma(String plat) {
		DefaultTableModel modeloPlat = new DefaultTableModel();
		modeloPlat.addColumn("Plataforma");
		modeloPlat.addColumn("Jogos");
		
		for(int i = 0;i<Dado.arrayPlat.size();i++) {
			if( Dado.arrayPlat.get(i)[0].equals(plat) ) {
				Dado.arrayPlat.set(i, new String[] {plat,""+(Integer.parseInt(Dado.arrayPlat.get(i)[1])+1)});
				for(int j = 0;j<Dado.arrayPlat.size();j++) {
					modeloPlat.addRow(new Object[] {Dado.arrayPlat.get(j)[0],Dado.arrayPlat.get(j)[1]});
				}
				return modeloPlat;
			}
		}
		
		Dado.arrayPlat.add(new String[]{plat,"1"});
		for(int i = 0;i<Dado.arrayPlat.size();i++) {
			modeloPlat.addRow(new Object[] {Dado.arrayPlat.get(i)[0],Dado.arrayPlat.get(i)[1]});
		}
		
		return modeloPlat;
	}
	
	//Estatística Gênero
	public DefaultTableModel genero(String genero) {
		DefaultTableModel modeloGenero = new DefaultTableModel();
		modeloGenero.addColumn("Gênero");
		modeloGenero.addColumn("Jogos");
		
		for(int i = 0;i<Dado.arrayGenero.size();i++) {
			if( Dado.arrayGenero.get(i)[0].equals(genero) ) {
				Dado.arrayGenero.set(i, new String[] {genero,""+(Integer.parseInt(Dado.arrayGenero.get(i)[1])+1)});
				for(int j = 0;j<Dado.arrayGenero.size();j++) {
					modeloGenero.addRow(new Object[] {Dado.arrayGenero.get(j)[0],Dado.arrayGenero.get(j)[1]});
				}
				return modeloGenero;
			}
		}
		
		Dado.arrayGenero.add(new String[]{genero,"1"});
		for(int i = 0;i<Dado.arrayGenero.size();i++) {
			modeloGenero.addRow(new Object[] {Dado.arrayGenero.get(i)[0],Dado.arrayGenero.get(i)[1]});
		}
		
		return modeloGenero;
	}
	
	//Validar repeticao
	public boolean validar(Jogo c) {
		
		for(int i = 0;i<Dado.arrayDados.size();i++) {
			if( (Dado.arrayDados.get(i).getNome().contentEquals(c.getNome())) && (Dado.arrayDados.get(i).getPlataforma().contentEquals(c.getPlataforma())) ) {
				return true;
			}
		}
		
		return false;
	}
	
	//Refaz Modelo plataforma
	public DefaultTableModel mostraplataforma() {
		DefaultTableModel modeloPlat = new DefaultTableModel();
		modeloPlat.addColumn("Plataforma");
		modeloPlat.addColumn("Jogos");
		for(int j = 0;j<Dado.arrayPlat.size();j++) {
			modeloPlat.addRow(new Object[] {Dado.arrayPlat.get(j)[0],Dado.arrayPlat.get(j)[1]});
		}
		return modeloPlat;
	}
	
	//Refaz Modelo genero
	public DefaultTableModel mostragenero() {
		DefaultTableModel modeloGenero = new DefaultTableModel();
		modeloGenero.addColumn("Gênero");
		modeloGenero.addColumn("Jogos");
		for(int j = 0;j<Dado.arrayGenero.size();j++) {
			modeloGenero.addRow(new Object[] {Dado.arrayGenero.get(j)[0],Dado.arrayGenero.get(j)[1]});
		}
		return modeloGenero;
	}
}
