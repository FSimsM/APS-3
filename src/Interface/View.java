package Interface;


import java.io.IOException;
import java.util.Scanner;

public class View {
	
	public Acao getAcao() {
		System.out.println();
		System.out.println("Escolha  o numero referente ao oque voce quer acessar?");
		System.out.println("1 - Para ver todos os cursos.");
		System.out.println("2 - Para ver todos os alunos.");
		System.out.println("3 - Para limpar histórico.");
		System.out.println("4 - Para ver lista de rendimento.");
		System.out.println("5 - Para incluir um novo aluno.");
		System.out.println("6 - Para incluir um novo curso.");
		System.out.println("7 - Para incluir novo rendimento.");
		System.out.println("0 - Para sair.");
		Acao resposta = null;
		
		try {
			resposta = getEscolhaUsuario();
		}catch(AcaoNaoExisteException e) {
			System.out.println("Comando nao reconhecido.");
			System.out.println("Tente novamente.");
			return getAcao();
		}
		
		
		return resposta;
		
	}
	
	private Acao getEscolhaUsuario() throws AcaoNaoExisteException{
		Scanner in = new Scanner(System.in);
		
		String escolha = in.next();
		escolha = escolha.strip();
		switch(escolha) {
			case "1": return Acao.cursos;
			case "2": return Acao.alunos;
			case "3": return Acao.limparHistorico;
			case "4": return Acao.rendimento;
			case "5": return Acao.incluirNovoAluno;
			case "6": return Acao.novoCurso;
			case "7": return Acao.novoRendimento;
			case "0": return Acao.SAIR;
			default: throw new AcaoNaoExisteException();
		}
		
	}
	
	public void sendGoodByMessage() {
		System.out.println("O programa terminou bye bye");
	}
	
	class AcaoNaoExisteException extends IOException{
		
	}

}
