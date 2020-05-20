package entidade;

public class Rendimento {
	
	private Aluno aluno;
	private Curso curso;
	private Nota media;
	
	public Rendimento(Aluno aluno, Curso curso, Nota media) {
		this.aluno = aluno;
		this.curso = curso;
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
	
	public double mediaG(double NP1, double NP2, double reposicao, double exame) {
        double x;
        if (reposicao >= NP1 || reposicao >= NP2) {
            if(NP1 < NP2) {
                NP1 = reposicao;
            }
            else {
                NP2 = reposicao;
            }
        }
        if((NP1+NP2)/2 >= 7) {
          	x = (NP1+NP2)/2;
        }
        else {
          	x = (((NP1+NP2)/2) + exame)/2;
        }
        return x;
	}

	public double mediaPG(double NP1, double NP2, double reposicao, double exame) {
        double x;
        if (reposicao >= NP1 || reposicao >= NP2) {
            if(NP1 < NP2) {
                NP1 = reposicao;
            }
            else {
                NP2 = reposicao;
            }
        }
        if((NP1+NP2)/2 >= 5) {
          	x = (NP1+NP2)/2;
        }
        else {
          	x = (((NP1+NP2)/2) + exame)/2;
        }
        return x;
	}
	
	public boolean aprovadoG (double x) {
		boolean y;
		if (x >= 7) {
			y = true;
		}
		else {
			y = false;
		}
		return y;
	}
	
	public boolean aprovadoPG (double x) {
		boolean y;
		if (x >= 5) {
			y = true;
		}
		else {
			y = false;
		}
		return y;
	}
}
	
	
	
	
    
