package exerc09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int n1,n2,par=0,impar=0,pos=0,neg=0;
		try {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
			if(n1>n2) {
				while(n1 >= n2) {
					System.out.println(n2+" ");
					if(n2>0)
						pos++;
					if(n2<0)
						neg++;
					if( ((n2%2) ==0) && (n2 != 0) ) 
						par++;
					else if(n2 != 0)
						impar++;
					n2++;
				}
			}
			else {
				while(n1 <= n2) {
					System.out.println(n1+" ");
					if(n1>0)
						pos++;
					if(n1<0)
						neg++;
					if( ((n1%2) ==0) && (n1 != 0) ) 
						par++;
					else if (n1 != 0)
						impar++;
					n1++;
				}
			}
			
				
			
			System.out.println("Pares: "+par+"\nÍmpares: "+impar+"\nPositivos: "+pos+"\nNegativos: "+neg);
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro "+erro.getMessage()+"\nO programa irá fechar","Erro",JOptionPane.PLAIN_MESSAGE);
		}
		
	}

}
