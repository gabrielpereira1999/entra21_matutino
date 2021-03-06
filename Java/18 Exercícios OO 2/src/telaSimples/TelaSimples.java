package telaSimples;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Usuario;
import dados.Dado;
import formulario.Formulario;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaSimples extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtNivel;
	private JTextField txtMail;
	private JTextField txtData;

	public TelaSimples() {
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 100, 239);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(a.usuarios());
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(120, 12, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(120, 37, 48, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNivel = new JLabel("Nivel");
		lblNivel.setBounds(120, 62, 48, 14);
		contentPane.add(lblNivel);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(120, 87, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(120, 112, 48, 14);
		contentPane.add(lblData);
		
		txtNome = new JTextField();
		txtNome.setBounds(161, 9, 145, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(161, 34, 145, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtNivel = new JTextField();
		txtNivel.setBounds(161, 59, 145, 20);
		contentPane.add(txtNivel);
		txtNivel.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setBounds(161, 84, 145, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);
		
		txtData = new JTextField();
		txtData.setBounds(161, 109, 145, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(171, 144, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.setBounds(171, 178, 89, 23);
		contentPane.add(btnDeslogar);
		
		Usuario u = a.userlogado();
		
		txtNome.setText(u.getUserName());
		txtSenha.setText(u.getUserPassword());
		txtNivel.setText(u.getUserLevel());
		txtMail.setText(u.getUserMail());
		txtData.setText(u.getUserCreated());
		
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario g = new Usuario();
				g.setUserName(txtNome.getText());
				g.setUserPassword(txtSenha.getText());
				g.setUserMail(txtMail.getText());
				g.setUserLevel(txtNivel.getText());
				g.setUserCreated(txtData.getText());
				for(int i = 0; i<Dado.UserArray.size();i++) {
					if( Dado.UserArray.get(i).getUserName().equals(u.getUserName()) ) {
						a.alterar(i, g, u.getUserName());
						break;
					}
				}

				table.setModel(a.usuarios());
			}
		});
		
		btnDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Formulario f = new Formulario();
				f.setVisible(true);
			}
		});
		
	}
}
