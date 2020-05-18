package entidade;

public class Aluno {
	
	private int ra;
	private String nome;
	private double nota;
	
	public Aluno(int ra, String nome, double nota) {
		this.ra = ra;
		this.nome = nome;
		this.nota = nota;
	}

	public int getRa() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Nome(" + ra + ") " + nome + ", nota=" + nota;
	}
	

}
