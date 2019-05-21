package exerc01;

import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {

		LocalDateTime tempo = LocalDateTime.now();
		int dia = tempo.getDayOfMonth();
		int mes = tempo.getMonthValue();
		int ano = tempo.getYear();
		int min = tempo.getMinute();
		int hora = tempo.getHour();

		System.out.println(dia + "/" + mes + "/" + ano + " - " + hora + ":" + min);
		String Dia = "", Mes = "", Ano = "", aux;

		switch (dia) {
		case 1:
			Dia = "Um";
			break;
		case 2:
			Dia = "Dois";
			break;
		case 3:
			Dia = "Três";
			break;
		case 4:
			Dia = "Quatro";
			break;
		case 5:
			Dia = "Cinco";
			break;
		case 6:
			Dia = "Seis";
			break;
		case 7:
			Dia = "Sete";
			break;
		case 8:
			Dia = "Oito";
			break;
		case 9:
			Dia = "Nove";
			break;
		case 10:
			Dia = "Dez";
			break;
		case 11:
			Dia = "Onze";
			break;
		case 12:
			Dia = "Doze";
			break;
		case 13:
			Dia = "Treze";
			break;
		case 14:
			Dia = "Quatorze";
			break;
		case 15:
			Dia = "Quinze";
			break;
		case 16:
			Dia = "Dezesseis";
			break;
		case 17:
			Dia = "Dezessete";
			break;
		case 18:
			Dia = "Dezoito";
			break;
		case 19:
			Dia = "Dezenove";
			break;
		case 20:
			Dia = "Vinte";
			break;
		case 21:
			Dia = "Vinte e um";
			break;
		case 22:
			Dia = "Vinte e dois";
			break;
		case 23:
			Dia = "Vinte e três";
			break;
		case 24:
			Dia = "Vinte e quatro";
			break;
		case 25:
			Dia = "Vinte e cinco";
			break;
		case 26:
			Dia = "Vinte e seis";
			break;
		case 27:
			Dia = "Vinte e sete";
			break;
		case 28:
			Dia = "Vinte e oito";
			break;
		case 29:
			Dia = "Vinte e nove";
			break;
		case 30:
			Dia = "Trinta";
			break;
		case 31:
			Dia = "Trinta e um";
			break;
		}

		switch (mes) {
		case 1:
			Mes = "Janeiro";
			break;
		case 2:
			Mes = "Fevereiro";
			break;
		case 3:
			Mes = "Março";
			break;
		case 4:
			Mes = "Abril";
			break;
		case 5:
			Mes = "Maio";
			break;
		case 6:
			Mes = "Junho";
			break;
		case 7:
			Mes = "Julho";
			break;
		case 8:
			Mes = "Agosto";
			break;
		case 9:
			Mes = "Setembro";
			break;
		case 10:
			Mes = "Outubro";
			break;
		case 11:
			Mes = "Novembro";
			break;
		case 12:
			Mes = "Dezembro";
			break;
		}
		Ano = "Dois mil";
		aux = "" + ano;

		if (aux.charAt(2) == '0') {
			if (aux.charAt(3) == '0') {

			} else if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e três";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '1') {
			if (aux.charAt(3) == '1') {
				Ano += " e onze";
			} else if (aux.charAt(3) == '2') {
				Ano += " e doze";
			} else if (aux.charAt(3) == '3') {
				Ano += " e treze";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatorze";
			} else if (aux.charAt(3) == '5') {
				Ano += " e quinze";
			} else if (aux.charAt(3) == '6') {
				Ano += " e dezesseis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e dezessete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e dezoito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e dezenove";
			}
		} else if (aux.charAt(2) == '2') {
			Ano += " e vinte";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '3') {
			Ano += " e trinta";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '4') {
			Ano += " e quarenta";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '5') {
			Ano += " e cinquenta";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '6') {
			Ano += " e sessenta";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '7') {
			Ano += " e setenta";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '8') {
			Ano += " e oitenta";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		} else if (aux.charAt(2) == '9') {
			Ano += " e noventa";
			if (aux.charAt(3) == '1') {
				Ano += " e um";
			} else if (aux.charAt(3) == '2') {
				Ano += " e dois";
			} else if (aux.charAt(3) == '3') {
				Ano += " e trs";
			} else if (aux.charAt(3) == '4') {
				Ano += " e quatro";
			} else if (aux.charAt(3) == '5') {
				Ano += " e cinco";
			} else if (aux.charAt(3) == '6') {
				Ano += " e seis";
			} else if (aux.charAt(3) == '7') {
				Ano += " e sete";
			} else if (aux.charAt(3) == '8') {
				Ano += " e oito";
			} else if (aux.charAt(3) == '9') {
				Ano += " e nove";
			}
		}
		aux = "" + hora;
		String Hora = "", aux1 = "" + min;

		if (aux.length() == 1) {
			if (aux.charAt(0) == '0') {
				Hora = "Meia noite";
			} else if (aux.charAt(0) == '1') {
				Hora = "Uma hora";
			} else if (aux.charAt(0) == '2') {
				Hora = "Duas horas";
			} else if (aux.charAt(0) == '3') {
				Hora = "Três horas";
			} else if (aux.charAt(0) == '4') {
				Hora = "Quatro horas";
			} else if (aux.charAt(0) == '5') {
				Hora = "Cinco horas";
			} else if (aux.charAt(0) == '6') {
				Hora = "Seis horas";
			} else if (aux.charAt(0) == '7') {
				Hora = "Sete horas";
			} else if (aux.charAt(0) == '8') {
				Hora = "Oito horas";
			} else if (aux.charAt(0) == '9') {
				Hora = "Nove horas";
			}
		}else {
			if ((aux.charAt(0) == '1') && (aux.charAt(1) == '0') ) {
				Hora = "Dez horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '1')) {
				Hora = "Onze horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '2')) {
				Hora = "Doze horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '3')) {
				Hora = "Treze horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '4')) {
				Hora = "Quatorze horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '5')) {
				Hora = "Quinze horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '6')) {
				Hora = "Dezesseis horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '7')) {
				Hora = "Dezessete horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '8')) {
				Hora = "Dezoito horas";
			} else if ((aux.charAt(0) == '1') && (aux.charAt(1) == '9')) {
				Hora = "Dezenove horas";
			}else if ((aux.charAt(0) == '2') && (aux.charAt(1) == '0')) {
				Hora = "Vinte horas";
			}else if ((aux.charAt(0) == '2') && (aux.charAt(1) == '1')) {
				Hora = "Vinte e uma horas";
			}else if ((aux.charAt(0) == '2') && (aux.charAt(1) == '2')) {
				Hora = "Vinte e duas horas";
			}else if ((aux.charAt(0) == '2') && (aux.charAt(1) == '3')) {
				Hora = "Vinte e três horas";
			}
		}

		if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '1')) {
			Hora+=" e um minuto";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '2')) {
			Hora += " e dois minutos";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '3')) {
			Hora += " e três minutos";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '4')) {
			Hora += " e quatro minutos";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '5')) {
			Hora += " e cinco minutos";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '6')) {
			Hora += " e seis minutos";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '7')) {
			Hora += " e sete minutos";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '8')) {
			Hora += " e oito minutos";
		} else if ((aux1.charAt(0) == '0') && (aux1.charAt(1) == '9')) {
			Hora += " e nove minutos";
		} else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '0')) {
			Hora += " e dez minutos";
		} else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '1')) {
			Hora += " e onze minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '2')) {
			Hora += " e doze minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '3')) {
			Hora += " e treze minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '4')) {
			Hora += " e quatorze minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '5')) {
			Hora += " e quinze minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '6')) {
			Hora += " e dezesseis minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '7')) {
			Hora += " e dezessete minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '8')) {
			Hora += " e dezoito minutos";
		}else if ((aux1.charAt(0) == '1') && (aux1.charAt(1) == '9')) {
			Hora += " e dezenove minutos";
		}else if (aux1.charAt(0) == '2') {
			Hora += " e vinte";
			if(aux1.charAt(1) == '0') {
				Hora += " minutos";
			}else if(aux1.charAt(1) == '1') {
				Hora += " e um minutos";
			}else if(aux1.charAt(1) == '2') {
				Hora += " e dois minutos";
			}else if(aux1.charAt(1) == '3') {
				Hora += " e três minutos";
			}else if(aux1.charAt(1) == '4') {
				Hora += " e quatro minutos";
			}else if(aux1.charAt(1) == '5') {
				Hora += " e cinco minutos";
			}else if(aux1.charAt(1) == '6') {
				Hora += " e seis minutos";
			}else if(aux1.charAt(1) == '7') {
				Hora += " e sete minutos";
			}else if(aux1.charAt(1) == '8') {
				Hora += " e oito minutos";
			}else if(aux1.charAt(1) == '9') {
				Hora += " e nove minutos";
			}
		}else if (aux1.charAt(0) == '3') {
			Hora += " e trinta";
			if(aux1.charAt(1) == '0') {
				Hora += " minutos";
			}else if(aux1.charAt(1) == '1') {
				Hora += " e um minutos";
			}else if(aux1.charAt(1) == '2') {
				Hora += " e dois minutos";
			}else if(aux1.charAt(1) == '3') {
				Hora += " e três minutos";
			}else if(aux1.charAt(1) == '4') {
				Hora += " e quatro minutos";
			}else if(aux1.charAt(1) == '5') {
				Hora += " e cinco minutos";
			}else if(aux1.charAt(1) == '6') {
				Hora += " e seis minutos";
			}else if(aux1.charAt(1) == '7') {
				Hora += " e sete minutos";
			}else if(aux1.charAt(1) == '8') {
				Hora += " e oito minutos";
			}else if(aux1.charAt(1) == '9') {
				Hora += " e nove minutos";
			}
		}else if (aux1.charAt(0) == '4') {
			Hora += " e quarenta";
			if(aux1.charAt(1) == '0') {
				Hora += " minutos";
			}else if(aux1.charAt(1) == '1') {
				Hora += " e um minutos";
			}else if(aux1.charAt(1) == '2') {
				Hora += " e dois minutos";
			}else if(aux1.charAt(1) == '3') {
				Hora += " e três minutos";
			}else if(aux1.charAt(1) == '4') {
				Hora += " e quatro minutos";
			}else if(aux1.charAt(1) == '5') {
				Hora += " e cinco minutos";
			}else if(aux1.charAt(1) == '6') {
				Hora += " e seis minutos";
			}else if(aux1.charAt(1) == '7') {
				Hora += " e sete minutos";
			}else if(aux1.charAt(1) == '8') {
				Hora += " e oito minutos";
			}else if(aux1.charAt(1) == '9') {
				Hora += " e nove minutos";
			}
		}else if (aux1.charAt(0) == '5') {
			Hora += " e cinquenta";
			if(aux1.charAt(1) == '0') {
				Hora += " minutos";
			}else if(aux1.charAt(1) == '1') {
				Hora += " e um minutos";
			}else if(aux1.charAt(1) == '2') {
				Hora += " e dois minutos";
			}else if(aux1.charAt(1) == '3') {
				Hora += " e três minutos";
			}else if(aux1.charAt(1) == '4') {
				Hora += " e quatro minutos";
			}else if(aux1.charAt(1) == '5') {
				Hora += " e cinco minutos";
			}else if(aux1.charAt(1) == '6') {
				Hora += " e seis minutos";
			}else if(aux1.charAt(1) == '7') {
				Hora += " e sete minutos";
			}else if(aux1.charAt(1) == '8') {
				Hora += " e oito minutos";
			}else if(aux1.charAt(1) == '9') {
				Hora += " e nove minutos";
			}
		}

		System.out.println("Hoje é dia " + Dia + " de " + Mes + " de " + Ano);
		System.out.println("A hora atual é "+Hora);
	}

}
