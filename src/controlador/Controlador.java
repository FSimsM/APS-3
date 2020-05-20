package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entidade.Aluno;
import entidade.CadastroAlunos;
import entidade.CadastroCursos;
import leitorCSV.LeitorAluno;
import user_interface.UserInterface;

public class Controlador {
	
	CadastroAlunos cadastro;
	CadastroCursos cadastroC;
	
	public Controlador() {
		cadastro = new CadastroAlunos();
	}
	
	public void init() {
		preparacao();
		
		Acao acao = null;
		while(acao!= Acao.SAIR) {
			acao = UserInterface.getAcao();
			if(acao==Acao.INCLUIR) {
				incluirAluno();
			} else if(acao == Acao.LISTAR) {
				listarAluno();
			} else if(acao == Acao.LISTARC)
				listarCurso();
			
		}
		
		finalizacao();
	}
	
	private void listarAluno() {
		UserInterface.listarAlunos(cadastro);
	}
	
	private void incluirAluno() {
		Aluno aluno = UserInterface.getAluno();
		cadastro.addAluno(aluno);
	}
	
	public void preparacao() {
		List<Aluno> alunos = LeitorAluno.getAlunos();
		cadastro.addAluno(alunos);
	}
	
	public void finalizacao() {
		List<Aluno> alunos = new ArrayList<>();
		Map<Integer, Aluno> alunosByRa = cadastro.getAlunos(); 
		for(Integer ra: alunosByRa.keySet()) {
			Aluno aluno = alunosByRa.get(ra);
			alunos.add(aluno);
		}
		LeitorAluno.saveAlunos(alunos);
		System.out.println("Termino do programa");
	}
	
	private void listarCurso() {
		UserInterface.listarCursos(cadastroC);
	}
	

}
