package exerc20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try{
			Object[] options1 = {"Santa Catarina", "Rio Grande do Sul", "Paraná"};
			int est =  JOptionPane.showOptionDialog(null,"Escolha um estado",
					"Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options1,options1[0]);
			if(est == 0) {
				Object[] options11 = {"Blumenau", "Indaial", "Joinville"};
				int city =  JOptionPane.showOptionDialog(null,"Escolha uma cidade",
						"Cidade",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,options11[0]);
				if(city==0) {
					JOptionPane.showMessageDialog(null, "Blumenau possui aproximadamente 334 002 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
					
				}else if(city==1) {
					JOptionPane.showMessageDialog(null, "Indaial possui aproximadamente 66 497 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else if(city==2) {
					JOptionPane.showMessageDialog(null, "Joinville possui aproximadamente 583 144 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Erro ao obter a cidade","Erro",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(est == 1){
				Object[] options2 = {"Porto Alegre", "Caxias do Sul", "Pelotas"};
				int city =  JOptionPane.showOptionDialog(null,"Escolha uma cidade",
						"Cidade",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options2,options2[0]);
				if(city==0) {
					JOptionPane.showMessageDialog(null, "Porto Alegre possui aproximadamente 1 472 482 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else if(city==1) {
					JOptionPane.showMessageDialog(null, "Caxias do Sul possui aproximadamente 470 223 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else if(city==2) {
					JOptionPane.showMessageDialog(null, "Pelotas possui aproximadamente 342 053 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Erro ao obter a cidade","Erro",JOptionPane.PLAIN_MESSAGE);
				}
			}else if(est ==2) {
				Object[] options3 = {"Curitiba", "Londrina", "Maringá"};
				int city =  JOptionPane.showOptionDialog(null,"Escolha uma cidade",
						"Cidade",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,options3[0]);
				if(city==0) {
					JOptionPane.showMessageDialog(null, "Curitiba possui aproximadamente 1 917 185 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else if(city==1) {
					JOptionPane.showMessageDialog(null, "Londrina possui aproximadamente 563 943 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else if(city==2) {
					JOptionPane.showMessageDialog(null, "Maringá possui aproximadamente 417 010 habitantes", "Informação", JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Erro ao obter a cidade","Erro",JOptionPane.PLAIN_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null,"Erro ao obter o estado","Erro",JOptionPane.PLAIN_MESSAGE);
			}
			
		
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null,"Erro ao obter o valor "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Fechando o programa","Fim",JOptionPane.PLAIN_MESSAGE);
		}

	}

}
