package revisao;

public class Calendario {
	private Horario horario;
	private Data data;

	public Calendario(Horario horario, Data data) {
		super();
		this.horario = horario;
		this.data = data;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
