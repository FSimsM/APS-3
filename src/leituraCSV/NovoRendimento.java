package leituraCSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import entidade.Curso;

public class NovoRendimento {
	Scanner sc = new Scanner(System.in);
    public String path = "filesCSV/cursos.csv";
    List<Curso> cursos = LeitorCursos.getCursos();
    int x = 0;
    
    public void novoRendimento() {
    	 System.out.println("Digite o nome do curso");
    	 String nome =  sc.next();
    	 System.out.println("Digite o nivel do curso (POS_GRADUACAO ou GRADUACAO)");
    	 String nivel =  sc.next();
    	 System.out.println("Digite o ano do curso");
    	 String ano =  sc.next();
    	 
    	 for(Curso curso: cursos ) {
 			if(curso.getNome().equals(nome) && curso.getTipo().equals(nivel) && curso.getAno().equals(ano)) {
 				x = 1;
 			}
 		}
    	 
    	 if(x == 1) {
    	 System.out.println("Digite o ID do aluno que você quer alterar as notas");
    	 String ID = sc.next();
    	 System.out.println("Digite a nova nota da NP1");
    	 String NP1 = sc.next();
    	 System.out.println("Digite a nova nota da  NP2");
    	 String NP2 = sc.next();
    	 System.out.println("Digite a nova nota da reposicao");
    	 String reposicao = sc.next();
    	 System.out.println("Digite a nova nota do exame");
    	 String exame = sc.next();
    	 
    	 if (nivel == "GRADUACAO" || nivel == "POS_GRADUACAO") {
    	 if (nivel.equals("GRADUACAO")) {
    	        path =  ("filesCSV/GraduacaoCSV/"+ nome +"_"+ nivel +"_"+ ano +".csv");
    	    }
    	 else if(nivel.equals("POS_GRADUACAO")){
    	  	  path =  ("filesCSV/PosGraduacaoCSV/"+ nome +"_"+ nivel +"_"+ ano +".csv");
    	 }
    	
    	 String[] lines = new String[] {ID +";"+ NP1 +";"+ NP2 +";"+ reposicao +";"+ exame};

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
    	 else {
    		 System.out.println("Você precisa digitar um curso existente");
    	 }
    }
}
