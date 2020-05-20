package teste;

import java.util.List;

import entidade.Aluno;
import entidade.CadastroAlunos;
import leitorCSV.LeitorAluno;

public class TesteCadastroAlunos {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = LeitorAluno.getAlunos();
		
		CadastroAlunos cadastro = new CadastroAlunos();
		cadastro.addAluno(alunos);
		
		System.out.println(cadastro);
		
	}

}
