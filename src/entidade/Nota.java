package entidade;

public class Nota {
    String idNota;
	double NP1;
    double NP2;
    double reposicao;
    double exame;
    double media;
    boolean aprovado;
	
 
    
	public Nota(String idNota, double nP1, double nP2, double reposicao, double exame, double media, boolean aprovado) {
		this.idNota = idNota;
		NP1 = nP1;
		NP2 = nP2;
		this.reposicao = reposicao;
		this.exame = exame;
		this.media = media;
		this.aprovado = aprovado;
	}

	public String getIdNota() {
		return idNota;
	}

	public void setIdNota(String idNota) {
		this.idNota = idNota;
	}

	public double getNP1() {
		return NP1;
	}

	public void setNP1(double nP1) {
		NP1 = nP1;
	}

	public double getNP2() {
		return NP2;
	}

	public void setNP2(double nP2) {
		NP2 = nP2;
	}

	public double getReposicao() {
		return reposicao;
	}

	public void setReposicao(double reposicao) {
		this.reposicao = reposicao;
	}

	public double getExame() {
		return exame;
	}

	public void setExame(double exame) {
		this.exame = exame;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	@Override
	public String toString() {
		String res = "";
		res += "Id: " + idNota + "\n";
		res += "NP1: " + NP1 + "\n";
		res += "NP2: " + NP2 + "\n";
		res += "Reposicao: " + reposicao + "\n";
		res += "Exame: " + exame + "\n";
		res += "Media: "  + media + "\n";
		res += "aprovado: "  + aprovado + "\n";
		return res;
	}
    
    
}