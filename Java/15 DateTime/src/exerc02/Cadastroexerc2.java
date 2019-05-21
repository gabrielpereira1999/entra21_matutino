package exerc02;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class Cadastroexerc2 extends JFrame {

	private JPanel contentPane;

	public static ArrayList<String[]> dados = new ArrayList<String[]>();
	static int i=0;
	private JTextField txtQuantidade;
	private JTextField txtValor;
	private JTextField txtNome;
	private JTable table;
	
	
	public Cadastroexerc2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 70, 14);
		contentPane.add(lblNome);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(10, 36, 70, 14);
		contentPane.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(10, 61, 70, 14);
		contentPane.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(78, 58, 150, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(78, 33, 150, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(78, 8, 150, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 100, 115, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnListarDados = new JButton("Listar Dados");
		btnListarDados.setBounds(159, 100, 115, 23);
		contentPane.add(btnListarDados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 284, 99);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(95, 110, 89, 23);
		contentPane.add(btnVoltar);
		btnVoltar.setVisible(false);
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Data e hora");
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalDateTime tempo = LocalDateTime.now();
				String hCadastro = tempo.getDayOfMonth()+"/"+tempo.getMonthValue()+"/"+tempo.getYear()+" "+tempo.getHour()+":"+tempo.getMinute();
				dados.add(new String[] {(txtNome.getText()),(txtValor.getText()),(txtQuantidade.getText()),hCadastro});
				modelo.addRow(dados.get(i));
				i++;
				txtNome.setText("");
				txtValor.setText("");
				txtQuantidade.setText("");
				txtNome.requestFocus();
				
			}
		});
		
		btnListarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNome.setVisible(false);
				lblValor.setVisible(false);
				lblQuantidade.setVisible(false);
				btnCadastrar.setVisible(false);
				btnListarDados.setVisible(false);
				txtNome.setVisible(false);
				txtValor.setVisible(false);
				txtQuantidade.setVisible(false);
				scrollPane.setVisible(true);
				btnVoltar.setVisible(true);
				table.setModel(modelo);
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNome.setVisible(true);
				lblValor.setVisible(true);
				lblQuantidade.setVisible(true);
				btnCadastrar.setVisible(true);
				btnListarDados.setVisible(true);
				txtNome.setVisible(true);
				txtValor.setVisible(true);
				txtQuantidade.setVisible(true);
				scrollPane.setVisible(false);
				btnVoltar.setVisible(false);
			}
		});
		
		
		
	}
}
