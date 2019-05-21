package exerc04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog(null, "Insira o produto escolhido:", "Escolha do produto", JOptionPane.PLAIN_MESSAGE),
			   forma_pag= JOptionPane.showInputDialog(null, "Insira a forma de pagamento(à vista, parcelado):", "Forma de pagamento", JOptionPane.PLAIN_MESSAGE).toLowerCase();
		int  valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do produto:", "Valor do produto", JOptionPane.PLAIN_MESSAGE));
		
		if ( (forma_pag.equals("à vista") || forma_pag.equals("a vista")) && (valor > 500) ) {
			JOptionPane.showMessageDialog(null, "Você recebeu 10% de desconto.\nProduto: "+produto+"\nValor final da compra: R$"+(valor*0.9), "Final da compra", JOptionPane.PLAIN_MESSAGE);
		
		}else if((forma_pag.equals("à vista")) || (forma_pag.equals("a vista")) || (forma_pag.equals("parcelado")) ){
			JOptionPane.showMessageDialog(null, "Produto: "+produto+"\nValor final da compra: R$"+valor, "Final da compra", JOptionPane.PLAIN_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "O método de pagamento inserido é inválido", "Final da compra", JOptionPane.PLAIN_MESSAGE);
		}

	}

}
