import java.util.ArrayList;

public class FinanceiroProxy extends Financeiro {
	
	protected String usuario, senha;
	
	public FinanceiroProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	private boolean permissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
	
	@Override
	public void inicializarFinaceiro() {
		if(permissaoDeAcesso()) {
			super.inicializarFinaceiro();
		} else {
			System.out.println("\nAcesso negado!");
		}
	}
		
	@Override
	public void deposito (ArrayList <MovimentacaoFinanceira> movimentacao){
		if(permissaoDeAcesso()) {
			super.deposito(movimentacao);
		} else {
			System.out.println("\nAcesso negado!");
		}
	}
	
	@Override
	public void saque (ArrayList <MovimentacaoFinanceira> movimentacao){
		if(permissaoDeAcesso()) {
			super.saque(movimentacao);
		} else {
			System.out.println("\nAcesso negado!");
		}
	}
	
	@Override
	public void relatorio (ArrayList <MovimentacaoFinanceira> movimentacao){
		if(permissaoDeAcesso()) {
			super.relatorio(movimentacao);
		} else {
			System.out.println("\nAcesso negado!");
		}
	}
	
	@Override
	public double getSaldo() {
		if(permissaoDeAcesso()) {
			return super.saldo;
		} else {
			System.out.println("\nAcesso negado!");
			return -1;
		}
	}
	
	@Override
	public void setSaldo(double saldo) {
		if(permissaoDeAcesso()) {
			super.saldo = saldo;
		} else {
			System.out.println("\nAcesso negado!");
		}
	}
}
