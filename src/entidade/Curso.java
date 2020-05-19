package entidade;

public class Curso {
	private String nomeC;
	private String nivel;
	private int ano;
	
	public Curso(String nomeC, String nivel, int ano) {
		this.nomeC = nomeC;
		this.nivel = nivel;
		this.ano = ano;
	}

	public String getNomeC() {
		return nomeC;
	}

	public String getNivel() {
		return nivel;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Nome: " + nomeC + "Nivel: " + nivel + "Ano: " + ano;
	}
}
