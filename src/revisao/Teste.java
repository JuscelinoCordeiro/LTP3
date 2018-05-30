package revisao;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Meses.JANEIRO.toString());
		// System.out.println(Meses.JANEIRO);
		// System.out.println(Meses.JANEIRO.ordinal()+1);

		// Horario h = new Horario();
		// System.out.println(h);
		Data d = new Data();
		Scanner entrada = new Scanner(System.in);
		int opcao, valor, dia, mes, ano;
		do {
			System.out.print("Digite o ano: ");
			ano = entrada.nextInt();
			if (ano < 0) {
				System.out.println("Ano nao pode ser negativo.");
			} else {
				d.setAno(ano);
			}
			System.out.print("Digite o mes: ");
			mes = entrada.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("Mês inválido.");
			} else {
				d.setMes(mes);
			}
			System.out.print("Digite o dia: ");
			dia = entrada.nextInt();
			if (dia < 1 || dia > 31) {
				System.out.println("Dia inválido.");
			} else if (dia == 31
					&& (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
				System.out.println("Este mês não tem 31 dias.");
			} else if (dia == 29 && (ano % 4 != 0) && mes == 2) {
				System.out
						.println("O mes de fevereiro nao tem 29 dias no ano informado.");
			} else {
				d.setDia(dia);
			}

			// menu();

			System.out.println(d);
			//teste ano
			d.incrementaAno();
			System.out.println("incremento ano " + d.getAno());
			d.incrementaAno(3);
			System.out.println("incremento   ano " + d.getAno());
			d.decrementaAno();
			System.out.println("decremento   ano " + d.getAno());
			d.decrementaAno(4);
			System.out.println("decremento   ano " + d.getAno());
			//teste mes
			d.incrementaMes();
			System.out.println("incremento mes " + d.getMes());
			d.incrementaMes(5);
			System.out.println("incremento   mes " + d.getMes());
			d.decrementaMes();
			System.out.println("decremento   mes " + d.getMes());
			d.decrementaMes(2);
			System.out.println("decremento   mes " + d.getMes());
			
			
			System.out.print("Digite uma opção: ");
			opcao = entrada.nextInt();
			// switch (opcao) {
			// case 1:
			// // limparTela();
			// // System.out.println("Horário anterior: " + h);
			// // h.incrementaSegundo();
			// // System.out.println("Horário incrementado de 1 segundo: " + h);
			// break;
			//
			// case 0:
			// // limparTela();
			// System.out.println("\nprograma encerrado");
			// break;
			// default:
			// System.out.println("\nOpção inválida.");
			// break;
			// }

		} while (opcao != 0);
	}

	public static void menu() {
		// limparTela();
		System.out.println("\n=============== Menu de Opções ===============");
		System.out
				.println("===============================================================================");
		System.out.println("1  - Incrementar 1 segundo");
		// System.out.println("2  - Incrementar n segundo");
		// System.out.println("3  - Decrementar 1 segundo");
		// System.out.println("4  - Decrementar n segundo");
		// System.out.println("===============================================================================");
		// System.out.println("5  - Incrementar 1 minuto");
		// System.out.println("6  - Incrementar n minuto");
		// System.out.println("7  - Decrementar 1 minuto");
		// System.out.println("8  - Decrementar n minuto");
		// System.out.println("===============================================================================");
		// System.out.println("9  - Incrementar 1 hora");
		// System.out.println("10 - Incrementar n hora");
		// System.out.println("11 - Decrementar 1 hora");
		// System.out.println("12 - Decrementar n hora");
		// System.out.println("===============================================================================");
		System.out.println("0  - Sair");
		System.out
				.println("===============================================================================");
	}

}
