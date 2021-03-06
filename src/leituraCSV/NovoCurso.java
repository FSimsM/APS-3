package leituraCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import controle.erro.DomainException;
import entidade.Curso;

public class NovoCurso {
	Scanner sc = new Scanner(System.in);
	public String path = "filesCSV/cursos.csv";
	File arquivo = new File(path);
	List<Curso> cursos = LeitorCursos.getCursos();

	public void novoCurso() {
		try {
			System.out.println("Digite o nome do curso");
			String nome = sc.next();
			System.out.println("Digite o nivel do curso (POS_GRADUACAO ou GRADUACAO)");
			String nivel = sc.next();
			System.out.println("Digite o ano do curso");
			String ano = sc.next();

			for (Curso curso : cursos) {
				if (curso.getNome().equals(nome) && curso.getTipo().equals(nivel) && curso.getAno().equals(ano)) {
					throw new DomainException("Curso Existente, tente novamente");
				}
			}

			if (nivel.equals("GRADUACAO")) {
				arquivo = new File("filesCSV/GraduacaoCSV/" + nome + "_" + nivel + "_" + ano + ".csv");
			} else if (nivel.equals("POSGRADUACAO")) {
				arquivo = new File("filesCSV/PosGraduacaoCSV/" + nome + "_" + nivel + "_" + ano + ".csv");
			}else {
				throw new DomainException("Digite um nivel valido 'GRADUACAO' ou 'POS_GRADUACAO'");
			}
			try {
				arquivo.createNewFile();
			} catch (IOException e) {

			}

			String[] lines = new String[] { nome + ";" + nivel + ";" + ano };

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (DomainException r) {
			System.out.println(r.getMessage());
		}
	}
}
