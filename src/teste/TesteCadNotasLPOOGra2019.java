package teste;

import java.util.List;

import entidade.CadastroNotasLPOOGra2019;
import entidade.Nota;
import leituraCSV.LeitorNotasLPOOGra2019;

public class TesteCadNotasLPOOGra2019 {
	public static void main(String[] args) {

		List<Nota> notas = LeitorNotasLPOOGra2019.getNotas();

		CadastroNotasLPOOGra2019 cadastrosNotaslPOOGra2019 = new CadastroNotasLPOOGra2019();
		cadastrosNotaslPOOGra2019.addAluno(notas);

		System.out.println(cadastrosNotaslPOOGra2019);

	}

}
