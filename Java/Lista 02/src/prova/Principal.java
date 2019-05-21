package prova;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Object[] depart = { "Áudio/Vídeo", "Informática", "Telefonia", "Vestuário" };
		Object[] aud = { "TVs", "Aparelhos de Som", "Voltar" };
		Object[] tv = { "Smart TV Led 49 Samsung - R$ 4.999,99", "Smart TV 4k LG 60 - R$7.499,00",
				"Smart TV Full HD 32 Samsung - R$ 1.710,00", "Voltar" };
		Object[] apsom = { "Semp Toshiba Áudio Bright - R$ 599,99", "Mini System LG - R$ 512,00",
				"Mini System Philco - R$ 499,99", "Voltar" };
		Object[] info = { "Hardware", "Software", "Voltar" };
		Object[] hard = { "Placa Mãe Asus - R$ 2.000,00", "Memória Ram Corsair 4GB - R$500,00",
				"Mouse Multilaser - R$59,90", "Voltar" };
		Object[] soft = { "Windows 10 - R$500,00", "Office 2019 - R$399,99", "AutoCard 3D - R$899,50", "Voltar" };
		Object[] tele = { "Smartphones", "Tablet", "Voltar" };
		Object[] smart = { "Samsung s10 - R$3.000,00", "Iphone 10 - R$5.000,00", "Xiaomi MI A1 - R$800,00", "Voltar" };
		Object[] tablet = { "Lenovo g15 - R$500,00", "Positivo nice - R$450,00", "Dell j2 - R$520,00", "Voltar" };
		Object[] vest = { "Masculino", "Feminino", "Voltar" };
		Object[] masc = { "Camisa Social Lacoste - R$ 200,00", "Calça Jeans Calvin Klein R$ 230,00",
				"Camisa Social Dudalina - R$ 130,00", "Voltar" };
		Object[] fem = { "Camisa Social Dudalina - R$170,00", "Calça Jeans Miss Masi - R$ 99,90",
				"Bermuda Dijean - R$ 74,40", "Voltar" };
		Object[] entra1 = { "Sim", "Não" };
		Object[] sexo = { "Masculino", "Feminino" };
		Object[] pag = { "Prazo", "A vista" };
		DecimalFormat f = new DecimalFormat("0.00");
		f.setRoundingMode(RoundingMode.UP);
		String nome = "", manome = "", menome = "";
		int idade, hom = 0, mul = 0, qntd, i17 = 0, i30 = 0, i50 = 0, imaior = 0, tvaud = 0, tvinfo = 0, tvtele = 0,
				tvvest = 0;
		double taud = 0, tinfo = 0, ttele = 0, tvest = 0, matotal = 0, metotal = 999999999;
		boolean entra = false, novo = true, voltar = false, voltarsub = true, comprar = true, nomeok = false;

		if ((JOptionPane.showOptionDialog(null, "Você deseja realizar alguma compra?", "Comprar", // REALIZAR COMPRA?
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, entra1, entra1[0])) == 1)
			JOptionPane.showMessageDialog(null, "Não foi realizada nenhuma venda");
		else
			entra = true;

		while (entra == true) { // VERIFICA SE VOLTA AO LOOP
			try {
				if (novo == true) {
					if (nomeok == false) {
						nome = JOptionPane.showInputDialog("Informe seu nome");
						if ((nome == null) || (nome.equals(""))) {
							JOptionPane.showMessageDialog(null, "Nenhum nome inserido");
							continue;
						}
					}
					nomeok = true;
					idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
					while ((idade < 10) || (idade > 120)) {
						idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade válida"));
					}
					if ((JOptionPane.showOptionDialog(null, "Informe seu sexo", "Sexo",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, sexo, sexo[0])) == 0) {
						hom++;
						novo = false;
						nomeok = false;
					} else {
						mul++;
						novo = false;
						nomeok = false;
					}
					if (idade < 18)
						i17++;
					else if (idade < 31)
						i30++;
					else if (idade < 51)
						i50++;
					else
						imaior++;
				}
				comprar = true;
				voltar = true;
				while (comprar == true) {
					while (voltar == true) {
						voltarsub = true;
						switch (JOptionPane.showOptionDialog(null, "Escolha um departamento para comprar", // ESCOLHA
																											// DPT.
								"Departamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
								depart, depart[0])) {
						case 0: // Audio/TV
							while (voltarsub == true) {
								switch (JOptionPane.showOptionDialog(null, "Escolha um subdepartamento para comprar", // ESCOLHA
																														// SUB
																														// DPT.
										"Subdepartamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
										null, aud, aud[0])) {
								case 0: // TV
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, tv, tv[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										taud += (qntd * 4999.99);
										tvaud += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										taud += (qntd * 7499);
										tvaud += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										taud += (qntd * 1710);
										tvaud += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}
								case 1: // AP. SOM
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, apsom, apsom[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										taud += (qntd * 599.99);
										tvaud += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										taud += (qntd * 512);
										tvaud += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										taud += (qntd * 499.99);
										tvaud += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}

								case 2:
									voltarsub = false;
									break;
								}
							}
						case 1: // INFORMATICA
							while (voltarsub == true) {
								switch (JOptionPane.showOptionDialog(null, "Escolha um subdepartamento para comprar", // ESCOLHA
																														// SUB
																														// DPT.
										"Subdepartamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
										null, info, info[0])) {
								case 0: // HARDWARE
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, hard, hard[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tinfo += (qntd * 2000);
										tvinfo += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tinfo += (qntd * 500);
										tvinfo += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tinfo += (qntd * 50.9);
										tvinfo += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}
								case 1: // SOFTWARE
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, soft, soft[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tinfo += (qntd * 500);
										tvinfo += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tinfo += (qntd * 399.99);
										tvinfo += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tinfo += (qntd * 899.5);
										tvinfo += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}
								case 2:
									voltarsub = false;
									break;
								}
							}
						case 2: // TELEFONIA
							while (voltarsub == true) {
								switch (JOptionPane.showOptionDialog(null, "Escolha um subdepartamento para comprar", // ESCOLHA
																														// SUB
																														// DPT.
										"Subdepartamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
										null, tele, tele[0])) {
								case 0: // SMARTPHONE
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, smart, smart[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										ttele += (qntd * 3000);
										tvtele += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										ttele += (qntd * 5000);
										tvtele += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										ttele += (qntd * 800);
										tvtele += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}
								case 1: // TABLET
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, tablet, tablet[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										ttele += (qntd * 500);
										tvtele += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										ttele += (qntd * 450);
										tvtele += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										ttele += (qntd * 520);
										tvtele += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}
								case 2:
									voltarsub = false;
									break;
								}
							}
						case 3: // VESTUARIO
							while (voltarsub == true) {
								switch (JOptionPane.showOptionDialog(null, "Escolha um subdepartamento para comprar", // ESCOLHA
																														// SUB
																														// DPT.
										"Subdepartamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
										null, vest, vest[0])) {
								case 0: // MASCULINO
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, masc, masc[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tvest += (qntd * 200);
										tvvest += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tvest += (qntd * 230);
										tvvest += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tvest += (qntd * 130);
										tvvest += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}
								case 1: // FEMININO
									switch (JOptionPane.showOptionDialog(null, "Escolha um produto para comprar",
											"Produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
											null, fem, fem[0])) {
									case 0:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tvest += (qntd * 170);
										tvvest += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 1:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tvest += (qntd * 99.9);
										tvvest += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 2:
										qntd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
										tvest += (qntd * 74.4);
										tvvest += qntd;
										voltarsub = false;
										voltar = false;
										continue;
									case 3:
										continue;
									}
								case 2:
									voltarsub = false;
									break;
								}
							}
						}
						if (voltar == false) {
							if (JOptionPane.showOptionDialog(null, "Deseja realizar mais alguma compra", "Continuar", // MAIS
																														// COMPRAS?
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, entra1,
									entra1[0]) == 1) {
								if (JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento", "Pagamento", // MET.PAGAMENTO
										JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, pag,
										pag[0]) == 0) {
									JOptionPane.showMessageDialog(null,
											"Total a ser pago: R$" + f.format((taud + tinfo + ttele + tvest)));
									boolean t = true;
									voltar = false;
									comprar = false;
									while (t == true) {
										if (Double.parseDouble(JOptionPane.showInputDialog(
												"Informe o valor que será pago")) < (taud + tinfo + ttele + tvest))
											JOptionPane.showMessageDialog(null,
													"O valor inserido é menor que o total a ser pago de R$"
															+ f.format((taud + tinfo + ttele + tvest)));
										else
											t = false;
									}
									if ((taud + tinfo + ttele + tvest) > matotal) {
										matotal = (taud + tinfo + ttele + tvest);
										manome = nome;
									}
									if ((taud + tinfo + ttele + tvest) < metotal) {
										metotal = (taud + tinfo + ttele + tvest);
										menome = nome;
									}
									continue;
								} else { // A vista
									voltar = false;
									comprar = false;
									JOptionPane.showMessageDialog(null, "Total a ser pago: R$" + f
											.format(((taud * 0.95) + (tinfo * 0.9) + (ttele * 0.85) + (tvest * 0.8))));
									boolean t = true;
									while (t == true) {
										if (Double.parseDouble(JOptionPane
												.showInputDialog("Informe o valor que será pago")) < ((taud * 0.95)
														+ (tinfo * 0.9) + (ttele * 0.85) + (tvest * 0.8)))
											JOptionPane.showMessageDialog(null,
													"O valor inserido é menor que o total a ser pago de R$"
															+ f.format(((taud * 0.95) + (tinfo * 0.9) + (ttele * 0.85)
																	+ (tvest * 0.8))));
										else
											t = false;
									}
									if (metotal == 0)
										metotal = (taud + tinfo + ttele + tvest);
									if ((taud + tinfo + ttele + tvest) > matotal) {
										matotal = (taud + tinfo + ttele + tvest);
										manome = nome;
									}
									if ((taud + tinfo + ttele + tvest) < metotal) {
										metotal = (taud + tinfo + ttele + tvest);
										menome = nome;
									}
									continue;
								}
							} else
								voltar = true;
							continue;
						}
					}
				} // TERMINA POSSIBILIDA DE COMPRA

				if ((JOptionPane.showOptionDialog(null, "Mais algum cliente deseja realizar alguma compra?",
						"Continuar", // MAIS CLIENTES?
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, entra1, entra1[0]) == 1)) {
					entra = false;
					break;
				} else {
					taud = 0;
					tinfo = 0;
					ttele = 0;
					tvest = 0;
					novo = true;
					voltar = true;
				}
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Um erro ocorreu " + erro.getMessage(), "Erro",
						JOptionPane.PLAIN_MESSAGE);
			}
		}
		if ((hom + mul) == 1) // MOSTRA INFORMAÇÕES FINAIS
			JOptionPane.showMessageDialog(null,
					"Quantidade de clientes: " + (hom + mul) + "\nQuantidade de homens: " + hom + " "
							+ (hom * 100 / (hom + mul)) + "%\nQuantidade de mulheres: " + mul + " "
							+ (mul * 100 / (hom + mul)) + "%\nClientes com até 17 anos: " + i17
							+ "\nCilentes entre 18 e 30 anos: " + i30 + "\nClientes enntre 31 e 50 anos: " + i50
							+ "\nClientes com mais de 50 anos: " + imaior + "\nProdutos vendidos Áudio/Vídeo: " + tvaud
							+ "\nProdutos vendidos Informática: " + tvinfo + "\nProdutos vendidos Telefonia: " + tvtele
							+ "\nProdutos vendidos Vestuário: " + tvvest);
		else if ((hom + mul) > 1)
			JOptionPane.showMessageDialog(null, "Quantidade de clientes: " + (hom + mul) + "\nQuantidade de homens: "
					+ hom + " " + (hom * 100 / (hom + mul)) + "%\nQuantidade de mulheres: " + mul + " "
					+ (mul * 100 / (hom + mul)) + "%\nClientes com até 17 anos: " + i17
					+ "\nCilentes entre 18 e 30 anos: " + i30 + "\nClientes enntre 31 e 50 anos: " + i50
					+ "\nClientes com mais de 50 anos: " + imaior + "\nProdutos vendidos Áudio/Vídeo: " + tvaud
					+ "\nProdutos vendidos Informática: " + tvinfo + "\nProdutos vendidos Telefonia: " + tvtele
					+ "\nProdutos vendidos Vestuário: " + tvvest + "\nCliente que mais gastou: " + manome + " R$"
					+ f.format(matotal) + "\nCliente que menos gastou: " + menome + " R$" + f.format(metotal));
	}

}
