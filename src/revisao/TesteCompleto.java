package revisao;

import java.util.Scanner;

public class TesteCompleto {

	public static void main(String[] args) {

		Horario h = new Horario();
//		System.out.println(h);
		Scanner entrada = new Scanner(System.in);
		int opcao, valor;
		do {
			menu();
			System.out.println("Horário atual: " + h);
			System.out.print("Digite uma opção: ");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
//				limparTela();
				System.out.println("Horário anterior: " + h);
				h.incrementaSegundo();
				System.out.println("Horário incrementado de 1 segundo: " + h);
				break;
			case 2:
//				limparTela();
				System.out
						.print("Digite a quantidade de segundos a incrementar: ");
				valor = entrada.nextInt();
				System.out.println("\nHorário anterior: " + h);
				h.incrementaSegundo(valor);
				System.out.println("Horário incrementado de " + valor
						+ " segundos: " + h);
				break;
			case 3:
//				limparTela();
				System.out.println("Horário anterior: " + h);
				h.decrementaSegundo();
				System.out.println("Horário decrementado de 1 segundo: " + h);
				break;
			case 4:
//				limparTela();
				System.out
						.print("Digite a quantidade de segundos a decrementar: ");
				valor = entrada.nextInt();
				System.out.println("\nHorário anterior: " + h);
				h.decrementaSegundo(valor);
				System.out.println("Horário incrementado de " + valor
						+ " segundos: " + h);
				break;
			case 5:
//				limparTela();
				System.out.println("Horário anterior: " + h);
				h.incrementaMinuto();
				System.out.println("Horário incrementado de 1 minuto: " + h);
				break;
			case 6:
//				limparTela();
				System.out
						.print("Digite a quantidade de minutos a incrementar: ");
				valor = entrada.nextInt();
				System.out.println("\nHorário anterior: " + h);
				h.incrementaMinuto(valor);
				System.out.println("Horário incrementado de " + valor
						+ " minutos: " + h);
				break;
			case 7:
//				limparTela();
				System.out.println("Horário anterior: " + h);
				h.decrementaMinuto();
				System.out.println("Horário decrementado de 1 minuto: " + h);
				break;
			case 8:
//				limparTela();
				System.out
						.print("Digite a quantidade de minutos a decrementar: ");
				valor = entrada.nextInt();
				System.out.println("\nHorário anterior: " + h);
				h.decrementaMinuto(valor);
				System.out.println("Horário incrementado de " + valor
						+ " minutos: " + h);
				break;
			case 9:
//				limparTela();
				System.out.println("Horário anterior: " + h);
				h.incrementaHora();
				System.out.println("Horário incrementado de 1 hora: " + h);
				break;
			case 10:
//				limparTela();
				System.out
						.print("Digite a quantidade de horas a incrementar: ");
				valor = entrada.nextInt();
				System.out.println("\nHorário anterior: " + h);
				h.incrementaHora(valor);
				System.out.println("Horário incrementado de " + valor
						+ " horas: " + h);
				break;
			case 11:
//				limparTela();
				System.out.println("Horário anterior: " + h);
				h.decrementaHora();
				System.out.println("Horário decrementado de 1 hora: " + h);
				break;
			case 12:
//				limparTela();
				System.out
						.print("Digite a quantidade de horas a decrementar: ");
				valor = entrada.nextInt();
				System.out.println("\nHorário anterior: " + h);
				h.decrementaHora(valor);
				System.out.println("Horário incrementada de " + valor
						+ " horas: " + h);
				break;
			case 0:
				limparTela();
				System.out.println("\nprograma encerrado");
				break;
			default:
				System.out.println("\nOpção inválida.");
				break;
			}

		} while (opcao != 0);
	}

	public static void menu() {
		// limparTela();
		System.out
				.println("\n=============== Menu de Opções ===============");
		System.out.println("===============================================================================");
		System.out.println("1  - Incrementar 1 segundo");
		System.out.println("2  - Incrementar n segundo");
		System.out.println("3  - Decrementar 1 segundo");
		System.out.println("4  - Decrementar n segundo");
		System.out.println("===============================================================================");
		System.out.println("5  - Incrementar 1 minuto");
		System.out.println("6  - Incrementar n minuto");
		System.out.println("7  - Decrementar 1 minuto");
		System.out.println("8  - Decrementar n minuto");
		System.out.println("===============================================================================");
		System.out.println("9  - Incrementar 1 hora");
		System.out.println("10 - Incrementar n hora");
		System.out.println("11 - Decrementar 1 hora");
		System.out.println("12 - Decrementar n hora");
		System.out.println("===============================================================================");
		System.out.println("0  - Sair");
		System.out.println("===============================================================================");
	}

	public static void limparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	}

}
