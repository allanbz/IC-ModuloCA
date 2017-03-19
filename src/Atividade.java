import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Atividade extends Notificacao {

	private static Scanner input;
	private static ArrayList<Notificacao> notificacoes;
	
	private String local;
	private int hora;
	private String data;
	private String assunto;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public void setHora(int hora){
		this.hora = hora;
	}
	public int getHora(){
		return hora;
	}
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return data;
	}
	public void setAssunto(String assunto){
		this.assunto = assunto;
	}
	public String getAssunto(){
		return assunto;
	}
	
	public void adicionar_Atividade(){
		try{
			String local, data, assunto;
			int hora;
			
			input = new Scanner(System.in);
			System.out.print("Insira o assunto da atividade: ");
			assunto = input.nextLine();
			
			System.out.print("Insira a data da atividade ( dd/mm/aa): ");
			data = input.nextLine();
			
			System.out.print("Insira o local da atividade: ");
			local = input.nextLine();
			
			System.out.print("Insira a hora da atividade(Ex: 16, 3, 22): ");
			hora = input.nextInt();
			
			Atividade atividade = new Atividade();
			
			atividade.setAssunto(assunto);
			atividade.setData(data);
			atividade.setHora(hora);
			atividade.setLocal(local);
			
			notificacoes.add(atividade);
			
			System.out.println("Atividade adicionada com sucesso!");
			
		}catch(InputMismatchException e){
			System.out.println("\nERRO! Foi detectado caractere inválido na inserção dos dados, por favor cadastre novamente!\n");
			input.nextLine();
		}
	}
	public void listar_Atividades(){}
	public void remover_Atividade(){}
	
	
	//implementar metodos de: criar, remover e consultar atividade (ordenada por data)
	//preparar relatorio com lista de atividades por mes/semestre
}
