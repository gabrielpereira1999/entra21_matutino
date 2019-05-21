package exerc01;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class JogoPerguntasRespotas extends JFrame {
	
	static int acertos = 0,cont=0;
	Random rnd = new Random();
	int linha = rnd.nextInt(15);
	static int[] resp = {1,4,2,1,2,3,1,3,3,4,1,1,2,2,3};
	ArrayList<Integer> repetido = new ArrayList<Integer>();
	ArrayList<String> jogador = new ArrayList<String>();
	ArrayList<Integer> acertosjogador = new ArrayList<Integer>();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoPerguntasRespotas frame = new JogoPerguntasRespotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JogoPerguntasRespotas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		String[][] perg = new String[15][5];
		perg[0][0] = "Qual o tipo do pokemon Bulbasaur?";
		perg[0][1] = "Grama";
		perg[0][2] = "Fogo";
		perg[0][3] = "Elétrico";
		perg[0][4] = "Lutador";
		perg[1][0] = "Qual o tipo do pokemon Squirtle?";
		perg[1][1] = "Grama";
		perg[1][2] = "Fogo";
		perg[1][3] = "Elétrico";
		perg[1][4] = "Água";
		perg[2][0] = "Qual o tipo do pokemon Charmander?";
		perg[2][1] = "Grama";
		perg[2][2] = "Fogo";
		perg[2][3] = "Elétrico";
		perg[2][4] = "Lutador";
		perg[3][0] = "Qual o tipo do pokemon Geodude?";
		perg[3][1] = "Pedra";
		perg[3][2] = "Fantasma";
		perg[3][3] = "Elétrico";
		perg[3][4] = "Lutador";
		perg[4][0] = "Qual o tipo do pokemon Ghastly?";
		perg[4][1] = "Grama";
		perg[4][2] = "Fantasma";
		perg[4][3] = "Elétrico";
		perg[4][4] = "Lutador";
		perg[5][0] = "Qual o tipo do pokemon Onix?";
		perg[5][1] = "Grama";
		perg[5][2] = "Fogo";
		perg[5][3] = "Pedra";
		perg[5][4] = "Lutador";
		perg[6][0] = "Qual o tipo do pokemon Eevee?";
		perg[6][1] = "Normal";
		perg[6][2] = "Fogo";
		perg[6][3] = "Elétrico";
		perg[6][4] = "Lutador";
		perg[7][0] = "Qual o tipo do pokemon Pikachu?";
		perg[7][1] = "Grama";
		perg[7][2] = "Fogo";
		perg[7][3] = "Elétrico";
		perg[7][4] = "Lutador";
		perg[8][0] = "Qual o tipo do pokemon Arbok?";
		perg[8][1] = "Grama";
		perg[8][2] = "Fogo";
		perg[8][3] = "Venenoso";
		perg[8][4] = "Lutador";
		perg[9][0] = "Qual o tipo do pokemon Mew?";
		perg[9][1] = "Grama";
		perg[9][2] = "Fogo";
		perg[9][3] = "Elétrico";
		perg[9][4] = "Psíquico";
		perg[10][0] = "Qual o tipo do pokemon Umbreon?";
		perg[10][1] = "Noturno";
		perg[10][2] = "Fogo";
		perg[10][3] = "Elétrico";
		perg[10][4] = "Lutador";
		perg[11][0] = "Qual o tipo do pokemon Clefairy?";
		perg[11][1] = "Fada";
		perg[11][2] = "Fogo";
		perg[11][3] = "Elétrico";
		perg[11][4] = "Lutador";
		perg[12][0] = "Qual o tipo do pokemon Meltan?";
		perg[12][1] = "Grama";
		perg[12][2] = "Aço";
		perg[12][3] = "Elétrico";
		perg[12][4] = "Lutador";
		perg[13][0] = "Qual o tipo do pokemon Caterpie?";
		perg[13][1] = "Grama";
		perg[13][2] = "Inseto";
		perg[13][3] = "Elétrico";
		perg[13][4] = "Lutador";
		perg[14][0] = "Qual o tipo do pokemon Snorunt?";
		perg[14][1] = "Grama";
		perg[14][2] = "Fogo";
		perg[14][3] = "Gelo";
		perg[14][4] = "Lutador";
		
		repetido.add(linha);
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(perg[linha][0]);
		lblNewLabel.setBounds(5, 5, 424, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Jogar Novamente");
		btnNewButton_3.setBounds(53, 138, 169, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setVisible(false);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.setBounds(232, 138, 120, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setVisible(false);
		
		JButton btnEnviar = new JButton(perg[linha][1]);
		
		btnEnviar.setBounds(53, 104, 120, 23);
		contentPane.add(btnEnviar);
		
		JButton btnNewButton = new JButton(perg[linha][2]);
		btnNewButton.setBounds(232, 138, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(perg[linha][3]);
		btnNewButton_1.setBounds(232, 104, 120, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(perg[linha][4]);
		btnNewButton_2.setBounds(53, 138, 120, 23);
		contentPane.add(btnNewButton_2);
		
		jogador.add(JOptionPane.showInputDialog("Informe seu nome"));
		
		DefaultTableModel ranking = new DefaultTableModel();
		ranking.addColumn("Jogador");
		ranking.addColumn("Acertos");
		JTable tabela = new JTable(ranking);
		tabela.setBounds(5, 50, 450, 300);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setLocation(150, 0);
		lblRanking.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanking.setSize(120, 30);
		contentPane.add(lblRanking);
		lblRanking.setVisible(false);
		
		JScrollPane barra = new JScrollPane(tabela);
		barra.setSize(429, 211);
		barra.setLocation(0, 50);
		contentPane.add(barra);
		barra.setVisible(false);
		
		
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont<=9) {
					cont++;
					if((resp[linha])==1)
						acertos++;
					while(repetido.contains(linha)) {
						linha = rnd.nextInt(15);
					}
					repetido.add(linha);
					lblNewLabel.setText(perg[linha][0]);
					btnEnviar.setText(perg[linha][1]);
					btnNewButton.setText(perg[linha][2]);
					btnNewButton_1.setText(perg[linha][3]);
					btnNewButton_2.setText(perg[linha][4]);
				}else {
					JOptionPane.showMessageDialog(null, "Você acertou "+acertos+" perguntas");
					acertosjogador.add(acertos);
					lblNewLabel.setVisible(false);
					btnEnviar.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_3.setVisible(true);
					btnNewButton_4.setVisible(true);
				}
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont<=9) {
					cont++;
					if((resp[linha])==2)
						acertos++;
					while(repetido.contains(linha)) {
						linha = rnd.nextInt(15);
					}
					repetido.add(linha);
					lblNewLabel.setText(perg[linha][0]);
					btnEnviar.setText(perg[linha][1]);
					btnNewButton.setText(perg[linha][2]);
					btnNewButton_1.setText(perg[linha][3]);
					btnNewButton_2.setText(perg[linha][4]);
				}else {
					JOptionPane.showMessageDialog(null, "Você acertou "+acertos+" perguntas");
					acertosjogador.add(acertos);
					lblNewLabel.setVisible(false);
					btnEnviar.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_3.setVisible(true);
					btnNewButton_4.setVisible(true);
				}
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont<=9) {
					cont++;
					if((resp[linha])==3)
						acertos++;
					while(repetido.contains(linha)) {
						linha = rnd.nextInt(15);
					}
					repetido.add(linha);
					lblNewLabel.setText(perg[linha][0]);
					btnEnviar.setText(perg[linha][1]);
					btnNewButton.setText(perg[linha][2]);
					btnNewButton_1.setText(perg[linha][3]);
					btnNewButton_2.setText(perg[linha][4]);
				}else {
					JOptionPane.showMessageDialog(null, "Você acertou "+acertos+" perguntas");
					acertosjogador.add(acertos);
					lblNewLabel.setVisible(false);
					btnEnviar.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_3.setVisible(true);
					btnNewButton_4.setVisible(true);
				}
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont<=9) {
					cont++;
					if((resp[linha])==4)
						acertos++;
					while(repetido.contains(linha)) {
						linha = rnd.nextInt(15);
					}
					repetido.add(linha);
					lblNewLabel.setText(perg[linha][0]);
					btnEnviar.setText(perg[linha][1]);
					btnNewButton.setText(perg[linha][2]);
					btnNewButton_1.setText(perg[linha][3]);
					btnNewButton_2.setText(perg[linha][4]);
				}else {
					JOptionPane.showMessageDialog(null, "Você acertou "+acertos+" perguntas");
					acertosjogador.add(acertos);
					lblNewLabel.setVisible(false);
					btnEnviar.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_3.setVisible(true);
					btnNewButton_4.setVisible(true);
				}
				
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont = 0;
				repetido.clear();
				acertos = 0;
				btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);
				lblNewLabel.setVisible(true);
				btnEnviar.setVisible(true);
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);
				jogador.add(JOptionPane.showInputDialog("Informe seu nome"));
			}
		});
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);
				lblNewLabel.setVisible(false);
				btnEnviar.setVisible(false);
				btnNewButton.setVisible(false);
				btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);
				int tempint;
				String tempstr;
				for(int i1 = 0;i1<(jogador.size()-1);i1++) {
					for(int i2 = i1+1;i2<jogador.size();i2++) {
						if((acertosjogador.get(i2)) > (acertosjogador.get(i1))) {
							tempint = acertosjogador.get(i1);
							tempstr = jogador.get(i1);
							acertosjogador.set(i1, acertosjogador.get(i2));
							acertosjogador.set(i2, tempint);
							jogador.set(i1, jogador.get(i2));
							jogador.set(i2, tempstr);
						}
					}
				}
				
				for(int i = 0;i < (jogador.size());i++) {
					ranking.addRow(new Object[] {jogador.get(i),acertosjogador.get(i)});
				}
				barra.setVisible(true);
				lblRanking.setVisible(true);
			}
		});
	}
}
