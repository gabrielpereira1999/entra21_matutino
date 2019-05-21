package exerc02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double[] num = new double[10];
		double aux;
		for(int i =0;i<10;i++) {
			num[i]=Double.parseDouble(JOptionPane.showInputDialog("Informe o "+(i+1)+"° número"));
		}
		
		
		for(int i =0;i<5;i++) {
			aux = num[i];
			num[i] = num[9-i];
			num[9-i] = aux;
		}
		for(int i =0;i<10;i++) {
			System.out.println(num[i]);
		}

	}

}
