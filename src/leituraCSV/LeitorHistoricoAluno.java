package leituraCSV;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import controle.erro.DomainException;
import entidade.Curso;
import entidade.Nota;

public class LeitorHistoricoAluno {
	Scanner sc = new Scanner(System.in);
	public String path = "filesCSV/cursos.csv";
	List<Curso> cursos = LeitorCursos.getCursos();
	File arquivo = new File(path);
	String id;
	String nome;
	String nivel;
	String ano;

	public void historicoAluno() {
		try {
			int y = 0;
			System.out.println("Digite o ID do aluno que você quer a nota");
			id = sc.next();

			for (Curso curso : cursos) {
				nome = curso.getNome();
				nivel = curso.getTipo();
				ano = curso.getAno();

				List<Nota> notas = LeitorNotas.getNotas(nome, nivel, ano);

				for (Nota nota : notas) {
					if (nota.getIdNota().equals(id)) {
						System.out.println(nome + "_" + nivel + "_" + ano);
						System.out.println(nota);
						y = 1;
					}
				}
				if (y == 0) {
					throw new DomainException("ID não existe! Tente novamente");
				}
			}
		} catch (DomainException e) {
			e.getMessage();
		}

	}
}
