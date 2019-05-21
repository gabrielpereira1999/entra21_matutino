package exerc05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		boolean sair = false;
		while(sair==false) {
			try {
				String prod;
				float valor;
				int i;
				prod = JOptionPane.showInputDialog("Informe o nome do produto");
				
				if( (prod==null) || (prod.equals("")) ) {
					JOptionPane.showMessageDialog(null,"Você saiu ou não inseriu o nome do produto","Erro",JOptionPane.PLAIN_MESSAGE);
					sair = true;
				}else {
					valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto"));
					System.out.println("Produto: "+prod+"\nValor: R$"+valor+"\n");
					for(i=1;i<=10;i++) {
						System.out.println(""+i+" x R$"+(valor*(1-(i*0.05))*i) );
					}
					sair = true;
					prod.equals("null");
				}
				
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

}
