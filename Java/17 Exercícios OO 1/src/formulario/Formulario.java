package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Jogo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtClassificao;
	private JTextField txtValor;
	private JTextField txtGenero;
	private JTextField txtNome;
	private JTable table;
	//private JComboBox<String> comboConsoles;
	private JTable table_1;
	private JTable table_2;
	
	//Limpar campos
		public void Limpar() {
			txtNome.setText("");
			txtClassificao.setText("");
			txtGenero.setText("");
			txtValor.setText("");
			//comboConsoles.setSelectedItem("Atari");
			txtNome.requestFocus();
			
		}

	public Formulario() {
		
		Acao a = new Acao();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1167, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(10, 11, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblGenero = new JLabel("G\u00EAnero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGenero.setBounds(10, 36, 48, 14);
		contentPane.add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlataforma.setBounds(10, 61, 80, 14);
		contentPane.add(lblPlataforma);
		
		JLabel lblClassificaoIndicativa = new JLabel("Classifica\u00E7\u00E3o Indicativa");
		lblClassificaoIndicativa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClassificaoIndicativa.setBounds(10, 86, 151, 14);
		contentPane.add(lblClassificaoIndicativa);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValor.setBounds(10, 111, 48, 14);
		contentPane.add(lblValor);
		
		txtClassificao = new JTextField();
		txtClassificao.setBounds(171, 85, 253, 20);
		contentPane.add(txtClassificao);
		txtClassificao.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(171, 116, 253, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(171, 35, 253, 20);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(171, 10, 253, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrar.setBounds(20, 147, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterar.setBounds(119, 147, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBounds(218, 147, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(317, 147, 89, 23);
		contentPane.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(434, 0, 707, 184);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(a.selecionar());
		
		JComboBox<String> comboConsoles = new JComboBox<String>();
		comboConsoles.setBounds(171, 59, 253, 22);
		comboConsoles.addItem("Atari");
		comboConsoles.addItem("Super Nintendo");
		comboConsoles.addItem("PlayStation");
		comboConsoles.addItem("Nintendo 64");
		comboConsoles.addItem("PlayStation 2");
		comboConsoles.addItem("Game Cube");
		comboConsoles.addItem("Xbox");
		comboConsoles.addItem("Xbox 360");
		comboConsoles.addItem("PlayStation 3");
		comboConsoles.addItem("Wii");
		comboConsoles.addItem("Wii U");
		comboConsoles.addItem("PlayStation 4");
		comboConsoles.addItem("Xbox One");
		comboConsoles.addItem("Nintendo Switch");
		contentPane.add(comboConsoles);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 182, 198, 128);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(a.mostraplataforma());
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(228, 181, 198, 129);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(a.mostragenero());
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Salva dados
				Jogo c = new Jogo();
				c.setNome(txtNome.getText());
				c.setClassificao(txtClassificao.getText());
				c.setGenero(txtGenero.getText());
				c.setValor(txtValor.getText());
				c.setPlataforma(comboConsoles.getSelectedItem().toString());
				if(a.validar(c))
					JOptionPane.showMessageDialog(null, "Jogo j� cadastrado");
				else {
					a.cadastrar(c);
					table.setModel(a.selecionar());
					table_1.setModel(a.plataforma(comboConsoles.getSelectedItem().toString()));
					table_2.setModel(a.genero(txtGenero.getText()));
				}
				
				
				Limpar();
			}
		});
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Altera Dados
				int indice = table.getSelectedRow();
				
				Jogo c = new Jogo();
				c.setNome(txtNome.getText());
				c.setClassificao(txtClassificao.getText());
				c.setGenero(txtGenero.getText());
				c.setValor(txtValor.getText());
				c.setPlataforma(comboConsoles.getSelectedItem().toString());
				a.alterar(indice, c, table.getValueAt(table.getSelectedRow(), 2).toString(), table.getValueAt(table.getSelectedRow(), 1).toString() );
				table.setModel(a.selecionar());
				table_1.setModel(a.mostraplataforma());
				table_2.setModel(a.mostragenero());
				
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
				txtClassificao.setText(table.getValueAt(i, 3).toString());
				comboConsoles.setSelectedItem(table.getValueAt(i, 2));
				txtGenero.setText(table.getValueAt(i, 1).toString());
				txtValor.setText(table.getValueAt(i, 4).toString());
				comboConsoles.getSelectedItem().toString();
				
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				
			}
		});
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				
				a.excluir(i,table.getValueAt(i, 2).toString(),table.getValueAt(i, 1).toString());
				table.setModel(a.selecionar());
				table_1.setModel(a.mostraplataforma());
				table_2.setModel(a.mostragenero());
				
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				
				Limpar();
				
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				Limpar();
			}
		});
		
		
		
	}
}
