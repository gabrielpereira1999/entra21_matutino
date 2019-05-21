package exerc03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		boolean tem10 = false;
		for(int i =0;i<5;i++) {
			num[i]=Double.parseDouble(JOptionPane.showInputDialog("Informe o "+(i+1)+"° número"));
		}
		for(int i =0;i<5;i++) {
			if(num[i]==10) {
				JOptionPane.showMessageDialog(null, "O número 10 aparece na posição "+(i+1)+" do vetor");
				tem10 = true;
			}
		}
		
		if(tem10 == false)
			JOptionPane.showMessageDialog(null, "O número 10 não está presente neste vetor");

	}

}
