package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Formul�rio");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//R�tulo
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10, 30, 130, 30);
		
		//Campo de texto
		JTextField campo = new JTextField();
		campo.setBounds(130, 30, 150, 30);
		
		//Bot�o
		JButton botao = new JButton();
		botao.setText("Enviar");
		
		//botao.setSize(100,20);
		botao.setBounds(300, 30, 100, 30);
		
		//Evento no bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Armazenar o nome informado 
				String nome = campo.getText();
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Ol� "+nome);
				
				//Limpar o campo nome
				campo.setText("");
				
				//Cursor no campo nome
				campo.requestFocus();
			}
		});
		
		//Adicionar o bot�o no formul�rio
		formulario.add(botao);
		formulario.add(rotulo);
		formulario.add(campo);
		
		//Exibir formul�rio e os componentes
		formulario.setVisible(true);
	}

}
