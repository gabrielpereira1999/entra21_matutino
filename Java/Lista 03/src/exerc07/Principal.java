package exerc07;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double[] random = new double[5]; double aux=0;
		boolean test = false;
		for(int i =0;i<5;i++) {
			test = false;
			aux = Math.random();
			for(int j = 0;j<5;j++) {
				if( aux == random[j] ) {
					i--;
					test = true;
					break;
				}
					
			}
			if(test == true)
				continue;
			random[i] = aux;
		}
		for(int i =0;i<5;i++) {
			System.out.println(" "+random[i] );
		}
		

	}

}
