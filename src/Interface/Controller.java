package Interface;

import java.util.List;
import java.util.Scanner;

import controle.erro.DomainException;
import entidade.Aluno;
import entidade.CadastroAluno;
import entidade.CadastroNotas;
import entidade.Curso;
import entidade.Nota;
import leituraCSV.LeitorAluno;
import leituraCSV.LeitorCursos;
import leituraCSV.LeitorHistoricoAluno;
import leituraCSV.LeitorNotas;
import leituraCSV.NovoAluno;
import leituraCSV.NovoCurso;
import leituraCSV.NovoRendimento;

public class Controller {
	Scanner sc = new Scanner(System.in);
	List<Curso> cursos = LeitorCursos.getCursos();
	View view;

	public Controller(View aView) {
		this.view = aView;
	}

	public void init() {

		Acao resposta = null;

		while (resposta != Acao.SAIR) {
			resposta = view.getAcao();
			System.out.println("Sua escolha foi " + resposta);

			if (resposta == Acao.cursos) {
				List<Curso> cursos = LeitorCursos.getCursos();

				for (Curso curso : cursos) {
					System.out.println(curso);
				}
			}
			if (resposta == Acao.alunos) {
				List<Aluno> alunos = LeitorAluno.getAlunos();

				CadastroAluno cadastro = new CadastroAluno();
				cadastro.addAluno(alunos);

				System.out.println(cadastro);
			}
			if (resposta == Acao.historicoAluno) {

				LeitorHistoricoAluno leitorHistoricoAluno = new LeitorHistoricoAluno();
				leitorHistoricoAluno.historicoAluno();

			}
			if (resposta == Acao.rendimento) {
				System.out.println("Digite o nome da matéria do curos que você quer a nota");
				String nome = sc.next();
				System.out.println("Digite o nivel do curso que você quer a nota(POS_GRADUACAO ou GRADUACAO)");
				String nivel = sc.next();
				System.out.println("Digite o ano do curso que você quer a nota");
				String ano = sc.next();
				
				
				try {
				 for(Curso curso: cursos ) {
			 			if(!(curso.getNome().equals(nome) && curso.getTipo().equals(nivel) && curso.getAno().equals(ano))) {
			 				throw new DomainException("Curso invalido");
			 			}
				 }
				
			 	
				List<Nota> notas = LeitorNotas.getNotas(nome, nivel, ano);

				CadastroNotas cadastrosNotas = new CadastroNotas();
				cadastrosNotas.addAluno(notas);

				System.out.println(cadastrosNotas);
			
			}catch (DomainException e) {
				e.getMessage();
			}

			}
			if (resposta == Acao.novoAluno) {
				NovoAluno novoAluno = new NovoAluno();
				novoAluno.AddAluno();

			}
			if (resposta == Acao.novoCurso) {
				NovoCurso novoCurso = new NovoCurso();
				novoCurso.novoCurso();
			}
			if (resposta == Acao.novoRendimento) {
				NovoRendimento novoRendimento = new NovoRendimento();
				novoRendimento.novoRendimento();
			}
			if (resposta == Acao.SAIR) {
				view.sendGoodByMessage();
			}
		}

	}

}

