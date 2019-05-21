package exerc06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome="a",situ;
		Object[] sexo1 = {"Masculino", "Feminino"};
		short hom=0,mul=0,med10=0,med99=0,med89=0,med79=0,med5=0,medb=0; 
		int aux;
		float n1,n2,n3,n4;
		
		
			try {
				while( !(JOptionPane.showInputDialog("Informe o nome").toLowerCase().equals("sair")) ){
				aux = JOptionPane.showOptionDialog(null, "Informe seu sexo", "Sexo", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, sexo1, sexo1[0]);
				if( aux == 0 ) 
					hom++;
				else if( aux == 1)
					mul++;
				else {
					JOptionPane.showMessageDialog(null, "Erro, nenhum sexo selecionado");
					continue;
				}
				n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1"));
				n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2"));
				n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 3"));
				n4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 4"));
				if( (n1>10) || (n1<0) || (n2>10) || (n2<0) || (n3>10) || (n3<0) || (n4>10) || (n4<0) ) {
					JOptionPane.showMessageDialog(null, "Erro, nota inserida inválida");
					if(aux==0)
						hom--;
					else
						mul--;
					continue;
				}
				if( ((n1+n2+n3+n4)/4) == 10 ) {
					med10++;
					situ = "Aprovado";
				}else if( ((n1+n2+n3+n4)/4) >= 9 ) {
					med99++;
					situ = "Aprovado";
				}else if( ((n1+n2+n3+n4)/4) >= 8 ) {
					med89++;
					situ = "Aprovado";
				}else if( ((n1+n2+n3+n4)/4) >= 7 ) {
					med79++;
					situ = "Aprovado";
				}else if( ((n1+n2+n3+n4)/4) >= 5 ) {
					med5++;
					situ = "Recuperação";
				}else {
					medb++;
					situ = "Reprovado";
				}
					
				JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nSituação: "+situ);
				
				}
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}
		if((hom+mul)==0)
			JOptionPane.showMessageDialog(null,"Nenhum dado inserido");
		else
			JOptionPane.showMessageDialog(null,"Homens: "+hom+"  "+((hom*100)/(hom+mul))+"%\nMulheres: "+mul+"  "+((mul*100)/(hom+mul))
				+"%\nAlunos que tiraram 10: "+med10+"  "+((med10*100)/(hom+mul))+"%\nAlunos que tiraram média entre 9.0 e 9.9: "
				+med99+"  "+((med99*100)/(hom+mul))+"%\nAlunos que tiraram média entre 8.0 e 8.9: "+med89+"  "+((med89*100)/(hom+mul))
				+"%\nAlunos que tiraram média entre 7.0 e 7.9: "+med89+"  "+((med79*100)/(hom+mul))+
				"%\nAlunos que tiraram média entre 5.0 e 6.9: "+med89+"  "+((med5*100)/(hom+mul))
				+"%\nAlunos que tiraram média abaixo de 5: "+medb+"  "+((medb*100)/(hom+mul))+"%","Informações",JOptionPane.PLAIN_MESSAGE);
	}
}


