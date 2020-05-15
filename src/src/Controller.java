package src;



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
			if(resposta==Acao.RAIZ) {
				InstanciaRaiz inst = view.getInstanciaRaiz();
				double numero = inst.getNumero();
				double indice = inst.getIndice();
				System.out.println("numero = " + inst.getNumero());
				System.out.println("indice = " + inst.getIndice());
				System.out.println("raiz de " + numero + " com indice " + indice + 
						" eh " + Math.pow(numero, 1.0/indice));
			}
		}
		
		view.sendGoodByMessage();
		
	}

}
