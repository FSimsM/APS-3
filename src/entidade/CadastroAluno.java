package entidade;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import controle.erro.DomainException;

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
	
	public void adiciona(Aluno aluno) throws DomainException {
		if(getAlunos().containsKey(aluno.getId())) {
			throw new DomainException ("Aluno com ID existente");
		}else {
			getAlunos().put(aluno.getId(), aluno);
			 
		}
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
