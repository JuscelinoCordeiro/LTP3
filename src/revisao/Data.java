package revisao;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 1 || mes < 12) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 1 || dia < 31) {
			this.dia = dia;
		}
	}

	public void incrementaAno() {
		this.ano++;
	}

	public void incrementaAno(int n) {
		this.ano += n;
	}

	public void decrementaAno() {
		this.ano--;
	}

	public void decrementaAno(int n) {
		this.ano -= n;
	}

	public void incrementaMes() {
		if (this.mes < 12) {
			this.mes++;
		} else {
			this.mes = 1;
			incrementaAno();
		}
	}

	public void incrementaMes(int n) {
		this.mes += n;
		if (this.mes > 12) {
			this.mes = this.mes % 12;
			incrementaAno();
		}
	}

	public void decrementaMes() {
		if (this.mes > 1) {
			this.mes--;
		} else {
			this.mes = 12;
			decrementaAno();
		}
	}

	public void decrementaMes(int n) {
		int anos = n / 12;
		int meses = n % 12;
		if (anos > 0) {
			decrementaAno(anos);
		}
		if (meses > 0) {
			int diferenca = this.mes - meses;
			if (diferenca > 0) {
				this.mes -= meses;
			} else {
				decrementaAno();
				this.mes = 12 - Math.abs(this.mes - meses);
			}
		}
	}

	public void incrementaDia() {
		if (this.dia == 30
				&& (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
			this.dia = 1;
			incrementaMes();
		} else if ((this.dia == 28 && this.mes == 2 && (this.ano % 4 != 0))) {
			this.dia = 1;
			incrementaMes();
		} else if ((this.dia == 29 && this.mes == 2) || this.dia == 31) {
			this.dia = 1;
			incrementaMes();
		} else {
			this.dia++;
		}
	}

	public void incrementaDia(int n) {
		for (int i = 0; i < n; i++) {
			incrementaDia();
		}
	}

	public void decrementaDia() {
		if (this.dia > 1) {
			this.dia--;
		} else if (this.dia == 1
				&& (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
			this.dia = 31;
			decrementaMes();
		} else if (this.dia == 1 && this.mes == 3 && (this.ano % 4 == 0)) {
			this.dia = 29;
			decrementaMes();
		} else if (this.dia == 1 && this.mes == 3 && (this.ano % 4 != 0)) {
			this.dia = 28;
			decrementaMes();
		} else {
			this.dia = 31;
			decrementaMes();
		}
	}

	public void decrementaDia(int n) {
		for (int i = 0; i < n; i++) {
			decrementaDia();
		}
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}
