package exerc03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String verbo,eu = "EU ",tu="TU ",ele="ELE ",nos="N�S ",vos="V�S ",eles="ELES ";
		
		verbo = JOptionPane.showInputDialog("Informe um verbo terminado em AR");
		
		if((!verbo.endsWith("AR")) && (!verbo.endsWith("ar")) ) {
			JOptionPane.showMessageDialog(null, "N�o foi inserido um verbo terminado em AR");
		}else {
			char[] array = verbo.toUpperCase().toCharArray();
			for(int i = 0;i<(verbo.length()-2);i++) {
				eu += array[i];
				tu += array[i];
				ele += array[i];
				nos += array[i];
				vos += array[i];
				eles += array[i];
			}
			JOptionPane.showMessageDialog(null, "A conjuga��o do verbo "+verbo.toUpperCase()+" �:\n"+eu+"O\n"+tu+"AS\n"+ele+"A\n"
					+nos+"AMOS\n"+vos+"AIS\n"+eles+"AM");
		}

	}

}
