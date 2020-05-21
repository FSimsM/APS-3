package leituraCSV;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import controle.erro.DomainException;
import entidade.Aluno;
import entidade.Curso;

public class LeitorCursos {
	public static String path = "filesCSV/cursos.csv";

	public static List<Curso> getCursos() {

		List<Curso> cursos = new ArrayList<>();

		// try-with-resource
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linha;
			while ((linha = in.readLine()) != null) {
				String[] palavras = linha.split(";");

				String nome = palavras[0];
				String tipo = palavras[1];
				String ano = palavras[2];

				Curso curso = new Curso(nome, tipo, ano);

				cursos.add(curso);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return cursos;
	}
	
	public void addCurso(Curso curso) throws DomainException{
		for(Curso curs : getCursos()) {
			if(curs.equals(getCursos())) {
				throw new DomainException("Curso Existeste tente novamente");
			}else {
				getCursos().add(curso);
				
			}
		}
	}
}
