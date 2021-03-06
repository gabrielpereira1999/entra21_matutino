package telaAdmin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Usuario;
import formulario.Formulario;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNome;
	private JLabel lblSenha;
	private JLabel lblNivel;
	private JLabel lblEmail;
	private JLabel lblDataCad;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtNivel;
	private JTextField txtMail;
	private JTextField txtData;
	private JButton btnCadastrar;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnCancelar;
	private JButton btnDeslogar;
	
	public void limpa() {
		btnCadastrar.setEnabled(true);
		btnAlterar.setEnabled(false);
		btnExcluir.setEnabled(false);
		txtNome.setEditable(true);
		txtSenha.setEditable(true);
		txtNivel.setEditable(true);
		txtMail.setEditable(true);
		txtNome.setText("");
		txtSenha.setText("");
		txtNivel.setText("");
		txtMail.setText("");
		txtData.setText("");
		txtNome.requestFocus();
	}

	public TelaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 422, 239);
		contentPane.add(scrollPane);
		
		Acao a = new Acao();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(a.usuariosAdm());
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(442, 18, 48, 14);
		contentPane.add(lblNome);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(442, 43, 48, 14);
		contentPane.add(lblSenha);
		
		lblNivel = new JLabel("N\u00EDvel");
		lblNivel.setBounds(442, 68, 48, 14);
		contentPane.add(lblNivel);
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(442, 93, 48, 14);
		contentPane.add(lblEmail);
		
		lblDataCad = new JLabel("Data Cad.");
		lblDataCad.setBounds(442, 118, 57, 14);
		contentPane.add(lblDataCad);
		
		txtNome = new JTextField();
		txtNome.setBounds(500, 15, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(500, 40, 200, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtNivel = new JTextField();
		txtNivel.setBounds(500, 65, 200, 20);
		contentPane.add(txtNivel);
		txtNivel.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setBounds(500, 90, 200, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);
		
		txtData = new JTextField();
		txtData.setEditable(false);
		txtData.setBounds(500, 115, 200, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(442, 154, 120, 23);
		contentPane.add(btnCadastrar);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(583, 154, 120, 23);
		contentPane.add(btnAlterar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(442, 188, 120, 23);
		contentPane.add(btnExcluir);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(583, 188, 117, 23);
		contentPane.add(btnCancelar);
		
		btnDeslogar = new JButton("Deslogar");
		btnDeslogar.setBounds(531, 227, 89, 23);
		contentPane.add(btnDeslogar);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				txtNome.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
				txtSenha.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
				txtNivel.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
				txtMail.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
				txtData.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
				btnCadastrar.setEnabled(false);
				
				if(txtNivel.getText().equals("Adm")) {
					if ( !txtNome.getText().equals(Acao.logado) ) {
						txtNome.setEditable(false);
						txtSenha.setEditable(false);
						txtNivel.setEditable(false);
						txtMail.setEditable(false);
						btnAlterar.setEnabled(false);
						btnExcluir.setEnabled(false);
				}else {
					btnAlterar.setEnabled(true);
					btnExcluir.setEnabled(true);
					txtNome.setEditable(true);
					txtSenha.setEditable(true);
					txtNivel.setEditable(true);
					txtMail.setEditable(true);
				}
					}else {
					btnAlterar.setEnabled(true);
					btnExcluir.setEnabled(true);
					txtNome.setEditable(true);
					txtSenha.setEditable(true);
					txtNivel.setEditable(true);
					txtMail.setEditable(true);
				}
				
			}
		});
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalDateTime data = LocalDateTime.now();
				Usuario u = new Usuario();
				u.setUserName(txtNome.getText());
				u.setUserPassword(txtSenha.getText());
				u.setUserLevel(txtNivel.getText());
				u.setUserMail(txtMail.getText());
				u.setUserCreated(""+data.getDayOfMonth()+"/"+data.getMonthValue()+"/"+data.getYear()+"  "+data.getHour()+":"+data.getMinute());
				if(!a.cadastra(u)) {
					JOptionPane.showMessageDialog(null, "Nome de usu�rio j� existe");
					}
				else {
				table.setModel(a.usuariosAdm());
				limpa();
				}
				
			}
		});
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				
				Usuario u = new Usuario();
				u.setUserName(txtNome.getText());
				u.setUserPassword(txtSenha.getText());
				u.setUserMail(txtMail.getText());
				u.setUserLevel(txtNivel.getText());
				u.setUserCreated(txtData.getText());
				a.alterar(i, u, table.getValueAt(i, 0).toString());
				table.setModel(a.usuariosAdm());
				limpa();
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpa();
			}
		});
		
		btnDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpa();
				setVisible(false);
				Formulario f = new Formulario();
				f.setVisible(true);
			}
		});
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				
				a.excluir(i);
				table.setModel(a.usuariosAdm());
				limpa();
			}
		});
	}
}
