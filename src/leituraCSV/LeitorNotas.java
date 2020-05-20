package leituraCSV;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Nota;

public class LeitorNotas {
    static Scanner sc = new Scanner(System.in);


    public static List<Nota> getNotas() {
    System.out.println("Digite o nome da matéria do curos que você quer a nota");
    String nome = sc.next();
    System.out.println("Digite o nivel do curso que você quer a nota(POSGRADUACAO ou GRADUACAO)");
    String nivel = sc.next();
    System.out.println("Digite o nome do ano do curso que você quer a nota");
    String ano = sc.next();

    String path = "filesCSV/"+ nome +""+ nivel +""+ ano +".csv";
    List<Nota> notas = new ArrayList<>();

    if (nivel.equals("GRADUACAO")) {
        path =  ("filesCSV/GraduacaoCSV/"+ nome +""+ nivel +""+ ano +".csv");
    }
    else {
        path = ("filesCSV/PosGraduacaoCSV/"+ nome +""+ nivel +"_"+ ano +".csv");
    }

        // try-with-resource
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = in.readLine()) != null) {
                String[] palavras = linha.split(";");

                String id = palavras[0];
                double NP1 = Double.parseDouble(palavras[1]);
                double NP2 = Double.parseDouble(palavras[2]);
                double reposicao = Double.parseDouble(palavras[3]);
                double exame = Double.parseDouble(palavras[4]);

                Nota nota = new Nota(id, NP1, NP2, reposicao, exame);

                notas.add(nota);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return notas;

    }

}