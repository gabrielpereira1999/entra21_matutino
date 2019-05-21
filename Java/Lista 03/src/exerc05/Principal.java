package exerc05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int[] num = new int[15];
		int soma=0,maiori=0,menor=0,pos=0,neg=0,neu=0,maior=0,par=0,impar=0;
		double media;
		try {
		for(int i = 0;i<15;i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			soma+=num[i];
		}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
					JOptionPane.PLAIN_MESSAGE);
		}
		media = soma/15;
		for(int i = 0;i<15;i++) {
			if ( num[i]==0 )
				neu++;
			else if(num[i] >0)
				pos++;
			else
				neg++;
			if ( num[i]>=media )
				maiori++;
			if ( num[i]>maior )
				maior = num[i];
			if ( num[i]<menor )
				menor = num[i];
			if ( num[i]!=0 ) {
				if( (num[i]%2)==0 )
					par++;
				else
					impar++;
			}
		}
		JOptionPane.showMessageDialog(null, "Soma dos números: "+soma+"\nMédia dos números: "+media+"\nMaiores ou iguais a média: "+maiori+
				"\nPositivos: "+pos+"\nNegativos: "+neg+"\nNeutros: "+neu+"\nMaior número: "+maior+"\nMenor número: "+menor+
				"\nNúmeros pares: "+par+"\nNúmeros ímpares: "+impar);
	}

}
