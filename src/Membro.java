import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Membro implements java.lang.Comparable<Membro> {
	
	private String nome;
	private String matricula;
	private String curso;
	private String periodoIngresso;
	private String cargo;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPeriodoIngresso() {
		return periodoIngresso;
	}
	public void setPeriodoIngresso(String periodoIngresso) {
		this.periodoIngresso = periodoIngresso;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
    public int compareTo(Membro m) {
        return this.nome.compareTo(m.getNome());
    }

    @Override
    public String toString() {
        return this.nome;
    }
	
	public void adicionarMembro(ArrayList <Membro> listaMembros) {
		
		Scanner scanner = new Scanner(System.in);
		Boolean verificador = true;
		
		System.out.println("\nTELA DE CADASTRO\n");
		
		while(verificador) {
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			if(nome != null && !nome.isEmpty()) {
				this.setNome(nome);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Número de Matrícula: ");
			String matricula = scanner.nextLine();
			
			if(matricula != null && !matricula.isEmpty()) {
				this.setMatricula(matricula);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Curso: ");
			String curso = scanner.nextLine();
			
			if(curso != null && !curso.isEmpty()) {
				this.setCurso(curso);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Período de ingresso: ");
			String periodoDeIngresso = scanner.nextLine();
			
			if(periodoDeIngresso != null && !periodoDeIngresso.isEmpty()) {
				this.setPeriodoIngresso(periodoDeIngresso);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Cargo: ");
			String cargo = scanner.nextLine();
			
			if(cargo != null && !cargo.isEmpty()) {
				this.setCargo(cargo);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("E-mail: ");
			String email = scanner.nextLine();
			
			if(email != null && !email.isEmpty()) {
				this.setEmail(email);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		listaMembros.add(this);
		Collections.sort(listaMembros);
	}
	
	public void removerMembro(ArrayList <Membro> listaMembros) {
		
		System.out.println("\nTELA DE REMOÇÃO\n");
		listarMembros(listaMembros);
		
		System.out.print("\nDigite o nome de quem deseja remover: ");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		
		int flag = 0;
		
		for(Membro m : listaMembros) {
			String membro = m.getNome();
			
			if(membro.equals(nome)) {
				flag = 1;
				
				listaMembros.remove(m);
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("\nMembro não encontrado! Certifique-se de digitar o nome corretamente.");
		}
	}

	public void consultarMembro(ArrayList <Membro> listaMembros) {
		
		System.out.println("\nTELA DE CONSULTA\n");
		listarMembros(listaMembros);
		
		System.out.print("\nDigite o nome de quem deseja consultar: ");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		
		int flag = 0;
		
		for(Membro m : listaMembros) {
			String membro = m.getNome();
			
			if(membro.equals(nome)) {
				flag = 1;
				
				System.out.println("\nDADOS DO MEMBRO\n");
				m.printDados();
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("\nMembro não encontrado! Certifique-se de digitar o nome corretamente.");
		}
	}

	public void editarMembro(ArrayList <Membro> listaMembros) {
		
		System.out.println("\nTELA DE EDIÇÃO\n");
		listarMembros(listaMembros);
		
		System.out.print("\nDigite o nome de quem deseja editar: ");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		
		int flag = 0;
		int comando = 1;
		
		for(Membro m : listaMembros) {
			String membro = m.getNome();
			
			if(membro.equals(nome)) {
				flag = 1;
				
				while(comando != 0) {
					Boolean verificador = false;
					
					while(!verificador) {
						try {
							System.out.println("\nQual informação deseja alterar:\n");
							System.out.println("1-Nome\n2-Matricula\n3-Curso\n4-Período de Ingresso");
							System.out.println("5-Cargo\n6-E-mail\n\n0-Sair\n");
							System.out.print("Opção desejada: ");
							
							comando = scanner.nextInt();
							scanner.nextLine();
							verificador = true;
						}
						catch(java.util.InputMismatchException e) {
							System.out.println("\nEntrada inválida! Digite um número inteiro!");
							scanner.nextLine();
						}
					}
					
					switch(comando) {
						case 0:
							Collections.sort(listaMembros);
							return;
						case 1:
							System.out.print("Nome: ");
							String novoNome = scanner.nextLine();
							m.setNome(novoNome);
							break;
						case 2:
							System.out.print("Matrícula: ");
							String novaMatricula = scanner.nextLine();
							m.setMatricula(novaMatricula);
							break;
						case 3:
							System.out.print("Curso: ");
							String novoCurso = scanner.nextLine();
							m.setCurso(novoCurso);
							break;
						case 4:
							System.out.print("Semestre: ");
							String novoSemestre = scanner.nextLine();
							m.setPeriodoIngresso(novoSemestre);
							break;
						case 5:
							System.out.print("Cargo: ");
							String novoCargo = scanner.nextLine();
							m.setCargo(novoCargo);
							break;
						case 6:
							System.out.print("E-mail: ");
							String novoEmail = scanner.nextLine();
							m.setEmail(novoEmail);
							break;
						default:
							System.out.println("\nDigite um número válido!");
							break;
					}
				}
				
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("\nMembro não encontrado! Certifique-se de digitar o nome corretamente.");
		}
	}

	public void listarMembros(ArrayList <Membro> listaMembros) {
		
		System.out.println("Lista de membros atualmente cadastrados:\n");
		
		for(Membro m : listaMembros) {
			System.out.printf("%s, %s, %s\n", m.getNome(), m.getCurso(), m.getCargo());
		}
	}
	
	public void printDados() {
		
		System.out.printf("Nome: %s\nMatrícula: %s\nCurso: %s", this.getNome(), this.matricula, this.getCurso());
		System.out.printf("\nSemestre: %s\nCargo: %s\nE-mail de contato: %s\n\n", this.getPeriodoIngresso(), this.getCargo(), this.getEmail());
	}
	
	public void relatorioDeMembros(ArrayList <Membro> listaMembros) {
		
		System.out.println("\n=================================");
		System.out.println("\nDIRETÓRIO ACADÊMICO DE COMPUTAÇÃO");
		System.out.println("\n=================================\n");
		
		for(Membro m : listaMembros) {
			
			m.printDados();
			System.out.println("======================\n");
		}
		
	}
}
