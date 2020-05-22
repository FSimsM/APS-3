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
import entidade.Rendimento;

public class LeitorNotas {
    static Scanner sc = new Scanner(System.in);
    static Rendimento r = new Rendimento(null, null, null);
    static double media;
    static boolean aprovado;
    static int x = 0;

    public static List<Nota> getNotas(String nome, String nivel, String ano) {

    	
    String path = "filesCSV/"+ nome +"_"+ nivel +"_"+ ano +".csv";
    List<Nota> notas = new ArrayList<>();

    if (nivel.equals("GRADUACAO")) {
        path =  ("filesCSV/GraduacaoCSV/"+ nome +"_"+ nivel +"_"+ ano +".csv");
        media = r.mediaG(0.0, 0.0, 0.0, 0.0);
        aprovado = r.aprovadoG(0.0);
    }
    else if(nivel.equals("POS_GRADUACAO")){
    	  path =  ("filesCSV/PosGraduacaoCSV/"+ nome +"_"+ nivel +"_"+ ano +".csv");
          media = r.mediaPG(0.0, 0.0, 0.0, 0.0);
          aprovado = r.aprovadoPG(0.0);
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
                media = r.mediaG(NP1, NP2, reposicao, exame);
                aprovado = r.aprovadoG(r.mediaG(NP1, NP2, reposicao, exame));
    
                Nota nota = new Nota(id, NP1, NP2, reposicao, exame, media, aprovado);

                notas.add(nota);
      
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return notas;
          
    }
}