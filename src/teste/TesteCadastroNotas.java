package teste;

import java.util.List;

import entidade.CadastroNotas;
import entidade.Nota;
import leituraCSV.LeitorNotas;

public class TesteCadastroNotas {
	public static void main(String[] args) {

		List<Nota> notas = LeitorNotas.getNotas();

		CadastroNotas cadastrosNotas = new CadastroNotas();
		cadastrosNotas.addAluno(notas);

		System.out.println(cadastrosNotas);

	}
}
