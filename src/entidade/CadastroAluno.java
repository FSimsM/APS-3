package entidade;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CadastroAluno {
	private Map<String, Aluno> alunosPorId;

	public CadastroAluno() {
		alunosPorId = new TreeMap<String, Aluno>();
	}

	public void addAluno(Aluno aluno) {
		alunosPorId.put(aluno.getId(), aluno);
	}

	public void addAluno(Collection<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			addAluno(aluno);
		}
	}

	public Map<String, Aluno> getAlunos() {
		return alunosPorId;
	}

	@Override
	public String toString() {
		String res = "";
		res += "Cadastros:\n";
		for (String id : alunosPorId.keySet()) {
			res += " " + alunosPorId.get(id) + "\n";
		}
		res += "\n";
		return res;
	}
}
