package teste;

import java.util.List;

import entidade.CadastroCurso;
import entidade.Curso;
import leituraCSV.LeitorCursos;

public class TesteCurso {

public static void main(String[] args) {
		
		List<Curso> cursos = LeitorCursos.getCursos();
		
		CadastroCurso cadastro = new CadastroCurso();
		cadastro.addCurso(cursos);
		
		System.out.println(cadastro);
		
	}

}
