package exemplo06;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Checkbox
		JCheckBox ckb01 = new JCheckBox("Opção 01");
		ckb01.setBounds(10, 10, 100, 20);
		
		JCheckBox ckb02 = new JCheckBox("Opção 02");
		ckb02.setBounds(10, 40, 100, 20);
		
		JCheckBox ckb03 = new JCheckBox("Opção 03");
		ckb03.setBounds(10, 70, 100, 20);
		
		//Adicionar elementos
		formulario.add(ckb01);
		formulario.add(ckb02);
		formulario.add(ckb03);
		
		formulario.setVisible(true);

	}

}
