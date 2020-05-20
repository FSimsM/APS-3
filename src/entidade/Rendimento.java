package entidade;

public class Rendimento {
	
	private Aluno aluno;
	private Curso curso;
	private boolean aprovado;
	private Nota media;
	
	public Rendimento(Aluno aluno, Curso curso, boolean aprovado, Nota media) {
		this.aluno = aluno;
		this.curso = curso;
		this.aprovado = aprovado;
		this.media = media;
	}


	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	
	
	
	
    
}