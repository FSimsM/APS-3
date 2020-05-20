package entidade;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CadastroAlunos {
	
	private Map<Integer, Aluno> alunosByRa;
	
	public CadastroAlunos() {
		alunosByRa = new TreeMap<Integer, Aluno>();
	}
	
	public void addAluno(Aluno aluno) {
		alunosByRa.put(aluno.getRa(), aluno);
	}
	
	public void addAluno(Collection<Aluno> aluno) {
		for(Aluno alunos: aluno) {
			addAluno(alunos);
		}
	}
	
	public Map<Integer, Aluno> getAlunos(){
		return alunosByRa;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Cadastros:\n";
		for(int ra: alunosByRa.keySet()) {
			res += "\t" + ra + ": " + alunosByRa.get(ra) + "\n";
		}
		res += "\n";
		return res;
	}

}
