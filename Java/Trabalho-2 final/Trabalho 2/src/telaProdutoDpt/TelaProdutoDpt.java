package telaProdutoDpt;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Dados;
import telaAdm.TelaAdministrador;
import telaContaUsuario.TelaContaUsuario;
import telaHomePage.TelaHomePage;
import telaUmProduto.TelaUmProduto;

@SuppressWarnings("serial")
public class TelaProdutoDpt extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	public TelaProdutoDpt(String dpt) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Acao a = new Acao();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 172, 747, 415);
		contentPane.add(scrollPane, BorderLayout.EAST);

		JPanel panel = new JPanel();
		panel.setPreferredSize(a.NovaTelaProdutos(dpt));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		JLabel lblMonster = new JLabel("MONSTER");
		lblMonster.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblMonster.setBounds(10, 11, 193, 49);
		contentPane.add(lblMonster);

		JLabel lblInformtica = new JLabel("Inform\u00E1tica");
		lblInformtica.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInformtica.setBounds(52, 58, 90, 22);
		contentPane.add(lblInformtica);

		JButton btnMinhaConta = new JButton("Minha conta");
		btnMinhaConta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMinhaConta.setBounds(510, 11, 120, 30);
		contentPane.add(btnMinhaConta);

		JButton btnMeuCarrinho = new JButton("Meu carrinho");
		btnMeuCarrinho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMeuCarrinho.setBounds(640, 11, 120, 30);
		contentPane.add(btnMeuCarrinho);

		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeslogar.setBounds(380, 11, 120, 30);
		contentPane.add(btnDeslogar);

		// Cria �cone para bot�o pesquisa
		ImageIcon iconPesquisa = new ImageIcon(TelaHomePage.class.getResource("iconPesquisa.jpg"));
		Image temp = iconPesquisa.getImage();
		Image newimg = temp.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIconPesquisa = new ImageIcon(newimg);

		JButton btnColocarimagemLupa = new JButton(resizedIconPesquisa);
		btnColocarimagemLupa.setBounds(730, 58, 30, 30);
		contentPane.add(btnColocarimagemLupa);

		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(380, 58, 340, 30);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);

		JButton btnPlacaDeVideo = new JButton("Placa de V\u00EDdeo");
		btnPlacaDeVideo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPlacaDeVideo.setBounds(10, 131, 142, 30);
		contentPane.add(btnPlacaDeVideo);

		JButton btnProcessador = new JButton("Processador");
		btnProcessador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnProcessador.setBounds(162, 131, 142, 30);
		contentPane.add(btnProcessador);

		JButton btnHddSsd = new JButton("HDD/SSD");
		btnHddSsd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHddSsd.setBounds(314, 131, 142, 30);
		contentPane.add(btnHddSsd);

		JButton btnMemoriaRam = new JButton("Mem\u00F3ria RAM");
		btnMemoriaRam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMemoriaRam.setBounds(466, 131, 142, 30);
		contentPane.add(btnMemoriaRam);

		JButton btnPerifericos = new JButton("Perif\u00E9ricos");
		btnPerifericos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPerifericos.setBounds(618, 131, 142, 30);
		contentPane.add(btnPerifericos);

		btnPlacaDeVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setPreferredSize(a.NovaTelaProdutos("Placa de V�deo"));
			}
		});

		btnProcessador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setPreferredSize(a.NovaTelaProdutos("Processador"));
			}
		});

		btnHddSsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setPreferredSize(a.NovaTelaProdutos("HDD/SDD"));
			}
		});

		btnMemoriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setPreferredSize(a.NovaTelaProdutos("Mem�ria Ram"));
			}
		});

		btnPerifericos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setPreferredSize(a.NovaTelaProdutos("Perif�ricos"));
			}
		});

		lblMonster.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				setVisible(false);
				TelaHomePage f = new TelaHomePage();
				f.setVisible(true);
			}
		});

		lblInformtica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				setVisible(false);
				TelaHomePage f = new TelaHomePage();
				f.setVisible(true);
			}
		});

		btnMinhaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Dados.userLogado.equals("admin")) {
					setVisible(false);
					TelaAdministrador f = new TelaAdministrador();
					f.setVisible(true);
				} else {
					setVisible(false);
					TelaContaUsuario f = new TelaContaUsuario();
					f.setVisible(true);
				}
			}
		});

		// ADICIONA_OS_PRODUTOS----------------------------------------------------------------------------------------------------------------------
		int cont = 0;
		for (int i = 0; i < Dados.arrayProdutos.size(); i++) {
			if (Dados.arrayProdutos.get(i).getDepartamento().equals(dpt)) {
				JLabel imagem = new JLabel(Dados.arrayProdutos.get(i).getFoto());
				imagem.setBounds(10, (cont*150), 120, 120);
				panel.add(imagem);
				JLabel nome = new JLabel(Dados.arrayProdutos.get(i).getProduto());
				nome.setBounds(150, (cont*150)+50, 300, 30);
				panel.add(nome);
				JLabel valor = new JLabel("R$"+Dados.arrayProdutos.get(i).getValor());
				valor.setBounds(350, (cont*150)+50, 150, 30);
				panel.add(valor);
				JButton botao = new JButton("Comprar");
				botao.setActionCommand(Dados.arrayProdutos.get(i).getProduto());
				botao.setBounds(450, (cont*150)+50, 150, 30);
				panel.add(botao);
				botao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						TelaUmProduto f = new TelaUmProduto(botao.getActionCommand());
						f.setVisible(true);
					}
				});
				cont++;

			}
		}
	}
}
