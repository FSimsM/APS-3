package entidade;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CadastroNotas {
	private Map<String, Nota> notaPorID;

	public CadastroNotas() {
		notaPorID = new TreeMap<String, Nota>();
	}

	public void addAluno(Nota nota) {
		notaPorID.put(nota.idNota, nota);
	}

	public void addAluno(Collection<Nota> nota) {
		for (Nota notas : nota) {
			addAluno(notas);
		}
	}

	public Map<String, Nota> getNota() {
		return notaPorID;
	}

	@Override
	public String toString() {
		String res = "";
		res += "Notas\n";
		for (String id : notaPorID.keySet()) {
			res += " " + notaPorID.get(id) + "\n";
		}
		res += "\n";
		return res;
	}
}
