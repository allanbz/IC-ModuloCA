import java.util.ArrayList;
import java.util.Scanner;

public class ModuloCA {

	static ArrayList <Membro> listaMembros = new ArrayList <Membro>();
	static ArrayList <Notificacao> listaNotificacoes = new ArrayList <Notificacao>();
	
	public static void main(String[] args) {
		
		Membro m = new Membro();
		Notificacao n = new Notificacao();
		Atividade a = new Atividade();
		Financeiro f = new Financeiro();
		
		System.out.print("*********************************************\n");
		System.out.println("Bem-vindo ao Diretório Acadêmio de Computação");
		System.out.print("*********************************************\n");
		
		Scanner scanner = new Scanner(System.in);
		int comando = 1;
		int comando1 = 1;
		int comando2 = 1;
		
		while(comando != 0) {
			Boolean verificador = false;
			
			while(!verificador) {
				try {
					System.out.println("\nSelecione a área que deseja acessar:\n");
					System.out.println("1-Membros\n2-Notificações e contatos\n3-Financeiro\n");
					System.out.print("Opção desejada: ");
					
					comando = scanner.nextInt();
					verificador = true;
				}
				catch(java.util.InputMismatchException e) {
					System.out.println("\nEntrada inválida! Digite um número inteiro!");
					scanner.nextLine();
				}
			}
			
			switch(comando) {
				case 1:
					Boolean verificador1 = false;
					
					while(!verificador1) {
						try {
							System.out.println("\nVocê deseja:\n");
							System.out.println("1-Adicionar membro\n2-Editar membro\n3-Remover membro\n4-Consultar membro\n5-Listar membros\n\n0-Voltar\n");
							System.out.print("Opção desejada: ");
							
							comando1 = scanner.nextInt();
							verificador1 = true;
						}
						catch(java.util.InputMismatchException e) {
							System.out.println("\nEntrada inválida! Digite um número inteiro!");
							scanner.nextLine();
						}
					}
					
					switch(comando1) {
						case 0:
							break;
						case 1:
							m.adicionarMembro(listaMembros);
							break;
						case 2:
							m.editarMembro(listaMembros);
							break;
						case 3:
							m.removerMembro(listaMembros);
							break;
						case 4:
							m.consultarMembro(listaMembros);
							break;
						case 5:
							m.relatorioDeMembros(listaMembros);
							break;
						default:
							System.out.println("\nDigite um número válido!");
							break;
					}
					break;
					
				case 2:
					Boolean verificador2 = false;
					
					while(!verificador2) {
						try {
							System.out.println("\nVocê deseja:\n");
							System.out.println("1-Adicionar atividade\n2-Remover atividade\n3-Listar atividades\n4-Entrar em contato\n\n0-Voltar\n");
							System.out.print("Opção desejada: ");
							
							comando2 = scanner.nextInt();
							verificador2 = true;
						}
						catch(java.util.InputMismatchException e) {
							System.out.println("\nEntrada inválida! Digite um número inteiro!");
							scanner.nextLine();
						}
					}
					
					switch(comando2) {
						case 0:
							break;	
						case 1:
							a.adicionar_Atividade();
							break;
						case 2:
							a.remover_Atividade();
							break;
						case 3:
							a.listar_Atividades();
							break;
						case 4:
							n.entrar_Em_Contato();
							break;
						default:
							System.out.println("\nDigite um número válido!");
							break;
					}
					break;
					
				case 3:
					f.inicializarFinaceiro();
					break;
					
				default:
					System.out.println("\nDigite um número válido!");
					break;
			}
		}
	}

}
