package teste;

import java.util.List;

import entidade.Aluno;
import io_utils.InputUtils;

public class TesteInputAlunos {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = InputUtils.getAlunos();
		
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		
	}

}
