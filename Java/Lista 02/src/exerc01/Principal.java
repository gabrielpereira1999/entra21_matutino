package exerc01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome;
		short idade=0,idade0=0, idade18=0, nhom=0, nmul=0, nger=0, nate=0, naço=0, nsec=0, nalm=0, npad=0, nest=0,i=1;
		Object[] sexo1 = {"Masculino", "Feminino"};
		Object[] cargo1 = {"Gerente", "Atendente", "Açougueiro", "Secretária", "Almoxarife", "Padeiro", "Estagiário"};
		do {
			try {
				nome = JOptionPane.showInputDialog("Informe seu nome");
				if ( (nome == null) || (nome.equals("")) ) {
					JOptionPane.showMessageDialog(null,"Nenhum nome inserido","Erro",JOptionPane.PLAIN_MESSAGE);
					continue;
				}
				idade = Short.parseShort(JOptionPane.showInputDialog("Informe sua idade"));
				if( idade >=18) //idade
					idade18++;
				else if(idade > 0)
					idade++;
				else {
					JOptionPane.showMessageDialog(null, "Idade inválida");
					continue;
				}
				switch(JOptionPane.showOptionDialog(null, "Informe seu sexo", "Sexo", JOptionPane.YES_NO_CANCEL_OPTION, //Sexo
						JOptionPane.PLAIN_MESSAGE, null, sexo1, sexo1[0])) {
				case 0:
					nhom++;
				break;
				case 1:
					nmul++;
				break;
				case -1:
					throw new Exception("Nenhum sexo selecionado") ;
				}
				switch(JOptionPane.showOptionDialog(null, "Informe seu cargo", "Cargo", JOptionPane.YES_NO_CANCEL_OPTION, //Cargo
						JOptionPane.PLAIN_MESSAGE, null, cargo1, cargo1[0])) {
				case 0:
					nger++;
				break;
				case 1:
					nate++;
				break;
				case 2:
					naço++;
				break;
				case 3:
					nsec++;
				break;
				case 4:
					nalm++;
				break;
				case 5:
					npad++;
				break;
				case 6:
					nest++;
				break;
				case -1:
					throw new Exception("Nenhum cargo selecionado") ;
				
				}
				i++;
				
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}
		}while(i<=1);//Numero de pessoas a cadastrar
		
		JOptionPane.showMessageDialog(null, "Homens: "+nhom+"\nMulheres: "+nmul+"\nGerentes: "+nger+"\nAtendentes: "+nate+
				"\nAçougueiros: "+naço+"\nSecretárias: "+nsec+"\nAlmoxarifes: "+nalm+"\nPadeiros: "+npad+"\nEstagiários: "+nest
				+"\nMaiores de idade: "+idade18+"\nMenores de idade: "+idade0);
	}

}
