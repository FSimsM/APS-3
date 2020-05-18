package teste;

import java.util.List;

import entidade.CadastroNotasALPOOGra2019;
import entidade.Nota;
import leituraCSV.LeitorNotasALPOOGra2019;

public class TesteCadNotasALPOOGra2019 {
	public static void main(String[] args) {

		List<Nota> notas = LeitorNotasALPOOGra2019.getNotas();

		CadastroNotasALPOOGra2019 cadastrosNotasAlPOOGra2019 = new CadastroNotasALPOOGra2019();
		cadastrosNotasAlPOOGra2019.addAluno(notas);

		System.out.println(cadastrosNotasAlPOOGra2019);

	}

}
