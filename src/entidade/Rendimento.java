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
/*	public double mediaG(double NP1, double NP2, double reposicao, double exame) {
        double x;
        if (reposicao >= NP1 || reposicao >= NP2) {
            if(NP1 < NP2) {
                NP1 = reposicao;
            }
            else {
                NP2 = reposicao;
            }
        }
	}*/

}
	
	
	
	
    
