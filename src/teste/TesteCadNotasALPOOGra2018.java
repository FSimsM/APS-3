package teste;

import java.util.List;

import entidade.CadastroNotasALPOOGra2018;
import entidade.Nota;
import leituraCSV.LeitorNotasALPOOGra2018;

public class TesteCadNotasALPOOGra2018 {
	public static void main(String[] args) {

		List<Nota> notas = LeitorNotasALPOOGra2018.getNotas();

		CadastroNotasALPOOGra2018 cadastrosNotasAlPOOGra2018 = new CadastroNotasALPOOGra2018();
		cadastrosNotasAlPOOGra2018.addAluno(notas);

		System.out.println(cadastrosNotasAlPOOGra2018);

	}

}
