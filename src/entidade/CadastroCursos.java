package entidade;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CadastroCursos {

	private Map<String, Curso> cursosByNome;

	public CadastroCursos() {
		cursosByNome = new TreeMap<String, Curso>();
	}

	public void addCurso(Curso curso) {
		cursosByNome.put(curso.getNomeC(), curso);
	}

	public void addCurso(Collection<Curso> curso) {
		for(Curso cursos : curso) {
			addCurso(cursos);
		}
	}

	public Map<String, Curso> getCursos() {
		return cursosByNome;
	}

	@Override
	public String toString() {
		String res = "";
		res += "Cadastros:\n";
		for(String nomeC: cursosByNome.keySet()) {
			res += "\t" + nomeC + ": " + cursosByNome.get(nomeC) + "\n";
		}
		res += "\n";
		return res;
	}
	
}
