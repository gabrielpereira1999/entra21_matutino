package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Curso;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtArea;
	private JTable table;
	private static int codigoCurso;

	private void limparCampos() {
		// Limpar os campos
		txtNome.setText("");
		txtArea.setText("");

		// Focus
		txtNome.requestFocus();
	}

	public Formulario() {

		// Objeto da classe acao
		Acao a = new Acao();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(10, 23, 66, 33);
		contentPane.add(lblNome);

		JLabel lblArea = new JLabel("\u00C1rea");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblArea.setBounds(10, 67, 66, 33);
		contentPane.add(lblArea);

		txtNome = new JTextField();
		txtNome.setBounds(76, 23, 340, 30);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtArea = new JTextField();
		txtArea.setBounds(76, 67, 340, 30);
		contentPane.add(txtArea);
		txtArea.setColumns(10);

		JButton btnAlterar = new JButton("Alterar");
		JButton btnCancelar = new JButton("Cancelar");
		JButton btnExcluir = new JButton("Excluir");

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Criar um objeto curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());

				// Efetuar o cadastro
				a.cadastrar(c);

				// Atualizar tabela
				table.setModel(a.selecionar());

				// Limpar os campos
				txtNome.setText("");
				txtArea.setText("");

				// Focus
				txtNome.requestFocus();

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setBounds(10, 127, 109, 23);
		contentPane.add(btnCadastrar);

		btnAlterar.setEnabled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Instanciar um objeto da classe Curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());

				// Realiza a alteração
				a.alterar(codigoCurso, c);

				// Atualizar listagem de cursos
				table.setModel(a.selecionar());

				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

				// Limpar campos
				limparCampos();

			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAlterar.setBounds(129, 127, 89, 23);
		contentPane.add(btnAlterar);

		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Remover curso
				a.excluir(codigoCurso);

				// Atualizar listagem de cursos
				table.setModel(a.selecionar());

				// Limpar os campos
				limparCampos();

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExcluir.setBounds(228, 127, 89, 23);
		contentPane.add(btnExcluir);

		btnCancelar.setEnabled(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Limpar os campos
				limparCampos();

				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(327, 127, 89, 23);
		contentPane.add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 161, 404, 269);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o índice da tabela
				int indice = table.getSelectedRow();

				// Selecionando dados do curso
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtArea.setText(table.getValueAt(indice, 1).toString());

				// Botões
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);

				codigoCurso = indice;

			}
		});
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);
	}
}
