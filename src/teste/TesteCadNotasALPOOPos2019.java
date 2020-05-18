package teste;

import java.util.List;

import entidade.CadastroNotasALPOOPos2019;
import entidade.Nota;
import leituraCSV.LeitorNotasALPOOPos2019;

public class TesteCadNotasALPOOPos2019 {
	public static void main(String[] args) {

		List<Nota> notas = LeitorNotasALPOOPos2019.getNotas();

		CadastroNotasALPOOPos2019 cadastrosNotasAlPOOPos2019 = new CadastroNotasALPOOPos2019();
		cadastrosNotasAlPOOPos2019.addAluno(notas);

		System.out.println(cadastrosNotasAlPOOPos2019);

	}

}
