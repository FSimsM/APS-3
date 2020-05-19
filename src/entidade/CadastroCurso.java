package entidade;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CadastroCurso {
	private Map<String, Curso> cursosPorId;

	public CadastroCurso() {
		cursosPorId = new TreeMap<String, Curso>();
	}

	public void addCurso(Curso curso) {
		cursosPorId.put(curso.getNome(), curso);
	}

	public void addCurso(Collection<Curso> curso) {
		for (Curso cursos : curso) {
			addCurso(cursos);
		}
	}

	public Map<String, Curso> getCursos() {
		return cursosPorId;
	}

	@Override
	public String toString() {
		String res = "";
		res += "Cadastros:\n";
		for (String id : cursosPorId.keySet()) {
			res += " " + cursosPorId.get(id) + "\n";
		}
		res += "\n";
		return res;
	}
}
