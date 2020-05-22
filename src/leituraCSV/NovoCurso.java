package leituraCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import entidade.Curso;

public class NovoCurso {
    Scanner sc = new Scanner(System.in);
    public String path = "filesCSV/cursos.csv";
    File arquivo = new File(path);
    List<Curso> cursos = LeitorCursos.getCursos();

    
    public void novoCurso() {

        System.out.println("Digite o nome do curso");
        String nome = sc.next();
        nome.toUpperCase().strip();
        System.out.println("Digite o nivel do curso (POS_GRADUACAO ou GRADUACAO)");
        String nivel = sc.next();
        nivel.toUpperCase().strip();
        System.out.println("Digite o ano do curso");
        String ano = sc.next();
        ano.toUpperCase().strip();
        int x = 0;
        
        for(Curso curso: cursos ) {
			if(curso.getNome().equals(nome) && curso.getTipo().equals(nivel) && curso.getAno().equals(ano)) {
				x = 1;
			}
		}
        
        if(x == 0) {
        if (nivel.equals("GRADUACAO")) {
            arquivo = new File("filesCSV/GraduacaoCSV/" + nome + "_" + nivel + "_" + ano + ".csv");
        } else if (nivel.equals("POSGRADUACAO")) {
            arquivo = new File("filesCSV/PosGraduacaoCSV/" + nome + "_" + nivel + "_" + ano + ".csv");
        }
        try {
            arquivo.createNewFile();
        } catch (IOException e) {

            }

            String[] lines = new String[] { nome + ";" + nivel + ";" + ano };

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                for (String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
        	System.out.println("Curso já existente");
        }
    }
}

