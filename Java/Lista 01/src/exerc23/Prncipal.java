package exerc23;

import javax.swing.JOptionPane;

public class Prncipal {

	public static void main(String[] args) {
		
		try{
			float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o seu peso", "Peso", JOptionPane.PLAIN_MESSAGE)),
				  altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a sua altura", "Altura", JOptionPane.PLAIN_MESSAGE));
			if( (peso <=0) || (altura<=0) ) {
				JOptionPane.showMessageDialog(null,"Dados inseridos inv�lidos","erro",JOptionPane.PLAIN_MESSAGE);
			}else if( (peso/Math.pow(altura, 2) < 17 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC � "+(peso/Math.pow(altura, 2))+
						", voc� est� muito abaixo do peso","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 18.5 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC � "+(peso/Math.pow(altura, 2))+
						", voc� est� abaixo do peso","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 25 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC � "+(peso/Math.pow(altura, 2))+
						", voc� est� com peso normal","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 30 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC � "+(peso/Math.pow(altura, 2))+
						", voc� est� acima do peso","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 35 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC � "+(peso/Math.pow(altura, 2))+
						", voc� est� com obesidade I","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else if ( (peso/Math.pow(altura, 2) < 40 ) ){
				JOptionPane.showMessageDialog(null,"O seu IMC � "+(peso/Math.pow(altura, 2))+
						", voc� est� com obesidade II (severa)","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null,"O seu IMC � "+(peso/Math.pow(altura, 2))+
						", voc� est� com obesidade III (m�rbida)","Situa��o",JOptionPane.PLAIN_MESSAGE);
			}
			
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
