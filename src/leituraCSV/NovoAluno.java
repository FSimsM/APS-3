package leituraCSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class NovoAluno {
	static Scanner sc = new Scanner(System.in);
	public static String path = "filesCSV/alunos.csv";
	
	public static void addAluno() {
	System.out.println("Digite o ID do aluno que voc  deseja adicionar");
	String ID = sc.next();
	System.out.println("Digite o nome do aluno que voc  deseja adicionar");
	String nome = sc.next();
	
	String[] lines = new String[] {ID +";"+ nome};
	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
	for (String line : lines) {
	bw.write(line);
	bw.newLine();
	}
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
}

