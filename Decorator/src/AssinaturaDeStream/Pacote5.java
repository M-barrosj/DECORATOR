package AssinaturaDeStream;

public class Pacote5 extends AssinaturaDecorator{

	public Pacote5(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Você adicionol o pacote 5 a sua assinatura (Compra com Cash Back R$ 19,99).");
	}

}
