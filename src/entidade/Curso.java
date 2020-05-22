package entidade;

public class Curso {
	String nome;
	String tipo;
	String ano;
	public Curso(String nome, String tipo, String ano) {
		this.nome = nome;
		this.tipo = tipo;
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Nome: " + nome + "\n";
		res += "Tipo: " + tipo + "\n";
		res += "Ano: " + ano + "\n";
		return res;
				
	}
	
}