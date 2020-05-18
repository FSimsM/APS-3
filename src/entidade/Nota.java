package entidade;

public class Nota {
    String idNota;
	double NP1;
    double NP2;
    double reposicao;
    double exame;
	
    public Nota(String idNota, double nP1, double nP2, double reposicao, double exame) {
		this.idNota = idNota;
		NP1 = nP1;
		NP2 = nP2;
		this.reposicao = reposicao;
		this.exame = exame;
	}

	public String getIdNota() {
		return idNota;
	}

	public double getNP1() {
		return NP1;
	}

	public double getNP2() {
		return NP2;
	}

	public double getReposicao() {
		return reposicao;
	}

	public double getExame() {
		return exame;
	}  
    
	@Override
	public String toString() {
		String res = "";
		res += "Id: " + idNota + "\n";
		res += "NP1: " + NP1 + "\n";
		res += "NP2: " + NP2 + "\n";
		res += "Reposicao: " + reposicao + "\n";
		res += "Exame: " + exame + "\n";
		return res;
	}
    
    
}