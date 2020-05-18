package entidade;

public class Aluno {
	String id;
	String nome;
	
	public Aluno(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	@Override
	public String toString() {
		String res = "";
		res += "ID: " + id + "\n";
		res +="Nome: " + nome + "\n";
		return res;
	}

	

}


