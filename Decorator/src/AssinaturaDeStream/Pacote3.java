package AssinaturaDeStream;

public class Pacote3 extends AssinaturaDecorator{

	public Pacote3(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Você adicionol o pacote 3 a sua assinatura (Caixa surpresa com produtos relacionados a filmes e séries R$29,99).");
	}

}
