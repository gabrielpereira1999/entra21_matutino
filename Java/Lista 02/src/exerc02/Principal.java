package exerc02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome="",nvelho="",npeso="",nalto="";
		short num=0,idade,velho=0;
		float altura,peso,alto=0,pesado=0,media=0;
		
		while( !(nome.toLowerCase()).equals("sair")) {
			try {
				nome = JOptionPane.showInputDialog("Informe o nome");
				if( (nome.toLowerCase()).equals("sair") )
					break;
				idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade"));
				if( idade < 3) {
					JOptionPane.showMessageDialog(null, "Idade inválida");
					continue;
				}
				altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura"));
				peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso"));
				if(idade > velho) {
					nvelho = nome;
					velho = idade;
				}
				if(altura > alto) {
					nalto = nome;
					alto = altura;
				}
				if(peso > pesado) {
					npeso = nome;
					pesado = peso;
				}
				num++;
				media+=altura;
				
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}
		}
		if(num==0)
			JOptionPane.showMessageDialog(null,"Nenhum jogador cadastrado");
		else
			JOptionPane.showMessageDialog(null,"Número de jogadores cadastrados: "+num+"\nJogador mais alto: "+nalto+" com "+alto+"m"
				+"\nJogador mais velho: "+nvelho+" com "+velho+" anos"+"\nJogador mais pesado: "+npeso+" com "+pesado+" kg"
				+"\nAltura média dos jogadores: "+(media/num),"Informações",JOptionPane.PLAIN_MESSAGE);

	}

}
