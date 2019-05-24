package telaCriaConta;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class TelaCriaConta extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private JTextField txtSenha2;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtCep;
	private JTextField txtCep2;

	public TelaCriaConta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(10, 11, 62, 19);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(10, 64, 62, 19);
		contentPane.add(lblSenha);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeCompleto.setBounds(199, 11, 106, 19);
		contentPane.add(lblNomeCompleto);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 33, 150, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(10, 85, 150, 20);
		contentPane.add(txtSenha);
		
		txtSenha2 = new JTextField();
		txtSenha2.setColumns(10);
		txtSenha2.setBounds(10, 137, 150, 20);
		contentPane.add(txtSenha2);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(199, 66, 48, 14);
		contentPane.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(199, 33, 150, 20);
		contentPane.add(txtNome);
		
		JLabel lblNewLabel = new JLabel("Repita a senha");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 116, 117, 19);
		contentPane.add(lblNewLabel);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(199, 85, 150, 20);
		contentPane.add(txtEmail);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setBounds(199, 118, 48, 14);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(199, 137, 150, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCep.setBounds(10, 168, 48, 14);
		contentPane.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCep.setColumns(10);
		txtCep.setBounds(10, 193, 96, 20);
		contentPane.add(txtCep);
		
		JLabel lblSeparaCamposCep = new JLabel("-");
		lblSeparaCamposCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeparaCamposCep.setBounds(112, 196, 18, 14);
		contentPane.add(lblSeparaCamposCep);
		
		txtCep2 = new JTextField();
		txtCep2.setBounds(122, 193, 38, 20);
		contentPane.add(txtCep2);
		txtCep2.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(227, 190, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
