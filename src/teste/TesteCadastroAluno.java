package teste;

import java.util.List;

import entidade.Aluno;
import entidade.CadastroAluno;
import leituraCSV.LeitorAluno;

public class TesteCadastroAluno {
public static void main(String[] args) {
		
		List<Aluno> alunos = LeitorAluno.getAlunos();
		
		CadastroAluno cadastro = new CadastroAluno();
		cadastro.addAluno(alunos);
		
		System.out.println(cadastro);
		
	}


}
