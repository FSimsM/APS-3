package teste;

import controle.erro.DomainException;
import entidade.CadastroAluno;
import leituraCSV.LeitorAluno;
import leituraCSV.NovoAluno;

public class TesteAddAluno {

	public static void main(String[] args) throws DomainException {
		NovoAluno novoAluno = new NovoAluno();
		novoAluno.AddAluno();
	}

}
