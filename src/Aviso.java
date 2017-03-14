import java.util.GregorianCalendar;

public class Aviso extends Notificacao {
	
	private GregorianCalendar dataHoraDeCriacao;

	public GregorianCalendar getDataHoraDeCriacao() {
		return dataHoraDeCriacao;
	}

	public void setDataHoraDeCriacao(GregorianCalendar dataHoraDeCriacao) {
		this.dataHoraDeCriacao = dataHoraDeCriacao;
	}
	
	//implementar metodos de: criacao, remocao e consulta de avisos (ordenado por data)
	//prepara relatorio com lista de avisos do mes/semestre
}
