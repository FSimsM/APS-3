package leitorCSV;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import entidade.Aluno;

public class LeitorAluno {
	
	public static String path = "filesCSV/alunos.csv";
	
	public static List<Aluno> getAlunos(){
		
		List<Aluno> alunos = new ArrayList<>();
		
		// try-with-resource
		try(BufferedReader in = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(path), 
						StandardCharsets.UTF_8))){
			String linha;
			while((linha = in.readLine())!=null) {
				String[] palavras = linha.split("\\|");
				
				String nome = palavras[0];
				int ra = Integer.parseInt(palavras[1]);
				double nota = Double.parseDouble(palavras[2]);
				
				Aluno aluno = new Aluno(ra, nome, nota);
				
				alunos.add(aluno);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return alunos;
		
	}
	
	public static void saveAlunos(List<Aluno> alunos) {
		try(PrintWriter out = new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(path), 
						StandardCharsets.UTF_8))){
			
			for(Aluno aluno: alunos) {
				String linha = "";
				linha += aluno.getNome() + "|";
				linha += aluno.getRa() + "|";
				linha += aluno.getNota();
				out.println(linha);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
