package exerc01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double[] num1 = new double[10];
		double[] num2 = new double[10];
		Object[] operacao = {"Adição","Subtração","Multiplicação","Divisão"};
		
		try {
		for(int i=0;i<10;i++) {
			num1[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+(i+1)+"° número para o primero vetor"));
			num2[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+(i+1)+"° número para o segundo vetor"));
		}}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
					JOptionPane.PLAIN_MESSAGE);
		}
		
		switch(JOptionPane.showOptionDialog(null, "Escolha uma operação", "Operação",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, operacao,operacao[0])){
		case 0:
			for(int i=0;i<10;i++) {
				System.out.println(num1[i]+" + "+num2[i]+" = "+(num1[i]+num2[i]));
			}
			break;
		case 1:
			for(int i=0;i<10;i++) {
				System.out.println(num1[i]+" - "+num2[i]+" = "+(num1[i]-num2[i]));
			}
			break;
		case 2:
			for(int i=0;i<10;i++) {
				System.out.println(num1[i]+" X "+num2[i]+" = "+(num1[i]*num2[i]));
			}
			break;
		case 3:
			for(int i=0;i<10;i++) {
				System.out.println(num1[i]+" / "+num2[i]+" = "+(num1[i]/num2[i]));
			}
			break;
		}
		
	}

}
