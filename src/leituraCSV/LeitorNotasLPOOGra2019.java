package leituraCSV;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import entidade.Nota;

public class LeitorNotasLPOOGra2019 {
	public static String path = "filesCSV/LPOO_GRADUACAO_2019.csv";

	public static List<Nota> getNotas() {

		List<Nota> notas = new ArrayList<>();

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
