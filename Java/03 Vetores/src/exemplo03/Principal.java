package exemplo03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Scanner
		Scanner obterNumero = new Scanner(System.in);
		//Laço for
		int[] numeros = new int[10];
		
		for(int i = 0;i< numeros.length;i++) {
			System.out.println("Informe o "+(i+1)+"° número: ");
			numeros[i] = obterNumero.nextInt();
		}
		//Finalizar Scanner
		obterNumero.close();
		 //Listar os valores
		/*for(int i = 0;i<numeros.length;i++) {
			System.out.println((i+1)+"° número1: "+numeros[i]) ;
		}*/
		
		 //Listar os valores com FOREACH
		for(int n : numeros) {
			System.out.println(n);
		}
		

	}

}
