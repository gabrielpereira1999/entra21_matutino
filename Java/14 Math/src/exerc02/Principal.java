package exerc02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double rnd = Math.random();
		
		int num = (int)Math.round((rnd*100)),chute,tent=1;
		
		chute = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro palpite para o número gerado"));
		boolean acertou = false;
		while(acertou == false) {
			if(num == chute) {
				if(tent==1) {
					JOptionPane.showMessageDialog(null, "Nossa! Acertou na mosca");
					acertou = true;
					break;
				}else if(tent<=5) {
					JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");
					acertou = true;
					break;
				}else if(tent<=10) {
					JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
					acertou = true;
					break;
				}else if(tent<=20) {
					JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
					acertou = true;
					break;
				}else if(tent>20) {
					JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?");
					acertou = true;
					break;
				}
			}else if( (Math.max(num,chute))-Math.min(num, chute) <=10 ) {
					JOptionPane.showMessageDialog(null, "Está perto!");	
			}else if( (Math.max(num,chute))-Math.min(num, chute) <=20 ) {
				JOptionPane.showMessageDialog(null, "Está longe!");	
			}else if( (Math.max(num,chute))-Math.min(num, chute) >20 ) {
				JOptionPane.showMessageDialog(null, "Ihhhhh! Muito longe.");	
			}
			tent++;
			try {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Informe outro palpite para o número gerado"));
			}catch(Exception a) {
				tent--;
				continue;
			}
		}

	}

}
