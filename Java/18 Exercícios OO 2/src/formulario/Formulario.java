package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Usuario;
import dados.Dado;
import telaAdmin.TelaAdmin;
import telaSimples.TelaSimples;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;
	static int aux = 0;

	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(10, 11, 48, 17);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(10, 39, 48, 14);
		contentPane.add(lblSenha);

		txtLogin = new JTextField();
		txtLogin.setBounds(58, 11, 140, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);

		txtSenha = new JTextField();
		txtSenha.setBounds(58, 39, 140, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEntrar.setBounds(68, 70, 89, 23);
		contentPane.add(btnEntrar);
		
		Usuario admin = new Usuario();
		admin.setUserName("admin");
		admin.setUserPassword("admin");
		admin.setUserMail("admin@mail.com");
		admin.setUserLevel("Adm");
		admin.setUserCreated("ever");
		if(aux==0) {
			Dado.UserArray.add(admin);
			aux++;
		}
		
		
		Acao a = new Acao();
		
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario();
				u.setUserName(txtLogin.getText());
				u.setUserPassword(txtSenha.getText());
				Acao.logado = txtLogin.getText();
				if (a.valida(u) == 0 ) {
					JOptionPane.showMessageDialog(null, "Bem vindo "+u.getUserName());
					setVisible(false);
					TelaAdmin tela = new TelaAdmin();
					tela.setVisible(true);
				}else if(a.valida(u) == 1) {
					setVisible(false);
					TelaSimples tela = new TelaSimples();
					tela.setVisible(true);
					Acao.logado = u.getUserName();
				}else {
					JOptionPane.showMessageDialog(null, "Usu�rio inexistente ou senha incorreta");
					txtLogin.setText("");
					txtSenha.setText("");
				}
			}
		});
		

	}
}
