package buysellsystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Principal {
	
	
	static int i=0,aux=0;
	static byte qualcarro=0;
	static double valorcarro =0;
	static String[][] dados = new String[10000][9];

	public static void main(String[] args) {
		
		

		DecimalFormat f = new DecimalFormat("0");
		f.setRoundingMode(RoundingMode.UP);	
		
		//FRAME
		JFrame JFloja = new JFrame();
		JFloja.setSize(1600, 860);
		JFloja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFloja.setTitle("NOGAS");
		JFloja.setLocationRelativeTo(null);
		JFloja.setLayout(null);
		
		JFrame JFlogin = new JFrame();
		JFlogin.setSize(500, 400);
		JFlogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JFlogin.setTitle("Acesso Restrito");
		JFlogin.setLocationRelativeTo(null);
		JFlogin.setLayout(null);
		
		JFrame JFhappyelon = new JFrame();
		JFhappyelon.setSize(894, 868);
		JFhappyelon.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JFhappyelon.setTitle("YOU MADE ELON HAPPY");
		JFhappyelon.setLocationRelativeTo(null);
		JFhappyelon.setLayout(null);

		//Painéis
        
		JPanel homepagep = new JPanel();
		homepagep.setBounds(0, 0, 1600, 850);
		homepagep.setLayout(null);
		
		JPanel ng100p = new JPanel();
		ng100p.setBounds(0, 0, 1600, 850);
		ng100p.setLayout(null);
		
		JPanel ng250p = new JPanel();
		ng250p.setBounds(0, 0, 1600, 850);
		ng250p.setLayout(null);
		
		JPanel bestevp = new JPanel();
		bestevp.setBounds(0, 0, 1600, 850);
		bestevp.setLayout(null);
		
		JPanel cadastrop = new JPanel();
		cadastrop.setBounds(0, 0, 1600, 850);
		cadastrop.setLayout(null);
		
		JPanel comprap = new JPanel();
		comprap.setBounds(0, 0, 1600, 850);
		comprap.setLayout(null);
		
		JPanel pagamentop = new JPanel();
		pagamentop.setBounds(0, 0, 1600, 850);
		pagamentop.setLayout(null);
			
		//ScrollPane
		
		JScrollPane scrollp = new JScrollPane();
		scrollp.setBounds(0, 0, 1600, 850);
		scrollp.setLayout(null);	
		
		//Icon
		
		ImageIcon homepageicon = new ImageIcon(Principal.class.getResource("homepage.png"));
		Image temp = homepageicon.getImage();
		Image newimg = temp.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedhomepage = new ImageIcon(newimg);
		
		// LABELS
		
		JLabel imgbestev = new JLabel(new ImageIcon(Principal.class.getResource("bestev.jpg")));
		imgbestev.setBounds(550, 300, 1000, 400);
		
		JLabel imgng100 = new JLabel(new ImageIcon(Principal.class.getResource("ng100.jpg")));
		imgng100.setBounds(550, 300, 1000, 400);
		
		JLabel imgng250 = new JLabel(new ImageIcon(Principal.class.getResource("ng250.png")));
		imgng250.setBounds(550, 300, 1000, 400);
		
		//Cores BestEV
		JLabel imgbestevred = new JLabel(new ImageIcon(Principal.class.getResource("bestevred.PNG")));
		imgbestevred.setBounds(300, 50, 1500, 800);
		
		JLabel imgbestevblue = new JLabel(new ImageIcon(Principal.class.getResource("bestevblue.PNG")));
		imgbestevblue.setBounds(300, 50, 1500, 800);
		
		JLabel imgbestevblack = new JLabel(new ImageIcon(Principal.class.getResource("bestevblack.PNG")));
		imgbestevblack.setBounds(300, 50, 1500, 800);
		
		//Cores NG100
		JLabel imgng100red = new JLabel(new ImageIcon(Principal.class.getResource("NG100red.PNG")));
		imgng100red.setBounds(300, 50, 1500, 800);
		
		JLabel imgng100blue = new JLabel(new ImageIcon(Principal.class.getResource("NG100blue.PNG")));
		imgng100blue.setBounds(300, 50, 1500, 800);
		
		JLabel imgng100black = new JLabel(new ImageIcon(Principal.class.getResource("NG100black.PNG")));
		imgng100black.setBounds(300, 50, 1500, 800);
		
		
		//Cores NG250
		JLabel imgng250red = new JLabel(new ImageIcon(Principal.class.getResource("NG250red.PNG")));
		imgng250red.setBounds(300, 50, 1500, 800);
		
		JLabel imgng250blue = new JLabel(new ImageIcon(Principal.class.getResource("NG250blue.PNG")));
		imgng250blue.setBounds(300, 50, 1500, 800);
		
		JLabel imgng250black = new JLabel(new ImageIcon(Principal.class.getResource("NG250black.PNG")));
		imgng250black.setBounds(300, 50, 1500, 800);
		
		
		
		JLabel homepagegif = new JLabel(new ImageIcon(Principal.class.getResource("gif.gif")));
		homepagegif.setBounds(50, 200, 1400, 600);
		
		JLabel imghappyelon = new JLabel(new ImageIcon(Principal.class.getResource("happyelon.jpg")));
		imghappyelon.setBounds(0, 0, 894, 778);
		
		JLabel nome = new JLabel();
		nome.setText("NOGAS");
		nome.setBounds(600, 10, 1500, 100);
		Font labelFont = nome.getFont();
		nome.setFont(new Font(labelFont.getName(), Font.PLAIN, 100));
		
		JLabel carros = new JLabel();
		carros.setText("Carros");
		carros.setBounds(10, 120, 100, 100);
		carros.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel ng100 = new JLabel();
		ng100.setText("NG100");
		ng100.setBounds(10, 120, 400, 100);
		ng100.setFont(new Font(labelFont.getName(), Font.PLAIN, 80));
		
		JLabel precong100 = new JLabel();
		precong100.setText("R$ 80000,00");
		precong100.setBounds(10, 670, 600, 100);
		precong100.setFont(new Font(labelFont.getName(), Font.PLAIN, 80));
		
		JLabel ng250 = new JLabel();
		ng250.setText("NG250");
		ng250.setBounds(10, 120, 400, 100);
		ng250.setFont(new Font(labelFont.getName(), Font.PLAIN, 80));
		
		JLabel precong250 = new JLabel();
		precong250.setText("R$ 120000,00");
		precong250.setBounds(10, 670, 600, 100);
		precong250.setFont(new Font(labelFont.getName(), Font.PLAIN, 80));
		
		JLabel bestev = new JLabel();
		bestev.setText("BestEV");
		bestev.setBounds(10, 120, 400, 100);
		bestev.setFont(new Font(labelFont.getName(), Font.PLAIN, 80));
		
		JLabel precobestev = new JLabel();
		precobestev.setText("R$ 200000,00");
		precobestev.setBounds(10, 670, 600, 100);
		precobestev.setFont(new Font(labelFont.getName(), Font.PLAIN, 80));
		
		JLabel ng100desc = new JLabel();
		ng100desc.setText("<html>O NG100 é o primeiro modelo desenvolvido pela NOGAS. Ele é 100% elétrico e apresenta autonomia de 200km "
				+ "na versão básica. Faz de 0-100Km/h em 5 segundos.</html>");
		ng100desc.setBounds(10, 300, 500, 400);
		ng100desc.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel ng250desc = new JLabel();
		ng250desc.setText("<html>O NG250 é o segundo modelo desenvolvido pela NOGAS. Assim como o NG100 ele é 100% elétrico."
				+ " O NG250 tem perfil mais esportvo, apresenta autonomia de 300km na versão básica é capaz de fazer de 0-100Km/h"
				+ " em 4 segundos.</html>");
		ng250desc.setBounds(10, 300, 500, 400);
		ng250desc.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));

		JLabel bestevdesc = new JLabel();
		bestevdesc.setText("<html>O BestEV é o terceiro e mais luxuoso modelo desenvolvido pela NOGAS. Assim como seus antecessores ele é "
				+ "100% elétrico. O BestEV tem performance e design incomparáveis, apresenta autonomia de 600km na versão básica é capaz "
				+ "de fazer de 0-100Km/h em 2 segundos.</html>");
		bestevdesc.setBounds(10, 300, 500, 400);
		bestevdesc.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel descversao = new JLabel();
		descversao.setBounds(10, 350, 500, 400);
		descversao.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel cadastro = new JLabel("Cadastro");
		cadastro.setBounds(300, 10, 300, 50); 
		cadastro.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
		
		JLabel nomecompleto = new JLabel("Nome Completo:");
		nomecompleto.setBounds(10, 80, 300, 50); 
		nomecompleto.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel datanasc = new JLabel("Data de Nascimento:");
		datanasc.setBounds(10, 200, 300, 50); 
		datanasc.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel cpf = new JLabel("CPF:");
		cpf.setBounds(10, 310, 300, 50); 
		cpf.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel endereco = new JLabel("Endereço:");
		endereco.setBounds(10, 410, 300, 50); 
		endereco.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel cep = new JLabel("CEP:");
		cep.setBounds(10, 530, 300, 50); 
		cep.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel telefone = new JLabel("Telefone:");
		telefone.setBounds(10, 650, 300, 50); 
		telefone.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel compra = new JLabel("Compra");
		compra.setBounds(300, 10, 300, 50); 
		compra.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
		
		JLabel modelo = new JLabel("Modelo");
		modelo.setBounds(10, 50, 300, 50); 
		modelo.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel versao = new JLabel("Versão");
		versao.setBounds(10, 160, 300, 50); 
		versao.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel valor = new JLabel("Valor: R$");
		valor.setBounds(10, 700, 150, 50); 
		valor.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel valormesmo = new JLabel();
		valormesmo.setBounds(150, 700, 300, 50); 
		valormesmo.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel numcard = new JLabel("Número do cartão (Qualquer banco)");
		numcard.setBounds(10, 80, 700, 50);
		numcard.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel vencard = new JLabel("Vencimento do cartão");
		vencard.setBounds(10, 200, 700, 50);
		vencard.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel codseg = new JLabel("Código de segurança do cartão");
		codseg.setBounds(10, 320, 700, 50);
		codseg.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel parcelas = new JLabel("Número de parcelas(sem juros)");
		parcelas.setBounds(10, 440, 700, 50);
		parcelas.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel valorparcelas = new JLabel("Valor das parcelas: R$");
		valorparcelas.setBounds(10, 560, 700, 50);
		valorparcelas.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel login = new JLabel("Usuário");
		login.setBounds(10, 10, 300, 50);
		login.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel senha = new JLabel("Senha");
		senha.setBounds(10, 130, 300, 50);
		senha.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JLabel dadonome = new JLabel("Nome");
		dadonome.setBounds(10, 10, 200, 50);
		dadonome.setFont(new Font(labelFont.getName(), Font.PLAIN, 40));
		
		JLabel dadocarro = new JLabel("Carro comprado");
		dadocarro.setBounds(700, 10, 300, 50);
		dadocarro.setFont(new Font(labelFont.getName(), Font.PLAIN, 40));
		
		JLabel dadovalor = new JLabel("Valor do carro");
		dadovalor.setBounds(1100, 10, 300, 50);
		dadovalor.setFont(new Font(labelFont.getName(), Font.PLAIN, 40));
		
		Font ghost = new Font("SansSerif", Font.BOLD, 30);
		JLabel ghostnome = new JLabel("Nome Completo");
		ghostnome.setBounds(10, 0, 500, 50);
		ghostnome.setForeground(Color.GRAY);
		ghostnome.setFont(ghost);
		
		JLabel ghostdata = new JLabel("dd/mm/aaaa");
		ghostdata.setBounds(10, 0, 500, 50);
		ghostdata.setForeground(Color.GRAY);
		ghostdata.setFont(ghost);
		
		JLabel ghostcpf = new JLabel("000.000.000-00");
		ghostcpf.setBounds(10, 0, 500, 50);
		ghostcpf.setForeground(Color.GRAY);
		ghostcpf.setFont(ghost);
		
		JLabel ghostendereco = new JLabel("Rua, Cidade, Estado, País");
		ghostendereco.setBounds(10, 0, 500, 50);
		ghostendereco.setForeground(Color.GRAY);
		ghostendereco.setFont(ghost);
		
		JLabel ghostcep = new JLabel("00000-000");
		ghostcep.setBounds(10, 0, 500, 50);
		ghostcep.setForeground(Color.GRAY);
		ghostcep.setFont(ghost);
		
		JLabel ghosttelefone = new JLabel("(00) 00 00000-0000");
		ghosttelefone.setBounds(10, 0, 500, 50);
		ghosttelefone.setForeground(Color.GRAY);
		ghosttelefone.setFont(ghost);
		
		JLabel cor = new JLabel("Cor");
		cor.setBounds(10, 280, 300, 50);
		cor.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		
		//Text FIELD
		
		JTextField fieldnome = new JTextField();
		fieldnome.setBounds(10, 140, 500, 50);
		fieldnome.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		fieldnome.add(ghostnome);
		
		JTextField fielddata = new JTextField();
		fielddata.setBounds(10, 260, 500, 50);
		fielddata.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		fielddata.add(ghostdata);
		
		
		JTextField fieldcpf = new JTextField();
		fieldcpf.setBounds(10, 360, 500, 50);
		fieldcpf.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		fieldcpf.add(ghostcpf);
		
		JTextField fieldendereco = new JTextField();
		fieldendereco.setBounds(10, 470, 500, 50);
		fieldendereco.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		fieldendereco.add(ghostendereco);
		
		JTextField fieldcep = new JTextField();
		fieldcep.setBounds(10, 590, 500, 50);
		fieldcep.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		fieldcep.add(ghostcep);
		
		JTextField fieldtelefone = new JTextField();
		fieldtelefone.setBounds(10, 710, 500, 50);
		fieldtelefone.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		fieldtelefone.add(ghosttelefone);
		
		JTextField fieldnumcard = new JTextField();
		fieldnumcard.setBounds(10, 140, 500, 50);
		fieldnumcard.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JTextField fieldvencard = new JTextField();
		fieldvencard.setBounds(10, 260, 500, 50);
		fieldvencard.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JTextField fieldcodseg = new JTextField();
		fieldcodseg.setBounds(10, 380, 500, 50);
		fieldcodseg.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JTextField fieldlogin = new JTextField();
		fieldlogin.setBounds(10, 70, 400, 50);
		fieldlogin.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JTextField fieldsenha = new JTextField();
		fieldsenha.setBounds(10, 190, 400, 50);
		fieldsenha.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		
		
		//BOTÃO
		JButton btncarro1 = new JButton("NG100");
		btncarro1.setBounds(220, 150, 150, 50);
		btncarro1.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btncomprar = new JButton("Comprar");
		btncomprar.setBounds(1300, 750, 200, 50);
		btncomprar.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));		

		JButton btncarro2 = new JButton("NG250");
		btncarro2.setBounds(420, 150, 150, 50);
		btncarro2.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));

		JButton btncarro3 = new JButton("BestEV");
		btncarro3.setBounds(620, 150, 150, 50);
		btncarro3.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btnhomepage = new JButton(resizedhomepage);
		btnhomepage.setBounds(1400, 50, 120, 120);
		btnhomepage.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btnfimcadastro = new JButton("Finalizar cadastro");
		btnfimcadastro.setBounds(900, 750, 300, 50);
		btnfimcadastro.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setBounds(1300, 750, 200, 50);
		btncancelar.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btnpagamento = new JButton("Ir para pagamento");
		btnpagamento.setBounds(800, 750, 300, 50);
		btnpagamento.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btnconfirmapagamento = new JButton("Confirmar pagamento");
		btnconfirmapagamento.setBounds(800, 750, 400, 50);
		btnconfirmapagamento.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btnadm = new JButton("Administrador");
		btnadm.setBounds(1320, 10, 250, 50);
		btnadm.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBounds(125, 250, 250, 50);
		btnlogin.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JButton btnok = new JButton("Ok......");
		btnok.setBounds(342, 778, 200, 50);
		btnok.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
	
		
		//Caixa de combinação
		JComboBox<String> combocarros = new JComboBox<String>();
		combocarros.setBounds(10, 100, 470, 60);
		combocarros.addItem("NG100");
		combocarros.addItem("NG250");
		combocarros.addItem("BestEV");
		combocarros.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JComboBox<String> comboadd = new JComboBox<String>();
		comboadd.setBounds(10, 210, 470, 60);
		comboadd.addItem("Básica");
		comboadd.addItem("Completa");
		comboadd.addItem("Luxo");
		comboadd.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JComboBox<String> comboparcelas = new JComboBox<String>();
		comboparcelas.setBounds(10, 500, 470, 60);
		comboparcelas.addItem("1");
		comboparcelas.addItem("2");
		comboparcelas.addItem("3");
		comboparcelas.addItem("4");
		comboparcelas.addItem("5");
		comboparcelas.addItem("6");
		comboparcelas.addItem("12");
		comboparcelas.addItem("24");
		comboparcelas.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		
		JComboBox<String> combocor = new JComboBox<String>();
		combocor.setBounds(10, 340, 200, 50);
		combocor.addItem("Vermelho");
		combocor.addItem("Azul");
		combocor.addItem("Preto");
		combocor.setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
		

		//Adicionar elementos aos frames e paineis
		homepagep.add(nome);
		homepagep.add(carros);
		homepagep.add(btncarro1);
		homepagep.add(btncarro2);
		homepagep.add(btncarro3);
		homepagep.add(homepagegif);
		homepagep.add(btnadm);
		ng100p.add(ng100);
		ng100p.add(ng100desc);
		ng100p.add(precong100);
		ng100p.add(imgng100);
		ng250p.add(ng250);
		ng250p.add(ng250desc);
		ng250p.add(precong250);
		ng250p.add(imgng250);
		bestevp.add(bestev);
		bestevp.add(bestevdesc);
		bestevp.add(precobestev);
		bestevp.add(imgbestev);	
		cadastrop.add(cadastro);
		cadastrop.add(nomecompleto);
		cadastrop.add(datanasc);
		cadastrop.add(cpf);
		cadastrop.add(endereco);
		cadastrop.add(telefone);
		cadastrop.add(cep);
		cadastrop.add(fieldnome);
		cadastrop.add(fielddata);
		cadastrop.add(fieldcpf);
		cadastrop.add(fieldendereco);
		cadastrop.add(fieldcep);
		cadastrop.add(fieldtelefone);
		cadastrop.add(btnfimcadastro);
		comprap.add(compra);
		comprap.add(combocarros);
		comprap.add(comboadd);
		comprap.add(modelo);
		comprap.add(versao);
		comprap.add(descversao);
		comprap.add(valor);
		comprap.add(valormesmo);
		comprap.add(btnpagamento);
		comprap.add(cor);
		comprap.add(combocor);
		comprap.add(imgbestevred);
		comprap.add(imgbestevblue);
		comprap.add(imgbestevblack);
		comprap.add(imgng100red);
		comprap.add(imgng100blue);
		comprap.add(imgng100black);
		comprap.add(imgng250red);
		comprap.add(imgng250blue);
		comprap.add(imgng250black);
		pagamentop.add(numcard);
		pagamentop.add(vencard);
		pagamentop.add(fieldnumcard);
		pagamentop.add(fieldvencard);
		pagamentop.add(fieldcodseg);
		pagamentop.add(codseg);
		pagamentop.add(parcelas);
		pagamentop.add(comboparcelas);
		pagamentop.add(valorparcelas);
		pagamentop.add(btnconfirmapagamento);
		scrollp.add(dadonome);
		scrollp.add(dadocarro);
		scrollp.add(dadovalor);
		JFloja.add(homepagep);
		JFloja.add(ng100p);
		JFloja.add(ng250p);
		JFloja.add(bestevp);
		JFloja.add(cadastrop);
		JFloja.add(comprap);
		JFloja.add(pagamentop);
		JFloja.add(scrollp);
		JFlogin.add(login);
		JFlogin.add(senha);
		JFlogin.add(fieldlogin);
		JFlogin.add(fieldsenha);
		JFlogin.add(btnlogin);
		JFhappyelon.add(btnok);
		JFhappyelon.add(imghappyelon);

		// Exibir paineis
		JFloja.setVisible(true);
		JFlogin.setVisible(false);
		JFhappyelon.setVisible(false);
		homepagep.setVisible(true);
		ng100p.setVisible(false);
		ng250p.setVisible(false);
		bestevp.setVisible(false);
		cadastrop.setVisible(false);
		comprap.setVisible(false);
		pagamentop.setVisible(false);
		
		

		//Evento no botão
		btncarro1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				homepagep.setVisible(false);
				ng100p.setVisible(true);
				ng100p.add(btnhomepage);
				ng100p.add(btncomprar);
				qualcarro = 1;
			
			}
		});
		
		btncarro2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				homepagep.setVisible(false);
				ng250p.setVisible(true);
				ng250p.add(btnhomepage);
				ng250p.add(btncomprar);
				qualcarro = 2;
							
			}
		});
		
		btncarro3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				homepagep.setVisible(false);
				bestevp.setVisible(true);
				bestevp.add(btnhomepage);			
				bestevp.add(btncomprar);	
				qualcarro = 3;
			
			}
		});
		
		btnhomepage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ng100p.setVisible(false);
				ng250p.setVisible(false);
				bestevp.setVisible(false);
				cadastrop.setVisible(false);
				scrollp.setVisible(false);
				homepagep.setVisible(true);	
			
			}
		});
		
		btncomprar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ng250p.setVisible(false);
				ng100p.setVisible(false);
				bestevp.setVisible(false);
				cadastrop.add(btnhomepage);
				cadastrop.add(btncancelar);
				cadastrop.setVisible(true);
				ghostnome.setVisible(true);
				ghostdata.setVisible(true);
				ghostcpf.setVisible(true);
				ghostendereco.setVisible(true);
				ghostcep.setVisible(true);
				ghosttelefone.setVisible(true);
				fieldnome.requestFocus();
				
			
			}
		});
		
		btnfimcadastro.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {

				if ( (fieldnome.getText().equals("")) || (fielddata.getText().equals("")) || (fieldcpf.getText().equals("")) 
						|| (fieldendereco.getText().equals("")) || (fieldtelefone.getText().equals("")) || (fieldcep.getText().equals(""))) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				}else {
					dados[i][0] = fieldnome.getText();
					dados[i][1] = fielddata.getText();
					dados[i][2] = fieldcpf.getText();
					dados[i][3] = fieldendereco.getText();
					dados[i][4] = fieldtelefone.getText();
					dados[i][5] = fieldcep.getText();
					cadastrop.setVisible(false);
					comprap.setVisible(true);
					combocor.setSelectedIndex(0);
					combocarros.requestFocus();
					descversao.setText("<html>A versão básica inclui câmbio automático, ar-condicionado, painel de 18\".</html>");
					comprap.add(btncancelar);
				}
				imgng100red.setVisible(false);
				imgng100blue.setVisible(false);
				imgng100black.setVisible(false);
				imgng250red.setVisible(false);
				imgng250blue.setVisible(false);
				imgng250black.setVisible(false);
				imgbestevred.setVisible(false);
				imgbestevblue.setVisible(false);
				imgbestevblack.setVisible(false);
				if (qualcarro==1) {
					combocarros.setSelectedItem("NG100");
					valormesmo.setText(""+80000+",00");
					imgng100red.setVisible(true);
				}else if (qualcarro==2) {
					combocarros.setSelectedItem("NG250");
					valormesmo.setText(""+120000+",00");
					imgng250red.setVisible(true);
				}else if(qualcarro ==3) {
					combocarros.setSelectedItem("BestEV");
					valormesmo.setText(""+200000+",00");
					imgbestevred.setVisible(true);
				}
				
				
				
			}
		});
		
		comboadd.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {

				
				if( comboadd.getSelectedIndex() == 0) {
					descversao.setText("<html>A versão básica inclui câmbio automático, ar-condicionado, painel de 18\".</html>");
				}else if( comboadd.getSelectedIndex() == 1) {
					descversao.setText("<html>A versão completa inclui adicionalmente aos itens da versão básica, atualizações"
							+ " remotas de software, equipamento preparado para suportar direção autônoma e tração nas 4 rodas.</html>");
				}else
					descversao.setText("<html>A versão de luxo inclui adicionalmente aos itens da versão completa, recarregamento"
							+ " de bateria grátis em todas as estações da NOGAS, seguro pago por 2 anos e a opção de receber as "
							+ "atualizações antes dos outros.</html>");
				
				if (combocarros.getSelectedIndex()==0) {
					if( (comboadd.getSelectedIndex())==0 ) {
						valormesmo.setText(""+80000+",00");
						valorcarro = 80000;
					}else if((comboadd.getSelectedIndex())==1) {
					valormesmo.setText(""+f.format(80000*1.1)+",00");
					valorcarro = 80000*1.1;
					}else if((comboadd.getSelectedIndex())==2) {
						valormesmo.setText(""+f.format(80000*1.3)+",00");
						valorcarro = 80000*1.3;
				}}else if (combocarros.getSelectedIndex()==1) {
					if( (comboadd.getSelectedIndex())==0 ) {
						valormesmo.setText(""+120000+",00");
						valorcarro = 120000;
					}else if((comboadd.getSelectedIndex())==1) {
					valormesmo.setText(""+f.format(120000*1.1)+",00");
					valorcarro = 120000*1.1;
					}else if((comboadd.getSelectedIndex())==2) {
						valormesmo.setText(""+f.format(120000*1.3)+",00");
						valorcarro = 120000*1.3;
				}}else {
					if( (comboadd.getSelectedIndex())==0 ) {
						valormesmo.setText(""+200000+",00");
						valorcarro = 200000;
					}else if((comboadd.getSelectedIndex())==1) {
					valormesmo.setText(""+f.format(200000*1.1)+",00");
					valorcarro = 200000*1.1;
					}else if((comboadd.getSelectedIndex())==2) {
						valormesmo.setText(""+f.format(200000*1.3)+",00");
						valorcarro = 200000*1.3;
					}
				}
			}
		});
		
		combocor.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {

				if (qualcarro==1) {
					if( combocor.getSelectedIndex() == 0) {
						combocor.getComponent(0).setBackground(Color.RED);
						imgng100red.setVisible(true);
						imgng100blue.setVisible(false);
						imgng100black.setVisible(false);
					}else if( combocor.getSelectedIndex() == 1) {
						combocor.getComponent(0).setBackground(Color.blue);
						imgng100red.setVisible(false);
						imgng100blue.setVisible(true);
						imgng100black.setVisible(false);
					}else {
						combocor.getComponent(0).setBackground(Color.BLACK);
						imgng100red.setVisible(false);
						imgng100blue.setVisible(false);
						imgng100black.setVisible(true);
					}
				}else if (qualcarro==2) {
					if( combocor.getSelectedIndex() == 0) {
						combocor.getComponent(0).setBackground(Color.RED);
						imgng250red.setVisible(true);
						imgng250blue.setVisible(false);
						imgng250black.setVisible(false);
					}else if( combocor.getSelectedIndex() == 1) {
						combocor.getComponent(0).setBackground(Color.blue);
						imgng250red.setVisible(false);
						imgng250blue.setVisible(true);
						imgng250black.setVisible(false);
					}else {
						combocor.getComponent(0).setBackground(Color.BLACK);
						imgng250red.setVisible(false);
						imgng250blue.setVisible(false);
						imgng250black.setVisible(true);
					}
				}else if(qualcarro ==3) {
					if( combocor.getSelectedIndex() == 0) {
						combocor.getComponent(0).setBackground(Color.RED);
						imgbestevred.setVisible(true);
						imgbestevblue.setVisible(false);
						imgbestevblack.setVisible(false);
					}else if( combocor.getSelectedIndex() == 1) {
						combocor.getComponent(0).setBackground(Color.blue);
						imgbestevred.setVisible(false);
						imgbestevblue.setVisible(true);
						imgbestevblack.setVisible(false);
					}else {
						combocor.getComponent(0).setBackground(Color.BLACK);
						imgbestevred.setVisible(false);
						imgbestevblue.setVisible(false);
						imgbestevblack.setVisible(true);
					}
				}
				
				
			}
		});
		
		combocarros.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
				
				imgng100red.setVisible(false);
				imgng100blue.setVisible(false);
				imgng100black.setVisible(false);
				imgng250red.setVisible(false);
				imgng250blue.setVisible(false);
				imgng250black.setVisible(false);
				imgbestevred.setVisible(false);
				imgbestevblue.setVisible(false);
				imgbestevblack.setVisible(false);
				
				if (combocarros.getSelectedIndex()==0) {
					qualcarro = 1;
					if( combocor.getSelectedIndex() == 0) {
						combocor.getComponent(0).setBackground(Color.RED);
						imgng100red.setVisible(true);
					}else if( combocor.getSelectedIndex() == 1) {
						combocor.getComponent(0).setBackground(Color.blue);
						imgng100blue.setVisible(true);
					}else {
						combocor.getComponent(0).setBackground(Color.BLACK);
						imgng100black.setVisible(true);
					}
					if( (comboadd.getSelectedIndex())==0 ) {
						valormesmo.setText(""+80000+",00");
						valorcarro = 80000;
					}else if((comboadd.getSelectedIndex())==1) {
					valormesmo.setText(""+f.format(80000*1.1)+",00");
					valorcarro = 80000*1.1;
					}else if((comboadd.getSelectedIndex())==2) {
						valormesmo.setText(""+f.format(80000*1.3)+",00");
						valorcarro = 80000*1.3;
				}}else if (combocarros.getSelectedIndex()==1) {
					qualcarro = 2;
					if( combocor.getSelectedIndex() == 0) {
						combocor.getComponent(0).setBackground(Color.RED);
						imgng250red.setVisible(true);
					}else if( combocor.getSelectedIndex() == 1) {
						combocor.getComponent(0).setBackground(Color.blue);
						imgng250blue.setVisible(true);
					}else {
						combocor.getComponent(0).setBackground(Color.BLACK);
						imgng250black.setVisible(true);
					}
					if( (comboadd.getSelectedIndex())==0 ) {
						valormesmo.setText(""+120000+",00");
						valorcarro = 120000;
					}else if((comboadd.getSelectedIndex())==1) {
					valormesmo.setText(""+f.format(120000*1.1)+",00");
					valorcarro = 120000*1.1;
					}else if((comboadd.getSelectedIndex())==2) {
						valormesmo.setText(""+f.format(120000*1.3)+",00");
						valorcarro = 120000*1.3;
				}}else {
					qualcarro = 3;
					if( combocor.getSelectedIndex() == 0) {
						combocor.getComponent(0).setBackground(Color.RED);
						imgbestevred.setVisible(true);
					}else if( combocor.getSelectedIndex() == 1) {
						combocor.getComponent(0).setBackground(Color.blue);
						imgbestevblue.setVisible(true);
					}else {
						combocor.getComponent(0).setBackground(Color.BLACK);
						imgbestevblack.setVisible(true);
					}
					if( (comboadd.getSelectedIndex())==0 ) {
						valormesmo.setText(""+200000+",00");
						valorcarro = 200000;
					}else if((comboadd.getSelectedIndex())==1) {
					valormesmo.setText(""+f.format(200000*1.1)+",00");
					valorcarro = 200000*1.1;
					}else if((comboadd.getSelectedIndex())==2) {
						valormesmo.setText(""+f.format(200000*1.3)+",00");
						valorcarro = 200000*1.3;
				}}
			}
		});
		
		btncancelar.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
			
				comprap.setVisible(false);
				cadastrop.setVisible(false);
				pagamentop.setVisible(false);
				homepagep.setVisible(true);
				if( (dados[i][0]!=null) || (dados[i][1]!=null) || (dados[i][2]!=null) || (dados[i][3]!=null) ||
					(dados[i][4]!=null) || (dados[i][5]!=null) ) {
					dados[i][0] = "";
					dados[i][1] = "";
					dados[i][2] = "";
					dados[i][3] = "";
					dados[i][4] = "";
					dados[i][5] = "";
				}
				fieldnome.setText("");
				fieldendereco.setText("");
				fieldcep.setText("");
				fieldcpf.setText("");
				fieldtelefone.setText("");
				fielddata.setText("");
				fieldnumcard.setText("");
				fieldvencard.setText("");
				fieldcodseg.setText("");
				comboparcelas.setSelectedIndex(0);
			}
		});
		
		btnpagamento.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
			
				comprap.setVisible(false);
				pagamentop.setVisible(true);
				pagamentop.add(btncancelar);
				if( comboparcelas.getSelectedIndex() == 0) {
					aux = 1;
				}else if ( comboparcelas.getSelectedIndex() == 1) {
					aux = 2;
				}else if( comboparcelas.getSelectedIndex() == 2) {
					aux = 3;
				}else if( comboparcelas.getSelectedIndex() == 3) {
					aux = 4;
				}else if( comboparcelas.getSelectedIndex() == 4) {
					aux = 5;
				}else if( comboparcelas.getSelectedIndex() == 5) {
					aux = 6;
				}else if( comboparcelas.getSelectedIndex() == 6) {
					aux = 12;
				}else
					aux = 24;
				valorparcelas.setText("Valor das parcelas: R$"+f.format(valorcarro/aux)+",00");
				fieldnumcard.requestFocus();
				
			}
		});
		
		comboparcelas.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
			
			
				if( comboparcelas.getSelectedIndex() == 0) {
					aux = 1;
				}else if ( comboparcelas.getSelectedIndex() == 1) {
					aux = 2;
				}else if( comboparcelas.getSelectedIndex() == 2) {
					aux = 3;
				}else if( comboparcelas.getSelectedIndex() == 3) {
					aux = 4;
				}else if( comboparcelas.getSelectedIndex() == 4) {
					aux = 5;
				}else if( comboparcelas.getSelectedIndex() == 5) {
					aux = 6;
				}else if( comboparcelas.getSelectedIndex() == 6) {
					aux = 12;
				}else
					aux = 24;
				valorparcelas.setText("Valor das parcelas: R$"+f.format(valorcarro/aux)+",00");
				
			}
		});
		
		btnconfirmapagamento.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
			
				if ( (fieldnumcard.getText().equals("")) || (fieldcodseg.getText().equals("")) || (fieldvencard.getText().equals("")) ) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				}else {
					if(qualcarro==1)
						dados[i][6] = "NG100";
					else if(qualcarro == 2)
						dados[i][6] = "NG250";
					else
						dados[i][6] = "BestEV";
					dados[i][7] = "R$"+f.format(valorcarro)+",00";
					if( combocor.getSelectedIndex() == 0) {
						dados[i][8] = "Vermelho";
					}else if( combocor.getSelectedIndex() == 1) {
						dados[i][8] = "Azul";
					}else
						dados[i][8] = "Preto";
 
					i++;
					
					pagamentop.setVisible(false);
					JFloja.setVisible(false);
					JFhappyelon.setVisible(true);
					
					fieldnome.setText("");
					fieldendereco.setText("");
					fieldcep.setText("");
					fieldcpf.setText("");
					fieldtelefone.setText("");
					fielddata.setText("");
					fieldnumcard.setText("");
					fieldvencard.setText("");
					fieldcodseg.setText("");
					fieldnumcard.setText("");
					fieldcodseg.setText("");
					fieldvencard.setText("");
					comboparcelas.setSelectedIndex(0);
					comboadd.setSelectedIndex(0);
					
				}
				
				
			}
		});
		
		btnadm.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
			
				JFlogin.setVisible(true);
				fieldlogin.setText("");
				fieldsenha.setText("");
				
				
			}
		});
		
		btnlogin.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
			
				if ( (fieldlogin.getText().equals("admin")) && (fieldsenha.getText().equals("admin")) ) {
					JFlogin.setVisible(false);
					homepagep.setVisible(false);
					int j=0;
					JLabel[] arraylnome = new JLabel[99999];
					JLabel[] arraylcarro = new JLabel[99999];
					JLabel[] arraylvalor = new JLabel[99999];
					try {
					while( (!dados[j][0].equals("")) && (dados[j][0] != null) ) {
						arraylnome[j] = new JLabel(dados[j][0]);
						arraylnome[j].setBounds(10, (50*(j+1)), 650, 50);
						arraylnome[j].setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
						scrollp.add(arraylnome[j]);
						arraylcarro[j] = new JLabel(dados[j][6]);
						arraylcarro[j].setBounds(700, (50*(j+1)), 200, 50);
						arraylcarro[j].setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
						scrollp.add(arraylcarro[j]);
						arraylvalor[j] = new JLabel(dados[j][7]);
						arraylvalor[j].setBounds(1100, (50*(j+1)), 200, 50);
						arraylvalor[j].setFont(new Font(labelFont.getName(), Font.PLAIN, 30));
						scrollp.add(arraylnome[j]);
						scrollp.add(arraylcarro[j]);
						scrollp.add(arraylvalor[j]);
						j++;
					}
					
					}catch(Exception a) {}
					
					scrollp.setVisible(true);
					scrollp.add(btnhomepage);
				}else {
					JOptionPane.showMessageDialog(null, "Dados incorretos");
				}
				
				
			}
		});
		
		btnok.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) {
			
				JFhappyelon.setVisible(false);
				JFloja.setVisible(true);
				homepagep.setVisible(true);
				
				
			}
		});
		
		fieldnome.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				if(fieldnome.getText().length() < 1)
					ghostnome.setVisible(true);
				
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
				ghostnome.setVisible(false);
			}
		});
		
		fielddata.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				if(fielddata.getText().length() < 1)
					ghostdata.setVisible(true);
				
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
				ghostdata.setVisible(false);
			}
		});
		
		fieldcpf.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				if(fieldcpf.getText().length() < 1)
					ghostcpf.setVisible(true);
				
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
				ghostcpf.setVisible(false);
			}
		});
		
		fieldendereco.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				if(fieldendereco.getText().length() < 1)
					ghostendereco.setVisible(true);
				
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				
				ghostendereco.setVisible(false);
			}
		});

		fieldcep.addFocusListener(new FocusListener() {
	
			@Override
			public void focusLost(FocusEvent e) {
		
				if(fieldcep.getText().length() < 1)
					ghostcep.setVisible(true);
		
		
			}
	
			@Override
			public void focusGained(FocusEvent e) {
		
				ghostcep.setVisible(false);
			}
		});

		fieldtelefone.addFocusListener(new FocusListener() {
	
			@Override
			public void focusLost(FocusEvent e) {
		
				if(fieldtelefone.getText().length() < 1)
					ghosttelefone.setVisible(true);
		
		
			}
	
			@Override
			public void focusGained(FocusEvent e) {
		
				ghosttelefone.setVisible(false);
			}
		});
		
	}

}
