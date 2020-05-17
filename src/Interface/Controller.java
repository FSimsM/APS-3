package Interface;

import java.util.Scanner;

public class Controller {
	
	View view;
	
	public Controller(View aView) {
		this.view = aView;
	}
	
	public void init() {
		
		Acao resposta = null;
		
		while(resposta != Acao.SAIR) {
			resposta = view.getAcao();
			System.out.println("Sua escolha foi " + resposta);
			
			if(resposta==Acao.alunos) {
				
			}
			if(resposta==Acao.cursos) {
				
			}
			if(resposta == Acao.limparHistorico) {
				
			}
			if(resposta == Acao.redimento) {
				
			}if(resposta == Acao.incluirNovoAluno) {
				
			}if(resposta == Acao.novoCurso) {
				
			}
		}
		
		view.sendGoodByMessage();
		
	}

}
