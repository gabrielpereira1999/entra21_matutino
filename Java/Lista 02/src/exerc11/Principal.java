package exerc11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome,nomeS="";
		short horas,horasx,horasxx,hom=0,mul=0,idade,faltas,filhos,associado,nassociado=0,cargo,i26=0,i40=0,i50=0,imaior=0,opcao1=0,
				c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,sexo1;
		Object sexo[] = {"Masculino","Feminino"};
		Object cargo1[] = {"Desenv. Java Júnior","Desenv. Java Pleno","Desenv. Java Sênior","Adm. de Banco de Dados","Analista Júnior",
				"Analista Pleno","Analista Sênior","Arquiteto de Software"
				,"Gerente de Projetos"};
		Object assoc[] = {"Não","Sim"};
		Object opcao[] = {"Cadastrar","Sair"};
		double sliq=0,sbru,shor,msliq=0,pfaltas;
		
		opcao1 = (short)JOptionPane.showOptionDialog(null, "Cadastrar?", "Cadastros", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, opcao, opcao[0]);
		
		while(opcao1 !=1) {
			try {
				nome = JOptionPane.showInputDialog("Nome do funcionário:");
				if( (nome==null) || (nome.equals("")) ) {
					JOptionPane.showMessageDialog(null, "Nenhum nome inserido");
					continue;
				}
				cargo = (short)JOptionPane.showOptionDialog(null, "Selecione o cargo", "Cargo", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, cargo1, cargo1[0]);
				if(cargo==-1) {
					JOptionPane.showMessageDialog(null, "Nenhum cargo inserido");
					continue;
				}
				horas = Short.parseShort(JOptionPane.showInputDialog("Número de horas normais trabalhadas:"));
				horasx = Short.parseShort(JOptionPane.showInputDialog("Número de horas extra 50% trabalhadas:"));
				horasxx = Short.parseShort(JOptionPane.showInputDialog("Número de horas extra 100% trabalhadas:"));
				sexo1 = (short)JOptionPane.showOptionDialog(null, "Selecione o sexo", "Sexo", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, sexo, sexo[0]);
				if ( sexo1 == 0 ) {
					hom++;
					idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade"));
					if(idade < 18) {
						JOptionPane.showMessageDialog(null,"Idade inválida","Erro",JOptionPane.PLAIN_MESSAGE);
						hom--;
					}
				}else {
					mul++;
					idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade"));
					if(idade < 18) {
						JOptionPane.showMessageDialog(null,"Idade inválida","Erro",JOptionPane.PLAIN_MESSAGE);
						mul--;
						continue;
					}
				}
				if(idade<27) 
					i26++;
				else if(idade<41)
					i40++;
				else if(idade<51)
					i50++;
				else
					imaior++;
				faltas = Short.parseShort(JOptionPane.showInputDialog("Número de faltas"));
				filhos = Short.parseShort(JOptionPane.showInputDialog("Número de filhos"));
				associado = (short)JOptionPane.showOptionDialog(null, "É associado(a)?", "Associado", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, assoc, assoc[0]);
				if(associado == 1)
					nassociado++;
				pfaltas = (faltas==0) ? 200 : 0;
				switch(cargo) {
				case 0:
					shor = (1450/horas);
					sbru = 1450 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.05)-(associado*110);
					c0++;
					break;
				case 1:
					shor = (2220/horas);
					sbru = 2220 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.07)-(associado*110);
					c1++;
					break;
				case 2:
					shor = (3300/horas);
					sbru = 1450 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.07)-(associado*110);
					c2++;
					break;
				case 3:
					shor = (3560/horas);
					sbru = 3560 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.08)-(associado*110);
					c3++;
					break;
				case 4:
					shor = (2800/horas);
					sbru = 2800 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.07)-(associado*110);
					c4++;
					break;
				case 5:
					shor = (3400/horas);
					sbru = 3400 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.07)-(associado*110);
					c5++;
					break;
				case 6:
					shor = (4500/horas);
					sbru = 4500 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.08)-(associado*110);
					c6++;
					break;
				case 7:
					shor = (5280/horas);
					sbru = 5280 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.08)-(associado*110);
					c7++;
					break;
				case 8:
					shor = (6000/horas);
					sbru = 6000 + (shor*1.5*horasx)+(shor*2*horasxx);
					sliq = sbru + pfaltas +(filhos*50)-(sbru*0.06)-(sbru*0.1)-(associado*110);
					c8++;
					break;
				}
				if (sliq > msliq) {
					msliq = sliq;
					nomeS = nome;
				}
				JOptionPane.showMessageDialog(null, "Salário líquido: "+sliq);
				opcao1 = (short)JOptionPane.showOptionDialog(null, "Cadastrar?", "Cadastros", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, opcao, opcao[0]);
				
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro "+erro.getMessage(),"Erro",JOptionPane.PLAIN_MESSAGE);
			}
		}
		if((hom+mul)<=0)
			JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado");
		else
			JOptionPane.showMessageDialog(null, "Número de funcionários cadastrados: "+(hom+mul)+"\nHomens: "+hom+" "+((hom*100)/(hom+mul))+
					"%\nMulheres: "+mul+" "+((mul*100)/(hom+mul))+"%\nFuncionários entre 18 e 26 anos: "+i26+"\nFuncionários entre 27 e "
							+ "40 anos: "+i40+"\nFuncionários entre 41 e 50 anos: "+i50+"\nFuncionários com mais de 50 anos: "+imaior+							"\nDesenvolvedores Java Júnior: "+c0+" "+((c0*100)/(hom+mul))
							+"%\nDesenvolvedores Java Pleno: "+c1+" "+((c1*100)/(hom+mul))+"%\nDesenvolvedores Jana Sênior: "+c2+" "+((c2*100)/(hom+mul))+
							"%\nAdministradores de Banco de Dados: "+c3+" "+((c3*100)/(hom+mul))+"%\nAnalistas Júnior: "+c4+" "+((c4*100)/(hom+mul))+
							"%\nAnalistas Pleno: "+c5+" "+((c5*100)/(hom+mul))+"%\nAnalistas Sênior: "+c6+" "+((c6*100)/(hom+mul))+
							"%\nArquitetos de Software: "+c7+" "+((c7*100)/(hom+mul))+"%\nGerentes de Projetos :"+c8+" "+((c8*100)/(hom+mul))+"%"
							+ "\nFuncionário com maior salário líquido: "+nomeS+" R$"+msliq+"\nAssociados do clube de filidados: "+nassociado);
	}
	

}
