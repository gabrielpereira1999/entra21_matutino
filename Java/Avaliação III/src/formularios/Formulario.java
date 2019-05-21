package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;

	public Formulario() {
		
		Acao a = new Acao();
		
		//CRIAÇÃO ELEMENTOS-----------------------------------------------------------------------------
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarroVermelho = new JLabel("Carro Vermelho");
		lblCarroVermelho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarroVermelho.setBounds(10, 11, 111, 19);
		contentPane.add(lblCarroVermelho);
		
		JLabel lblCarroAzul = new JLabel("Carro Azul");
		lblCarroAzul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarroAzul.setBounds(131, 11, 87, 19);
		contentPane.add(lblCarroAzul);
		
		JLabel lblCarroAmarelo = new JLabel("Carro Amarelo");
		lblCarroAmarelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarroAmarelo.setBounds(336, 11, 99, 19);
		contentPane.add(lblCarroAmarelo);
		
		JLabel lbMotoVermelha = new JLabel("Moto Vermelha");
		lbMotoVermelha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMotoVermelha.setBounds(10, 86, 111, 19);
		contentPane.add(lbMotoVermelha);
		
		JLabel lblCarroVerde = new JLabel("Carro Verde");
		lblCarroVerde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarroVerde.setBounds(228, 11, 99, 19);
		contentPane.add(lblCarroVerde);
		
		JLabel lblMotoAzul = new JLabel("Moto Azul");
		lblMotoAzul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMotoAzul.setBounds(131, 86, 87, 19);
		contentPane.add(lblMotoAzul);
		
		JLabel lblMotoVerde = new JLabel("Moto Verde");
		lblMotoVerde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMotoVerde.setBounds(228, 86, 99, 19);
		contentPane.add(lblMotoVerde);
		
		JLabel lblMotoAmarela = new JLabel("Moto Amarela");
		lblMotoAmarela.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMotoAmarela.setBounds(336, 86, 99, 19);
		contentPane.add(lblMotoAmarela);
		
		JButton btnSubCVermelho = new JButton("-");
		btnSubCVermelho.setBounds(10, 41, 41, 23);
		contentPane.add(btnSubCVermelho);
		
		JButton btnAddCVermelho = new JButton("+");
		btnAddCVermelho.setBounds(61, 41, 41, 23);
		contentPane.add(btnAddCVermelho);
		
		JButton btnSubCAzul = new JButton("-");
		btnSubCAzul.setBounds(129, 41, 41, 23);
		contentPane.add(btnSubCAzul);
		
		JButton btnAddCAzul = new JButton("+");
		btnAddCAzul.setBounds(176, 41, 41, 23);
		contentPane.add(btnAddCAzul);
		
		JButton btnSubCVerde = new JButton("-");
		btnSubCVerde.setBounds(228, 41, 41, 23);
		contentPane.add(btnSubCVerde);
		
		JButton btnAddCVerde = new JButton("+");
		btnAddCVerde.setBounds(279, 41, 41, 23);
		contentPane.add(btnAddCVerde);
		
		JButton btnSubCAmarelo = new JButton("-");
		btnSubCAmarelo.setBounds(336, 41, 41, 23);
		contentPane.add(btnSubCAmarelo);
		
		JButton btnAddCAmarelo = new JButton("+");
		btnAddCAmarelo.setBounds(387, 41, 41, 23);
		contentPane.add(btnAddCAmarelo);
		
		JButton btnSubMVermelha = new JButton("-");
		btnSubMVermelha.setBounds(10, 116, 41, 23);
		contentPane.add(btnSubMVermelha);
		
		JButton btnAddMVermelha = new JButton("+");
		btnAddMVermelha.setBounds(61, 116, 41, 23);
		contentPane.add(btnAddMVermelha);
		
		JButton btnSubMAzul = new JButton("-");
		btnSubMAzul.setBounds(129, 116, 41, 23);
		contentPane.add(btnSubMAzul);
		
		JButton btnAddMAzul = new JButton("+");
		btnAddMAzul.setBounds(176, 116, 41, 23);
		contentPane.add(btnAddMAzul);
		
		JButton btnSubMVerde = new JButton("-");
		btnSubMVerde.setBounds(228, 116, 41, 23);
		contentPane.add(btnSubMVerde);
		
		JButton btnAddMVerde = new JButton("+");
		btnAddMVerde.setBounds(279, 116, 41, 23);
		contentPane.add(btnAddMVerde);
		
		JButton btnSubMAmarela = new JButton("-");
		btnSubMAmarela.setBounds(336, 116, 41, 23);
		contentPane.add(btnSubMAmarela);
		
		JButton btnAddMAmarela = new JButton("+");
		btnAddMAmarela.setBounds(387, 116, 41, 23);
		contentPane.add(btnAddMAmarela);
		
		JButton btnQuantidade = new JButton();
		btnQuantidade.setBounds(445, 11, 143, 23);
		contentPane.add(btnQuantidade);
		btnQuantidade.setText("Quantidade: "+a.conta());
		
		//INCREMENTAÇÕES---------------------------------------------------------------------------
		
		btnAddCVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Carro Vermelho"));
			}
		});
		
		btnAddCAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Carro Azul"));
			}
		});
		
		btnAddCVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Carro Verde"));
			}
		});
		
		btnAddCAmarelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Carro Amarelo"));
			}
		});
		
		
		btnAddMVermelha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Moto Vermelha"));
			}
		});
		
		btnAddMAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Moto Azul"));
			}
		});
		
		btnAddMVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Moto Verde"));
			}
		});
		
		btnAddMAmarela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.incrementa("Moto Amarela"));
			}
		});
		
		//DECREMENTAÇÕES---------------------------------------------------------------------------
		
		btnSubCVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Carro Vermelho"));
			}
		});
		
		btnSubCAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Carro Azul"));
			}
		});
		
		btnSubCAmarelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Carro Amarelo"));
			}
		});
		
		btnSubCVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Carro Verde"));
			}
		});
		
		btnSubMVermelha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Moto Vermelha"));
			}
		});
		
		btnSubMVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Moto Verde"));
			}
		});
		
		btnSubMAmarela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Moto Amarela"));
			}
		});
		
		btnSubMAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQuantidade.setText("Quantidade: "+a.decrementa("Moto Azul"));
			}
		});
		
		
		//ATUALIZA CONTADOR BOTÃO QUANTIDADE
		btnQuantidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MostraQuantidade f = new MostraQuantidade();
				f.setVisible(true);
			}
		});
		
	}
}
