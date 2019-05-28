package telaHomePage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Dados;
import telaAdm.TelaAdministrador;
import telaContaUsuario.TelaContaUsuario;
import telaProdutoDpt.TelaProdutoDpt;
import telaUmProduto.TelaUmProduto;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaHomePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	public TelaHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		//Cria �cone para bot�o pesquisa
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
		
		JLabel lblDestaques = new JLabel("Destaques");
		lblDestaques.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDestaques.setBounds(10, 172, 108, 30);
		contentPane.add(lblDestaques);
		
		try {
		JLabel lblImagemdoproduto = new JLabel(Dados.arrayProdutos.get(0).getFoto());
		lblImagemdoproduto.setBounds(10, 213, 108, 106);
		contentPane.add(lblImagemdoproduto);
		
		JLabel lblNomeprodutodestaque1 = new JLabel(Dados.arrayProdutos.get(0).getProduto());
		lblNomeprodutodestaque1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeprodutodestaque1.setBounds(143, 253, 286, 22);
		contentPane.add(lblNomeprodutodestaque1);
		
		JLabel lblValorprodutodestaque1 = new JLabel("R$ "+Dados.arrayProdutos.get(0).getValor());
		lblValorprodutodestaque1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorprodutodestaque1.setBounds(439, 256, 90, 16);
		contentPane.add(lblValorprodutodestaque1);
		
		JButton btnPaginaDoProduto = new JButton("P\u00E1gina do Produto");
		btnPaginaDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaginaDoProduto.setBounds(591, 253, 169, 23);
		contentPane.add(btnPaginaDoProduto);
		
		btnPaginaDoProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaUmProduto u = new TelaUmProduto(Dados.arrayProdutos.get(0).getProduto());
				u.setVisible(true);
				
			}
		});
		
		JLabel lblImagemdoproduto2 = new JLabel(Dados.arrayProdutos.get(1).getFoto());
		lblImagemdoproduto2.setBounds(10, 330, 108, 106);
		contentPane.add(lblImagemdoproduto2);
		
		JLabel lblNomeprodutodestaque2 = new JLabel(Dados.arrayProdutos.get(1).getProduto());
		lblNomeprodutodestaque2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeprodutodestaque2.setBounds(143, 375, 286, 22);
		contentPane.add(lblNomeprodutodestaque2);
		
		JLabel lblValorprodutodestaque2 = new JLabel("R$ "+Dados.arrayProdutos.get(1).getValor());
		lblValorprodutodestaque2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorprodutodestaque2.setBounds(439, 378, 90, 16);
		contentPane.add(lblValorprodutodestaque2);
		
		JButton btnPaginaDoProduto2 = new JButton("P\u00E1gina do Produto");
		btnPaginaDoProduto2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaginaDoProduto2.setBounds(591, 377, 169, 23);
		contentPane.add(btnPaginaDoProduto2);
		
		btnPaginaDoProduto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaUmProduto u = new TelaUmProduto(Dados.arrayProdutos.get(1).getProduto());
				u.setVisible(true);
			}
		});
		
		JLabel lblImagemdoproduto3 = new JLabel(Dados.arrayProdutos.get(2).getFoto());
		lblImagemdoproduto3.setBounds(10, 457, 108, 106);
		contentPane.add(lblImagemdoproduto3);
		
		JLabel lblNomeprodutodestaque3 = new JLabel(Dados.arrayProdutos.get(2).getProduto());
		lblNomeprodutodestaque3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeprodutodestaque3.setBounds(143, 497, 286, 22);
		contentPane.add(lblNomeprodutodestaque3);
		
		JLabel lblValorprodutodestaque3 = new JLabel("R$ "+Dados.arrayProdutos.get(2).getValor());
		lblValorprodutodestaque3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorprodutodestaque3.setBounds(439, 500, 90, 16);
		contentPane.add(lblValorprodutodestaque3);
		
		JButton btnPaginaDoProduto3 = new JButton("P\u00E1gina do Produto");
		btnPaginaDoProduto3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaginaDoProduto3.setBounds(591, 499, 169, 23);
		contentPane.add(btnPaginaDoProduto3);
		
		btnPaginaDoProduto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaUmProduto u = new TelaUmProduto(Dados.arrayProdutos.get(2).getProduto());
				u.setVisible(true);
			}
		});
		
		}catch(Exception a){
			
		}
		
		btnPlacaDeVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Placa de V�deo");
				f.setVisible(true);
			}
		});
		
		btnProcessador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Processador");
				f.setVisible(true);
			}
		});
		
		btnHddSsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("HDD/SDD");
				f.setVisible(true);
			}
		});
		
		btnMemoriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Mem�ria RAM");
				f.setVisible(true);
			}
		});
		
		btnPerifericos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Perif�ricos");
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
		
		
	}

}
