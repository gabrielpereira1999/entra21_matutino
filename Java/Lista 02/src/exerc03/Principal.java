package exerc03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] finalizar1 = {"Adicionar um código", "Finalizar"};
		Object[] pedido1 = {"1", "2", "3", "4", "5", "6", "7"};
		int qntd = 0,finalizar =0,pedido;
		float troco,total=0;
		
		while(finalizar != 1) {
			try {
				finalizar = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, finalizar1, finalizar1[0]);
				if(finalizar == 1)
					break;
				pedido = JOptionPane.showOptionDialog(null, "Escolha um pedido", "Opções", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, pedido1, pedido1[0]);
				qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de undidades deste pedido"));
				if (qntd <= 0)
					throw new Exception("Quantidade inserida inválida") ;
				if(pedido == 0)
					total += 5*qntd;
				else if(pedido == 1)
					total += 4.5*qntd;
				else if(pedido == 2)
					total += 8*qntd;
				else if(pedido == 3)
					total += 12*qntd;
				else if(pedido == 4)
					total += 16.5*qntd;
				else if(pedido == 5)
					total += 1*qntd;
				else 
					total += 2.5*qntd;
				
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro: "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}
		}
			while(qntd > 0) {
				try{
					JOptionPane.showMessageDialog(null,"Valor total: R$"+total,"Total",JOptionPane.PLAIN_MESSAGE);
					troco = (Float.parseFloat(JOptionPane.showInputDialog("Valor pago")))-total;
					if(troco<0)
						throw new Exception("Valor insuficiente") ;
					JOptionPane.showMessageDialog(null,"Valor do troco: R$"+troco,"Troco",JOptionPane.PLAIN_MESSAGE);
					qntd = 0;
				
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null,"Erro: "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			
		}
	}


