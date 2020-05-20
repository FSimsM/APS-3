package teste;

import java.util.List;

import entidade.Aluno;
import leitorCSV.LeitorAluno;

public class TesteInputAlunos {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = LeitorAluno.getAlunos();
		
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
		
	}

}
