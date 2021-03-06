package acao;

import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import dados.Dado;

public class Acao {
	
	static public String logado;
	
	
	//Excluir
		public void excluir(int i) {
			Dado.UserArray.remove(i);
		}
	
	//Valida login
	public int valida (Usuario u ) {
		for(int i =0; i<Dado.UserArray.size();i++) {
			if( (Dado.UserArray.get(i).getUserName().equals(u.getUserName())) && (Dado.UserArray.get(i).getUserPassword().equals(u.getUserPassword())) ){ 
				if( Dado.UserArray.get(i).getUserLevel().equals("Adm") )
					return 0;
				else
					return 1;
			}
		}
		return 2;
	}
	
	//Lista usuarios para adm
	public DefaultTableModel usuariosAdm() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Usu�rio");
		modelo.addColumn("Senha");
		modelo.addColumn("N�vel");
		modelo.addColumn("E-mail");
		modelo.addColumn("Data Cadastro");
		
		for(int i = 0;i<Dado.UserArray.size();i++) {
			modelo.addRow(new Object[] {
					Dado.UserArray.get(i).getUserName(),
					Dado.UserArray.get(i).getUserPassword(),
					Dado.UserArray.get(i).getUserLevel(),
					Dado.UserArray.get(i).getUserMail(),
					Dado.UserArray.get(i).getUserCreated(),
			});
		}
		return modelo;
	}
	
	//Lista usuarios para usu�rio comum
		public DefaultTableModel usuarios() {
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.addColumn("Usu�rio");
			
			for(int i = 0;i<Dado.UserArray.size();i++) {
				modelo.addRow(new Object[] {
						Dado.UserArray.get(i).getUserName()	});
			}
			return modelo;
		}
	
	//Cadastra User
	public boolean cadastra (Usuario u) {
		for(int i = 0;i<Dado.UserArray.size();i++) {
			if(Dado.UserArray.get(i).getUserName().equals(u.getUserName()))
				return false;
		}
		Dado.UserArray.add(u);
		return true;
	}
	
	//Alterar
	public void alterar(int i, Usuario c, String anterior) {
		if( anterior.equals(logado) )
			logado = c.getUserName();
		Dado.UserArray.set(i, c);
		
		
	}
	
	//Devolve dados usu�rio
	public Usuario userlogado() {
		Usuario u = new Usuario();
		for(int i = 0;i<Dado.UserArray.size();i++) {
			if ( Dado.UserArray.get(i).getUserName().equals(logado) ) {
				u.setUserName(Dado.UserArray.get(i).getUserName());
				u.setUserPassword(Dado.UserArray.get(i).getUserPassword());
				u.setUserLevel(Dado.UserArray.get(i).getUserLevel());
				u.setUserMail(Dado.UserArray.get(i).getUserMail());
				u.setUserCreated(Dado.UserArray.get(i).getUserCreated());
				break;
			}
		}
		return u;
	}

}
