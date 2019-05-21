package exerc07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String pri="_",seg="S",ter="_",qua="_",qui="_",sex="_",set="R",poss="A B C D E F G H I J K L M N O P Q T U V W X Y Z",
				err="",teste;
		JOptionPane.showMessageDialog(null, "Jogo da Forca");
		
		while( !(pri+seg+ter+qua+qui+sex+set).toLowerCase().equals("estudar")) {
			try {
				teste = JOptionPane.showInputDialog(""+(pri+seg+ter+qua+qui+sex+set).toUpperCase()+"\nInsira uma letra para testar\n"
						+ "Restantes: "+poss+"\nErradas: "+err);
				if(teste.toLowerCase().equals("e")) {
					pri = "E";
					poss = poss.replace("E", "");
				}else if( teste.toLowerCase().equals("t") ) {
					ter = "T";
					poss = poss.replace("T", "");
				}else if( teste.toLowerCase().equals("u") ) {
					qua = "U";
					poss = poss.replace("U", "");
				}else if( teste.toLowerCase().equals("d") ) {
					qui = "D";
					poss = poss.replace("D", "");
				}else if( teste.toLowerCase().equals("a") ) {
					sex = "A";
					poss = poss.replace("A", "");
				}else if( teste.toLowerCase().equals("") ) {
					JOptionPane.showMessageDialog(null,"Nada inserido","Erro",JOptionPane.PLAIN_MESSAGE);
				}else{
					poss = poss.replace(teste.toUpperCase(), "");
					err = err+(teste.toUpperCase());
				}
			}
			catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Você saiu",":(",JOptionPane.PLAIN_MESSAGE);
				break;
			}
		}
		if( (pri+seg+ter+qua+qui+sex+set).toLowerCase().equals("estudar") ) 
			JOptionPane.showMessageDialog(null,"Você conseguiu, parabéns!","Parabéns",JOptionPane.PLAIN_MESSAGE);
		

	}

}
