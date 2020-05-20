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


public class LeitorAluno {
	public static String path = "filesCSV/alunos.csv";

	public static List<Aluno> getAlunos() {

		List<Aluno> alunos = new ArrayList<>();

		// try-with-resource
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linha;
			while ((linha = in.readLine()) != null) {
				String[] palavras = linha.split(";");

				String id = palavras[0];
				String nome = palavras[1];
				
				Aluno aluno = new Aluno(id, nome);

				alunos.add(aluno);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return alunos;
	}
	
	/*public void AddAluno(Aluno aluno) throws DomainException {
		for(Aluno alunos : getAlunos()) {
			if(alunos.equals(aluno.getId())){
				throw new DomainException("ID existente. tente novamente");
				
			}else {
				getAlunos().add(aluno);
				
			}
		}
		*/
	}
	

