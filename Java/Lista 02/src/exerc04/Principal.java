package exerc04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] nota = {"Excelente", "Ótimo","Bom","Regular", "Ruim","Sair"};
		int idade, crianca=0,adol=0,adulto=0,exc=0,oti=0,bom=0,reg=0,ruim=0,votos=0;
		boolean sair = false;
		
		while(sair==false) {
			try {
				switch(JOptionPane.showOptionDialog(null, "Informe sua nota", "Nota", JOptionPane.YES_NO_CANCEL_OPTION, //Nota
						JOptionPane.PLAIN_MESSAGE, null, nota, nota[0])) {
				case 0:
					exc++;
				break;
				case 1:
					oti++;
				break;
				case 2:
					bom++;
				break;
				case 3:
					reg++;
				break;
				case 4:
					ruim++;
				break;
				case 5:
					sair=true;
				break;
				case -1:
					throw new Exception("Janela fechada") ;
				}
				if(sair==true)
					break;
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
				boolean valida = false;
				while(valida == false ) {
					if( (idade<0) || (idade>100) ) {
						JOptionPane.showMessageDialog(null,"Idade inválida");
						idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
					}else
						valida= true;
				}
				if(idade < 10)
					crianca++;
				else if(idade <18)
					adol++;
				else
					adulto++;
				votos++;
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}
		}
		if(votos>0)
		JOptionPane.showMessageDialog(null, "Percentual de votos e idade dos votantes:\nExcelente: "+((exc*100)/votos)+"%\nÓtimo: "+((oti*100)/votos)
				+"%"+"\nBom: "+((bom*100)/votos)+"%\nRegular: "+((reg*100)/votos)+"%\nRuim: "+((ruim*100)/votos)+"%\nCrianças: "+crianca+"\nAdoslecentes: "
				+adol+"\nAdultos: "+adulto);
		else
			JOptionPane.showMessageDialog(null, "Não houve avaliações");
			
	}
}
		


