package user_interface;

import java.util.Map;
import java.util.Scanner;

import controlador.Acao;
import entidade.Aluno;
import entidade.CadastroAlunos;
import entidade.Curso;
import entidade.CadastroCursos;

public class UserInterface {
	
	public static Acao getAcao() {
		Acao acao = null;
		while(acao==null) {
			System.out.println("Entre com uma das opcoes abaixo:");
			System.out.println("1 - para Listar Alunos");
			System.out.println("2 - para Incluir Aluno");
			System.out.println("3 - para Listar Cursos");
			System.out.println("4 - para Incluir Curso");
			System.out.println("0 - para Sair");
			acao = getAcaoUsuario();
			
		}
		return acao;
	}
	
	private static Acao getAcaoUsuario() {
		try (Scanner in = new Scanner(System.in)) {
			String entrada = in.next();
			if(entrada.strip().equals("1")) {
				return Acao.LISTAR;
			}else if(entrada.strip().equals("2")) {
				return Acao.INCLUIR;
			}else if(entrada.strip().equals("3")) {
				return Acao.LISTARC;
			}else  if(entrada.strip().equals("0")) {
				return Acao.SAIR;
			} else {
				System.out.println("Acao nao reconhecida\n");
				return null;
			}
		}
	}
	
	public static void listarAlunos(CadastroAlunos alunos) {
		System.out.println("Todos os alunos cadastrados: ");
		Map<Integer, Aluno> alunosByRa = alunos.getAlunos();
		for(Integer ra: alunosByRa.keySet()) {
			Aluno aluno = alunosByRa.get(ra);
			System.out.println("-----------------------");
			System.out.println("Ra: " + ra);
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Nota: " + aluno.getNota());
		}
		System.out.println("-----------------------");
	}
	
	public static Aluno getAluno() {
		
		String nome = getNome();
		int ra = getId();
		double nota = getNota();
		
		Aluno aluno = new Aluno(ra, nome, nota);
		
		return aluno;
	}
	
	private static String getNome() {
		System.out.println("Entre com o nome do aluno");
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		return nome;
	}
	
	private static int getId() {
		System.out.println("Entre com o ra do aluno");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String idPalavra = in.next();
		try {
			int id = Integer.parseInt(idPalavra);
			return id;
		}catch(NumberFormatException e) {
			System.out.println("Numero inteiro entrado nao reconhecido");
			System.out.println("Por favor entre com um numero inteiro");
			return getId();
		}
		
	}

	private static double getNota() {
		System.out.println("Entre com a nota do aluno");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String notaPalavra = in.next();
		try {
			double nota = Double.parseDouble(notaPalavra);
			if(nota<0 || nota>10) {
				throw new NumberFormatException();
			}
			return nota;
		}catch(NumberFormatException e) {
			System.out.println("Numero real entrado nao reconhecido");
			System.out.println("Por favor entre com um numero real positivo menor que 10");
			return getNota();
		}
	}	
	
	
	public static void listarCursos(CadastroCursos cursos) {
		System.out.println("Todos os cursos cadastrados: ");
		Map<String, Curso> cursosByNome = cursos.getCursos();
		for(String nomeC: cursosByNome.keySet()) {
			Curso curso = cursosByNome.get(nomeC);
			System.out.println("-----------------------");
			System.out.println("Ra: " + nomeC);
			System.out.println("Nome: " + curso.getNivel());
			System.out.println("Nota: " + curso.getAno());
		}
		System.out.println("-----------------------");
	}
	

}
	
	