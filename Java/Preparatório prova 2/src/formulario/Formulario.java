package formulario;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.IMC;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtNome;
	private JTable table;
	private JTable table_2;
	private JTextField txtIdade;

	// Limpar campos
	public void Limpar() {
		txtNome.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
		txtIdade.setText("");
		txtNome.requestFocus();

	}

	public Formulario() {

		Acao a = new Acao();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(10, 11, 48, 14);
		contentPane.add(lblNome);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeso.setBounds(10, 36, 48, 14);
		contentPane.add(lblPeso);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAltura.setBounds(10, 61, 48, 14);
		contentPane.add(lblAltura);

		txtNome = new JTextField();
		txtNome.setBounds(68, 10, 140, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtPeso = new JTextField();
		txtPeso.setBounds(68, 35, 140, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(68, 61, 140, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrar.setBounds(10, 115, 89, 23);
		contentPane.add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterar.setBounds(10, 149, 89, 23);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBounds(109, 115, 89, 23);
		contentPane.add(btnExcluir);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(109, 149, 89, 23);
		contentPane.add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 183, 416, 138);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(a.selecionar());

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(228, 11, 198, 161);
		contentPane.add(scrollPane_2);

		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(10, 86, 48, 14);
		contentPane.add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setBounds(68, 85, 140, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		table_2.setModel(a.tabelaEst());

		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Salva dados
				IMC c = new IMC();
				try {
				c.setNome(txtNome.getText());
				c.setPeso(Double.parseDouble(txtPeso.getText()));
				c.setAlt(Double.parseDouble(txtAltura.getText()));
				c.setIdade(Integer.parseInt(txtIdade.getText()));
				c.setIMC((c.getPeso()) / (Math.pow(c.getAlt(), 2)));
				
				// Cadastra
				a.cadastrar(c);

				// Soma estatistica
				a.somaEst(c.getIMC());

				// Arruma tabela cadastrados
				table.setModel(a.selecionar());

				// Arruma tabela estatísticas
				table_2.setModel(a.tabelaEst());

				Limpar();
				
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Verifique se todos os campos estão preenchidos corretamente");
				}
				
			}
		});

		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = table.getSelectedRow();

				// Subtrai estatística
				a.subtraiEst(Double.parseDouble(table.getValueAt(indice, 4).toString()));

				// Altera Dados
				IMC c = new IMC();
				c.setNome(txtNome.getText());
				c.setAlt(Double.parseDouble(txtAltura.getText()));
				c.setPeso(Double.parseDouble(txtPeso.getText()));
				c.setIdade(Integer.parseInt(txtIdade.getText()));
				c.setIMC((c.getPeso()) / (Math.pow(c.getAlt(), 2)));
				a.alterar(indice, c);

				// Arruma tabela cadastrados
				table.setModel(a.selecionar());

				// Soma estatistica
				a.somaEst(c.getIMC());

				// Arruma tabela estatísticas
				table_2.setModel(a.tabelaEst());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);

				Limpar();
			}
		});

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int i = table.getSelectedRow();
				txtNome.setText(table.getValueAt(i, 0).toString());
				txtIdade.setText(table.getValueAt(i, 1).toString());
				txtPeso.setText(table.getValueAt(i, 2).toString());
				txtAltura.setText(table.getValueAt(i, 3).toString());

				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);

			}
		});

		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();

				// Subtrai estatística
				a.subtraiEst(Double.parseDouble(table.getValueAt(i, 4).toString()));

				// Exclui
				a.excluir(i);

				// Arruma tabela cadastrados
				table.setModel(a.selecionar());

				// Arruma tabela estatísticas
				table_2.setModel(a.tabelaEst());

				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);

				Limpar();

			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Limpar();
			}
		});
		

	}
}
