package exerc03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		boolean tem10 = false;
		for(int i =0;i<5;i++) {
			num[i]=Double.parseDouble(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero"));
		}
		for(int i =0;i<5;i++) {
			if(num[i]==10) {
				JOptionPane.showMessageDialog(null, "O n�mero 10 aparece na posi��o "+(i+1)+" do vetor");
				tem10 = true;
			}
		}
		
		if(tem10 == false)
			JOptionPane.showMessageDialog(null, "O n�mero 10 n�o est� presente neste vetor");

	}

}
