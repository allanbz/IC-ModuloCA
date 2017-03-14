import java.util.ArrayList;

public class Financeiro {

	//so vamos criar um objeto pra essa classe, pois so teremos um "cofre"
	//saques e depositos ficarao registrados no arraylist "movimentacao"
	
	private double saldo;
	private ArrayList <MovimentacaoFinanceira> movimentacao;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public ArrayList<MovimentacaoFinanceira> getMovimentacao() {
		return movimentacao;
	}
	public void setMovimentacao(ArrayList<MovimentacaoFinanceira> movimentacao) {
		this.movimentacao = movimentacao;
	}
	
	//implementar metodos de: deposito, saque e consulta de saldo
	//preparar relatorios de transparencia: saques/depositos com justificativas no mes/semestre (ordenado por data)
	
}
