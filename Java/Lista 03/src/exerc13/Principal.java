package exerc13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[][] prod = new String[20][2];
		prod[0][0] = "Arroz 5 KG" ; prod[0][1] = "9.5" ;
		prod[1][0] = "Arroz 1 KG"  ; prod[1][1] = "2.75" ;
		prod[2][0] = "Feijão 3 KG"  ; prod[2][1] = "5.6" ;
		prod[3][0] = "Feijão 1 KG"  ; prod[3][1] = "3.1" ;
		prod[4][0] = "Macarrão 500 GR"  ; prod[4][1] = "1.9" ;
		prod[5][0] = "Farinha de Trigo 2 KG "  ; prod[5][1] = "3.21" ;
		prod[6][0] = "Ketchup 370 GR"  ; prod[6][1] = "5.5" ;
		prod[7][0] = "Maionese 480 GR"  ; prod[7][1] = "7.3" ;
		prod[8][0] = "Gelatina 50 GR"  ; prod[8][1] = "7.3" ;
		prod[9][0] = "Macarrão Instantâneo 120 GR"  ; prod[9][1] = "1.19" ;
		prod[10][0] = "Creme de Leite 150 GR "  ; prod[10][1] = "1.89" ;
		prod[11][0] = "Leite Condensado 150 GR"  ; prod[11][1] = "2.88" ;
		prod[12][0] = "Leite 1 L "  ; prod[12][1] = "2.06" ;
		prod[13][0] = "Chocolate em Pó 500 GR"  ; prod[13][1] = "9.67" ;
		prod[14][0] = "Pepino em Conserva 600 GR"  ; prod[14][1] = "11.99" ;
		prod[15][0] = "Vinagre 550 ML "  ; prod[15][1] = "1.94" ;
		prod[16][0] = "Sal 500 GR"  ; prod[16][1] = "3.34" ;
		prod[17][0] = "Açúcar 550 GR"  ; prod[17][1] = "4.89" ;
		prod[18][0] = "Fermento 150 FR"  ; prod[18][1] = "2.19" ;
		prod[19][0] = "Biscoito de Chocolate 70 GR"  ; prod[19][1] = "2.09" ;
		int cod=50,qntd = 0;
		double total=0,total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total7=0,total8=0,total9=0,total10=0,total11=0,total12=0
				,total13=0,total14=0,total15=0,total16=0,total17=0,total18=0,total19=0,total20=0;
		
		while(cod != 0) {
			try {
			cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto"));
			if(cod==0)
				break;
			if( (cod < 0) || (cod>20) ) {
				JOptionPane.showMessageDialog(null, "Código inexistente");
				continue;
			}
			qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de unidades deste produto"));
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Erro "+erro.getMessage());
			}
			total+=(Integer.parseInt(prod[cod-1][1]) * qntd);
			if(cod == 1) {
				total1 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 2) {
				total2 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 3) {
				total3 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 4) {
				total4 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 5) {
				total5 += ((Integer.parseInt(prod[(cod-1)][1])) * qntd);
			}else if(cod == 6) {
				total6 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 7) {
				total7 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 8) {
				total8 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 9) {
				total9 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 10) {
				total10 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 11) {
				total11 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 12) {
				total12 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 13) {
				total13 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 14) {
				total14 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 15) {
				total15 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 16) {
				total16 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 17) {
				total17 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 18) {
				total18 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 19) {
				total19 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}else if(cod == 20) {
				total20 += ((Integer.parseInt(prod[cod-1][1])) * qntd);
			}
			
		}
		

	}

}
