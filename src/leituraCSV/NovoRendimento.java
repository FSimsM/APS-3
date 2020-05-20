package leituraCSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NovoRendimento {
	static Scanner sc = new Scanner(System.in);
    public static String path = "filesCSV/cursos.csv";
    
    public static void novoRendimento() {
    	 System.out.println("Digite o nome do curso");
    	 String  nome =  sc.next();
    	 System.out.println("Digite o nivel do curso (POS_GRADUACAO ou GRADUACAO)");
    	 String  nivel =  sc.next();
    	 System.out.println("Digite o ano do curso");
    	 String  ano =  sc.next();
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
