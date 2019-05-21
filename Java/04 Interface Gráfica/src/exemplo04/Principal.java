package exemplo04;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Formul�rio");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Caixa de combina��o
		JComboBox<String> combo = new JComboBox<String>();
		combo.setBounds(10, 10, 470, 30);
		combo.addItem("Op��o 01");
		combo.addItem("Op��o 02");
		combo.addItem("Op��o 03");
		
		//Adicionar combo ao formul�rio
		formulario.add(combo);
		
		
		//Exibir formul�rio e componentes
		formulario.setVisible(true);

	}

}
