package exerc02;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Random ger = new Random();
		String[][] array = new String[5][30];
		for(int i = 0;i<5;i++) {
			for(int j =0; j<30;j++) {
				array[i][j] = ""+ger.nextInt(10);
			}
		}
		for(int i = 0;i<5;i++) {
				array[i][0] = "*";
				array[i][29] = "*";
		}
		for(int i = 0;i<30;i++) {
			array[0][i] = "*";
			array[4][i] = "*";
		}
		for(int i = 1;i<4;i++) {
			for(int j =1; j<29;j++) {
				if(j==15) {
					if(i==2)
						continue;
				}
				array[i][j] = " ";
			}
		}
		for(int i = 0;i<5;i++) {
			for(int j =0; j<30;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
