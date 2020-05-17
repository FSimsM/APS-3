package Interface;


import java.io.IOException;
import java.util.Scanner;

public class View {
	
	public Acao getAcao() {
		System.out.println();
		System.out.println("Usuário, qual destes você escolhe?");
		System.out.println("1 - Para Potencia");
		System.out.println("2 - Para Raíz");
		System.out.println("3 - Para Hipotenusa");
		System.out.println("0 - Para Sair");
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
			case "1": return Acao.POTENCIA;
			case "2": return Acao.RAIZ;
			case "3": return Acao.HIPOTENUSA;
			case "0": return Acao.SAIR;
			default: throw new AcaoNaoExisteException();
		}
		
	}
	
	public void sendGoodByMessage() {
		System.out.println("O programa terminou bye bye");
	}
	
	public InstanciaRaiz getInstanciaRaiz() {
		double numero = getDouble();
		double raiz = getDouble();
		InstanciaRaiz inst = new InstanciaRaiz(numero, raiz);
		return inst;
	}
	
	private double getDouble() {
		double resposta;
		Scanner in = new Scanner(System.in);
		System.out.println("\nEntre com um numero real");
		String palavra = in.next();
		try {
			resposta = Double.parseDouble(palavra);
		}catch(NumberFormatException e){
			System.out.println("Entrada nao reconhecida como um double");
			System.out.println("Tente novamente");
			return getDouble();
		}
		return resposta;
	}
	
	class AcaoNaoExisteException extends IOException{
		
	}

}
