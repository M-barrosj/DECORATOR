package AssinaturaDeStream;

public class Pacote4 extends AssinaturaDecorator{

	public Pacote4(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Você adicionol o pacote 4 a sua assinatura (Cartão de crédito Platinum R$49,99).");
	}

}
