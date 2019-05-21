package exerc16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		float[] pedidos = new float[7];
		pedidos[0]= 5f; pedidos[1]= 4.5f; pedidos[2]= 8f; pedidos[3]= 12f;
		pedidos[4]= 16.5f;pedidos[5]= 1f;pedidos[6]= 2.5f;
		
		try{
			byte pedido = Byte.parseByte(JOptionPane.showInputDialog(null,"Número do pedido","N° Pedido",
					JOptionPane.PLAIN_MESSAGE));
			short pag = Short.parseShort(JOptionPane.showInputDialog(null,"Valor pago","Valor pago",
					JOptionPane.PLAIN_MESSAGE));
			if( (pedido <1) || (pedido > 8) || (pag < 1)) {
				JOptionPane.showMessageDialog(null,"Informações inválidas","Erro",JOptionPane.PLAIN_MESSAGE);
			}else if(pag-pedidos[pedido]<0) {
				JOptionPane.showMessageDialog(null,"O valor pago é insuficiente","Erro",JOptionPane.PLAIN_MESSAGE);
			}else{JOptionPane.showMessageDialog(null,"N° pedido: "+pedido+"\nValor do pedido: R$"+pedidos[pedido]
					+"\nValor do troco: R$"+(pag-pedidos[pedido]),"N° Pedido",JOptionPane.PLAIN_MESSAGE);
			}
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}
	}

}
