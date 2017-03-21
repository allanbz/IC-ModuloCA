import java.util.ArrayList;
import java.util.Scanner;

public class ModuloCA {

	static ArrayList <Membro> listaMembros = new ArrayList <Membro>();
	static ArrayList <Notificacao> listaNotificacoes = new ArrayList <Notificacao>();
	
	public static void main(String[] args) {
		
		//TODO: menu inicial do modulo
		Membro m = new Membro();
		Notificacao n = new Notificacao();
		Atividade a = new Atividade();
		
		System.out.print("*********************************************\n");
		System.out.println("Bem-vindo ao Diret�rio Acad�mio de Computa��o");
		System.out.print("*********************************************\n");
		
		Scanner scanner = new Scanner(System.in);
		int comando = 1;
		int comando1 = 1;
		int comando2 = 1;
		int comando3 = 1;
		int comando4 = 1;
		
		while(comando != 0) {
			Boolean verificador = false;
			
			while(!verificador) {
				try {
					System.out.println("\nSelecione a �rea que deseja acessar:\n");
					System.out.println("1-Membros\n2-Notifica��es e contatos\n3-Financeiro\n4-Relat�rios\n");
					System.out.print("Op��o desejada: ");
					
					comando = scanner.nextInt();
					verificador = true;
				}
				catch(java.util.InputMismatchException e) {
					System.out.println("\nEntrada inv�lida! Digite um n�mero inteiro!");
					scanner.nextLine();
				}
			}
			
			switch(comando) {
				case 1:
					Boolean verificador1 = false;
					
					while(!verificador1) {
						try {
							System.out.println("\nVoc� deseja:\n");
							System.out.println("1-Adicionar membro\n2-Editar membro\n3-Remover membro\n4-Consultar membro\n\n0-Voltar\n");
							System.out.print("Op��o desejada: ");
							
							comando1 = scanner.nextInt();
							verificador1 = true;
						}
						catch(java.util.InputMismatchException e) {
							System.out.println("\nEntrada inv�lida! Digite um n�mero inteiro!");
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
						default:
							System.out.println("\nDigite um n�mero v�lido!");
							break;
					}
					break;
					
				case 2:
					Boolean verificador2 = false;
					
					while(!verificador2) {
						try {
							System.out.println("\nVoc� deseja:\n");
							System.out.println("1-Adicionar atividade\n2-Remover atividade\n3-Listar atividades\n4-Entrar em contato\n\n0-Voltar\n");
							System.out.print("Op��o desejada: ");
							
							comando2 = scanner.nextInt();
							verificador2 = true;
						}
						catch(java.util.InputMismatchException e) {
							System.out.println("\nEntrada inv�lida! Digite um n�mero inteiro!");
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
							System.out.println("\nDigite um n�mero v�lido!");
							break;
					}
					break;
					
				case 3:
					Boolean verificador3 = false;
					
					while(!verificador3) {
						try {
							System.out.println("\nVoc� deseja:\n");
							System.out.println("1-\n2-\n3-\n4-\n\n0-Voltar");
							System.out.print("Op��o desejada: ");
							
							comando3 = scanner.nextInt();
							verificador3 = true;
						}
						catch(java.util.InputMismatchException e) {
							System.out.println("\nEntrada inv�lida! Digite um n�mero inteiro!");
							scanner.nextLine();
						}
					}
					
					switch(comando3) {
						case 0:
							break;
						case 1:
							
							break;
						case 2:
							
							break;
						case 3:
							
							break;
						case 4:
							
							break;
						default:
							System.out.println("\nDigite um n�mero v�lido!");
							break;
					}
					break;
					
				case 4:
					Boolean verificador4 = false;
					
					while(!verificador4) {
						try {
							System.out.println("\nVoc� deseja:\n");
							System.out.println("1-Relat�rio de membros\n2-\n3-\n4-\n\n0-Voltar\n");
							System.out.print("Op��o desejada: ");
							
							comando4 = scanner.nextInt();
							verificador4 = true;
						}
						catch(java.util.InputMismatchException e) {
							System.out.println("\nEntrada inv�lida! Digite um n�mero inteiro!");
							scanner.nextLine();
						}
					}
					
					switch(comando4) {
						case 0:
							break;
						case 1:
							m.relatorioDeMembros(listaMembros);
							break;
						case 2:
							
							break;
						case 3:
							
							break;
						case 4:
							
							break;
						default:
							System.out.println("\nDigite um n�mero v�lido!");
							break;
					}
					break;
				
				default:
					System.out.println("\nDigite um n�mero v�lido!");
					break;
			}
		}
	}

}
