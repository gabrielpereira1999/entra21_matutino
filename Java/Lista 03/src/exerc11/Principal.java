package exerc11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String[][] dados = new String[20][6];
		double aux;
		int hom = 0, mul = 0, ac40 = 0, e35 = 0, e30 = 0, e25 = 0, e185 = 0, e17 = 0, emenor = 0;
		for (int i = 0; i < 20; i++) {
			dados[i][0] = JOptionPane.showInputDialog("Informe o nome");
			if( (dados[i][0] == null) || ((dados[i][0]).equals("")) )
				break;
			dados[i][1] = JOptionPane.showInputDialog("Informe o sexo").toLowerCase();
			if ( (dados[i][1]).equals("masculino") )
				hom++;
			else if ( (dados[i][1]).equals("feminino") )
				mul++;
			else {
					JOptionPane.showMessageDialog(null, "Sexo inválido. Reinsira os dados");
					break;
			}
			dados[i][2] = JOptionPane.showInputDialog("Informe a altura");
			dados[i][3] = JOptionPane.showInputDialog("Informe o peso");
			aux = (Double.parseDouble(dados[i][3]))
					/ ((Double.parseDouble(dados[i][2])) * (Double.parseDouble(dados[i][2])));
			dados[i][4] = Double.toString(aux);
			if (aux > 39.99) {
				dados[i][5] = "Obesidade III (mórbida)";
				ac40++;
			} else if (aux >= 35) {
				dados[i][5] = "Obesidade II (severa)";
				e35++;
			} else if (aux >= 30) {
				dados[i][5] = "Obesidade I";
				e30++;
			} else if (aux >= 25) {
				dados[i][5] = "Acima do peso";
				e25++;
			} else if (aux >= 18.5) {
				dados[i][5] = "Peso normal";
				e185++;
			} else if (aux >= 17) {
				dados[i][5] = "Abaixo do peso";
				e17++;
			} else {
				dados[i][5] = "Muito abaixo do peso";
				emenor++;

			}
		}
		for (int i = 0; i < 20; i++) {
			if( (dados[i][0] == null) || ((dados[i][0]).equals("")) )
				break;
			System.out.println("Nome: "+dados[i][0]+"\nIMC: "+dados[i][4]+"\nSituação: "+dados[i][5]+"\n");
		}
		System.out.println("Número de homens: "+hom+" "+((hom*100)/(hom+mul))+"%"+"\nNúmero de mulheres: "+mul+" "+((mul*100)/(hom+mul))+
				"%"+"\nPessoas muito abaixo do peso: "+emenor+"\nPessoas abaixo do peso: "+e17+"\nPessoas com peso normal: "+e185+
				"\nPessoas acima do peso: "+e25+"\nPessoas com obesidade I: "+e30+"\nPessoas com obesidade II: "+e35+
				"\nPessoas com obesidade III: "+ac40);
		
	}

}
