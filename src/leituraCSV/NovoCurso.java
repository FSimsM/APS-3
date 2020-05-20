package leituraCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NovoCurso {
    static Scanner sc = new Scanner(System.in);
    public static String path = "filesCSV/cursos.csv";
    static File arquivo = new File(path);

    public static void novoCurso() {
    System.out.println("Digite o nome do curso");
    String  nome =  sc.next();
    System.out.println("Digite o nivel do curso (POSGRADUACAO ou GRADUACAO)");
    String  nivel =  sc.next();
    System.out.println("Digite o ano do curso");
    String  ano =  sc.next();

    if(nivel.equals("GRADUACAO")) {
        arquivo = new File ("filesCSV/GraduacaoCSV/"+ nome +""+ nivel +""+ ano +".csv");
    }
    else {
        arquivo = new File ("filesCSV/PosGraduacaoCSV/"+ nome +""+ nivel +"_"+ ano +".csv");
    }
    try {
        arquivo.createNewFile();
    }
    catch (IOException e) {

    }

    String[] lines = new String[] {nome +";"+ nivel +";"+ ano};

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