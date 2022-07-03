package AssinaturaDeStream;

public class Pacote3 extends AssinaturaDecorator{

	public Pacote3(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Voc� adicionol o pacote 3 a sua assinatura (Caixa surpresa com produtos relacionados a filmes e s�ries R$29,99).");
	}

}
