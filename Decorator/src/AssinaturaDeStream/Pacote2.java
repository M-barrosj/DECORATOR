package AssinaturaDeStream;

public class Pacote2 extends AssinaturaDecorator{

	public Pacote2(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Você adicionol o pacote 2 a sua assinatura (Frete Grátis em produtos R$9,99).");
	}

}
