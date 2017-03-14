import java.util.GregorianCalendar;

public class MovimentacaoFinanceira {

	private double valor;	//positivo: deposito / negativo: saque
	private String justificativa;
	private GregorianCalendar dataHora;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public GregorianCalendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(GregorianCalendar dataHora) {
		this.dataHora = dataHora;
	}
	
}
