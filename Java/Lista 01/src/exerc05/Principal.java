package exerc05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		byte dia = Byte.parseByte(JOptionPane.showInputDialog(null,"Insira o dia","Seleção do dia",JOptionPane.PLAIN_MESSAGE));
		byte i = 0;
		boolean teste = false;
		while(i<=4) {
			if( (dia == 3+(7*i)) || (dia == 4+(7*i)) ) {
				JOptionPane.showMessageDialog(null, "Dia "+dia+" é fim de semana");
				teste = true;
			}
			i += 1;
		}
		if (teste) {
			
		}else if ( (dia < 1) || (dia >28) ) {
			JOptionPane.showMessageDialog(null, "O dia inserido é inválido");
		}else {
			JOptionPane.showMessageDialog(null, "Dia "+dia+" é dia de semana");
		}
			
		}
	}
		


