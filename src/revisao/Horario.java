package revisao;

import java.util.regex.Matcher;

public class Horario {
	private int hora; // dominio 00-23
	private int minutos; // dominio 00-59
	private int segundos; // dominio 00-59

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else if (hora > 23) {
			incrementaHora(hora);
		} else {
			decrementaHora(hora);
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		} else if (minutos > 59) {
			incrementaSegundo(minutos);
		} else {
			decrementaSegundo(minutos);
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		} else if (segundos > 59) {
			incrementaSegundo(segundos);
		} else {
			decrementaSegundo(segundos);
		}
	}

	public void incrementaSegundo() {
		if (segundos < 59) {
			this.segundos += 1;
		} else {
			this.segundos = 0;
			incrementaMinuto();
		}
	}

	public void incrementaSegundo(int valor) {
		int minutos = (valor / 60); // parte minuto
		int segundos = (valor % 60); // parte segundo
		if (minutos > 0) {
			incrementaMinuto(minutos);
		}
		if (segundos > 0) {
			this.segundos += segundos;
			if (this.segundos > 59) {
				int segundosExtras = (this.segundos % 60);
				this.minutos += 1;
				this.segundos = segundosExtras;
			}
		}
	}

	public void decrementaSegundo() {
		if (segundos > 0) {
			this.segundos -= 1;
		} else {
			this.segundos = 59;
			decrementaMinuto();
		}
	}

	public void decrementaSegundo(int valor) {
		int minutos = (valor / 60); // parte hora
		int segundos = (valor % 60); // parte minuto
		if (minutos > 0) {
			decrementaMinuto(minutos);
		}
		if (segundos >= 0) {
			int diferenca = (this.segundos - segundos);
			if (diferenca >= 0) {
				this.segundos -= segundos;
			} else {
				minutos += 1;
				this.segundos = 60 - Math.abs(this.segundos - segundos);
			}
		}
	}

	public void incrementaMinuto() {
		if (minutos < 59) {
			this.minutos += 1;
		} else {
			this.minutos = 0;
			incrementaHora();
		}
	}

	public void incrementaMinuto(int valor) {
		int horas = (valor / 60); // parte hora
		int minutos = (valor % 60); // parte minuto
		if (minutos > 0) {
			this.minutos += minutos;
			if (this.minutos > 59) {
				int minutosExtras = (this.minutos % 60);
				this.hora += 1;
				this.minutos = minutosExtras;
			}
		}
		if (horas > 0) {
			incrementaHora(horas);
		}
	}

	public void decrementaMinuto() {
		if (minutos > 0) {
			this.minutos -= 1;
		} else {
			this.minutos = 59;
			decrementaHora();
		}
	}

	public void decrementaMinuto(int valor) {
		int horas = (valor / 60); // parte hora
		int minutos = (valor % 60); // parte minuto
		if (minutos > 0) {
			int minutoAtual = this.minutos;
			int diferenca = (minutoAtual - minutos);
			System.out.println("Diferença: " + diferenca);
			if (diferenca >= 0) {
				this.minutos -= minutos;
			} else {
				horas += 1;
				this.minutos = 60 - Math.abs(this.minutos - minutos);
			}
		}
		if (horas > 0) {
			decrementaHora(horas);
		}
		// System.out.println("Hora: " + horas);
		// System.out.println("Minutos: " + minutos);
	}

	public void incrementaHora() {
		if (hora < 23) {
			this.hora += 1;
		} else {
			this.hora = 0;
		}
	}

	public void incrementaHora(int valor) {
		if (valor > 0) {
			this.hora += valor;
			if (this.hora > 23) {
				int dias = (this.hora / 24);
				int horas = (this.hora % 24);
				this.hora = horas;
				if (dias > 0) {
					System.out.println("Avançou " + dias + " dia(s).");
				}
			}
		}
	}

	public void decrementaHora() {
		if (hora > 0) {
			this.hora -= 1;
		} else {
			this.hora = 23;
		}
	}

	public void decrementaHora(int valor) {
		if (valor > 0) {
			int dias = (valor / 24);
			int horas = (valor % 24);
			int horaAtual = this.hora;
			int diferenca = horaAtual - horas;
			if (diferenca > 0) {
				this.hora -= horas;
			} else {
				dias += 1;
				this.hora = 24 - Math.abs(this.hora - horas);
				if (this.hora == 24) {
					this.hora = 0;
				}
			}
			if (dias > 0) {
				System.out.println("Retrocedeu " + dias + " dia(s).");
			}
			// System.out.println("dias = "+dias);
			// System.out.println("horas = "+horas);
		}
	}

	public String toString() {
		return hora + ":" + minutos + ":" + segundos;
	}
}
