package teste;

import java.util.List;


import entidade.Curso;
import leituraCSV.LeitorCursos;

public class TesteCurso {

public static void main(String[] args) {
		
		List<Curso> cursos = LeitorCursos.getCursos();
		
		for(Curso curso : cursos) {
			System.out.println(curso);
		}

}
}
