
public class Discente {
	
	private int id;
	private String nome;
	private String cpf;
	private String matricula;
	private Curso curso;	//tipo Curso, criar classe
	private Periodo periodoIngresso;	//tipo Periodo, criar classe
	private String tipoEmProjeto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Periodo getPeriodoIngresso() {
		return periodoIngresso;
	}
	public void setPeriodoIngresso(Periodo periodoIngresso) {
		this.periodoIngresso = periodoIngresso;
	}
	public String getTipoEmProjeto() {
		return tipoEmProjeto;
	}
	public void setTipoEmProjeto(String tipoEmProjeto) {
		this.tipoEmProjeto = tipoEmProjeto;
	}
	
}
