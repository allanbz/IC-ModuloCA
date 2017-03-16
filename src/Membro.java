import java.util.Scanner;

public class Membro {
	
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
	
	//implementar metodos de: adicao, edicao, remocao e consulta de membro
	//preparar relatorio de lista de membros e seus dados
	
	public void adicionarMembro() {
		
		Scanner scanner = new Scanner(System.in);
		Boolean verificador = true;
		
		System.out.println("TELA DE CADASTRO\n");
		
		while(verificador) {
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			if(nome != null && !nome.isEmpty()) {
				setNome(nome);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Número de Matrícula: ");
			String matricula = scanner.nextLine();
			
			if(matricula != null && !matricula.isEmpty()) {
				setMatricula(matricula);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Curso: ");
			String curso = scanner.nextLine();
			
			if(curso != null && !curso.isEmpty()) {
				setCurso(curso);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Período de ingresso: ");
			String periodoDeIngresso = scanner.nextLine();
			
			if(periodoDeIngresso != null && !periodoDeIngresso.isEmpty()) {
				setPeriodoIngresso(periodoDeIngresso);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("Cargo: ");
			String cargo = scanner.nextLine();
			
			if(cargo != null && !cargo.isEmpty()) {
				setCargo(cargo);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
		
		while(verificador) {
			System.out.print("E-mail: ");
			String email = scanner.nextLine();
			
			if(email != null && !email.isEmpty()) {
				setEmail(email);
				break;
			} else {
				System.out.println("\nPor favor, preencha o campo corretamente!\n");
			}
		}
	}
	
}
