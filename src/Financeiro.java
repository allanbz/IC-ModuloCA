import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Financeiro {

	//so vamos criar um objeto pra essa classe, pois so teremos um "cofre"
	//saques e depositos ficarao registrados no arraylist "movimentacao"
	
	private double saldo;
	private ArrayList <MovimentacaoFinanceira> movimentacao;
	private Scanner input;
	
	public void inicializarFinaceiro() {
		input = new Scanner(System.in);
		
		System.out.println ("Informe a a��o que deseja realizar:");
		System.out.println ("1 - Dep�sito.");
		System.out.println ("2 - Saque.");
		System.out.println ("3 - Consulta de saldo.");
		System.out.println ("4 - Relat�rio de movimenta��es.");
		int opcao = input.nextInt();
		switch (opcao){
			case 1:
				deposito (movimentacao);
			case 2:
				saque (movimentacao);
			case 3:
				System.out.println("O saldo atual �: " + getSaldo());
			case 4:
				relatorio (movimentacao);
		}
	}
		
	public void deposito (ArrayList <MovimentacaoFinanceira> movimentacao){
		input = new Scanner(System.in);
		Date dataHora= new Date();
		Boolean verificador = true;
		MovimentacaoFinanceira mov = new MovimentacaoFinanceira();
		
		while(verificador) {
			try {
				System.out.print("Informe o valor do dep�sito: ");
				double valor = input.nextDouble();
				System.out.println("Justifique o dep�sito:");
				String justificativa = input.nextLine();
				
				mov.setValor(valor);
				mov.setJustificativa(justificativa);
				mov.setDataHora(dataHora);
				movimentacao.add(mov);
				
				valor =+ getSaldo(); 
				setSaldo(valor);  //Atualiza o valor do saldo
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("\nErro! Sua entrada foi inv�lida, tente novamente.");
				input.nextLine();	//Limpa a entrada
			}
		}
	}
	public void saque (ArrayList <MovimentacaoFinanceira> movimentacao){
		input = new Scanner(System.in);
		Date dataHora= new Date();
		Boolean verificador = true;
		MovimentacaoFinanceira mov = new MovimentacaoFinanceira();
		
		while(verificador) {
			try {
				System.out.print("Informe o valor do saque: ");
				double valor = input.nextDouble();		
				if (valor>=getSaldo()){
					valor = 0 - valor;
					System.out.println("Justifique o saque:");
					String justificativa = input.nextLine();
					
					mov.setValor(valor);
					mov.setJustificativa(justificativa);
					mov.setDataHora(dataHora);
					movimentacao.add(mov);

					valor =+ getSaldo(); 
					setSaldo(valor);  //Atualiza o valor do saldo					
				}
				else	System.out.println("Erro! N�o existe esse valor em saldo.");
			}catch(java.util.InputMismatchException e) {
				System.out.println("\nErro! Sua entrada foi inv�lida, tente novamente.");
				input.nextLine();	//Limpa a entrada
			}
		}
		
	}
	public void relatorio (ArrayList <MovimentacaoFinanceira> movimentacao){
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sh = new SimpleDateFormat("HH:mm");
		
		for (int i = 0;i < movimentacao.size(); i++) {
            if (movimentacao.get(i).getValor()>0)	System.out.println("Houve um dep�sito de ");
            else	System.out.println("Houve um saque de ");
            
            System.out.println(Math.abs(movimentacao.get(i).getValor()));
            System.out.print("reais na data " + sd.format(movimentacao.get(i).getDataHora()));
            System.out.print(" e hor�rio " + sh.format(movimentacao.get(i).getDataHora()) + ".");
			System.out.println("Justificativa: " + movimentacao.get(i).getJustificativa() + ".\n");
        }
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//implementar metodos de: deposito, saque e consulta de saldo
	//preparar relatorios de transparencia: saques/depositos com justificativas no mes/semestre (ordenado por data)
	
}
