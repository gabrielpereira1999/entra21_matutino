package exerc10;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double aplicado=0,ganho=0,total=0;
		short tempo=999,dia=10,mes=04,ano=2019;
		boolean feito = false;
		DecimalFormat format = new DecimalFormat("0.00");
		format.setRoundingMode(RoundingMode.HALF_EVEN);
		while(feito == false) {
			try {
				aplicado = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja aplicar"));
				if(aplicado <=0) {
					
				}
				tempo = Short.parseShort(JOptionPane.showInputDialog("Informe por quanto tempo deseja deixar o valor aplicado em meses.(Não mais que 24 meses)"));
				if(tempo > 24) {
					JOptionPane.showMessageDialog(null,"Tempo inserido muito alto");
					continue;
				}else if(tempo<=0) {
					JOptionPane.showMessageDialog(null,"Tempo inserido muito baixo");
					tempo = 999;
					continue;
				}
				feito = true;
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Você saiu",":(",JOptionPane.PLAIN_MESSAGE);
				break;
			}
		}
		System.out.println("Data\t\tGanho\t\tTotal\n");
		total = aplicado;
		while(tempo>0) {
			if(mes<12) 
				mes++;
			else {
				mes=1;
				ano++;
			}
			ganho = aplicado * 0.0037;
			aplicado+=ganho;
			if(mes<=9)
				System.out.println(dia+"/0"+mes+"/"+ano+"\tR$"+format.format(ganho)+"\t\t"+format.format(aplicado));
			else
				System.out.println(dia+"/"+mes+"/"+ano+"\tR$"+format.format(ganho)+"\t\t"+format.format(aplicado));
			tempo--;
		}
		total = aplicado - total;
		System.out.println("\nTotal ganho de juros: R$"+format.format(total));
	}
}
