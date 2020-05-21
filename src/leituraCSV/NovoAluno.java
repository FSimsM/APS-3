package leituraCSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import controle.erro.DomainException;
import entidade.CadastroAluno;
import entidade.Aluno;

public class NovoAluno {
	Scanner sc = new Scanner(System.in);
	CadastroAluno cadastro = new CadastroAluno();
	 public String path = "filesCSV/alunos.csv";
	String ID;
	String nome;

	public void AddAluno() {
		try {
			System.out.println("Digite o ID do aluno que você deseja adicionar");
			ID = sc.next();
			System.out.println("Digite o nome do aluno que você deseja adicionar");
			nome = sc.next();
			Aluno aluno = new Aluno(ID, nome);
			cadastro.addAluno(LeitorAluno.getAlunos());
			cadastro.adiciona(aluno);
			String[] lines = new String[] {ID +";"+ nome};
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