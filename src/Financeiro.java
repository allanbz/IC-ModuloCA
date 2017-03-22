import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Financeiro {
	
	private double saldo;
	private ArrayList <MovimentacaoFinanceira> movimentacao = new ArrayList<MovimentacaoFinanceira>();
	private Scanner input;
	
	public void inicializarFinaceiro() {
		input = new Scanner(System.in);
		Boolean verificador = true;
		int opcao = 0;
		
		while(verificador) {
			try {
				System.out.println ("\nInforme a a��o que deseja realizar:\n");
				System.out.println ("1-Dep�sito.");
				System.out.println ("2-Saque.");
				System.out.println ("3-Consulta de saldo.");
				System.out.println ("4-Relat�rio de movimenta��es.\n");
				System.out.println ("0-Voltar.\n");
				System.out.print("Op��o desejada: ");
				
				opcao = input.nextInt();
				verificador = false;
			} catch(java.util.InputMismatchException e) {
				System.out.println("\nErro! Sua entrada foi inv�lida, tente novamente.");
				input.nextLine();	//Limpa a entrada
			}
		}
		
		switch (opcao){
			case 0:
				return;
			case 1:
				deposito (movimentacao);
				break;
			case 2:
				saque (movimentacao);
				break;
			case 3:
				System.out.println("\nO saldo atual �: R$ " + this.getSaldo());
				break;
			case 4:
				relatorio (movimentacao);
				break;
			default:
				System.out.println("\nDigite um n�mero v�lido!");
				break;
		}
	}
		
	public void deposito (ArrayList <MovimentacaoFinanceira> movimentacao){
		input = new Scanner(System.in);
		Date dataHora= new Date();
		Boolean verificador = true;
		MovimentacaoFinanceira mov = new MovimentacaoFinanceira();
		
		while(verificador) {
			try {
				System.out.print("\nInforme o valor do dep�sito: ");
				double valor = input.nextDouble();
				input.nextLine();
				System.out.print("Justifique o dep�sito: ");
				String justificativa = input.nextLine();
				
				mov.setValor(valor);
				mov.setJustificativa(justificativa);
				mov.setDataHora(dataHora);
				movimentacao.add(mov);
				
				valor += this.getSaldo();
				setSaldo(valor);  //Atualiza o valor do saldo
				
				verificador = false;
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
				System.out.print("\nInforme o valor do saque: ");
				double valor = input.nextDouble();		
				if (valor<=this.getSaldo()){
					valor = 0 - valor;
					input.nextLine();
					System.out.print("Justifique o saque: ");
					String justificativa = input.nextLine();
					
					mov.setValor(valor);
					mov.setJustificativa(justificativa);
					mov.setDataHora(dataHora);
					movimentacao.add(mov);

					valor += getSaldo(); 
					setSaldo(valor);  //Atualiza o valor do saldo	
					verificador = false;
				}
				else {
					System.out.println("\nN�o existe esse valor em saldo!");
					verificador = false;
				}
			}catch(java.util.InputMismatchException e) {
				System.out.println("\nErro! Sua entrada foi inv�lida, tente novamente.");
				input.nextLine();	//Limpa a entrada
			}
		}
		
	}
	public void relatorio (ArrayList <MovimentacaoFinanceira> movimentacao){
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sh = new SimpleDateFormat("HH:mm");
		
		for (int i = 0; i < movimentacao.size(); i++) {
            if (movimentacao.get(i).getValor()>0)	System.out.print("\nHouve um dep�sito de R$ ");
            else	System.out.print("\nHouve um saque de R$ ");
            
            System.out.print(Math.abs(movimentacao.get(i).getValor()));
            System.out.print(" na data " + sd.format(movimentacao.get(i).getDataHora()));
            System.out.print(" e hor�rio " + sh.format(movimentacao.get(i).getDataHora()) + ".");
			System.out.println("\nJustificativa: " + movimentacao.get(i).getJustificativa() + ".\n");
        }
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
