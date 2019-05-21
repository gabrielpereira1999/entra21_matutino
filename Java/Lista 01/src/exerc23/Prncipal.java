package exerc23;

import javax.swing.JOptionPane;

public class Prncipal {

	public static void main(String[] args) {
		
		try{
			float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o seu peso", "Peso", JOptionPane.PLAIN_MESSAGE)),
				  altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a sua altura", "Altura", JOptionPane.PLAIN_MESSAGE));
			if( (peso <=0) || (altura<=0) ) {
				JOptionPane.showMessageDialog(null,"Dados inseridos inválidos","erro",JOptionPane.PLAIN_MESSAGE);
			}else if( (peso/Math.pow(altura, 2) < 17 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC é "+(peso/Math.pow(altura, 2))+
						", você está muito abaixo do peso","Situação",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 18.5 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC é "+(peso/Math.pow(altura, 2))+
						", você está abaixo do peso","Situação",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 25 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC é "+(peso/Math.pow(altura, 2))+
						", você está com peso normal","Situação",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 30 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC é "+(peso/Math.pow(altura, 2))+
						", você está acima do peso","Situação",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 35 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC é "+(peso/Math.pow(altura, 2))+
						", você está com obesidade I","Situação",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 40 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC é "+(peso/Math.pow(altura, 2))+
						", você está com obesidade II (severa)","Situação",JOptionPane.PLAIN_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null,"O seu IMC é "+(peso/Math.pow(altura, 2))+
						", você está com obesidade III (mórbida)","Situação",JOptionPane.PLAIN_MESSAGE);
			}
			
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
