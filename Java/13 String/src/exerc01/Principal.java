package exerc01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String texto="",ma,mi,resp="";
		texto = JOptionPane.showInputDialog("Insira uma palavra");
		ma=texto.toUpperCase();
		mi=texto.toLowerCase();
		for(int i = 0; i<texto.length();i++) {
			resp += ma.charAt(i);
			i++;
			if(i<texto.length())
				resp+=mi.charAt(i);
		}
		JOptionPane.showMessageDialog(null, ""+resp);

	}

}
