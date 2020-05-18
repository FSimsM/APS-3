package teste;

import java.util.List;

import entidade.Aluno;
import entidade.CadastroAlunos;
import io_utils.InputUtils;

public class TesteCadastroAlunos {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = InputUtils.getAlunos();
		
		CadastroAlunos cadastro = new CadastroAlunos();
		cadastro.addAluno(alunos);
		
		System.out.println(cadastro);
		
	}

}
