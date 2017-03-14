import java.util.GregorianCalendar;

public class Atividade extends Notificacao {

	private GregorianCalendar dataHora;
	private String local;
	
	public GregorianCalendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(GregorianCalendar dataHora) {
		this.dataHora = dataHora;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	//implementar metodos de: criar, remover e consultar atividade (ordenada por data)
	//preparar relatorio com lista de atividades por mes/semestre
}
