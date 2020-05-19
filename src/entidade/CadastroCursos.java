package entidade;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;


public class CadastroCursos {
	
	private Map<Integer, Curso> CursosByNome;
	
	public CadastroCursos() {
		CursosByNome = new TreeMap<Integer, Curso>();
	}
	
	public void addCurso(Aluno aluno) {
		CursosByNome.put(aluno.getNome(), curso);
	}
	
	public void addCurso(Collection<Aluno> curso) {
		for(Curso curso: curso) {
			addCurso(curso);
		}
	}
	
	public Map<Integer, Aluno> getAlunos(){
		return CursosByNome;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Cadastros:\n";
		for(int ra: CursosByNome.keySet()) {
			res += "\t" + ra + ": " + CursosByNome.get(ra) + "\n";
		}
		res += "\n";
		return res;
	}

	
}
